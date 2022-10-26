public class ScreenWriter extends Human{
    private int salary;

    public ScreenWriter() {
    }

    public ScreenWriter(String name, String bornCountry, int bornYear, char gender, int salary) {
        super(name, bornCountry, bornYear, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nЗарплата: " + salary;
    }
}
