class CopyArray{

	public static void main (String[] arg ){
		int[] arrya = {10,20,30,40,50,60,70,};
		for(int i = 0 ; i < arrya.length ; i++){
			System.out.println(i +"_" +arrya[i]);
		}
		
		//copy arrya 
		
		int copyArray[] = new int[5];
		System.arraycopy(arrya,0,copyArray,1,4);
		for(int i = 0 ; i < copyArray.length ; i++){
			System.out.println(i + "__" +copyArray[i]);
		}

	}

}