package spring_webapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_webapp.model.Familiar;

@Controller
@RequestMapping("/familiar")
public class FamiliarController {
	
	@RequestMapping("/Form1")
	public String Form1(Model familiarModel) {
		System.out.println("Roannananananawnjkwebfvgwev");
		Familiar familiar = new Familiar();
		familiarModel.addAttribute("familiar", familiar);
		return "FamiliarForm";
	}
	
	@RequestMapping("Form2")
	public String Form2(@Valid @ModelAttribute("familiar") Familiar familiarModel, BindingResult br) {

		if(br.hasErrors())
			return "FamiliarForm";
		
		return "FamiliarConfirmation";
	}
	
}
