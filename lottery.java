public class lottery{
	public static void main(String [] args){
		int arr[] = new int[5];
		for (int i = 0; i<5; i++){
			arr[i]=0;
                	int white = (int)(1+ Math.random()*49);
			int j = 0;	
			while(j<=i){
				if(white != arr[j]){
				j++;
				}
				else {
				 white = (int)(1 + Math.random()*49);
				 j=0;
				}
			}
		arr[i] = white ;
		}
	int red = (int) (1 + Math.random()*42);
	for (int k=0;k<5;k++){
		System.out.print(arr[k] + " ");
		}
	System.out.println("Red ball no is " + red);
	}

}