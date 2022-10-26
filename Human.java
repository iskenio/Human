public class Human {
    private String name;
    private String bornCountry;
    private int bornYear;
    private char gender;

    public Human() {
    }

    public Human(String name, String bornCountry, int bornYear, char gender) {
        this.name = name;
        this.bornCountry = bornCountry;
        this.bornYear = bornYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public void setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Имя: " + name +
                "\nМесто рождения: " + bornCountry +
                "\nГод рождения: " + bornYear +
                "\nПол: " + gender;
    }
}
