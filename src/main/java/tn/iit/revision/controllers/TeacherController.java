package tn.iit.revision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.revision.dto.TeacherDto;
import tn.iit.revision.models.Teacher;
import tn.iit.revision.services.TeacherService;

import java.util.List;

@RequestMapping("/api/teachers")
@RestController()
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<TeacherDto> findAll(){
        return this.teacherService.findAll ();
    }

    @GetMapping("/{id}")
    public TeacherDto find(@PathVariable ("id") long id){
        return this.teacherService.find (id);
    }

    @PostMapping
    public void save(@RequestBody TeacherDto teacherDto) {
        this.teacherService.save (teacherDto);
    }

    @PutMapping
    public void update(@RequestBody TeacherDto teacherDto){
        this.teacherService.save (teacherDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") long id){
        this.teacherService.delete (id);
    }

}
