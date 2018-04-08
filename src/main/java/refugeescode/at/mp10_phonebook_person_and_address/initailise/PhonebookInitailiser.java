package refugeescode.at.mp10_phonebook_person_and_address.initailise;


import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import refugeescode.at.mp10_phonebook_person_and_address.model.Contact;
import refugeescode.at.mp10_phonebook_person_and_address.repository.PhonebookRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class PhonebookInitailiser {


    @Bean
    ApplicationRunner initialisePhonebooks(PhonebookRepository phonebookRepository){
        return args->{

            phonebookRepository.deleteAll();
            List<Contact> contacts = createContact();

        };
    }

    private List<Contact> createContact() {
        return Stream.of(
                new Contact("thaer", (long) 2222),
                new Contact("joelle", (long) 444),
                new Contact("rana", (long) 222)


        ).collect(Collectors.toList());
    }

}
