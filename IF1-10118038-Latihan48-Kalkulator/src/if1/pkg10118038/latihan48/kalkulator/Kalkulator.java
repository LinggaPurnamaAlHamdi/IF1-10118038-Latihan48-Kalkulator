/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan48.kalkulator;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Kalkulator
 */
public class Kalkulator {
    private double value1, value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        System.out.println(note);
    }
    
    public double add(double value1, double value2) {
       return value1 + value2; 
    }
    
    public double minus(double value1, double value2) {
        return value1 - value2;
    }
    
    public double multiplication(double value1, double value2) {
        return value1 * value2;
    }
    
    public double division(double value1, double value2) {
        return value1 / value2;
    }
}
