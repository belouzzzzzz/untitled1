public abstract class SweetBox {
   private String name;
   private Double weight;
   private Double price;
   private String param;

    public SweetBox(String name, Double weight, Double price, String param) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
    public String toString(){
        return "название = "+name+", вес = "+weight+", стоимость = "+price+", параметр = " +param;
    }

}
