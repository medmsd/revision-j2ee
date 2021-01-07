package tn.iit.revision.dto;

import lombok.*;
import tn.iit.revision.models.Teacher;

import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CompteDto {
    @EqualsAndHashCode.Include
    private long id;
    private float amount;
    private TeacherDto teacher;

    public CompteDto(float amount, TeacherDto teacher) {
        this.amount = amount;
        this.teacher = teacher;
    }
}
