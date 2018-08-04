package it.stacja.app.web.wykop.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wykop")
public class WykopController {

    @GetMapping("/main")
    public void main(){

    }

    @PostMapping("/add")
    public void add(){

    }
}
