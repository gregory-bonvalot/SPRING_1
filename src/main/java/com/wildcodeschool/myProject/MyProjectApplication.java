package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	return "<ul><li><a href='/doctor/1'>William Hartnell</a></li>"+
    			"<li><a href='/doctor/2'>Patrick Troughton</a></li>"+
    			"<li><a href='/doctor/3'>Jon Pertwee</a></li>"+
    			"<li><a href='/doctor/4'>Tom Baker</a></li></ul>";
    	
    	
    }
    
    @RequestMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell"+"<br/><a href='/'>accueil</a>";
    }
    
    @RequestMapping("/doctor/2")
    @ResponseBody
    public String doctor2() {
        return "Patrick Troughton"+"<br/><a href='/'>accueil</a>";
    } 
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String doctor3() {
        return "Jon Pertwee"+"<br/><a href='/'>accueil</a>";
    }
    @RequestMapping("/doctor/4")
    @ResponseBody
    public String doctor4() {
        return "Tom Baker"+"<br/><a href='/'>accueil</a>";
    }
    
    

}