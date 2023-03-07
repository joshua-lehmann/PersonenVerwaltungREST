package ch.hftm.personenverwaltung.repository;

import ch.hftm.personenverwaltung.data.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<City, Long>, CrudRepository<City, Long> {
}
