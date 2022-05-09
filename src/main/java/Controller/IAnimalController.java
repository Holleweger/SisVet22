
package Controller;
import Model.Animal;
import Model.Clinic;
import java.util.ArrayList;

public interface IAnimalController {
    public void insertAnimal(int idClinic,Animal animal);
    public Animal updateAnimal(int idClinic,Animal animal);
    public Animal deleteAnimal(int idClinic,Animal animal);
    public Animal searchAnimal(int idClinic,int idAnimal);
    public ArrayList<Animal> searchAnimal(int idClinic,String name);
}
