package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.PetType;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import com.codecool.hogwartshouses.service.DAO.StudentMemory;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class RoomCreator {

    final RoomMemory roomMemory;
    final StudentMemory studentMemory;

    //apparently @Autowired annotation can be omitted if there's only one constructor
    public RoomCreator(RoomMemory roomMemory, StudentMemory studentMemory) {
        this.roomMemory = roomMemory;
        this.studentMemory = studentMemory;
        initialize();
    }

    public void initialize() {
        roomMemory.add(new Room("Gryffindor Common Room", new HashSet<>(), false));
        roomMemory.add(new Room("Prefects' Bathroom", new HashSet<>(), false));
        roomMemory.add(new Room("The Library", new HashSet<>(), false));
        roomMemory.add(new Room("Snape's Office", new HashSet<>(), false));
        roomMemory.add(new Room("The Astronomy Room", new HashSet<>(), false));
        Student hermione = new Student("Hermione Granger", PetType.CAT);
        Student draco = new Student("Draco Malfoy", PetType.OWL);
        studentMemory.add(draco);
        studentMemory.add(hermione);
        Room slytherin7 = new Room("Slytherin Dorm Room 7", new HashSet<>(), true);
        roomMemory.add(slytherin7);
        slytherin7.getOccupants().add(draco);
        Room gryffindor3 = new Room("Gryffindor Dorm Room 3", new HashSet<>(), true);
        roomMemory.add(gryffindor3);
        gryffindor3.getOccupants().add(hermione);
        roomMemory.add(new Room("Gryffindor Dorm Room 2", new HashSet<>(), true));
    }
}
