package Controller;

import Data.DataSetClinic;
import Model.Clinic;



public class ClinicController implements IClinicController {

    @Override
    public void insertClinic(Clinic clinic) {
        DataSetClinic.data.add(clinic);
    }

    @Override
    public Clinic updateClinic(Clinic clinic) {
        return null;
    }

    @Override
    public Clinic deleteClinic(Clinic clinic) {
        DataSetClinic.data.remove(clinic);
        return clinic;
    }

    @Override
    public Clinic searchClinic(int id) {
        Clinic retorno = new Clinic();
        for ( Clinic c : DataSetClinic.data ){
            if( c.getId() == id){
               retorno = c;
               break;
            }
        }
        return retorno;
    }
        
    @Override
    public Clinic searchClinic(String name) {
        
        Clinic retorno = new Clinic();
        for(int i = 0; i < DataSetClinic.data.size(); i++){
            if(DataSetClinic.data.get(i)
                    .getName().toLowerCase(). equals(name.toLowerCase()))
            {
                retorno = DataSetClinic.data.get(i);
                break;
            }
        }
        return retorno;
    }
    
    public int getNextId()
    {
        int id = 0;
        for( Clinic c : DataSetClinic.data ){
            if( c.getId() > id )
            {
                id = c.getId();
            }
        }
        
        return(id + 1);
    }
    
    public int getClinicIndex(int idClinic)
    {
        return DataSetClinic.data.indexOf( searchClinic(idClinic) );
    }
    
    
    
}
