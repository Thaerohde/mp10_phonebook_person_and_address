package refugeescode.at.mp10_phonebook_person_and_address.model;


import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    private String contact;


    @OneToOne(cascade = CascadeType.ALL)
    private Long phoneNumber;

    public Contact(String contact, Long phoneNumber) {
        this.phoneNumber=phoneNumber;
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

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override

    public String toString() {
        return "Contact{" + "id" + " contact is '" + contact + '\'' + "Phone number is: " + phoneNumber + '}';
    }


}
