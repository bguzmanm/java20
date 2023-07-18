package cl.awakelab.java20.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="address_id")
  private int id;
  private String address;
  private String address2;
  private String district;
  private int cityId;
  private String postalCode;
  private String phone;

  public Address() {
  }

  public Address(int id, String address, String address2, String district, int cityId, String postalCode, String phone) {
    this.id = id;
    this.address = address;
    this.address2 = address2;
    this.district = district;
    this.cityId = cityId;
    this.postalCode = postalCode;
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public int getCityId() {
    return cityId;
  }

  public void setCityId(int cityId) {
    this.cityId = cityId;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


}
