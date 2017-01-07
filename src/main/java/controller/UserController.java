package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	String message = "Welcome to Spring MVC!";
	@RequestMapping("/welcome")
	public ModelAndView Welcome(
			@RequestParam() String name) {
		
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("message", message);
		return mv;
		
	}
}
