package springAPI.springstudy.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springAPI.springstudy.model.Student;

@RestController
@RequestMapping("/api/v1/all-students")
public class StudentController {
    
    @GetMapping
    public List<Student> findAllStudent(){
        
        return List.of(
                Student.builder().firstName("Pedro").Email("pedro@mail.es").age(32).build(),
                Student.builder().firstName("Carlito").Email("carlito@mail.es").age(28).build(),
                Student.builder().firstName("Rafa").Email("rafa@mail.es").age(34).build()
        );
                
    }
}
