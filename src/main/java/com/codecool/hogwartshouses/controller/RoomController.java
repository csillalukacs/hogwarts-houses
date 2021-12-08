package com.codecool.hogwartshouses.controller;

import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/rooms")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getAll());
        return "rooms";
    }
}