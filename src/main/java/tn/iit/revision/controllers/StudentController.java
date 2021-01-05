package tn.iit.revision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.revision.models.Student;
import tn.iit.revision.services.StudentService;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/api/students")
@RestController()
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        return this.studentService.findAll ();
    }

    @GetMapping("/{id}")
    public Student find(@PathVariable ("id") long id){
        return this.studentService.find (id);
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        this.studentService.save (student);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Student student){
        this.studentService.save (student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") long id){
        this.studentService.delete (id);
    }

}
