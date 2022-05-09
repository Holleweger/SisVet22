package Controller;

import Data.DataSetClinic;
import Model.Vet;
import java.util.ArrayList;


public class VetController implements IVetController{

    @Override
    public void insertVet(int idClinic, Vet vet) 
    {
        DataSetClinic.data.get(idClinic).getVets().add(vet);
    }

    @Override
    public Vet updateVet(int idClinic, Vet vet) 
    {
        return null;
        
    }

    @Override
    public Vet deleteVet(int idClinic, Vet vet) 
    {
        DataSetClinic.data.get(idClinic).getVets().remove(vet);
        return vet;
    }

    @Override
    public Vet searchVet(int idClinic, int idVet) 
    {
        Vet retorno = null;
        
        for( Vet v : DataSetClinic.data.get(idClinic).getVets())
        {
            if( v.getId() == idVet )
            {
                retorno = v;
                break;
            }
        }
        
        
        return retorno;
    }

    @Override
    public ArrayList<Vet> searchVet(int idClinic, String name) {
        
        ArrayList<Vet> listaRetorno = new ArrayList<Vet>();
        for( Vet v : DataSetClinic.data.get(idClinic).getVets())
        {
            if( v.getName().toLowerCase().contains(name.toLowerCase()))
            {
              listaRetorno.add(v);
            }
        }
        return listaRetorno;
        
    }
    
    
    
}
