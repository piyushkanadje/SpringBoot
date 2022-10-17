package com.example.boots.boots;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

	private Book page;
	@RequestMapping("/courses")
	public  List<Book> great() {
		return Arrays.asList( new Book(1, " math ", "Piyush "),
				new Book(2, " Science" , " Ajay"));
	}
}
