package cl.awakelab.java20.model.repository;

import cl.awakelab.java20.model.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
}
