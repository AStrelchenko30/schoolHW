package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;

public class FacultyService {

    private final HashMap<Long, Faculty> facultys = new HashMap<>();
    private long lastId = 0;

    public Faculty createFaculty(Faculty faculty){
        faculty.setId(++lastId);
        facultys.put(lastId,faculty);
        return faculty;
    }
    public Faculty findFaculty (long id){
        return facultys.get(id);
    }
    public Faculty editeFaculty(Faculty faculty){
        facultys.put(faculty.getId(),faculty);
        return faculty;
    }
    public Faculty deleteFaculty(long id){
        return facultys.remove(id);

    }

}
