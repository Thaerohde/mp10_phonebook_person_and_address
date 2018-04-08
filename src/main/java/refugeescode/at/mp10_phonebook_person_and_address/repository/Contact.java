package refugeescode.at.mp10_phonebook_person_and_address.repository;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    private String contact;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override

    public String toString() {
        return "Contact{" + "id" + " contact is '" + contact + '\'' + "Phone number is: " + address + '}';
    }


}
