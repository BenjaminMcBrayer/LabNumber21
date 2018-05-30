package co.grandcircus.coffeeshopapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshopapp.dao.ObjectDao;
import co.grandcircus.coffeeshopapp.entity.Item;
import co.grandcircus.coffeeshopapp.entity.Person;

@Controller
public class HomeController {

	@Autowired
	private ObjectDao objectDao;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Item> items = objectDao.findAllItems();

		return new ModelAndView("index", "items", items); // This requires either one or more than two parameters.
	}

	@RequestMapping("registration")
	public String form() {
		return "registration";
	}

	@RequestMapping("add")
	public ModelAndView addUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("emailAddress") String emailAddress, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("birthDate") String birthDate, @RequestParam("userGender") String userGender) {
		Person p = new Person(null, firstName, lastName, emailAddress, phoneNumber, birthDate, userGender);
		System.out.println(p.toString());
		objectDao.addUser(p);
		System.out.println(p);
		
		return new ModelAndView("registrationresults", "person",
				"Hello, " + p.getFirstName() + "! Thank you for registering.");
	}

	@RequestMapping("updateinventory")
	public ModelAndView addItem(@RequestParam("name") String name, @RequestParam("description") String description,
			@RequestParam("quantity") Long quantity, @RequestParam("price") Float price) {
		Item i = new Item(null, name, description, quantity, price);
		objectDao.addItem(i);

		List<Item> items = objectDao.findAllItems();
		return new ModelAndView("inventoryupdates", "items", items);
	}
	
	@RequestMapping("/checkbox")
	public ModelAndView checkboxTest(@RequestParam("vehicle") String vehicle) {
		return new ModelAndView("formtest", "formStuff", vehicle);
	}
}
