public class Actor extends Human{
    private boolean oscar;

    public Actor() {
    }

    public Actor(String name, String bornCountry, int bornYear, char gender, boolean oscar) {
        super(name, bornCountry, bornYear, gender);
        this.oscar = oscar;
    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nПремия Оскар: " + oscar;

    }
}

