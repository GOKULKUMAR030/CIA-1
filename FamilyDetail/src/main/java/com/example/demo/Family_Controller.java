package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Family_Controller 
{
   
   @GetMapping("/List")
   public List<FamilyDetails> getList()
   {
	 List<FamilyDetails> detailsList=new ArrayList<>();
	 detailsList.add(new FamilyDetails ("Adhi",15,"son"));
	 detailsList.add(new FamilyDetails("mohan",16,"son")); 
     return detailsList;
   }
   
	   
   
   
}
