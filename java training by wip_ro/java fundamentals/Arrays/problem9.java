import java.util.Scanner;
class problem9{
	public static void main(String args[]){
		int len = args.length;
		int arr[] = new int[len];
		int i1 = 0;
		for(int i = 0;i < len;i++){
             arr[i] = Integer.parseInt(args[i]);
		}
		int i = 0,sum = 0;
		while(i < len){
				if(arr[i] == 6){
					sum += 6;
					//System.out.println(sum);
					break;
				}
				sum = sum + arr[i];
				i++;
				
		}
        if(i == len) {
        	System.out.println(sum);
        }
        else{
			i1 = len-1;
			if(arr[i1] == 7){
				sum += arr[i1];

			}else{
			while(i1 > i){
				sum += arr[i1];
				i1--;
				if(arr[i1] == 7){
					sum += 7;
					//System.out.println(sum);
					break;
					}
				}
			}
          System.out.println(sum);
		}
	}
}