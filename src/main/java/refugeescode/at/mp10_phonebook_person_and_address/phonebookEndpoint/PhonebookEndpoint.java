package refugeescode.at.mp10_phonebook_person_and_address.phonebookEndpoint;


import org.springframework.web.bind.annotation.*;
import refugeescode.at.mp10_phonebook_person_and_address.model.Contact;
import refugeescode.at.mp10_phonebook_person_and_address.repository.PhonebookRepository;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class PhonebookEndpoint {
    private PhonebookRepository phonebookRepository;

    public PhonebookEndpoint(PhonebookRepository phonebookRepository) {
        this.phonebookRepository = phonebookRepository;
    }

    @GetMapping
    List<Contact> findAll() {
        return phonebookRepository.findAll();
    }

    @PostMapping("/{contact}")
    Contact save(@RequestBody Contact contact) {
        return phonebookRepository.save(contact);
    }


}
