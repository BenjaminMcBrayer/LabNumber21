package co.grandcircus.coffeeshopapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshopapp.entity.Item;
import co.grandcircus.coffeeshopapp.entity.Person;

@Repository
public class ObjectDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAllUsers() {
		String sql = "SELECT * FROM coffeeshopdb.users";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Person.class));
	}

	public void addUser(Person person) {
		String sql = "INSERT INTO coffeeshopdb.users (firstName, lastName, emailAddress, phoneNumber, birthDate, userGender) VALUES (?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getEmailAddress(),
				person.getPhoneNumber(), person.getBirthDate(), person.getUserGender());
	}

	public void deleteUser(long customerId) {
		String sql = "DELETE FROM coffeeshopdb.users WHERE customerId=?";

		jdbcTemplate.update(sql, customerId);
	}

	public List<Item> findAllItems() {
		String sql = "SELECT * FROM coffeeshopdb.items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}

	public void addItem(Item item) {
		String sql = "INSERT INTO coffeeshopdb.items (name, description, quantity, price) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, item.getName(), item.getDescription(), item.getQuantity(), item.getPrice());
	}

	public void deleteItem(long itemId) {
		String sql = "DELETE FROM coffeeshopdb.items WHERE itemId=?";

		jdbcTemplate.update(sql, itemId);
	}

}
