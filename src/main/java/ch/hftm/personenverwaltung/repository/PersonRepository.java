package ch.hftm.personenverwaltung.repository;

import ch.hftm.personenverwaltung.data.Person;
import ch.hftm.personenverwaltung.data.projection.PersonWithAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people", excerptProjection = PersonWithAddress.class)
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {
    List<Person> findByLastName(@Param("name") String name);
}