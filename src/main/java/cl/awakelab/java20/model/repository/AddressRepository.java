package cl.awakelab.java20.model.repository;

import cl.awakelab.java20.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
