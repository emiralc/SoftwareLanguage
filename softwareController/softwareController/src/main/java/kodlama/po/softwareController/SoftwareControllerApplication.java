package kodlama.po.softwareController;

import kodlama.po.softwareController.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.po.softwareController.dataAccess.concretes.InMemorySoftwareLanguageRepository;
import kodlama.po.softwareController.entities.concretes.SoftwareLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SoftwareControllerApplication  {


	public static void main(String[] args) {

/*
        List<SoftwareLanguage> softwareLanguages;
		softwareLanguages=new ArrayList<>();
		softwareLanguages.add(new SoftwareLanguage(1,"C#"));
		softwareLanguages.add(new SoftwareLanguage(2,"Java"));
		softwareLanguages.add(new SoftwareLanguage(3,"Python"));




		InMemorySoftwareLanguageRepository inMemorySoftwareLanguageRepository=new InMemorySoftwareLanguageRepository(softwareLanguages);
		*/






		SpringApplication.run(SoftwareControllerApplication.class, args);



	}




}
