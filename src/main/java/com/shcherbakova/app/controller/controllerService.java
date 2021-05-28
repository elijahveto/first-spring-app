package com.shcherbakova.app.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class controllerService {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", "SomeCoolName");
        return "home";
    }

    @GetMapping("/test")
    public String testPage(Model model) {
        model.addAttribute("testRun", "yolo");
        return "test";
    }

    @GetMapping("/login")
    public String login() {
        return "login"; }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession(true).invalidate();
        return "redirect:/";
    }
}
