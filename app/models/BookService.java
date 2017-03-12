package models;

import java.util.List;

public class BookService {
    /**
     * Create a Book
     *
     *
     * @return Book
     */
    public static Book create(Book data) {
        return BookDAO.create(data);
    }

    /**
     * Update a Book
     * @return Book
     */
    public static Book update(Book data) {
        return BookDAO.update(data);
    }

    /**
     * Find a Book by id
     * @return Book
     */
    public static Book find(Integer id) {
        return BookDAO.find(id);
    }

    /**
     * Delete a Book by id
     * @return Boolean
     */
    public static Boolean delete(Integer id) {
        Book Book = BookDAO.find(id);
        if (Book != null) {
            BookDAO.delete(id);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get all Books
     *
     * @return List<Book>
     */
    public static List<Book> all() {
        return BookDAO.all();
    }


    public static List<Book> searchByTitleOrAuthor(String text) {
        return BookDAO.Search(text);
    }

}