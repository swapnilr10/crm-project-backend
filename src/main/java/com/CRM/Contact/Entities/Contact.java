package com.CRM.Contact.Entities;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="Contact_Test123")
public class Contact {
	
	@Id
	@GeneratedValue(generator = "CONTACT123_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "CONTACT123_SEQ", sequenceName = "CONTACT123_SEQ", allocationSize=1)
	@Column(name="Contact_Id", unique=true, nullable=false, precision=10, scale=0)
	private Integer Contact_id;

	//@NotNull
	@Column(name = "First_Name")
	private String First_Name;
	

	@Column(name = "Middle_Name")
	private String Middle_Name;

	//@NotNull
	@Column(name = "Last_Name")
	private String Last_Name;

	//@NotNull
	@Column(name = "Salutation")
	private String Salutation;

	//@NotNull
	@Column(name = "Lead_Display_Name")
	private String Lead_Display_Name;

	//@NotNull
	//@Size(max = 10, min = 10)
	@Column(name = "Contact")
	private BigInteger Contact;

	//@NotNull
	//@Size(max = 10, min = 10)
	@Column(name = "Alternate_Contact")
	private BigInteger Alternate_Contact;

	//@Email(message = "Please enter a valid email Id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	//@NotNull
	@Column(name = "Email_Id")
	private String Email_Id;

	//@NotNull
	@Column(name = "Department")
	private String Department;

	//@NotNull
	@Column(name = "Designation")
	private String Designation;

	//@NotNull
	@Column(name = "Contact_Status")
	private boolean Contact_Status;

	public Contact(Integer contact_id, String first_Name, String middle_Name, String last_Name, String salutation,
			String lead_Display_Name, BigInteger contact, BigInteger alternate_Contact, String email_Id,
			String department, String designation, boolean contact_Status) {
		super();
		Contact_id = contact_id;
		First_Name = first_Name;
		Middle_Name = middle_Name;
		Last_Name = last_Name;
		Salutation = salutation;
		Lead_Display_Name = lead_Display_Name;
		Contact = contact;
		Alternate_Contact = alternate_Contact;
		Email_Id = email_Id;
		Department = department;
		Designation = designation;
		Contact_Status = contact_Status;
	}
	
	

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



	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [Contact_id=" + Contact_id + ", First_Name=" + First_Name + ", Middle_Name=" + Middle_Name
				+ ", Last_Name=" + Last_Name + ", Salutation=" + Salutation + ", Lead_Display_Name=" + Lead_Display_Name
				+ ", Contact=" + Contact + ", Alternate_Contact=" + Alternate_Contact + ", Email_Id=" + Email_Id
				+ ", Department=" + Department + ", Designation=" + Designation + ", Contact_Status=" + Contact_Status
				+ "]";
	}
	
	
	
}
