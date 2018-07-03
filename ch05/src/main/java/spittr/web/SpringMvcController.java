package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mvc")
public class SpringMvcController {

    @RequestMapping(value = "/m1",method = RequestMethod.GET)

    public String testMvc(@RequestHeader("Accept-Language") String header){
        System.out.println(header);
        return "sucess";
    }
}
