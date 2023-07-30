package com.springboot.springboot_crud_web_app.controller;

import com.springboot.springboot_crud_web_app.service.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    //Display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees", empService.getAllEmployees());
        return "index";
    }
}
