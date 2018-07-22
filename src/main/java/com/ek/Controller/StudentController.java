package com.ek.Controller;

import com.ek.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eK14u on 7/22/2018.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/")
    public String welcome(ModelMap model){
        model.put("content", "test");
        return "students";
    }

}