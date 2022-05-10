
package Controller;
import Data.DataSetClinic;
import Model.Animal;
import java.util.ArrayList;


public class AnimalController implements IAnimalController {

    @Override
    public void insertAnimal(int idClinic,Animal animal) {
        DataSetClinic.data.get(idClinic).getAnimals().add(animal);
    }

    @Override
    public Animal updateAnimal(int idClinic,Animal animal) {
        return null;
    }

    @Override
    public Animal deleteAnimal(int idClinic, Animal animal) {
        DataSetClinic.data.get(idClinic).getAnimals().remove(animal);
        return animal;
    }

    @Override
    public ArrayList<Animal> searchAnimal(int idClinic,String name) {
        ArrayList<Animal> listaRetorno = new ArrayList<Animal>();
        for( Animal a : DataSetClinic.data.get(idClinic).getAnimals())
        {
            if( a.getName().toLowerCase().contains(name.toLowerCase()))
            {
              listaRetorno.add(a);
            }
        }
        return listaRetorno;
    }

    @Override
    public Animal searchAnimal(int idClinic, int idAnimal) {
        Animal retorno = null;
        
        for( Animal a : DataSetClinic.data.get(idClinic).getAnimals())
        {
            if( a.getId() == idAnimal )
            {
                retorno = a;
                break;
            }
        }
        
        
        return retorno;
    }

    public int getNextId(int idClinic){
        int retorno = 0;
        for(Animal a : DataSetClinic.data.get(idClinic).getAnimals()){  
           if(a.getId() > retorno){
               retorno = a.getId();     
           } 
        }
        return (retorno + 1) ;
    }
    
    public ArrayList<Animal> getAnimals (int idClinic){
        return DataSetClinic.data.get(idClinic).getAnimals();
    }
}
