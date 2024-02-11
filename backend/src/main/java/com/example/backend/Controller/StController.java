package com.example.backend.Controller;

import com.example.backend.Entity.St;
import com.example.backend.Service.StService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/st")
public class StController {

    @Autowired
    private StService stService;
    @PostMapping(value="/save")
    public String saveSt(@RequestBody St sts)
    {
        stService.saveorUpdate(sts);
        return sts.get_id();
    }
    @GetMapping(value="/get-all")
    public Iterable<St>getSts()
    {
        return stService.listALL();
    }
    @PutMapping (value="/edit/{id}")
    private St update (@RequestBody St st,@PathVariable(name="id")String _id)
    {
       st.set_id(_id);
        stService.saveorUpdate(st);
        return st;
    }
    @DeleteMapping("/delete/{id}")
    private void deleteSt(@PathVariable("id") String _id)
    {
        stService.deleteSt(_id);
    }


    @RequestMapping("/search/{id}")
    private St getSts(@PathVariable(name="id") String stid)
    {
        return stService.getStbyID(stid);
    }



}
