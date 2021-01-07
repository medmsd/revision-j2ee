package tn.iit.revision.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "t_project")
@Entity
public class Project implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne()
    private Teacher teacher;

    @ManyToMany(mappedBy = "projects")
    @JsonIgnoreProperties(value = {"projects"})
    private List<Student> students = new ArrayList<> ();

    public Project(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
