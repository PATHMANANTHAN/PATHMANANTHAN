
package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class HomeController {
	
	@PostMapping("welcomeMsg")	
	 public String  living(){
String  name = "baby";
int  age = 34;
String  color = "color";

return name + " "+ age +" "+ color ;
}  

	@PostMapping("getTest")
	public String getTest(@RequestBody String  reqBody) {
		return "Hi Nandhu, Welcome to COeP Controller!"+reqBody;
	}	

	@PostMapping("oneParameter")
	public String oneParameter(@RequestBody String name) {
		name = "Kumar";
		return "Hi, Welcome to gettTest !"+name;
	} 
		
	@PostMapping("twoParameter")
	public static  String twoParameter(@RequestBody String name ,String age, String batch,String salary) {
		name = "kannan";
		age = "23";
		batch = "a1";
		salary = "29770";
		return "Hi, Welcome to gettTest !"+name+" " +age +" "+ batch ;
	} 
	
	/// object
	@PostMapping("object")
	 public  int object()
	    {
	        Student s = new Student();
	        int neww =s.result();
	        return neww;
	    }	
			
	//NESTED OBJECT
	@PostMapping("multi")	
	public  String multi()
    {
		oneClass a1 = new oneClass();
		oneClass a2 = new oneClass();
		oneClass a3 = new oneClass();

        int neww =a1.hi();
        int ne =a1.hi();
        int n =a1.hi();

        return neww +" "+ne+" "+n;     
    }
	
	//ARRAY OBJECT
	@PostMapping("Array")	
	public int[]  hi() {
		ArrayObject newClassObj = new ArrayObject();
	int[] secondArray = newClassObj.getNumArray();
	return secondArray;
	}
	}









