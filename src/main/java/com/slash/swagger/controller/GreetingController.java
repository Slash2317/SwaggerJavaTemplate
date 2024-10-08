package com.slash.swagger.controller;

import com.slash.swagger.domain.Area;
import com.slash.swagger.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private AreaRepository areaRepository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @GetMapping("/getAreaName")
    public String getAreaName(@RequestParam(value = "id") int id) {
        return areaRepository.loadAreaName(id);
    }

    @GetMapping("/getArea")
    public Area getArea(@RequestParam(value = "id") int id) {
        return areaRepository.loadArea(id);
    }
}
