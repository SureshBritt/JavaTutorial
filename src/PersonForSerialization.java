import java.io.Serializable;

public class PersonForSerialization implements Serializable {

    private static final long serialVersionUID = 4801633306273802062L;

    private int id;
    private String name;

    public PersonForSerialization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}

