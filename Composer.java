public class Composer extends Human{
    private String musicalInstrument;
    private String music;

    public Composer() {
    }

    public Composer(String name, String bornCountry, int bornYear, char gender, String musicalInstrument, String music) {
        super(name, bornCountry, bornYear, gender);
        this.musicalInstrument = musicalInstrument;
        this.music = music;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public void setMusicalInstrument(String musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return super.toString() + "\nМузыкальный инструмент: " + musicalInstrument;
    }
}
