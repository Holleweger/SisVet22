
package Model;

import java.util.ArrayList;

public class Clinic {
   private int id;
   private String name;
   
   private ArrayList<Vet> vets =
           new ArrayList<Vet>();
   
   private ArrayList<Animal> animals = 
           new ArrayList<Animal>();
   
   private ArrayList<Attendance> attendances =
           new ArrayList<Attendance>();
   
   
   //CONSTRUCTOR

    public Clinic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Clinic() {
    }

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

    public ArrayList<Vet> getVets() {
        return vets;
    }

    public void setVets(ArrayList<Vet> vets) {
        this.vets = vets;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(ArrayList<Attendance> attendances) {
        this.attendances = attendances;
    }
   
   
}


    
