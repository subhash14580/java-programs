import java.util.*;
class CeaserCipher{
		public 
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
			System.out.println("enter the plain text");
			String pt = in.next();
			System.out.println("key");
			int key = in.nextInt();
			String cipher = "";
			for(int i = 0;i < pt.length();i++){
				int index = (int)pt.charAt(i);
				if(index >= 97 && index <= 122){
					index = index + key;
					if(index <= 122 && index >= 97){
							cipher += (char)index;
					}
					else{
						int pos = (index % 26) + 97;
						//System.out.println(pos+" "+index);
						  cipher += (char)pos;
					}
				}

			}
			System.out.println("encryption :: "+cipher);
			
	}
}