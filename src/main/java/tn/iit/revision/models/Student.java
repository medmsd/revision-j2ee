package tn.iit.revision.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "t_student")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Student implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "t_projects_students",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns =@JoinColumn(name = "project_id") )
    @JsonIgnoreProperties(value = {"students"})
    private List<Project> projects = new ArrayList<> ();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addProject(Project project){
        if(!this.projects.contains (project))
            this.projects.add (project);
    }
}
