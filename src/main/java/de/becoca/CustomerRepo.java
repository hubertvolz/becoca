package de.becoca;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, String> {
}
