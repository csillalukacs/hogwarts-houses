package com.codecool.hogwartshouses.controller;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/rooms")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getAll());
        return "rooms";
    }

    @PostMapping("/rooms")
    //if included, id from POST request will be used :(
    public void add(@RequestBody Room room){
        roomService.add(room);
    }

    @GetMapping("/room/{id}")
    @ResponseBody
    public Room getRoom(@PathVariable int id){
        return roomService.find(id);
    }
}
