package models;

import play.db.jpa.*;
import java.util.List;

public class BookDAO {
    /**
     * Create an Book
     *
     * @return Book
     */
    public static Book create (Book model) {
        JPA.em().persist(model);
        // Flush and refresh for check
        JPA.em().flush();
        JPA.em().refresh(model);
        return model;
    }

    /**
     * Find an Book by id
     * @return Book
     */
    public static Book find(Integer id) {
        return JPA.em().find(Book.class, id);
    }

    /**
     * Update a Book

     * @return Book
     */
    public static Book update(Book model) {
        return JPA.em().merge(model);
    }

    /**
     * Delete an Book by id
     */
    public static void delete(Integer id) {
        Book model = JPA.em().getReference(Book.class, id);
        JPA.em().remove(model);
    }

    /**
     * Get all Books
     *
     * @return List<Book>
     */
    public static List<Book> all() {
        return JPA.em().createQuery("select b from Book b",Book.class).getResultList();
  }

  public static List<Book> Search(String text) {
        return JPA.em().createQuery("select b from Book b  where b.title like ?1 OR  b.author like ?1 ",Book.class).setParameter(1,"%"+text+"%").getResultList();
  }

}