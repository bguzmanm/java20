package cl.awakelab.java20.model.service;

import cl.awakelab.java20.model.entity.Store;
import cl.awakelab.java20.model.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {

  private final StoreRepository repository;

  public StoreServiceImpl(StoreRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Store> findAll() {
    return repository.findAll();
  }
}
