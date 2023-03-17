package ch.hftm.personenverwaltung.repository;

import ch.hftm.personenverwaltung.data.Address;
import ch.hftm.personenverwaltung.data.projection.AddressWithCity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = AddressWithCity.class)
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>, CrudRepository<Address, Long> {
}
