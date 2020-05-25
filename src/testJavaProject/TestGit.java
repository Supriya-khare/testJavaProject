package testJavaProject;

public class TestGit {
	public static  int[] data = {1, 2,  5, 7, 8,9, 10};
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i: data ) {
			System.out.println(  i + "- " + data[i]);
			sum += data[i];
		} 
		System.out.println(" sum is " + sum);
	}
}
