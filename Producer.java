public class Producer extends Human{
    private int filmCount;

    public Producer() {
    }

    public Producer(String name, String bornCountry, int bornYear, char gender, int filmCount) {
        super(name, bornCountry, bornYear, gender);
        this.filmCount = filmCount;
    }

    public int getFilmCount() {
        return filmCount;
    }

    public void setFilmCount(int filmCount) {
        this.filmCount = filmCount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nКоличество фильмов: " + filmCount;
    }
}
