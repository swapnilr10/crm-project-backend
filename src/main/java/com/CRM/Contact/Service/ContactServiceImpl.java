package com.CRM.Contact.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CRM.Contact.Entities.Contact;
import com.CRM.Contact.Model.BaseResponse;
import com.CRM.Contact.Model.ContactDto;
import com.CRM.Contact.Repository.ContactRepo;
import com.CRM.Contact.Util.CommonConstants;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepo contactRepo;

	@Override
	public ResponseEntity<BaseResponse<Contact>> saveContact(ContactDto contactdto) {

		BaseResponse<Contact> baseResponse = new BaseResponse<>();
		try {
			Contact contact = new Contact();
			contact.setFirst_Name(contactdto.getFirst_Name());
			contact.setMiddle_Name(contactdto.getMiddle_Name());
			contact.setLast_Name(contactdto.getLast_Name());
			contact.setSalutation(contactdto.getSalutation());
			contact.setLead_Display_Name(contactdto.getLead_Display_Name());
			contact.setContact(contactdto.getContact());
			contact.setAlternate_Contact(contactdto.getAlternate_Contact());
			contact.setEmail_Id(contactdto.getEmail_Id());
			contact.setDepartment(contactdto.getDepartment());
			contact.setDesignation(contactdto.getDepartment());
			contact.setContact_Status(contactdto.isContact_Status());
			baseResponse.setResponseObject(contactRepo.save(contact));
			baseResponse.setStatus(CommonConstants.SUCCESS);
			baseResponse.setReasonText(CommonConstants.USER_ADDED_SUCCESSFULLY);
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : saveUser() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public ResponseEntity<BaseResponse<Contact>> getAllContact() {

		BaseResponse<Contact> baseResponse = new BaseResponse<>();
		try {
			List<Contact> allcontact = contactRepo.findAll();
			if (allcontact.size() > 0) {
				baseResponse.setResponseListObject(allcontact);
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.GET_ALL_RECORDS);
				baseResponse.setTotalRecords(allcontact.size());
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			} else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			}
		} catch (Exception e) {

			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : getAllContact() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.BAD_REQUEST);

		}
	}

	@Override
	public ResponseEntity<BaseResponse<Contact>> updateContact(ContactDto contactdto, Integer contact_id) {
		BaseResponse<Contact> baseResponse = new BaseResponse<>();
		try {
			Contact contact = contactRepo.findById(contact_id).get();
			contact.setFirst_Name(contactdto.getFirst_Name());
			contact.setMiddle_Name(contactdto.getMiddle_Name());
			contact.setLast_Name(contactdto.getLast_Name());
			contact.setSalutation(contactdto.getSalutation());
			contact.setLead_Display_Name(contactdto.getLead_Display_Name());
			contact.setContact(contactdto.getContact());
			contact.setAlternate_Contact(contactdto.getAlternate_Contact());
			contact.setEmail_Id(contactdto.getEmail_Id());
			contact.setDepartment(contactdto.getDepartment());
			contact.setDesignation(contactdto.getDepartment());
			contact.setContact_Status(contactdto.isContact_Status());
			baseResponse.setResponseObject(contactRepo.save(contact));
			baseResponse.setStatus(CommonConstants.SUCCESS);
			baseResponse.setReasonText(CommonConstants.USER_DATA_UPDATED_SUCCESSFULLY);
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : updateContact() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}

	}

	@Override
	public ResponseEntity<BaseResponse<Contact>> deleteContact(HttpServletRequest request, Integer contact_id) {
		BaseResponse<Contact> baseResponse = new BaseResponse<>();
		try {
			Contact contact = contactRepo.findById(contact_id).get();
			if (!contact.toString().isEmpty()) {
				contactRepo.deleteById(contact_id);
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.DELETE_RECORD_BY_ID);
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			} else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			}
		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : deleteContact() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<BaseResponse<Contact>> getContactById(Integer contactId) {
		BaseResponse<Contact> baseResponse = new BaseResponse<>();
		try {
			Contact contact = contactRepo.findById(contactId).get();
			if (!contact.toString().isEmpty()) {
				//contactRepo.deleteById(contactId);
				baseResponse.setResponseObject(contact);
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.GET_RECORD_BY_ID);
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			} else {
				baseResponse.setStatus(CommonConstants.SUCCESS);
				baseResponse.setReasonText(CommonConstants.NO_RECORDS);
				return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.OK);
			}
		} catch (Exception e) {
			baseResponse.setStatus(CommonConstants.FAIL);
			baseResponse.setReasonText("Exception In ContactServiceImpl : deleteContact() :: " + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(baseResponse, null, HttpStatus.BAD_REQUEST);
		}
	}

}
