package model.post;

import java.util.ArrayList;

import model.Comment;
import model.ContentState;
import model.ContentType;
import model.Post;

public class Story extends Post {
    private int duration;
    private int view;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getDuration() {
        return duration;
    }

    public int getView() {
        return view;
    }
    public Story() {

    }
    public Story(String postId, ContentState status, ContentType postType, String timeUpload, ArrayList<Comment> comments, int duration, int view){
        super(postId, status, postType, timeUpload, comments);
        this.duration = duration;
        this.view = view;
    }
    public String toString(){
        return super.toString()+"\nDuration : "+duration+"\nView : "+view;
    }  
}
