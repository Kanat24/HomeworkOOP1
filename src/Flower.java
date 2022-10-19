public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor!=null && !flowerColor.isEmpty() && !flowerColor.isBlank() ){
            this.flowerColor = flowerColor ;
        } else {
        this.flowerColor = "Белый" ;
        }
        if (country!=null && !country.isBlank() && !country.isEmpty()){
            this.country = country ;
        } else {
            this.country = "Россия";
        }
        if (cost>0){
        this.cost = cost;
        }
        else {
            this.cost =1;
        }
        if (lifeSpan>0){
        this.lifeSpan = lifeSpan;
    }
        else this.lifeSpan = 3;
    }

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }


}
