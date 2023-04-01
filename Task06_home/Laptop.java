public class Laptop{
   
    private Integer ram;
    private Integer hdd;
    private String operating_system;
    private Integer diagonal;
    private Integer weight;
    private String color;
    private String country;

   public Laptop( String operating_system, Integer ram, Integer hdd,Integer diagonal, String color,String country,Integer weight) {
    this.operating_system=operating_system;
    this.ram=ram;
    this.hdd= hdd;
    this.diagonal=diagonal;
    this.color=color;
    this.country=country;
    this.weight=weight;
    
    
   }


    public void setCountry(String country) {
        this.country = country;
    }
    
    public void setRam(Integer ram) {
        this.ram = ram;
    }
    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }
    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }
    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public void setColour(String color) {
        this.color = color;
    }


    
    public Integer getRam() {
        return ram;
    }
    public Integer getHdd() {
        return hdd;
    }
    public String getOperating_system() {
        return operating_system;
    }
    public Integer getDiagonal() {
        return diagonal;
    }
    public Integer getWeight() {
        return weight;
    }
    public String getColour() {
        return color;
    }
    public String getCountry() {
        return country;
    }

    public String toString() {
        return String.format("%s:%s", operating_system,ram,hdd,diagonal,color, country, weight);
    }

    // public String toString() {
    //     return ""
        
    // }


}