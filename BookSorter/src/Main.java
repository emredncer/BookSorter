import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        //Objects created.
        Book book1 = new Book("Tutunanlar",430,"İsmail YK","2023");
        Book book2 = new Book("Yüzüklerin ta kendisi",530,"Ajdar ","2015");
        Book book3 = new Book("Abasıyanık",245,"Sait Faik","2005");
        Book book4 = new Book("Araba Sevdası",670,"Lvbelc5","2023");
        Book book5 = new Book("Macera oyunu",85300,"Patika.dev","2023");

        //Defined treeset that will do alphabetical sorting with the compareTo method we override in Book class.
        Set<Book> alphabeticSort = new TreeSet<>(Book::compareTo);

        //Objects added.
        alphabeticSort.add(book1);
        alphabeticSort.add(book2);
        alphabeticSort.add(book3);
        alphabeticSort.add(book4);
        alphabeticSort.add(book5);

        //Print treeset.
        System.out.println("Alphabetic sorted Book list:");
        for (Book x : alphabeticSort){
            System.out.println(x.getBookName()
                    +"  |  "+x.getPageNumber()
                    +"  |  "+x.getAuthorName()
                    +"  |  "+x.getReleaseDate());
            System.out.println("------------------------------------------------------");
        }

        //We defined the TreeSet that will sort by the number of pages.
        //Here we will use the compare method in the comparator class we created.
        Set<Book> pageNumberSort = new TreeSet<>(new PageNumberOrderComparator());

        //Object added.
        pageNumberSort.add(book1);
        pageNumberSort.add(book2);
        pageNumberSort.add(book3);
        pageNumberSort.add(book4);
        pageNumberSort.add(book5);

        System.out.println();
        System.out.println();
        //Print treeset.
        System.out.println("Page number sorted Book list:");
        for (Book y : pageNumberSort){
            System.out.println(y.getBookName()
                    +"  |  "+y.getPageNumber()
                    +"  |  "+y.getAuthorName()
                    +"  |  "+y.getReleaseDate());
            System.out.println("------------------------------------------------------");        }
    }
}
