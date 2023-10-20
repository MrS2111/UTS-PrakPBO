package model.post;

import java.util.ArrayList;

import model.Comment;
import model.ContentState;
import model.ContentType;
import model.Post;

public class Reel extends Post {
    private int duration;
    private int playedCount;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public Reel() {

    }

    public Reel(String postId, ContentState status, ContentType postType, String timeUpload,ArrayList<Comment> comments, int duration,
            int playedCount) {
        super(postId, status, postType, timeUpload, comments);
        this.duration = duration;
        this.playedCount = playedCount;
    }
    public String toString(){
        return super.toString()+"\nDuration : "+duration+"\nPlayed Count : "+playedCount;
    }
}
