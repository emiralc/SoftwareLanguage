package kodlama.po.softwareController.business.abstracts;

import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();


    void add(SoftwareLanguage softwareLanguage) throws Exception;
    void delete(SoftwareLanguage softwareLanguage);
    void update(SoftwareLanguage softwareLanguage);
    SoftwareLanguage getById(int id);


}
