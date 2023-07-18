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
  @ManyToOne
  @JoinColumn(name = "store_id", insertable = false, updatable = false)
  private Store store;
  private String firstName;
  private String lastName;
  private String email;
  @ManyToOne
  @JoinColumn(name = "address_id", insertable = false, updatable = false)
  private Address address;
  private boolean active;
  private Date createDate;

  public Customer() {
  }

  public Customer(int id, Store store, String firstName, String lastName, String email, Address address,
                  boolean active, Date createDate) {
    this.id = id;
    this.store = store;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.address = address;
    this.active = active;
    this.createDate = createDate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Store getStoreId() {
    return store;
  }

  public void setStoreId(Store storeId) {
    this.store = storeId;
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

  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }
}
