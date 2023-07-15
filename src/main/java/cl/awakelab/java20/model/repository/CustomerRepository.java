package cl.awakelab.java20.model.repository;

import cl.awakelab.java20.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
