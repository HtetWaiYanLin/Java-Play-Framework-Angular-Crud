package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Book;
import models.BookService;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


public class BookController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }
    public Result template() {
        return ok(views.html.template.render());
    }


    @Inject
    public BookController() {
    }
/*****************Upload Picture to Directory public/images/upload  **************************/
/*****************Not Recommended To Store File/Image in the database **************************/
/*****************So We Store the name of file in the database  **********not finished****************/

/*    public  Result upload() {
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            try {
                FileUtils.moveFile(file, new File("public/images/upload", fileName));
                return ok(fileName);
            } catch (IOException ioe) {
                System.out.println(ioe);
                return badRequest("File exist");
            }
        } else {
            return badRequest("File Null");
        }
    }*/


/************List Books*********************/
    /**
     *
     * @return Result
     */
    @Transactional(readOnly = true)
    public Result listBooks() {
        List models = BookService.all();
        return ok(Json.toJson(models));
    }

/*******************Search by ID********************/

    /**
     *
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    public Result getbookById(Integer id) {
        //use list to get formatedJSON => [{object1 },{object2}]
        List<Book> models = new ArrayList<Book>();
        Book book = BookService.find(id);
        if (book != null ) {
            models.add(book);
        }
        return ok(Json.toJson(models));
    }


    /*******************Insert A Book*******************/

    /**
     *
     * @return Result
     */
    @Transactional
    public Result createBook() {
        JsonNode json = request().body().asJson();
        if (json == null){
            return badRequest("Error insert Book");
        }
        Book book = BookService.create((Book) Json.fromJson(json, Book.class));
        String name = json.findPath("picture").textValue();
        System.out.println(name);
        JsonNode jsonObject = Json.toJson(book);
        return created(jsonObject);
    }

    /*******************Update exist Book********************/

    /**
     *
     * @return
     */
    @Transactional
    public Result updateBook() {
        JsonNode json = request().body().asJson();
        System.out.println(json);
        if (json == null){
            return badRequest("Error update Book");
        }
        Book book = BookService.update((Book) Json.fromJson(json, Book.class));
        JsonNode jsonObject = Json.toJson(book);
        return ok(jsonObject);
    }

    /*******************Delete exist Book********************/
    @Transactional
    public Result deleteBookById(Integer id) {
        if (BookService.delete(id)) {
            ObjectNode result = Json.newObject();
            result.put("msg", "Deleted " + id);
            return ok(result);
        }
        ObjectNode result = Json.newObject();
        result.put("error", "Not found ID" + id);
        return notFound(result);
    }
}