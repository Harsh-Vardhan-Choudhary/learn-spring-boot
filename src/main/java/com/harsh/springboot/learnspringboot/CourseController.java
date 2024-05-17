package com.harsh.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
    //courses
    //course : id, name, author

    //we can create medhods in here and expose the links from here
    @RequestMapping("/courses")
    
    public List<Course> retrieveAllCourse()
    {
        return Arrays.asList(
                            new Course(1, "Learn AWS", "in28minutes"),
                            new Course(2, "Learn Devops", "in28minutes")
        );
    }
}
