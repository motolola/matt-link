package io.prosek.link.repository;

import io.prosek.link.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 
 * http://javasampleapproach.com/testing/datajpatest-with-spring-boot
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}