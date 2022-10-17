public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth<0){
            this.yearOfBirth =0;
        }else {
            this.yearOfBirth=2022 - yearOfBirth;
        }
        if (name==null){
            this.name =" Информация не указана";
        }else {
            this.name = name;
        }
        if (town==null){
            this.town =" Информация не указана";
        }else {
            this.town = town;
        }
        if (job==null){
            this.job =" Информация не указана";
        }else {
            this.job = job;        }

    }

    void printGreeting() {
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в "
                + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");
    }
}
