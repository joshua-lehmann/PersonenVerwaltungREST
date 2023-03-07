package ch.hftm.personenverwaltung.data;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String cityName;
    Integer zipCode;
}
