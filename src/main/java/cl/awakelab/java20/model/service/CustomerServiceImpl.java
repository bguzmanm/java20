package cl.awakelab.java20.model.service;

import cl.awakelab.java20.model.entity.Customer;
import cl.awakelab.java20.model.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository repository;

  public CustomerServiceImpl(CustomerRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Customer> findAll() {
    return repository.findAll();
  }

  @Override
  public Customer findById(int id) {
    return repository.findById(id).orElse(null);
  }
}
