package com.example.backend.Controller;

import com.example.backend.Entity.Reclamation;
import com.example.backend.Entity.St;
import com.example.backend.Repo.ReclamationRepository;
import com.example.backend.Service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/reclamation")

public class ReclamationController {
    @Autowired
    private ReclamationService reclamationService;
    @Autowired
    private ReclamationRepository reclamationRepository;

    @PostMapping("/reclamation")
    public Reclamation submitReclamation(@RequestBody Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }
    @GetMapping("")
     public List<Reclamation> GetAllReclamation(){
        return reclamationService.GetAllReclamation();
    }
}

