package refugeescode.at.mp10_phonebook_person_and_address.model;


import javax.persistence.*;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue
    private Long id;
    private String contact;

    public PhoneNumber() {

    }

    public PhoneNumber(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" + "id" + " name is '" + '\'' + "Phone number is: " + contact + '}';
    }
}