package Data;

import Model.Clinic;
import java.util.ArrayList;


public abstract class DataSetClinic {
    
    /*Coleção de clínicas cadastradas no sistema,
    aqui a empresa poderia inserir todas as suas filiais*/
    public static ArrayList<Clinic> data =
            new ArrayList<Clinic>();
    
    /*Propriedade estática que será utilizada para identificar
    qual a clínica selecionado pelo usuário para operações no sistema*/
    public static Clinic selectedClinic;
    
}
