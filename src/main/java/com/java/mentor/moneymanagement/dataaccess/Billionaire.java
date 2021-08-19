package com.java.mentor.moneymanagement.dataaccess;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billionaire {

  // Script
  // INSERT INTO Billionaire (id, first_name, last_name, career) VALUES
  // (-1, 'Aliko', 'Dangote', 'Billionaire Industrialist'),
  // (-2, 'Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  // (-3, 'Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String career;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }

}
