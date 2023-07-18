package cl.awakelab.java20.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="category")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="category_id")
  private int id;
  private String name;

  @ManyToMany(mappedBy = "categories")
  private List<Film> films;

  public Category() {
  }

  public Category(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
