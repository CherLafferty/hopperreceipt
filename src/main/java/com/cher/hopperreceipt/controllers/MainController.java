package com.cher.hopperreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home(Model model) {
	    String name = "Grace Hopper";
	    String itemName = "Copper wire";
	    double price = 5.25;
	    String description = "Metal strips, also an illustration of nanoseconds.";
	    String vendor = "Little Things Corner Store";    

	    model.addAttribute("nameKey", name);
	    model.addAttribute("itemKey", itemName);
	    model.addAttribute("priceKey", price);
	    model.addAttribute("descriptionKey", description);
	    model.addAttribute("vendorKey", vendor);
	    System.out.println("Test Works");
	    return "index.jsp";
	  }

}
