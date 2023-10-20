package model;

public class Comment {
    private String commentId;
    private String text;
    private ContentState status;

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommentId() {
        return commentId;
    }

    public ContentState getStatus() {
        return status;
    }

    public String getText() {
        return text;
    }

    public Comment() {

    }

    public Comment(String commentId, String text, ContentState status) {
        this.commentId = commentId;
        this.text = text;
        this.status = status;
    }
    public String toString(){
        return "Comment ID : "+commentId+"\nText : "+text+"\nStatus : "+status;
    }
}
