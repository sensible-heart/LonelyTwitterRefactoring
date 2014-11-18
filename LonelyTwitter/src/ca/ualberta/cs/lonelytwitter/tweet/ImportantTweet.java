package ca.ualberta.cs.lonelytwitter.tweet;

import java.util.Date;

import android.util.Log;



public class ImportantTweet extends LonelyTweet
{
	public ImportantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid(){
		if(tweetBody.trim().length() == 0 || tweetBody.trim().length() > 10){
			return false;
		}
	

		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public String toString()
	{
		String importantString = "IMPORTANT " + getTweetDate() + " | " + getTweetBody();
		Log.i("TAG",importantString);
		// TODO Auto-generated method stub
		return importantString;
	}

	@Override
	public String getTweetBody()
	{
		return tweetBody;
	}
}
