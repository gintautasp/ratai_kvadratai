package ernadas_ratai_kvadratai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(path="/")
	public String home( Model model ) {
		
		 // Model model = new Model();
		model.addAttribute( "fraze",  "Labas is Java Spring" );
		return "home";
	}

}
