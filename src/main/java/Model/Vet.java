
package Model;

public class Vet {
    private int id;
    private String name;
    private String CRV;
    
    //CONSTRUCTORS

    public Vet(int id, String name, String CRV) {
        this.id = id;
        this.name = name;
        this.CRV = CRV;
    }

    public Vet() {
    }
    
    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCRV() {
        return CRV;
    }

    public void setCRV(String CRV) {
        this.CRV = CRV;
    }
    
    
    
}




