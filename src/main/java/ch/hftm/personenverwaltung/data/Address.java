package ch.hftm.personenverwaltung.data;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String street;
    Integer houseNumber;
    @Temporal(TemporalType.DATE)
    Date validFrom;
    @Temporal(TemporalType.DATE)
    Date validTo;
    Boolean isCurrentAddress = false;
    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @ManyToOne
    @JoinColumn(name = "person_id")
    Person person;
}
