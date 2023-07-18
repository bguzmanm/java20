package cl.awakelab.java20.controller;

import cl.awakelab.java20.model.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film")
public class FilmController {

  FilmService service;

  public FilmController(FilmService service) {
    this.service = service;
  }

  @GetMapping
  public String findAll(Model model){
    model.addAttribute("films", service.findAll());
    return "listFilms";
  }
}
