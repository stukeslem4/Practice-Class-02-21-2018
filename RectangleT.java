import java.util.Scanner;
public class RectangleT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner H=new Scanner(System.in);
	
	
	for(int i=0;i<=3;i++){
		
	
	System.out.println("What is the length and the width");
	int L=H.nextInt();
	int W=H.nextInt();	
		
	Rectangle R=new Rectangle(L,W);

	
	System.out.println(R.Area());
	System.out.println(R.Perimeter());	
		
		}
		
		
	}

	
	
	
	
	
	
}
