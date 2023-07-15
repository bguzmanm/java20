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
  @Column(name="address_id")
  private int addressId;

  public Store() {
  }

  public Store(int id, int managerId, int addressId) {
    this.id = id;
    this.managerId = managerId;
    this.addressId = addressId;
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

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }
}
