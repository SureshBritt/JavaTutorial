import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
 
 
 
public class ReadObjects {
 
     
    public static void main(String[] args) {
        System.out.println("Reading objects...");
 
        try(FileInputStream fi = new FileInputStream("people.bin")) {
             
            ObjectInputStream os = new ObjectInputStream(fi);

            PersonForSerialization person1 = (PersonForSerialization)os.readObject();
            PersonForSerialization person2 = (PersonForSerialization)os.readObject();
             
            os.close();
             
            System.out.println(person1);
            System.out.println(person2);
             
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