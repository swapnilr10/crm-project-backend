package com.CRM.Contact.Model;

import java.math.BigInteger;

public class ContactDto {

	private Integer Contact_id;
	private String First_Name;
	private String Middle_Name;
	private String Last_Name;
	private String Salutation;
	private String Lead_Display_Name;
	private BigInteger Contact;
	private BigInteger Alternate_Contact;
	private String Email_Id;
	private String Department;
	private String Designation;
	private boolean Contact_Status;

	public Integer getContact_id() {
		return Contact_id;
	}

	public void setContact_id(Integer contact_id) {
		Contact_id = contact_id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getMiddle_Name() {
		return Middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getSalutation() {
		return Salutation;
	}

	public void setSalutation(String salutation) {
		Salutation = salutation;
	}

	public String getLead_Display_Name() {
		return Lead_Display_Name;
	}

	public void setLead_Display_Name(String lead_Display_Name) {
		Lead_Display_Name = lead_Display_Name;
	}

	public BigInteger getContact() {
		return Contact;
	}

	public void setContact(BigInteger contact) {
		Contact = contact;
	}

	public BigInteger getAlternate_Contact() {
		return Alternate_Contact;
	}

	public void setAlternate_Contact(BigInteger alternate_Contact) {
		Alternate_Contact = alternate_Contact;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public boolean isContact_Status() {
		return Contact_Status;
	}

	public void setContact_Status(boolean contact_Status) {
		Contact_Status = contact_Status;
	}

}
