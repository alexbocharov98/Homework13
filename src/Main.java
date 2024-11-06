public class Main {
    public static void main(String[] args) {
        Author aPushkin = new Author("Александр", "Пушкин");
        Author lTolstoy = new Author("Лев", "Толстой");
        Book evgeniiOnegin = new Book("Евгений Онегин", 1975, aPushkin);
        Book voinaIMir = new Book("Война и мир", 2001, lTolstoy);
        evgeniiOnegin.setYearPublication(1980);
        voinaIMir.setYearPublication(2020);
        System.out.println(evgeniiOnegin.toString());
        System.out.println(voinaIMir.toString());

    }
}

