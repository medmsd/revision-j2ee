package tn.iit.revision.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@NamedQueries (value = {
        @NamedQuery (name = "allTeachers", query = "select t from Teacher t"),
})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "t_teacher")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Teacher implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
