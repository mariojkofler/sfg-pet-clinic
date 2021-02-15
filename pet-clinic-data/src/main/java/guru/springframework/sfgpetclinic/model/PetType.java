package guru.springframework.sfgpetclinic.model;

/**
 * Created by mjk on 08.02.21
 */

public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
