package lvyang.mybaties.mybatiesdemo.mapper;


import lvyang.mybaties.mybatiesdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Mapper
public interface StudentMapper {
    int insert(Student record);

    List<Student> selectAll();
    Student getStudentByID(String id);


}