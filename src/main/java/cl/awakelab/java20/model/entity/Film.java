package cl.awakelab.java20.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "film")
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="film_id")
  private int id;
  private String title;
  private String description;
  @Column(name="release_year")
  private int year;


  @ManyToMany
  @JoinTable(name = "film_category",
    joinColumns = @JoinColumn(name="film_id", referencedColumnName = "film_id"),
          inverseJoinColumns = @JoinColumn(name="category_id", referencedColumnName = "category_id"))
  private List<Category> categories;

  public Film() {
  }

  public Film(int id, String title, String description, int year, List<Category> categories) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.year = year;
    this.categories = categories;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }
}
