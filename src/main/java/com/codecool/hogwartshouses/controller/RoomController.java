package com.codecool.hogwartshouses.controller;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import com.codecool.hogwartshouses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;
    @Autowired
    StudentService studentService;

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

    @ResponseBody
    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable int id){
        return roomService.find(id);
    }

    @ResponseBody
    @PutMapping("/room/{id}")
    public void updateRoom(@PathVariable int id, @RequestBody Room room){
        roomService.update(id, room);
    }

    @ResponseBody
    @DeleteMapping("/room/{id}")
    public void deleteRoom(@PathVariable int id){
        roomService.delete(id);
    }
}
