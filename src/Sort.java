import java.util.List;

/**
 * Author : JisooPyo
 * When : Jul, 19, 2024
 * Objective : 환자 리스트를 환자 번호에 맞게 정렬합니다.
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Sort {
    List<Patient> patients;

    public Sort(List<Patient> patients) {
        this.patients = patients;
    }

    public void sort() {
        patients.sort((a, b) -> a.getNum() - b.getNum());
    }
}
