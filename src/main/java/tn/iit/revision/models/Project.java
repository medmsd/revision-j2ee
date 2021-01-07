package tn.iit.revision.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NamedQueries(value = {
        @NamedQuery(name = "allProjects", query = "select p from Project p"),
        @NamedQuery(name = "findProjectsByTeacherId", query = "select p from Project p where p.teacher.id=:id"),
        @NamedQuery(name = "deleteProjectsByTeacherId", query = "delete from Project p where p.teacher.id=:id"),
})
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Teacher teacher;

    @ManyToMany(mappedBy = "projects", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonIgnoreProperties(value = {"projects"})
    private List<Student> students = new ArrayList<> ();

    public Project(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
