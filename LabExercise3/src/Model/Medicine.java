
package Model;


public class Medicine {
    String medicineName;
    Double dosage;
    
    public Medicine() {
        
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }
    
}
