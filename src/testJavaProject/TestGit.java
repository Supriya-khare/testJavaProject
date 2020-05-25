package testJavaProject;

public class TestGit {
	public static  Integer [] data = {1, 5, 7, 8,9, null};
	
	/**
	 * main function for test
	 */
	public static void main(String[] args) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(  i + "- " + data[i]);
			System.out.println("size is " + data.length);
		}
	}
}
