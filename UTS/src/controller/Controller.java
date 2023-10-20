package controller;

import controller.Dummy;
import model.ContentState;
import model.Post;
import model.User;
import model.post.Feed;
import model.post.Reel;
import model.post.Story;

public class Controller {
    public String showUserPosts(String userId) {
        String text = "";
        for (User user : Dummy.users) {
            if (user.getUserId() == userId) {
                for (Post post : user.getPosts()) {
                    if (post instanceof Reel) {
                        Reel reel = (Reel) post;
                        if (reel.getStatus().equals(ContentState.PINNED)) {
                            text += "Status : " + reel.getStatus() + "Played Count" + reel.getPlayedCount();
                        } else if (reel.getStatus().equals(ContentState.SHOWED)) {
                            text += "Status : " + reel.getStatus() + "Played Count" + reel.getPlayedCount();
                        } else if (reel.getStatus().equals(ContentState.ARCHIVED)) {
                            text += "Status : " + reel.getStatus() + "Played Count" + reel.getPlayedCount();
                        }
                    } else if (post instanceof Story) {
                        Story story = (Story) post;
                        if (story.getStatus().equals(ContentState.PINNED)) {
                            text += "Status : " + story.getStatus() + "Viewed Count" + story.getView();
                        } else if (story.getStatus().equals(ContentState.SHOWED)) {
                            text += "Status : " + story.getStatus() + "Viewed Count" + story.getView();
                        } else if (story.getStatus().equals(ContentState.ARCHIVED)) {
                            text += "Status : " + story.getStatus() + "Viewed Count" + story.getView();
                        }
                    } else if (post instanceof Feed) {
                        Feed feed = (Feed) post;
                        if (feed.getStatus().equals(ContentState.PINNED)) {
                            text += "Status : " + feed.getStatus() + "Liked Count" + feed.getLikes();
                        } else if (feed.getStatus().equals(ContentState.SHOWED)) {
                            text += "Status : " + feed.getStatus() + "Liked Count" + feed.getLikes();
                        } else if (feed.getStatus().equals(ContentState.ARCHIVED)) {
                            text += "Status : " + feed.getStatus() + "Liked Count" + feed.getLikes();
                        }
                    }
                }
            }
        }
        return text;
    }

    public String showPost(String postId) {
        String text = "";
        for (User user : Dummy.users) {
            for (Post post : user.getPosts()) {
                if (post.getPostId().equals(postId)) {
                    if (post instanceof Reel) {
                        Reel reel = (Reel) post;
                        reel.toString();
                    } else if (post instanceof Story) {
                        Story story = (Story) post;
                        story.toString();
                    } else if (post instanceof Feed) {
                        Feed feed = (Feed) post;
                        feed.toString();
                    }
                }
            }
        }
        return text;
    }

    public String changePostState(String postId, ContentState status) {
        String text = "";
        for (User user : Dummy.users) {
            for (Post post : user.getPosts()) {
                if (post.getPostId().equals(postId)) {
                    if (post instanceof Reel) {
                        Reel reel = (Reel) post;
                        if (reel.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.ARCHIVED) || status.equals(ContentState.PINNED)) {
                                reel.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (reel.getStatus().equals(ContentState.ARCHIVED)) {
                            if (status.equals(ContentState.DELETED)) {
                                reel.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (reel.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.PINNED)) {
                                reel.setStatus(status);
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        }
                    } else if (post instanceof Story) {
                        Story story = (Story) post;
                        if (story.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.ARCHIVED) || status.equals(ContentState.PINNED)) {
                                story.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (story.getStatus().equals(ContentState.ARCHIVED)) {
                            if (status.equals(ContentState.DELETED)) {
                                story.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (story.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.PINNED)) {
                                story.setStatus(status);
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        }
                    } else if (post instanceof Feed) {
                        Feed feed = (Feed) post;
                        if (feed.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.ARCHIVED) || status.equals(ContentState.PINNED)) {
                                feed.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (feed.getStatus().equals(ContentState.ARCHIVED)) {
                            if (status.equals(ContentState.DELETED)) {
                                feed.setStatus(status);
                                text += "Status changed to " + status;
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        } else if (feed.getStatus().equals(ContentState.SHOWED)) {
                            if (status.equals(ContentState.PINNED)) {
                                feed.setStatus(status);
                            } else {
                                text += "Status can't be changed to " + status;
                            }
                        }
                    }
                }
            }
        }
        return text;
    }

    public Post showUserBestPost() {
        Post post = null;
        int temp = 0;
        for (User user : Dummy.users) {
            for (Post posts : user.getPosts()) {
                if (posts instanceof Reel) {
                    Reel reel = (Reel) posts;
                    if (temp < reel.getPlayedCount()) {
                        temp = reel.getPlayedCount();
                        post = reel;
                    }
                } else if (posts instanceof Story) {
                    Story story = (Story) posts;
                    if (temp < story.getView()) {
                        temp = story.getView();
                        post = story;
                    }
                } else if (posts instanceof Feed) {
                    Feed feed = (Feed) posts;
                    if (temp < feed.getLikes()) {
                        temp = feed.getLikes();
                        post = feed;
                    }
                }
            }
        }
        return post;
    }
}
