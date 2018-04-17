package com.rmit.carrotcake.controller;

import com.rmit.carrotcake.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/rooms")
    public String room(Model model) {
        model.addAttribute("rooms", roomRepository.findAll());
        model.addAttribute("name", "test");
        return "rooms";
    }
}
