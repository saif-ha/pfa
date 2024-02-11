package com.example.backend.Service;

import com.example.backend.Entity.St;
import com.example.backend.Repo.StRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StService {
    @Autowired
    private StRepo repo;
    public void saveorUpdate(St sts) {
        repo.save(sts);
    }

    public Iterable<St> listALL() {
      return this.repo.findAll();
    }


    public void deleteSt(String id) {
        repo.deleteById(id);
    }

    public St getStbyID(String stid) {
        return  repo.findById(stid).get();
    }
}
