package tn.iit.revision.mapper;

import tn.iit.revision.dto.StudentDto;
import tn.iit.revision.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMapper {
    public static StudentDto studentToStudentDto(Student student){
        StudentDto studentDto = new StudentDto ();
        studentDto.setFirstName (student.getFirstName ());
        studentDto.setLastName (student.getLastName ());
        studentDto.setId (student.getId ());
        studentDto.setProjects (ProjectMapper.projectsToProjectDtos (student.getProjects ()));
        return studentDto;
    }
    public static Student studentDtoToStudent (StudentDto studentDto){
        Student student = new Student ();
        student.setFirstName (studentDto.getFirstName ());
        student.setLastName (studentDto.getLastName ());
        student.setId (studentDto.getId ());
        student.setProjects (ProjectMapper.projectDtosToProjects (studentDto.getProjects ()));
        return student;
    }
    public static List<StudentDto> studentsToStudentDtos(List<Student> students)
    {
        List<StudentDto> studentDtoList = new ArrayList<> ();
        students.forEach(student -> {
            studentDtoList.add (studentToStudentDto (student));
        });
        return studentDtoList;
    }
    public static List<Student> studentDtosToStudents(List<StudentDto> studentDtoList)
    {
        List<Student> students = new ArrayList<> ();
        studentDtoList.forEach(student -> {
            students.add (studentDtoToStudent (student));
        });
        return students;
    }
}
