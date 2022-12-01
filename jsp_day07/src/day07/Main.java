//package day07;
//
//public class Main {
//	public static void main(String[] args) {
//		MemberHandler mHan = new MemberHandler();
//		Member ob1 = new Member("cjfgus01","cjfgus01PW", "정철현1", 28,"1995-05-30");
//		Member ob2 = new Member("cjfgus02","cjfgus02PW", "정철현2", 25,"1998-11-28");
//		Member ob2_1 = new Member("cjfgus02","cjfgus02-1PW", "정철현2-1", 45,"1998-11-28");
//		Member ob3 = new Member("cjfgus03","cjfgus03PW", "정철현3", 30,"1993-07-16");
//		
//		int row1 = mHan.insert(ob1);
//		System.out.println(row1 == 1 ? "성공" : "실패");
//		int row2 = mHan.insert(ob2);
//		System.out.println(row2 == 1 ? "성공" : "실패");
//		int row2_1 = mHan.insert(ob2_1);
//		System.out.println(row2_1 == 1 ? "성공" : "실패");
//		int row3 = mHan.insert(ob3);
//		System.out.println(row3 == 1 ? "성공" : "실패");
//		System.out.println();
//		for(Member m : mHan.getList()) {
//			System.out.println("아이디 : " + m.getUserid());
//			System.out.println("패스워드 : " + m.getUserpw());
//			System.out.println("이름 : " + m.getUsername());
//			System.out.println("나이 : " + m.getAge());
//			System.out.println("생년월일 : " + m.getBirth());
//			System.out.println();
//		}
//	}
//}
