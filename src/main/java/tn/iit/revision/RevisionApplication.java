package tn.iit.revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.iit.revision.services.CompteService;
import tn.iit.revision.services.ProjectService;
import tn.iit.revision.services.StudentService;
import tn.iit.revision.services.TeacherService;

@SpringBootApplication
public class RevisionApplication implements CommandLineRunner {
    @Autowired
    private CompteService compteService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    public static void main(String[] args) {
        SpringApplication.run (RevisionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        StudentDto kess = new StudentDto ("Mohamed", "Amine Kessentini");
//        StudentDto tayeb = new StudentDto ("Tayeb","Karaa");
//        StudentDto triki = new StudentDto ("Houssem", "Triki");
//        TeacherDto mseddi = new TeacherDto ("Mohamed", "Mseddi");
//        TeacherDto louati = new TeacherDto ("Mahdi", "Louati");
//        ProjectDto j2ee = new ProjectDto ("J2EE", mseddi);
//        ProjectDto dataScience = new ProjectDto ("Covid", louati);
//        CompteDto compte = new CompteDto (1000, mseddi);
//        kess.getProjects().add (j2ee);
//        tayeb.getProjects().add (dataScience);
//        triki.getProjects().add(dataScience);
//        this.teacherService.save (mseddi);
//        this.teacherService.save (louati);
//        this.projectService.save (j2ee);
//        this.projectService.save (dataScience);
//        this.compteService.save (compte);
//        this.studentService.save (kess);
//        this.studentService.save (tayeb);
//        this.studentService.save (triki);
    }
}
