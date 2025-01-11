import java.io.Serializable;

public class PersonSerilaizing implements Serializable {

    private static final long serialVersionUID = 4801633306273802062L;

    private int id;
    private String name;

    public PersonSerilaizing(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}

