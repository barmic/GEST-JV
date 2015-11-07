package fr.gest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Rpg {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Integer year;
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rpg rpg = (Rpg) o;
    return Objects.equals(id, rpg.id) &&
        Objects.equals(name, rpg.name) &&
        Objects.equals(year, rpg.year) &&
        Objects.equals(description, rpg.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, year, description);
  }
}
