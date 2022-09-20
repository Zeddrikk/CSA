package tweets;
class Tweet
{
	private String message;
	private int retweets;
	private int likes;
	//add 2 more instance variables
	
	public Tweet( String m, int r, int lk )
	{
		//finish the constructor
		message = m;
		retweets =r;
		likes = lk;
	}
	
	public void addLikes( int n )
	{
		//code
		likes +=n;
	}
	
	public void addRetweets( int n )
	{
		//code
		retweets +=n;
	}
	
	public boolean notLiked()
	{
		if(likes<10) {
			return true;
		}
		return false;
	}
	
	public boolean kindaLiked()
	{
		if(likes>retweets) {
			return true;
		}
		return false;
	}
	
	public boolean isTrending()
	{
		if((retweets + likes) > 75) {
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return "msg: \"" + message + " has " + retweets + " retweets and " + likes + " likes.\""; //to be completed
	}
}