package ch.hftm.personenverwaltung.data.projection;

import ch.hftm.personenverwaltung.data.Address;
import ch.hftm.personenverwaltung.data.City;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "addressWithCity", types = {Address.class})
public interface AddressWithCity {
    String getStreet();

    Integer getHouseNumber();

    Date getValidFrom();

    Date getValidTo();

    Boolean getIsCurrentAddress();

    City getCity();
}
