package com.example.backend.Service;

import com.example.backend.Entity.Reclamation;
import com.example.backend.Repo.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {
    private  final ReclamationRepository reclamationRepository;
    @Autowired
    public ReclamationService(ReclamationRepository reclamationRepository){
        this.reclamationRepository = reclamationRepository;
    }

   public List<Reclamation> GetAllReclamation(){
        return reclamationRepository.findAll();
    }

    public Reclamation saveReclamation(Reclamation reclamation){
        return reclamationRepository.save(reclamation);
    }
}
