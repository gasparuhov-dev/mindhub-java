package vendingMachine;

public class Test {
	public static void main(String[] args) {
		String as = "as1;as2;as3;as4";
		String [] abb = new String[4];
		abb = as.split(";");
		for(int i =0;i< abb.length;i++) {
			System.out.println(abb[i]);
		}
	}
}
