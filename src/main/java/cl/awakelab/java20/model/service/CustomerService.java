package cl.awakelab.java20.model.service;

import cl.awakelab.java20.model.entity.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> findAll();
  Customer findById(int id);
}
