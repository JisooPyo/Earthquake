package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import exam.Patient;
import exam.Sort;
/*
 * Author : Jinhee Lim
 * When : Jul, 19, 2024
 * Objective : Sort class Test
 * Environment : Windows 10 Pro, openjdk 17.0.11, IntelliJ 2024.1.4
 */
public class SortTest {

    @Test
    void sort() {
        List<Patient> list = new ArrayList<Patient>();
        Sort sort = new Sort(list);
        Patient p1 = new Patient(3, "MI", 3, 10);
        Patient p2 = new Patient(1, "MI", 3, 10);
        Patient p3 = new Patient(10, "MI", 3, 10);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        sort.sort();
        assertEquals(10, list.get(2).getNum());
    }
}
