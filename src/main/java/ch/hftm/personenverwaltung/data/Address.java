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
    Date validFrom;
    Date validTo;
    @OneToOne
    City city;
}
