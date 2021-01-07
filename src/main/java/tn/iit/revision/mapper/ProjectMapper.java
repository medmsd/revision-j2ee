package tn.iit.revision.mapper;

import tn.iit.revision.dto.ProjectDto;
import tn.iit.revision.models.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectMapper {
    public static ProjectDto projectToProjectDto(Project project) {
        ProjectDto projectDto = new ProjectDto ();
        projectDto.setName (project.getName ());
        projectDto.setId (project.getId ());
        projectDto.setTeacher (TeacherMapper.teacherToTeacherDto (project.getTeacher ()));
        projectDto.setStudents (StudentMapper.studentsToStudentDtos (project.getStudents ()));
        return projectDto;
    }

    public static Project projectDtoToProject(ProjectDto projectDto) {
        Project project = new Project ();
        project.setStudents (StudentMapper.studentDtosToStudents (projectDto.getStudents ()));
        project.setName (projectDto.getName ());
        project.setId (projectDto.getId ());
        project.setTeacher (TeacherMapper.teacherDtoToTeacher (projectDto.getTeacher ()));
        return project;
    }

    public static List<ProjectDto> projectsToProjectDtos(List<Project> projects) {
        List<ProjectDto> projectDtoList = new ArrayList<> ();
        projects.forEach (project -> {
            projectDtoList.add (projectToProjectDto (project));
        });
        return projectDtoList;
    }
    public static List<Project> projectDtosToProjects(List<ProjectDto> projectDtoList) {
        List<Project> projects = new ArrayList<> ();
        projectDtoList.forEach (project -> {
            projects.add (projectDtoToProject (project));
        });
        return projects;
    }
}
