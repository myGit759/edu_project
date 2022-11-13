package exception;

import java.util.Scanner;

class MyOperatorException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "연산자에는 '+','-','*''/' 만 입력할 수 있습니다";
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		char oper;
		
		try {
			System.out.print("정수 1 입력 : ");
			n1 = Integer.parseInt(sc.nextLine());
			System.out.print("연산자 입력 : ");
			oper = sc.nextLine().charAt(0);
			System.out.print("정수 2 입력 : ");
			n2 = Integer.parseInt(sc.nextLine());
			switch (oper) {
			case '+':
				result = n1 + n2;break;
			case '-':
				result = n1 - n2;break;
			case '/':
				result = n1 / n2;break;
			case '*':
				result = n1 * n2;break;
			default :
				MyOperatorException ex = new MyOperatorException();
				throw ex;
			}
			System.out.println("결과 : " + result);

		} catch (java.lang.NumberFormatException e) {
			System.out.println("정수를 입력해야합니다");
		} catch (java.lang.ArithmeticException e) {
			System.out.println("분모가 0이면 안됨!");
		} catch(MyOperatorException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("종료");

		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다
		
		
	}
}
