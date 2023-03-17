package ch.hftm.personenverwaltung.data.projection;

import ch.hftm.personenverwaltung.data.Address;
import ch.hftm.personenverwaltung.data.Person;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "personWithAddresses", types = { Person.class })
public interface PersonWithAddress {
    Integer getId();

    String getLastName();
    String getFirstName();
    String getHomeTown();
    String getBirthDate();
    List<Address> getPersonAddresses();
}
