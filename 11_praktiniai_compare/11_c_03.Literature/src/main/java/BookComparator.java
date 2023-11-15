import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book b1, Book b2) {

//        if (b1.getRecomendedAge() > b2.getRecomendedAge()) {
//            return 1;
//        } if (b1.getRecomendedAge() < b2.getRecomendedAge()){
//            return -1;
//        }
//        return 0;

        if ((b1.getRecomendedAge() + b1.getNameOfTheBook()).compareTo(b2.getRecomendedAge() + b2.getNameOfTheBook()) > 0) {
            return 1;
        } if ((b1.getRecomendedAge() + b1.getNameOfTheBook()).compareTo(b2.getRecomendedAge() + b2.getNameOfTheBook()) < 0){
            return -1;
        }
        return 0;

    }

}
