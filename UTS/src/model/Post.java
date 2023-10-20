package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Post {
    private String postId;
    private ContentState status;
    private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private String timeUpload = format.format(new java.util.Date());
    private ContentType postType;
    private ArrayList<Comment> comments = new ArrayList<Comment>();

    public static SimpleDateFormat getFormat() {
        return format;
    }

    public String getPostId() {
        return postId;
    }

    public ContentType getPostType() {
        return postType;
    }

    public ContentState getStatus() {
        return status;
    }

    public String getTimeUpload() {
        return timeUpload;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public void setTimeUpload(String timeUpload) {
        this.timeUpload = timeUpload;
    }
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
    public ArrayList<Comment> getComments() {
        return comments;
    }
    public Post(){

    }
    public Post(String postId, ContentState status, ContentType postType, String timeUpload, ArrayList<Comment> comments) {
        this.postId = postId;
        this.status = status;
        this.postType = postType;
        this.timeUpload = timeUpload;
        this.comments = comments;
    }
    public String toString(){
        return "Post ID : "+postId+"\nStatus : "+status+"\nPost Type : "+postType+"\nTime Upload : "+timeUpload+"\nComments : "+comments;
    }
}
