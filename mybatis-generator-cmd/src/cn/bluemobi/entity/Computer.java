package cn.bluemobi.entity;

public class Computer {
    private Integer id;

    private String computeName;

    private String brand;

    private Integer runmem;

    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComputeName() {
        return computeName;
    }

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRunmem() {
        return runmem;
    }

    public void setRunmem(Integer runmem) {
        this.runmem = runmem;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}