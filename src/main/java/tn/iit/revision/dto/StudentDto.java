package tn.iit.revision.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class StudentDto {
    @EqualsAndHashCode.Include
    private long id;
    private String firstName;
    private String lastName;
    private List<ProjectDto> projects = new ArrayList<> ();

    public StudentDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
