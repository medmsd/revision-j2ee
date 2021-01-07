package tn.iit.revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.iit.revision.models.Compte;
import tn.iit.revision.models.Project;
import tn.iit.revision.models.Student;
import tn.iit.revision.models.Teacher;
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
        Student kess = new Student ("Mohamed", "Amine Kessentini");
        Student tayeb = new Student ("Tayeb","Karaa");
        Student triki = new Student ("Houssem", "Triki");
        Teacher  mseddi = new Teacher ("Mohamed", "Mseddi");
        Teacher louati = new Teacher ("Mahdi", "Louati");
        Project j2ee = new Project ("J2EE", mseddi);
        Project dataScience = new Project ("Covid", louati);
        Compte compte = new Compte (1000, mseddi);
        kess.addProject (j2ee);
        tayeb.addProject (dataScience);
        triki.addProject (dataScience);
        this.teacherService.add (mseddi);
        this.teacherService.add (louati);
        this.projectService.add (j2ee);
        this.projectService.add (dataScience);
        this.compteService.add (compte);
        this.studentService.add (kess);
        this.studentService.add (tayeb);
        this.studentService.add (triki);
    }
}
