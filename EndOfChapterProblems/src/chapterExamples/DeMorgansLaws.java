package chapterExamples;

public class DeMorgansLaws {

	public static void main(String[] args) {
		
		boolean c = true;
		boolean z = false;
		int x = 4;
		int y = 7;
		int a = 1;
		int b = 1;
		int g = 4;
		int i = 4;
		int j = 6;
		
		
		
		if((!(x<5) && !(y>=7)) == (!(x<5 || y>=7))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if((!(x<5) && !(y>=7)) != (!(x<5 || y>=7))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if((!(a == b) || !(g != 5)) == !((a == b) && (g != 5))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if((!(a == b) || !(g != 5)) != !((a == b) && (g != 5))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if(!((x<=8) && (y>4)) == (!(x<=8) || !(y>4))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if(!((x<=8) && (y>4)) != (!(x<=8) || !(y>4))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if(!((i > 4) || (j <= 6)) == (!(i > 4) && !(j <= 6))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		if(!((i > 4) || (j <= 6)) != (!(i > 4) && !(j <= 6))) {
			System.out.println(c);
		}else {
			System.out.println(z);
		}
		
		
		
/*
 * a) !(x<5) && !(y>=7) 
 * b) !(a == b) || !(g != 5) 
 * c) !((x<=8) && (y>4)) 
 * d) !((i > 4) || (j <= 6))
 */
	}

}
