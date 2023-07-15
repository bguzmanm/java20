package cl.awakelab.java20.controller;

import cl.awakelab.java20.model.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {

  private final StoreService service;

  public StoreController(StoreService service) {
    this.service = service;
  }

  @GetMapping
  public String findAll(Model model){
    model.addAttribute("stores", service.findAll());
    return "listStores";
  }
}
