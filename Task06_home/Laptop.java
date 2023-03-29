public class Laptop{
   
    private Integer ram;
    private Integer hdd;
    private String operating_system;
    private Integer diagonal;
    private Integer weight;
    private String colour;
    private String manufacturer;

   


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
    public void setColour(String colour) {
        this.colour = colour;
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
        return colour;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    


}