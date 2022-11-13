package programmers;


public class Quiz131128 {
	public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        String X = "152142314";
        String Y = "6731532213514";
        
		int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }

        }
        if("".equals(answer.toString())){
        	System.out.println("-1");
        }
		else if(answer.toString().charAt(0) == 48){
		System.out.println("0");
		}
		System.out.println(answer); 
	}
}
