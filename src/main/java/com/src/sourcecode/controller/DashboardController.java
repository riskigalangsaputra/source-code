package com.src.sourcecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
//@RequestMapping("/")
public class DashboardController {

    private static final String DASHBOARD_VIEW = "dashboard/dashboard";

    @GetMapping("/")
    public String dashboard() {
        return DASHBOARD_VIEW;
    }
}
