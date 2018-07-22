package com.ek.Controller;

import com.ek.Entity.Page;
import com.ek.Entity.Student;
import com.ek.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

/**
 * Created by eK14u on 7/22/2018.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public String welcome(ModelMap model){
        Collection<Student> students = studentService.getAllStudents();
        model.put("content", students);
        return "students";
    }

    @ResponseBody
    @GetMapping("/json/")
    public Collection<Student> json(){
        return studentService.getAllStudents();
    }

}