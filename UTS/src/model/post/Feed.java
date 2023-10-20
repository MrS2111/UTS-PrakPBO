package model.post;

import java.util.ArrayList;

import model.Comment;
import model.ContentState;
import model.ContentType;
import model.Post;

public class Feed extends Post {
    private String caption;
    private int likes;

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getCaption() {
        return caption;
    }

    public int getLikes() {
        return likes;
    }

    public Feed() {

    }

    public Feed(String postId, ContentState status, ContentType postType, String timeUpload,ArrayList<Comment> comments, String caption,
            int likes) {
        super(postId, status, postType, timeUpload, comments);
        this.caption = caption;
        this.likes = likes;
    }
    public String toString(){
        return super.toString()+"\nCaption : "+caption+"\nLikes : "+likes;
    }
}
