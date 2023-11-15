
public class Book {

    private String nameOfTheBook;
    private int recomendedAge;

    public Book(String nameOfTheBook, int recomendedAge) {
        this.nameOfTheBook = nameOfTheBook;
        this.recomendedAge = recomendedAge;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public int getRecomendedAge() {
        return recomendedAge;
    }

    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)", nameOfTheBook, recomendedAge);
    }


}


