package Library;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map collection = new HashMap();
        collection.put(1, new Book(" ДЖ.Селинджер"));
        collection.put(2, new Book("Шарлотта  Бронте"));
        collection.put(3, new Book("Маргарет Митчел"));
        collection.put(4, new Book("Лев Толстой"));
        collection.put(5, new Book("Федор Достоевский"));
        // System.out.println(collection.get(3)); выведет на экран автора третей книги
        Set set = collection.entrySet(); //выведет весь список, если использовать keySet - то выведет ключи
        for (Object o : set) {
            System.out.println(o);
        }
    }

    public static class Book {
        String nameAuthor;

        public Book(String nameAuthor) {
            this.nameAuthor = nameAuthor;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "nameAuthor='" + nameAuthor + '\'' +
                    '}';
        }

    }

}
