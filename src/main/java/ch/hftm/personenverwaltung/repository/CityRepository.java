package ch.hftm.personenverwaltung.repository;

import ch.hftm.personenverwaltung.data.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface CityRepository extends PagingAndSortingRepository<City, Long>, CrudRepository<City, Long> {

    List<City> findByZipCode(@Param("zipCode") Integer zipCode);

}