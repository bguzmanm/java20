package cl.awakelab.java20.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="customer_id")
  private int id;
  @Column(name="store_id")
  private int storeId;
  @Column(name="first_name")
  private String firstName;
  @Column(name="last_name")
  private String lastName;
  @Column(name="email")
  private String email;
  @Column(name="address_id")
  private int addressId;
  @Column(name="active")
  private boolean active;
  @Column(name="create_date")
  private Date createDate;

  public Customer() {
  }

  public Customer(int id, int storeId, String firstName, String lastName, String email, int addressId, boolean active, Date createDate) {
    this.id = id;
    this.storeId = storeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.addressId = addressId;
    this.active = active;
    this.createDate = createDate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
