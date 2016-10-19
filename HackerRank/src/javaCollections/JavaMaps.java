package javaCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if(map.containsKey(s)){
				String s1 = (s+"="+map.get(s));
				System.out.println(s1);
			}else{
				System.out.println("Not found");
			}
		}
		//System.out.println(map.stream().);
	}
}
