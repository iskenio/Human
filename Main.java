public class Main {
    public static void main(String[] args) throws InterruptedException {
        Actor actor1 = new Actor("Ryan Gosling", "Kyrgyzstan", 1996, 'm', true);
        Actor actor2 = new Actor("Talgart Delon", "Great Britain", 1990, 'm', true);
        Actor actor3 = new Actor("Ana De Armas", "Spain", 1999, 'f', false);
        Producer producer = new Producer("Shamil Bootkempov", "USA", 1985, 'm', 50);
        ScreenWriter screenWriter = new ScreenWriter("Iskandar Dadabaev", "Irland", 1992, 'm', 5000);
        Composer composer = new Composer("Ainura Kamilova", "France", 2002, 'f', "Violin", "myMysic");
        Film film = new Film("Однажды в Буткемпе", "Триллер", 98000000, new Actor[]{actor1, actor2, actor3},
                producer, composer, screenWriter, "Bootcamp pictures");
        film.filmInfo();
    }
}