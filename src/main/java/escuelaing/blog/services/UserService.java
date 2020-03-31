package escuelaing.blog.services;

import java.util.List;

import escuelaing.blog.models.User;

/**
 * UserService
 */
public interface UserService {

  List<User> getAllUsers();

  User saveUser(User user);

  User Update(User user);
  
}