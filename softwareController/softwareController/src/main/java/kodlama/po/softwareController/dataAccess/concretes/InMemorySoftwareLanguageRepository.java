package kodlama.po.softwareController.dataAccess.concretes;

import kodlama.po.softwareController.SoftwareControllerApplication;
import kodlama.po.softwareController.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {

    InMemorySoftwareLanguageRepository inMemorySoftwareLanguageRepository;
    private List<SoftwareLanguage> softwareLanguages;




    public InMemorySoftwareLanguageRepository() {



        softwareLanguages=new ArrayList<>();
        softwareLanguages.add(new SoftwareLanguage(1,"C#"));
        softwareLanguages.add(new SoftwareLanguage(2,"Java"));
        softwareLanguages.add(new SoftwareLanguage(3,"Python"));








    }



    @Override
    public void add(SoftwareLanguage softwareLanguage) {
        softwareLanguages.add(softwareLanguage);
    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {
        softwareLanguages.remove(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {

        for(SoftwareLanguage softwareLanguage1: softwareLanguages){
            if(softwareLanguage.getId()==softwareLanguage1.getId()){
                softwareLanguage1.setName(softwareLanguage.getName());

            }

        }
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguages;
    }

    @Override
    public SoftwareLanguage getById(int id) {
        for(SoftwareLanguage softwareLanguage: softwareLanguages){
            if(softwareLanguage.getId()==id){
                return softwareLanguage;
            }

        }

        return null;
    }
}
