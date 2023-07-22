package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private List<Medicinal> medicines = new ArrayList<>();

    public void addMedicine(Medicinal drug) {
        medicines.add(drug);
    }

    public void removeMedicine(Medicinal drug) {
        medicines.remove(drug);
    }

    public void createPrescription() {
        System.out.println("create ");
        medicines.forEach(Medicinal::cure);
    }

}
