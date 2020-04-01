package escuelaing.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import escuelaing.blog.models.User;
import escuelaing.blog.repository.UserRepository;
import escuelaing.blog.services.UserService;

/**
 * UserService
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository ur;

  @Override
  public List<User> getAllUsers() {
    return ur.findAll();
  }

  @Override
  public User saveUser(User user) {
    if (!((Long)ur.count()).equals(0L)) {
      User tmp = ur.findByNumDoc(user.getNumDoc());
      if (tmp.getNumDoc().equals(user.getNumDoc()))
        user.setId(tmp.getId());
    }
    return ur.save(user);
  }

  @Override
  public User Update(User user) {
    if (!((Long)ur.count()).equals(0L)) {
      User tmp = ur.findByNumDoc(user.getNumDoc());
      user.setId(tmp.getId());
    }
    return ur.save(user);
  }

}