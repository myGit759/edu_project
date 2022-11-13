package ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	String title;
	String director;
	String[] actors;
	int runningTime;
	Date openningDate;
	double rating;
	
	Movie( String title, String director, String[] actors, int runningTime, Date openningDate,double rating) {
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.runningTime = runningTime;
		this.openningDate = openningDate;
		this.rating = rating;
	}
	
	String getInfo() {
		String form = "[%s]\n배우 : %s\t개봉일 : %s\n";
		String result = String.format(form, title, actors[0], sdf.format(openningDate));
		return result;
	}
	
	String getDetail() {
		String form = "[%s]\n감독 : %s\n배우 : %s\n상영시간 : %d분\n개봉일 : %s\n평점 : %.2f\n";
		String result = String.format(form, title, director, arrToString(actors), runningTime ,sdf.format(openningDate), rating);
		return result;
	}
	
	String arrToString(String[] arr) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			result +=  (i != (arr.length -1)) ? ", " : "";
		}
		return result;
	}	
}
