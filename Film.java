import java.util.Arrays;

public class Film {
    private String filmName;
    private String genre;
    private int bujet;
    private Actor[] actor;
    private Producer producer;
    private Composer composer;
    private ScreenWriter screenWriter;
    private String studio;

    public Film() {
    }

    public Film(String filmName, String genre, int bujet, Actor[] actor, Producer producer, Composer composer, ScreenWriter screenWriter, String studio) {
        this.filmName = filmName;
        this.genre = genre;
        this.bujet = bujet;
        this.actor = actor;
        this.producer = producer;
        this.composer = composer;
        this.screenWriter = screenWriter;
        this.studio = studio;
    }

    public void filmInfo() throws InterruptedException {
        System.out.println("Название фильма:" + filmName);
        Thread.sleep(2000l);
        System.out.println("Жанр: " + genre);
        Thread.sleep(2000l);
        System.out.println("Бюджет: " + bujet);
        Thread.sleep(2000l);
        for (Actor a: actor){
            System.out.println("Актеры: " + a.getName());
            Thread.sleep(2000l);
        }
//        System.out.println("Актеры: " + Arrays.toString(actor).substring(1, Arrays.toString(actor).length()-1));

        System.out.println("Режиссер: " + producer.getName());
        Thread.sleep(2000l);
        System.out.println("Сценарист: " + screenWriter.getName());
        Thread.sleep(2000l);
        System.out.println("Композитор: " + composer.getName());
        Thread.sleep(2000l);
        System.out.println("Саундтрек: " + composer.getMusic());
        Thread.sleep(2000l);
        System.out.println("Производство: " + studio);
        Thread.sleep(2000l);

    }


//    @Override
//    public String toString() {
//        return  "Название фильма:" + filmName +
//                "\nЖанр: " + genre + '\'' +
//                "\nБюджет: " + bujet +
//                "\nАктеры: \n" + Arrays.toString(actor).substring(1, Arrays.toString(actor).length()-1) +
//                "\nРежиссер: \n" + producer +
//                "\nКомпозитор: \n" + composer +
//                "\nСценарист: \n" + screenWriter;
//    }
}
