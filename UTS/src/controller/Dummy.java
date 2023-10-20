package controller;

import java.util.ArrayList;

import model.Post;
import model.User;
import model.post.Feed;
import model.post.Reel;
import model.post.Story;
import model.Comment;
import model.ContentState;
import model.ContentType;

public class Dummy {
    public static ArrayList<User> users = new ArrayList<User>(){
        {
            add(new User("111", "Ganjar", "presiden2024", "Tuanku, ya rakyat ku",new ArrayList<Post>(posts.subList(0, 1))));
            add(new User("112", "Prabowo", "capres2024", "Korupsi dikit ga ngaruh", new ArrayList<Post>(posts.subList(1, 2))));
            add(new User("113", "Anies", "cagub2019", "OK OC", new ArrayList<Post>(posts.subList(0, 2))));
        }
    };
    public static ArrayList<Post> posts = new ArrayList<Post>(){
        {
            add(new Story("211", ContentState.SHOWED, ContentType.PICTURE, "2021-04-01", new ArrayList<Comment>(comments.subList(0, 2)), 10, 100));
            add(new Reel("212", ContentState.SHOWED, ContentType.VIDEO, "2021-04-01", new ArrayList<Comment>(comments.subList(1, 4)), 150, 100));
            add(new Feed("213", ContentState.SHOWED, ContentType.PICTURE, "2021-04-01", new ArrayList<Comment>(comments.subList(1, 4)), "Dewa pa", 1000));
            add(new Story("214", ContentState.SHOWED, ContentType.PICTURE, "2021-04-01", new ArrayList<Comment>(comments.subList(3, 5)), 60, 1500));
        }
    };
    public static ArrayList<Comment> comments = new ArrayList<Comment>(){
        {
            add(new Comment("311", "Mantap pa, ganteng banget", ContentState.SHOWED));
            add(new Comment("312", "Asik banget euy", ContentState.SHOWED));
            add(new Comment("313", "Keren banget pa semoga keterima jadi presiden", ContentState.SHOWED));
            add(new Comment("314", "Naek kuda dulu pa", ContentState.SHOWED));
            add(new Comment("315", "Minimal uban di semir pa", ContentState.SHOWED));
            add(new Comment("316", "BBM gratis yang bener aja pa?", ContentState.SHOWED));
        }
    };
}
