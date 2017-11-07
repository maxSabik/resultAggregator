package com.ra.results;

import com.ra.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResultController {
    @Autowired
    ResultService resultService;

    @RequestMapping("/results")
    public List<Result> getResults() {
        return resultService.findAll();
    }
}
