package com.cube.testautoops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Ethan
 * @description:
 * @date:2019/7/9
 **/
@Controller
@RequestMapping
public class controller {
    @RequestMapping("/")
    public String index(){
       return "index";
    }
}
