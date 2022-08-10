public class Principal{

	public static void main(String args[]){
		int[] a1=new int[7];

			a1[0]=90;
			a1[1]=88;
			a1[2]=15;
			a1[3]=75;
			a1[4]=66;
			a1[5]=12;
			a1[6]=44;
			
	
		for(int p:a1){
			if (p%2==0){
				System.out.println(p+" ---> es numero par");
			}else{
				System.out.println(p+" ---> es numero impar");
			}
		}
	
	}
}