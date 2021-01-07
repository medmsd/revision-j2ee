package tn.iit.revision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.revision.models.Compte;
import tn.iit.revision.services.CompteService;

import java.util.List;

@RequestMapping("/api/comptes")
@RestController()
public class CompteController {
    @Autowired
    private CompteService compteService;

    @GetMapping
    public List<Compte> findAll(){
        return this.compteService.findAll ();
    }

    @GetMapping("/{id}")
    public Compte find(@PathVariable ("id") long id){
        return this.compteService.find (id);
    }

    @PostMapping
    public void save(@RequestBody Compte compte) {
        this.compteService.add (compte);
    }

    @PutMapping
    public void update(@RequestBody Compte compte){
        this.compteService.update (compte);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") long id){
        this.compteService.delete (id);
    }

}
