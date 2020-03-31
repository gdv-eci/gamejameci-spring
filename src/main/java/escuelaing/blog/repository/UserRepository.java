package escuelaing.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import escuelaing.blog.models.User;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByNumDoc(Long number);
}