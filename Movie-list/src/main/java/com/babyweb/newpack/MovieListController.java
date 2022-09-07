package com.babyweb.newpack;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.babyweb.movies.model.Movie;


@Controller
@RequestMapping("/")
public class MovieListController {
	
	@RequestMapping("/movies")
	public String getMovieListByActor(Model model1) {
		
		List<Movie> movieList= new ArrayList<Movie>();
		
		Movie movie1 = new Movie();
		movie1.setActor("Vijay");
		movie1.setDescription("Political party");
		movie1.setName("Sarkar");
		
		Movie movie2 = new Movie();
		movie2.setActor("Vijay");
		movie2.setDescription("Drugs");
		movie2.setName("Master");
		
		Movie movie3 = new Movie();
		movie3.setActor("Vijay");
		movie3.setDescription("Terrorist");
		movie3.setName("Beast");
		
		Movie movie4 = new Movie();
		movie4.setActor("Vijay");
		movie4.setDescription("Medical feild");
		movie4.setName("Mersal");
		
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		
		model1.addAttribute("movies", movieList);
	
		return "movieList";
	}
}
