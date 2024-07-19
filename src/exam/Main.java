package exam;

import java.util.ArrayList;
import java.util.List;

/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : 병원 관리 프로그램을 실행합니다.
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class Main {
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<>();

        Input input = new Input(list);
        input.input();

        Calc calc = new Calc(list);
        calc.calc();

        Sort sort = new Sort(list);
        sort.sort();

        Output output = new Output(list);
        output.output();

        System.out.println("Bye~!");
    }
}
