package tn.iit.revision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.revision.dto.ProjectDto;
import tn.iit.revision.services.ProjectService;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/api/projects")
@RestController()
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<ProjectDto> findAll(){
        return this.projectService.findAll ();
    }

    @GetMapping("/{id}")
    public ProjectDto find(@PathVariable ("id") long id){
        return this.projectService.find (id);
    }

    @PostMapping
    public void save(@RequestBody ProjectDto projectDto) {
        this.projectService.save (projectDto);
    }

    @PutMapping
    public void update(@RequestBody ProjectDto projectDto){
        this.projectService.save (projectDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") long id){
        this.projectService.delete (id);
    }

}
