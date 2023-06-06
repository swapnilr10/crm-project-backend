package com.CRM.Contact.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CRM.Contact.Entities.Contact;
import com.CRM.Contact.Model.BaseResponse;
import com.CRM.Contact.Model.ContactDto;

@Service
public interface ContactService {

	ResponseEntity<BaseResponse<Contact>> saveContact(ContactDto contactdto);

	ResponseEntity<BaseResponse<Contact>> getAllContact();
	ResponseEntity<BaseResponse<Contact>> updateContact(ContactDto contactdto,Integer contact_id);
	ResponseEntity<BaseResponse<Contact>> deleteContact(HttpServletRequest request, Integer contact_id);

    ResponseEntity<BaseResponse<Contact>> getContactById(Integer contactId);
}
