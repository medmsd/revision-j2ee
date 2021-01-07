package tn.iit.revision.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TeacherDto {
    @EqualsAndHashCode.Include
    private long id;
    private String firstName;
    private String lastName;

    public TeacherDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
