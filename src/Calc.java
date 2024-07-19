import java.util.List;

/**
 * Author : JisooPyo
 * When : Jul, 19, 2024
 * Objective : 환자의 입원비, 진찰비, 진료비를 계산합니다.
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Calc {
    List<Patient> patients;

    public Calc(List<Patient> patients) {
        this.patients = patients;
    }

    public void calc() {
        for (Patient patient : patients) {
            // 입원비 계산
            int hospitalizationFee = calculateHospitalizationFee(patient);
            patient.setHospitalizationFee(hospitalizationFee);

            // 진찰비 계산
            int consultationFee = calculateConsultationFee(patient);
            patient.setConsultationFee(consultationFee);

            // 진료비 계산
            patient.setMedicalFee(hospitalizationFee + consultationFee);
        }
    }

    // 입원비를 계산합니다.
    private int calculateConsultationFee(Patient patient) {
        int age = patient.getAge();
        return
            age >= 50 ? 2300 :
                age >= 40 ? 4500 :
                    age >= 30 ? 7000 :
                        age >= 20 ? 8000 :
                            age >= 10 ? 5000 : 7000;
    }

    // 진찰비를 계산합니다.
    private int calculateHospitalizationFee(Patient patient) {
        int dayFee = patient.getDays() <= 3 ? 30000 : 25000;
        int days = patient.getDays();
        int totalFee = dayFee * days;
        double discountRate =
            days >= 100 ? 0.68 :
                days >= 30 ? 0.72 :
                    days >= 20 ? 0.77 :
                        days >= 15 ? 0.80 :
                            days >= 10 ? 0.85 : 1.00;
        return (int)(totalFee * discountRate);
    }
}
