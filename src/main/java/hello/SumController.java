package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {

    @GetMapping("/sum")
    public String addMethod(@RequestParam(name="a") int a, 
				@RequestParam(name="b") int b, 
				Model model) {
		System.out.println("SumController ATIVADO!");
        model.addAttribute("result", a + b);
        return "sum";
    }
	
    @GetMapping("/estatica01")
    public String mapearA() {
        return "tela01";
    }	
	
    @GetMapping("/dinamica02")
    public String mapearB() {
        return "tela02";
    }	
}
