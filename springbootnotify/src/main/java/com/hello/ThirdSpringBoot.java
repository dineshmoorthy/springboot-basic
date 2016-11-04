package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/helloWorld")

public class ThirdSpringBoot {

	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(ModelMap model) {

		model.addAttribute("msg", "JCG Hello World!");

		return "helloWorld";

	}

	@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
	public String displayMessage(@PathVariable String msg, ModelMap model) {

		model.addAttribute("msg", msg);

		return "helloWorld";

	}

}
