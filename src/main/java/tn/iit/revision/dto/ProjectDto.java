package tn.iit.revision.dto;

import lombok.*;
import tn.iit.revision.models.Teacher;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProjectDto {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private TeacherDto teacher;
    private List<StudentDto> students = new ArrayList<> ();

    public ProjectDto(String name, TeacherDto teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
