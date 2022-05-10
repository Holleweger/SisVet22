package View;
import java.util.Scanner;
import Controller.ClinicController;
import Data.DataSetClinic;
import Model.Clinic;


public class ClinicView {
    
    private Scanner sc = new Scanner(System.in);
    private ClinicController clinicController = new ClinicController();
    
    /*Método construtor da View de Clínica
    Quando a View de Clínica for instanciada,
    automaticamente o método de inicialização
    será também invocado*/
    public ClinicView(){
        DataSetClinic.data.add(new Clinic(1,"Amigo do Bicho"));
        DataSetClinic.data.add(new Clinic(2,"Pet Lovers"));
        this.InitClientView();
    }
    
    private void InitClientView(){
        System.out.print("""
                           *********************** 
                           **BEM-VINDO AO SISVET** 
                           *********************** 
                           """);
        
        System.out.println(DataSetClinic.data.size() + " clínicas cadastradas. \n");
        
        int op = 0;
        do {            
            System.out.print("""
                              
                               ***********MENU************                      
                                #1 - Incluir Cl\u00ednica 
                                #2 - Selecionar Cl\u00ednica 
                                #0 - Sair 
                               ***************************
                               """);
            
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    break;
                case 2:
                    this.SelectClinic();
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            
        } while (op !=0);
        
    }
    
    private void SelectClinic(){
        int op = 0;
        do {
            System.out.println("""
                               **Selecione o código da clínica**
                               """);
            for(Clinic c : DataSetClinic.data){
                System.out.println(c.getId() + " - " + c.getName());
            }
            op = sc.nextInt();
            DataSetClinic.selectedClinic = this.clinicController.searchClinic(op);
            if (DataSetClinic.selectedClinic == null) {
                System.out.println("Clinica Inválida");
                op = 0;
            }
        } while (op == 0);
}
}
