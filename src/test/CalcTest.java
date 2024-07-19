package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import exam.Calc;
import exam.Patient;

/**
 * Author : JisooPyo
 * When : Jul, 19, 2024
 * Objective : Calc class Test
 * Environment : Windows 10 22H2(OS build 19045.4651), openjdk 17.0.11, IntelliJ 2024.1.4
 */
class CalcTest {

    @Test
    void calc() {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(7, "외과", 3, 31));
        Calc calc = new Calc(patients);
        calc.calc();

        // 진찰비 테스트
        assertEquals(7000, patients.get(0).getConsultationFee());
        // 입원비 테스트
        assertEquals(90000, patients.get(0).getHospitalizationFee());
        // 진료비 테스트
        assertEquals(97000, patients.get(0).getMedicalFee());
    }
}