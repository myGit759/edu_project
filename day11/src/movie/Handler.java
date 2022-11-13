package movie;


public class Handler {

	static Movie[] arr = new Movie[10];
	
	static String getList() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += "(" + ( i + 1) + ") ";
				result += arr[i].getInfo();
				result += "\n";
			}
		}
		return result;	
	}
	
	static String getInf(int num) {
		String result = "";
		result += arr[num-1].getDetail();
		result += "\n";
		return result;	
	}
	
	static String search(String keyword) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i].getDetail().contains(keyword)) {
					result += "(" + ( i + 1) + ") ";
					result += arr[i].getDetail();
					result += "\n";
				}
			}
		}
		return result;
	}
	
	static int insert(Movie ob) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				result = 1;
				break;
			}
		}
		return result;		
	}
	
	static int delete(int idx) {
		int result = 0;
		if(arr[idx-1] != null) {
			arr[idx-1] = null;
			result = 1;
		}
		return result;
	}
	static int delete(String str) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getDetail().contains(str)){
				arr[i] = null;
				result = 1;
			}
		}
		return result;
	}
}











