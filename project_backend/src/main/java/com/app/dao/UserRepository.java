package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.Role;
import com.app.pojos.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByEmailAndPassword(String fn, String ln);

	public User findByEmail(String email);

	@Query("select u from User u where u.role=:role")
	List<User>findByRole(@Param("role")Role role);
}
