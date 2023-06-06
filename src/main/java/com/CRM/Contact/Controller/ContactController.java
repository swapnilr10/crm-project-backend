package com.CRM.Contact.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CRM.Contact.Entities.Contact;
import com.CRM.Contact.Model.BaseResponse;
import com.CRM.Contact.Model.ContactDto;
import com.CRM.Contact.Service.ContactService;
import com.CRM.Contact.Util.CommonConstants;

@RestController
@RequestMapping("/api/v1/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

	@Autowired
	ContactService contactService;

	@PostMapping("/add")
	public ResponseEntity<BaseResponse<Contact>> saveContact(@RequestBody ContactDto contactdto) {
		BaseResponse<Contact> c = new BaseResponse<>();
		try {
			String validate = validateRequest(contactdto);
			if (validate.trim().isEmpty()) {
				return contactService.saveContact(contactdto);
			} else {
				c.setStatus(CommonConstants.FAIL);
				c.setReasonText(validate);
				return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			c.setStatus(CommonConstants.FAIL);
			c.setReasonText("Exception In ContactController : saveContact ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
		}

	}

	private String validateRequest(ContactDto contactdto) {
		StringBuilder validate = new StringBuilder();
		if (contactdto == null) {
			validate.append("Fail");
		}
		return validate.toString();
	}

	@GetMapping("/get")
	public ResponseEntity<BaseResponse<Contact>> getAllContact() {
		BaseResponse<Contact> c = new BaseResponse<>();
		try {
			return contactService.getAllContact();
		} catch (Exception e) {
			c.setStatus(CommonConstants.FAIL);
			c.setReasonText("Exception In ContactController : saveContact ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getById")
	public ResponseEntity<BaseResponse<Contact>> getContactById(@RequestParam Integer contactId) {
		BaseResponse<Contact> c = new BaseResponse<>();
		try {
			return contactService.getContactById(contactId);
		} catch (Exception e) {
			c.setStatus(CommonConstants.FAIL);
			c.setReasonText("Exception In ContactController : saveContact ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
		}

	}


	@PutMapping("/update/{contact_id}")
	public ResponseEntity<BaseResponse<Contact>> updateContact(@RequestBody ContactDto contactdto,
			@PathVariable("contact_id") Integer contact_id) {
		BaseResponse<Contact> c = new BaseResponse<>();
		try {
			if (!contactdto.toString().isEmpty()) {
				return contactService.updateContact(contactdto, contact_id);
			} else {
				c.setStatus(CommonConstants.FAIL);
				c.setReasonText(CommonConstants.PPUID);
				return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			c.setStatus(CommonConstants.FAIL);
			c.setReasonText("Exception In ContactController : saveContact ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("/delete/{contact_id}")
	public ResponseEntity<BaseResponse<Contact>> deleteContact(HttpServletRequest request,
			@PathVariable("contact_id") Integer contact_id) {
		BaseResponse<Contact> c = new BaseResponse<>();
		try {
			return contactService.deleteContact(request, contact_id);
		} catch (Exception e) {
			c.setStatus(CommonConstants.FAIL);
			c.setReasonText("Exception In ContactController : saveContact ::" + e.getMessage());
			return new ResponseEntity<BaseResponse<Contact>>(c, null, HttpStatus.BAD_REQUEST);
		}

	}

}
