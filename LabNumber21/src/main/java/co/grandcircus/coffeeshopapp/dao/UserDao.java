package co.grandcircus.coffeeshopapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshopapp.entity.User;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> findAllUsers() {
		String sql = "SELECT * FROM coffeeshopdb.users";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}

	public void addUser(User user) {
		String sql = "INSERT INTO coffeeshopdb.users (firstName, lastName, emailAddress, phoneNumber, birthDate, userGender) VALUES (?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmailAddress(),
				user.getPhoneNumber(), user.getBirthDate(), user.getUserGender());
	}
	
	public void addPWord(String pWord) {
		
	}

	public void deleteUser(long customerId) {
		String sql = "DELETE FROM coffeeshopdb.users WHERE customerId=?";

		jdbcTemplate.update(sql, customerId);
	}
}
