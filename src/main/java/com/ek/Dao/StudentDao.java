package com.ek.Dao;

import com.ek.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eK14u on 7/22/2018.
 */
@Repository
public class StudentDao {

    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Said", "Computer Science"));
                put(3, new Student(3, "Said", "Computer Science"));
            }
        };
    }
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
