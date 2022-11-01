package kodlama.po.softwareController.entities.concretes;

public class SoftwareLanguage {
    private String name;
    private int id;

    public SoftwareLanguage() {
    }

    public SoftwareLanguage(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
