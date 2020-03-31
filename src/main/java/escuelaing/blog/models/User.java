package escuelaing.blog.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * User
 */
@Data
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  String lastName;

  @Column(nullable = false)
  String email;

  @Column(nullable = false)
  String tp;

  @Column(nullable = false)
  Long numDoc;

  @Column(nullable = false)
  String uniInv;

  @Column(nullable = false)
  String uniEst;

  @Column(nullable = false)
  String code;

  @Column(nullable = false)
  String cel;

  @Column(nullable = false)
  Boolean wa;

  @Column(nullable = false)
  Boolean veg;

  @Column(nullable = false)
  String rol;

  @Column(nullable = false)
  String level;

}