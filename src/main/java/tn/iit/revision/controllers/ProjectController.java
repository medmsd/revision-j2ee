package tn.iit.revision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.revision.models.Project;
import tn.iit.revision.services.ProjectService;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/api/projects")
@RestController()
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> findAll(){
        return this.projectService.findAll ();
    }

    @GetMapping("/{id}")
    public Project find(@PathVariable ("id") long id){
        return this.projectService.find (id);
    }

    @PostMapping
    public void save(@RequestBody Project project) {
        this.projectService.save (project);
    }

    @PutMapping
    public void update(@RequestBody Project project){
        this.projectService.save (project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") long id){
        this.projectService.delete (id);
    }

}
