package tn.iit.revision.mapper;

import tn.iit.revision.dto.CompteDto;
import tn.iit.revision.models.Compte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CompteMapper {
    public static CompteDto compteToCompteDto(Compte compte){
        CompteDto compteDto = new CompteDto ();
        compteDto.setAmount (compte.getAmount ());
        compteDto.setId (compte.getId ());
        compteDto.setTeacher (TeacherMapper.teacherToTeacherDto (compte.getTeacher ()));
        return compteDto;
    }
    public static Compte compteDtoToCompte (CompteDto compteDto){
        Compte compte = new Compte ();
        compte.setAmount (compteDto.getAmount ());
        compte.setId (compteDto.getId ());
        compte.setTeacher (TeacherMapper.teacherDtoToTeacher (compteDto.getTeacher ()));
        return compte;
    }
    public static List<CompteDto> comptesToCompteDtos(List<Compte> comptes)
    {
        List<CompteDto> compteDtoList = new ArrayList<> ();
        comptes.forEach(compte -> {
            compteDtoList.add (compteToCompteDto (compte));
        });
        return compteDtoList;
    }
}
