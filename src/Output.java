import java.util.List;

/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : 콘솔에 병원 관리 프로그램을 출력합니다.
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Output {
    List<Patient> list;

    public Output(List<Patient> list) {
        this.list = list;
    }

    public void output() {
        label();
        for (Patient p : this.list) {
            System.out.println(p);
        }
    }

    private void label() {
        System.out.println("                 <<병원 관리 프로그램>>");
        System.out.println("--------------------------------------------------------");
        System.out.println("번호\t    진찰부서\t     진찰비\t    입원비\t        진료비\t");
        System.out.println("---------------------------------------------------------");
    }
}
