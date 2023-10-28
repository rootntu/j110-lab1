public class Book {
    String bookName;
    Publish publish;
    Integer publishYear;
    String[] authors;

    public Book(String bookName, String author, Integer publishYear, Publish publish) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.authors = new String[]{author};
        this.publish = publish;
    }

    public Book(String bookName, Integer publishYear, Publish publish) {
        this.bookName = bookName;
        this.publish = publish;
        this.publishYear = publishYear;
    }

    public Book(String bookName, String[] authors, Integer publishYear, Publish publish) {
        this.bookName = bookName;
        this.publish = publish;
        this.publishYear = publishYear;
        this.authors = authors;
    }

    public static void printAll(Book[] books) {
        for (Book book : books) {
            book.print();
        }
    }

    public static void fillArray() {
        var prospect = new Publish("Проспект", "Москва");
        var piter = new Publish("Питер", "Санкт-Петербург");
        var bhv = new Publish("БХВ", "Санкт-Петебург");
        var dialectica = new Publish("Диалектика", "Киев");

        Book[] booksArray = new Book[]{
                new Book("Computer Science: основы программирования на Java,ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter),
                new Book("Разработка требований к программному обеспечению. 3-е издание, дoполненное", "Вигерс Карл", 2019, bhv),
                new Book("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, dialectica),
                new Book("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, bhv),
                new Book("Конституция РФ", 2020, prospect)
        };

        Book.printAll(booksArray);
        bhv.setCity("Санкт-Петербург");
        Book.printAll(booksArray);
    }

    public void print() {
        String authorsInfo = authors == null || authors.length == 0 ?
                "Нет данных об авторах" : String.join(", ", this.authors);
        System.out.printf("Название: %s Авторы: %s Издательство: %s Год издания: %s\n"
                , this.bookName, authorsInfo, this.publish.getName(), this.publishYear);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName == null) throw new NullPointerException("Название должно быть не пустой ссылкой");
        this.bookName = bookName;
    }

    public Publish getPublish() {
        return publish;
    }

    public void setPublish(Publish publish) {
        if (publish == null) throw new NullPointerException("Издательство должно быть не пустой ссылкой");
        this.publish = publish;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        if (publishYear <= 0) throw new IllegalArgumentException("Год издания должен быть больше нуля");
        this.publishYear = publishYear;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) throw new NullPointerException("Массив авторов не может быть null");
        for (String author : authors) {
            if (author == null) throw new IllegalArgumentException("Массив не должен содержать пустых ссылок");
        }
        this.authors = authors;
    }

    //Тернарный оператор. Если автор не пустая ссылка, то берем длину массива иначе возвращаем ноль.
    public int getAuthorsCount() {
        return this.authors != null ? this.authors.length : 0;
    }


    public String getAuthorByIndex(int index) {
        if (authors == null) throw new NullPointerException("Массив авторов равен null");
        if (index < 0 || index > authors.length - 1)
            throw new IndexOutOfBoundsException(String.format("Неверный индекс %s для массива длинной %s", index, authors.length));
        return this.authors[index];
    }

//Седжвик Роберт, Уэйн Кевин; Computer Science: основы программирования на Java,ООП, алгоритмы и структуры данных; Питер; 2018;
// Вигерс Карл; Разработка требований к программному обеспечению. 3-е издание, дoполненное; БХВ; 2019;
// Шилдт Герберт; Java. Полное руководство, 10-е издание; Диалектика; 2018;
// Полубенцева М.И.; C/C++. Процедурное программирование; БХВ; 2017;
// Конституция РФ, Проспект, 2020.

}

//название (строка);
//издательство (ссылка на экземпляр соответствующего класса);
//год издания;
//автор(ы) книги (массив строк); книга может не иметь авторов.