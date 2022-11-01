package kodlama.po.softwareController.business.consretes;

import kodlama.po.softwareController.business.abstracts.SoftwareLanguageService;
import kodlama.po.softwareController.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }


    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }



    @Override
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        List<SoftwareLanguage> softwareLanguages=softwareLanguageRepository.getAll();
        for(SoftwareLanguage softwareLanguage1: softwareLanguages){
            if(softwareLanguage1.getName().equals("") || softwareLanguage1.getName()==softwareLanguage.getName()){
                throw new Exception("Aynı isim veya boş girdiniz !!");
            }else{
                softwareLanguageRepository.add(softwareLanguage);
            }

        }

    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage) {
        softwareLanguageRepository.delete(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {
        softwareLanguageRepository.update(softwareLanguage);
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return softwareLanguageRepository.getById(id);
    }


}
