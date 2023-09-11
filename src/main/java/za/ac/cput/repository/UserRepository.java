/*
 * UserRepository.java
 * This is a repository for user entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */


package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
