package co.grandcircus.coffeeshopapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshopapp.dao.ItemDao;
import co.grandcircus.coffeeshopapp.dao.UserDao;
import co.grandcircus.coffeeshopapp.entity.Item;
import co.grandcircus.coffeeshopapp.entity.User;

@Controller
public class HomeController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index", "items", itemDao.findAll());
	}

	@RequestMapping("/itemnamesearch")
	public ModelAndView search(@RequestParam("name") String name) {

		Item item = itemDao.findByName(name);
		if (item == null) {
			return new ModelAndView("search", "itemname", "No Results");
		}

		return new ModelAndView("search", "itemname", item);
	}

	@RequestMapping("registration")
	public String form() {
		return "registration";
	}

	@RequestMapping("add")
	public ModelAndView addUser(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
			@RequestParam("email") String emailAddress, @RequestParam("phone") String phoneNumber,
			@RequestParam("birthDate") String birthDate, @RequestParam("userGender") String userGender) {
		User user = new User(null, firstName, lastName, emailAddress, phoneNumber, birthDate, userGender);

		userDao.addUser(user);

		return new ModelAndView("registrationresults", "person",
				"Hello, " + user.getFirstName() + "! Thank you for registering.");
	}

	@RequestMapping("/itemadmin")
	public ModelAndView itemadmin() {
		return new ModelAndView("itemadmin", "items", itemDao.findAll());
	}
	
	@RequestMapping("/addnewitem")
	public ModelAndView addnewitem(@RequestParam("itemid") Long itemid) {
		return new ModelAndView("addnewitem", "itemid", itemid);
	}
	
	@RequestMapping(value = "/additem")
	public ModelAndView add(@RequestParam("name") String name, @RequestParam("description") String description,
			@RequestParam("quantity") Long quantity, @RequestParam("price") Float price) {
		Item item = new Item(name, description, quantity, price);
		itemDao.update(item);
		return new ModelAndView("redirect:/itemadmin");
	}

	@RequestMapping(value = { "/delete" })
	public ModelAndView delete(@RequestParam("itemid") Long itemid) {
		itemDao.deleteById(itemid);

		return new ModelAndView("redirect:/itemadmin");
	}

	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("itemid") Long itemid) {
		Item item = itemDao.findById(itemid);
		return new ModelAndView("edit", "item", item);
	}

	@RequestMapping(value = "/edititem")
	public ModelAndView update(@RequestParam("itemid") Long itemid, @RequestParam("name") String name,
			@RequestParam("description") String description, @RequestParam("quantity") Long quantity, @RequestParam("price") Float price) {
		Item item = new Item(itemid, name, description, quantity, price);
		itemDao.update(item);

		return new ModelAndView("redirect:/itemadmin");
	}

}