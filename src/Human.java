import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private final String name;
    private String town;
    private final String job;

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

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth>=0){
        this.yearOfBirth = yearOfBirth;}
        else {
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        }
        else {
            this.town = "Информация не указана";
        }
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth<0){
            this.yearOfBirth =0;
        }else {
            this.yearOfBirth= LocalDate.now().getYear() - yearOfBirth;
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
