package refugeescode.at.mp10_phonebook_person_and_address.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import refugeescode.at.mp10_phonebook_person_and_address.model.Contact;

public interface PhonebookRepository extends JpaRepository<Contact, Long> {
    boolean existsByName(String name);
}
