
public class CoreJava_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String website = "ritwiksingh.com";
		
		int[] arr2 = {1,3,4,5,6};
//		System.out.println(arr2[1]);
		
		
		for (int i = 0; i < arr2.length; i++)
		{
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i] + " is not a multiple for 2");
			}
			
		}
		
		String[] name = {"ritwik", "singh", "selenium"};
		
		for(String s : name) {
			System.out.println(s);
		}
			
		
	}

}
