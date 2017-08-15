package dec2bin;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int n=255;
		
		String str=strBin(getBin(n));
		System.out.println(str);
		
	}
	
	
	public static ArrayList getBin(int n){
		ArrayList al=new ArrayList();
		
		while(n!=0){
			if(n%2==0) al.add(0);
			else al.add(1);
			n=n/2;
		}
		return al;
		
	}
	
	public static String strBin(ArrayList al){
		String str="";
		
		for(int i=al.size() -1;i>=0 ;i--){
			str=str + al.get(i).toString();
		}
		
		
		return str;
		
	}
	

}
