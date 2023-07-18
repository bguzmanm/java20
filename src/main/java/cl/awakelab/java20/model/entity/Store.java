package cl.awakelab.java20.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="store")
public class Store {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="store_id")
  private int id;
  @Column(name="manager_staff_id")
  private int managerId;

  @ManyToOne
  @JoinColumn(name="address_id")
  private Address address;

  public Store() {
  }

  public Store(int id, int managerId, Address address) {
    this.id = id;
    this.managerId = managerId;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getManagerId() {
    return managerId;
  }

  public void setManagerId(int managerId) {
    this.managerId = managerId;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
