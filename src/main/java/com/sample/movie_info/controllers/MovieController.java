package com.sample.movie_info.controllers;

import com.sample.common.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

    @GetMapping({"/", ""})
    private List<Movie> list() {
        return Arrays.asList(new Movie("Movie 1", "some description"), new Movie("Movie 2", "one more description"));
    }
}
