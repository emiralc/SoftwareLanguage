package kodlama.po.softwareController.webApi.controllers;

import kodlama.po.softwareController.business.abstracts.SoftwareLanguageService;
import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //annotation
@RequestMapping("/api/softwarelanguages")
public class SoftwareLanguagesController {


    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguagesController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll(){
        return softwareLanguageService.getAll();
    }


    @PostMapping("/add")
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        softwareLanguageService.add(softwareLanguage);
    }

    @PutMapping("/update")
    public void update(SoftwareLanguage softwareLanguage) {
        softwareLanguageService.update(softwareLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(SoftwareLanguage softwareLanguage) {
        softwareLanguageService.delete(softwareLanguage);
    }

    @GetMapping("/getId")
    public SoftwareLanguage getById(int id) {
        return softwareLanguageService.getById(id);
    }



}
