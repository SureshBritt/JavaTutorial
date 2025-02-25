import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadObjectsSerilizing {

    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {

            // Read entire array
            PersonSerilaizing[] people = (PersonSerilaizing[])os.readObject();

            // Read entire arraylist
            @SuppressWarnings("unchecked")
            ArrayList<PersonSerilaizing> peopleList = (ArrayList<PersonSerilaizing>)os.readObject();

            for(PersonSerilaizing person: people) {
                System.out.println(person);
            }

            for(PersonSerilaizing person: peopleList) {
                System.out.println(person);
            }

            // Read objects one by one.
            int num = os.readInt();

            for(int i=0; i<num; i++) {
                PersonSerilaizing person = (PersonSerilaizing)os.readObject();
                System.out.println(person);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}