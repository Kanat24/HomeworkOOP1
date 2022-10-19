package transport;

import java.time.LocalDate;

public class Car {

    public  static class Insurance {
        private final LocalDate validity;
        private final int price;
        private final String number;


        public Insurance(LocalDate validity, int price, String number) {
            if (validity==null){
                this.validity=LocalDate.now().plusDays(365);
            }else {
            this.validity = validity;
            }
            this.price = price;
            if (number==null){
                this.number = "123456789";
            } else{
            this.number = number;}
        }

        public Insurance() {
           this(null, 0, null);
        }

        public LocalDate getValidity() {
            return validity;
        }

        public int getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void verifyValidity() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())){
                System.out.println("нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void verifynumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validity=" + validity +
                    ", price=" + price +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
    public static class Key {
        private boolean remoteEnginestart;
        private boolean keylessEntry;

        public Key() {
            this(false, false);
        }

        public Key(boolean remoteEnginestart, boolean keylessEntry) {
                this.remoteEnginestart = remoteEnginestart;
                this.keylessEntry = keylessEntry;

        }
        public boolean isRemoteEnginestart() {
            return remoteEnginestart;
        }

        public void setRemoteEnginestart(boolean remoteEnginestart) {
            this.remoteEnginestart = remoteEnginestart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEnginestart=" + remoteEnginestart +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry,
                "Механика", "универсал", "A340A0142", 5, true,
                new Key(), new Insurance());
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires, Key key, Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "x000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 3;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.summerTires = true;
        if (key==null){
            this.key = new Key();
        }else
            this.key = key;
        if (insurance==null){
            this.insurance = new Insurance();
        }else
            this.insurance = insurance;
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
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }
    public boolean correctNumber() {
        if (registrationNumber.length()!=9){
            return false;
        }
        char [] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])|| !Character.isAlphabetic(chars[5])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) ||!Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || !correctNumber()) {
            this.registrationNumber = "x000хх000";
        } else {
            this.registrationNumber = registrationNumber;
    }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public boolean changeTires(){
        summerTires=!summerTires;
        return summerTires;
    }



}
