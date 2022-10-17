public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand==null){
            this.brand= "default";
        }
        else{
            this.brand = brand;
        }
        if (model==null){
            this.model= "default";
        }
        else{
            this.model = model;
        }
        if (Double.compare(engineVolume, 0)==0){
            this.engineVolume= 1.5;
        }
        else{
            this.engineVolume = engineVolume;
        }
        if (color==null){
            this.color= "Белый";
        }
        else{
            this.color = color;
        }
        if (productionYear==0){
            this.productionYear= 2000;
        }
        else{
            this.productionYear = productionYear;
        }
        this.productionYear = productionYear;
        if (productionCountry==null){
            this.productionCountry= "default";
        }
        else{
            this.productionCountry = productionCountry;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }
}
