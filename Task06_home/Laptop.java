package Task06_home;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

    private String ram;
    private String hdd;
    private String operating_system;
    private String diagonal;
    private String brend;

    
    // private Integer weight;
    // private String color;
    private String country;

    public Laptop(String brend,String operating_system, String ram,String hdd, String diagonal, String country) {
        this.operating_system = operating_system;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.brend=brend;
        // this.color=color;
        this.country = country;
        // this.weight=weight;

    }
   

    public void setBrend(String brend) {
    this.brend = brend;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
    // public void setWeight(Integer weight) {
    // this.weight = weight;
    // }
    // public void setColour(String color) {
    // this.color = color;
    // }

    public String getBrend() {
        return brend;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getDiagonal() {
        return diagonal;
    }

    // public Integer getWeight() {
    // return weight;
    // }
    // public String getColour() {
    // return color;
    // }
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("\nБрэнд - %s \nОперецинная система - %s\n" +
                "оперативная память -  %s Гб  постоянная память - %s Гб  диаганаль - %s страна - %s"
                , brend, operating_system, ram, hdd, diagonal, country);
    }
    
}