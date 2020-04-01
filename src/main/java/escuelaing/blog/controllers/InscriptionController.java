package escuelaing.blog.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import escuelaing.blog.models.User;
import escuelaing.blog.services.UserService;

/**
 * Inscription
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/users")
public class InscriptionController {

  @Autowired
  UserService us;

  @GetMapping
  public ResponseEntity<?> getAllUsers() {
    try {
      return new ResponseEntity<>(us.getAllUsers(), HttpStatus.OK);
    } catch (Exception ex) {
      Logger.getLogger(InscriptionController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("No user exist", HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping
  public ResponseEntity<?> createUser(@RequestBody User user) {
    try {
      return new ResponseEntity<>(us.saveUser(user), HttpStatus.OK);
    } catch (Exception ex) {
      Logger.getLogger(InscriptionController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Can't save user", HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping
  public ResponseEntity<?> updateUser(@RequestBody User user) {
    try {
      return new ResponseEntity<>(us.Update(user), HttpStatus.OK);
    } catch (Exception ex) {
      Logger.getLogger(InscriptionController.class.getName()).log(Level.SEVERE, null, ex);
      return new ResponseEntity<>("Can't update user", HttpStatus.NOT_FOUND);
    }
  }
  
}