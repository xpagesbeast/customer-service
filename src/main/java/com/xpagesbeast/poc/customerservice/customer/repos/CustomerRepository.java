package com.xpagesbeast.poc.customerservice.customer.repos;

import com.xpagesbeast.poc.customerservice.customer.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
