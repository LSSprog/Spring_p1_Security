package spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping ("/home")
    public String homePage() {
        return "HOME";
    }

    @GetMapping ("/dao")
    public String daoPage() {
        return "DAO";
    }

}
