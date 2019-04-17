package es.avalon.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/micontrolador")
public class HolaController {
	
	@RequestMapping("/hola")
	//@ResponseBody
	public String hola() {
		return "hola";
	}

}
