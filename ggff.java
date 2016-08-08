
		import java.util.Scanner;

	        public class ere {
	
		public static void main(String[] args) {
				
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string");
		String a=s.nextLine();
		System.out.println("Enter the string to be checked as a substring");
		String b=s.nextLine();
		if(a.contains(b)){
		System.out.println("'b'is a substring of 'a' String");
		}else{
			System.out.println("'b'is not a substring");
		}
		s.close();
			}
		}
