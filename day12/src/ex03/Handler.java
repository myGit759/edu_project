package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Handler {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Movie[] arr = new Movie[10];

	String showSimpleList() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += arr[i].getInfo() + "\n";
			}
		}
		return result;
	}

	int insert(Movie input) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = input;
				return 1;
			}
		}
		return 0;
	}

	String search(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(find)) {
				return arr[i].getDetail();
			}
		}
		return null;
	}

	int update(String find, String part, String result) throws ParseException {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.contains(find)) {
				switch(part) {
				case "제목":
					arr[i].title = result;
				case "감독":
					arr[i].director = result;
				case "배우":
					arr[i].actors = result.split(",");
				case "상영시간":
					arr[i].runningTime = Integer.parseInt(result);
				case "개봉일":
					arr[i].openningDate = sdf.parse(result);
				case "평점" :
					arr[i].rating = Double.parseDouble(result);
				}
				return 1;
			}
		}
		return 0;
	}

	int delete(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.contains(find)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
}
