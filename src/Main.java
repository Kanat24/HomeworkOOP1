import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(-10, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(21,"Владимир", "Казань", "нигде не работает");
        maxim.printGreeting();
        anna.printGreeting();
        kate.printGreeting();
        artem.printGreeting();
        vladimir.printGreeting();

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        lada.setTransmission("Automat");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setRegistrationNumber("H084АК142");
        System.out.println(audi.correctNumber());
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        bmw.setSummerTires(false);
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Flower roza = new Flower("", "Голландия", 35.59);
        Flower xrizantema = new Flower("", "", 15.00, 5);
        Flower pion = new Flower("", "Англия", 69.90, 1);
        Flower gipsofila = new Flower("", "Турция", 19.5, 10);
        System.out.println(roza);
        System.out.println(xrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);
        collectABouquet(roza,roza,roza,xrizantema,xrizantema,xrizantema,xrizantema,xrizantema,gipsofila);



    }
    public static void collectABouquet(Flower... flowers){
        double totalCost =0;
        int minLifeSpan =Integer.MAX_VALUE;
        for (Flower flower:flowers){
            if (flower.lifeSpan<minLifeSpan){
                minLifeSpan = flower.lifeSpan;
            }
            totalCost+=flower.getCost();
        }
        totalCost=totalCost*1.1;
        System.out.printf("Стоимость букета равна : %.2f%n", totalCost);
        System.out.println("Букет простоит : " + minLifeSpan);


    }
}