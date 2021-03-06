package kr.ac.hansung.cse.hellospringboot.controller;

import kr.ac.hansung.cse.hellospringboot.conf.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class HelloWorldController {

    /*@Value("${app.professor}")
    private String professor;

    @Value("${app.course}")
    private String course;*/

    @Autowired
    private AppConfig appConfig;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/say")
    public String sayHello(Model model) {

        logger.debug("professor name: {}", appConfig.getProfessor());
        logger.debug("course name: {}", appConfig.getCourse());

        model.addAttribute("msg", "hello, world");
        model.addAttribute("appConfig", appConfig);
        return "index";
    }

    /*private void error() {
        HashMap<Integer, String> strings = new HashMap<>();
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "index";
    }*/
}

