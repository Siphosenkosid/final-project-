package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller

//@RestController
    public class hellocontroller {

        @GetMapping(value = "/")
        public String hello() { return "Hello vistula, in my first spring controller";}


        @GetMapping( "/greeting")
        public String greeting(@RequestParam(name="vistula", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", "vistula");
            return "greeting";
        }
     //http://localhost:8080/greeting?name=Vistula
    }


