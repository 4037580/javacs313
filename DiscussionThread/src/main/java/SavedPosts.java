
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class SavedPosts {
    public String thePost;
    public Date date;

    public SavedPosts() {
        this.thePost = "";
        this.date = new Date(); // current date and time
    }
    
    public SavedPosts(String thePostContent, Date thePostDate) {
        thePost = thePostContent;
        date = thePostDate;
    }
}
