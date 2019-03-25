package lvyang.mybaties.mybatiesdemo.controller;

import lvyang.mybaties.mybatiesdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class StudentController {

    @Autowired
    StudentService studentServiceImp;

     @RequestMapping("/getStudentList")
     @ResponseBody
     public String getStudent(){

         String string = studentServiceImp.getAllStudent().toString();

         return  string;

     }
    
}
