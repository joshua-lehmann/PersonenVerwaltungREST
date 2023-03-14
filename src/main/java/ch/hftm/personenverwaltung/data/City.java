package ch.hftm.personenverwaltung.data;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String cityName;
    Integer zipCode;

    @OneToMany(mappedBy = "city")
    private List<Address> addresses;
}
