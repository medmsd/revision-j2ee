package tn.iit.revision.mapper;

import tn.iit.revision.dto.TeacherDto;
import tn.iit.revision.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherMapper {
    public static TeacherDto teacherToTeacherDto(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto ();
        teacherDto.setFirstName (teacher.getFirstName ());
        teacherDto.setLastName (teacher.getLastName ());
        teacherDto.setId (teacher.getId ());
        return teacherDto;
    }
    public static Teacher teacherDtoToTeacher (TeacherDto teacherDto){
        Teacher teacher = new Teacher ();
        teacher.setFirstName (teacherDto.getFirstName ());
        teacher.setLastName (teacherDto.getLastName ());
        teacher.setId (teacherDto.getId ());
        return teacher;
    }
    public static List<TeacherDto> teachersToTeacherDtos(List<Teacher> teachers)
    {
        List<TeacherDto> teacherDtoList = new ArrayList<> ();
        teachers.forEach(teacher -> {
            teacherDtoList.add (teacherToTeacherDto(teacher));
        });
        return teacherDtoList;
    }
}
