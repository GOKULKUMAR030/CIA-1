package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Name_Controller 
{
   private String name="Gokul Kumar.S";
   @GetMapping("/List")
   public String getName()
   {
	   return "Hi"+name;
   }
   
	   
   
   
}
