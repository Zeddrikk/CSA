package tweet;

public class Tweet {
    private String message;
    private int retweets;
    private int likes;

    public Tweet( String m, int r, int lk ) {
        message = m;
        retweets = r;
        likes = lk;
    }

    public void addLikes( int n ) {
        likes += n;
    }

    public void addRetweets( int n ) {
        retweets += n;
    }

    public boolean notLiked() {
        if (likes < 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean kindaLiked() {
       if (likes > retweets) {
           return true;
       } else {
           return false;
       }
    }

    public boolean isTrending() {
        if (retweets + likes >75) {
            return true;
        } else {
            return false;
        }
    }

    public String toString()
    {
        return "msg: \"" + message + " has " + retweets + " retweets and " + likes + " likes.\""; //to be completed
    }
}