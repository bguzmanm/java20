package cl.awakelab.java20.controller;

import cl.awakelab.java20.model.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
  private final CustomerService service;
  public CustomerController(CustomerService service) {
    this.service = service;
  }
  @GetMapping
  public String listCustomers(Model model){
    model.addAttribute("customers", service.findAll());
    return "listCustomers";
  }

  @GetMapping("/{customerId}")
  public String findCustomer(@PathVariable int customerId, Model model){
    model.addAttribute("customer", service.findById(customerId));
    return "customer";
  }

}
