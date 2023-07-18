package cl.awakelab.java20.model.service;

import cl.awakelab.java20.model.entity.Film;
import cl.awakelab.java20.model.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
  FilmRepository repository;

  public FilmServiceImpl(FilmRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Film> findAll() {
    return repository.findAll();
  }
}
