package com.CRM.Contact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CRM.Contact.Entities.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {


}
