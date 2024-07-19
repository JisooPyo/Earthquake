package exam;

/**
 * Author : JisooPyo
 * When : Jul, 19, 2024
 * Objective : exam.Patient Entity
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Patient {
    private int num;                // 번호
    private String dept;            // 부서
    private int days;               // 입원일수
    private int age;                // 나이
    private int consultationFee;    // 진찰비
    private int hospitalizationFee; // 입원비
    private int medicalFee;         // 진료비

    public Patient(int num, String dept, int days, int age) {
        this.num = num;
        this.dept = dept;
        this.days = days;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public String getDept() {
        return dept;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public int getHospitalizationFee() {
        return hospitalizationFee;
    }

    public int getMedicalFee() {
        return medicalFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void setHospitalizationFee(int hospitalizationFee) {
        this.hospitalizationFee = hospitalizationFee;
    }

    public void setMedicalFee(int medicalFee) {
        this.medicalFee = medicalFee;
    }

    @Override
    public String toString() {
        return String.format(
            "%-7d\t%7s\t%10d\t%10d\t%13d",
            num, dept, consultationFee, hospitalizationFee, medicalFee
        );
    }
}
