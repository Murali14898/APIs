package com.sharpmind.createmyfirstapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//my url are
// localhost:8080/api/hello
//localhost:8080/api/bye
@RestController
@RequestMapping("/practice")
public class PracticeController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
    @RequestMapping("/bye/{name}")
    public String sayBye(@PathVariable("name")String name){
        return "Bye"+" "+name;
    }
}
