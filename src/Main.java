public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human kate = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(-10, "Артем", "Москва", "директор по развитию бизнеса");
        maxim.printGreeting();
        anna.printGreeting();
        kate.printGreeting();
        artem.printGreeting();

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}