package models;

import javax.persistence.*;

import play.data.validation.Constraints;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Constraints.Required
    private String title;

    @Column(nullable = false)
    @Constraints.Required
    private String author;


    @Column(nullable = false)
    @Constraints.Required
    private int pages;

/*    @Column(nullable = false)
    @Constraints.Required
    private String picture;*/

    @Lob
    @Column(length=512)
    private String description;

    /*********Default Construct*****/
    public Book() {
    }

    /***************Getters And Setters*********************/


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

/*    public String getPicture() {
        return picture;
    }*/

 /*   public void setPicture(String picture) {
        this.picture = picture;
    }*/
}