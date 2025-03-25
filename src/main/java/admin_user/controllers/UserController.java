package admin_user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.dto.UserDto;
import admin_user.services.UserService;

@Controller
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	
	@GetMapping("/registration")
	public String getRegistration(@ModelAttribute("user") UserDto userDto) {
		return "register";
	}

	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user")UserDto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("message", "Registered Succsessfully!");
		return "register";
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
