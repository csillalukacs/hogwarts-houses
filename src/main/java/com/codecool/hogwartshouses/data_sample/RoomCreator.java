package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import org.springframework.stereotype.Component;

@Component
public class RoomCreator {

    final RoomMemory roomMemory;

    public void initialize() {
        roomMemory.add(new Room("Gryffindor Common Room"));
        roomMemory.add(new Room("Prefects' Bathroom"));
        roomMemory.add(new Room("The Library"));
        roomMemory.add(new Room("Snape's Office"));
        roomMemory.add(new Room("The Astronomy Room"));
    }

    //apparently @Autowired annotation can be omitted if there's only one constructor
    public RoomCreator(RoomMemory roomMemory) {
        this.roomMemory = roomMemory;
        initialize();
    }
}
