package pattern.composite;

public class App {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Medicinal drug1 = new Paracetamol();
        Medicinal drug2 = new Paracetamol();
        Medicinal drug3 = new Gramicidin();

        pharmacy.addMedicine(drug1);
        pharmacy.addMedicine(drug2);
        pharmacy.addMedicine(drug3);

        pharmacy.createPrescription();
    }
}
