package lvyang.mybaties.mybatiesdemo.service;

import lvyang.mybaties.mybatiesdemo.mapper.StudentMapper;
import lvyang.mybaties.mybatiesdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
@Service
public class StudentServiceImp implements   StudentService {
    @Autowired
    StudentMapper studentMapperImp;

    @Override
    public List<Student> getAllStudent(Map map) {
        return studentMapperImp.selectAll();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapperImp.selectAll();
    }

    @Override
    public Integer insertStudent(Student studnet) {
        return studentMapperImp.insert(studnet);
    }

    @Override
    public Student getStudentByID(String id) {
        return studentMapperImp.getStudentByID(id);
    }
}
