package lvyang.mybaties.mybatiesdemo.service;

import lvyang.mybaties.mybatiesdemo.entity.Student;

import java.util.List;
import java.util.Map;


public interface StudentService {

   List<Student> getAllStudent(Map map);
   List<Student> getAllStudent();

   Integer insertStudent(Student student);
   Student getStudentByID(String id);

}
