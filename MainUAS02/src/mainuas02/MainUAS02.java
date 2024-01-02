/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainuas02;

/**
 *
 * @author MyBook Z Series
 */
abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println( this.getName() +" Memimpin tim dan membuat keputusan");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " Menentukan persyaratan, membuat kode, dan menguji aplikasi");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " Membuat desain grafis dan antarmuka pengguna");
    }
}

public class MainUAS02 {

    public static void main(String[] args) {
        Manager manajer = new Manager("Danish Fadlan Azam");
        Developer pengembang = new Developer("Bintang Nusantara");
        Designer desainer = new Designer("Asmalik Hudri");
        
        manajer.work();        
        pengembang.work();
        desainer.work();
    }
}

