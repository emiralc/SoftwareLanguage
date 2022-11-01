package kodlama.po.softwareController.dataAccess.abstracts;

import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageRepository {

    void add(SoftwareLanguage softwareLanguage);
    void delete(SoftwareLanguage softwareLanguage);
    void update(SoftwareLanguage softwareLanguage);
    List<SoftwareLanguage> getAll();
    SoftwareLanguage getById(int id);
}
