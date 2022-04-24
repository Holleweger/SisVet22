
package Model;

import java.util.Date;

public class Attendance {
    private int id;
    private Date dateAttendance;
    private Animal Animal;
    private Vet Vet;
    private String details;

    // CONSTRUCTORS
    
    public Attendance(int id, Date dateAttendance, Animal Animal, Vet Vet, String details) {
        this.id = id;
        this.dateAttendance = dateAttendance;
        this.Animal = Animal;
        this.Vet = Vet;
        this.details = details;
    }

    public Attendance() {
    }

    // GETTERS AND SETTERS
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAttendance() {
        return dateAttendance;
    }

    public void setDateAttendance(Date dateAttendance) {
        this.dateAttendance = dateAttendance;
    }

    public Animal getAnimal() {
        return Animal;
    }

    public void setAnimal(Animal Animal) {
        this.Animal = Animal;
    }

    public Vet getVet() {
        return Vet;
    }

    public void setVet(Vet Vet) {
        this.Vet = Vet;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
