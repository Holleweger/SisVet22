package Controller;

import Model.Vet;
import java.util.ArrayList;


public interface IVetController {
    
    public void insertVet( int idClinic, Vet vet);
    public Vet updateVet(int idClinic, Vet vet);
    public Vet deleteVet(int idClinic, Vet vet);
    public Vet searchVet(int idClinic, int idVet);
    public ArrayList<Vet> searchVet( int idClinic, String name );
    
}