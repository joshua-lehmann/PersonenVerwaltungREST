package ch.hftm.personenverwaltung.data;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lastName;
    private String firstName;
    private String homeTown;
    private Date birthDate;

    @OneToMany
    List<Address> personAddresses;
}
