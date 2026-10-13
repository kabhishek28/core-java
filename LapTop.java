class LapTop{

public static void main(String[] args){

int[] a = {10,20,30,40,50,60};
for(int i = 0 ; i <a.length ; i++){
System.out.println(a[i]);
}
int [] b = new int[3];
System.arraycopy(a,2,b,0,3);
for(int i = 0 ; i <b.length ; i++){
	
System.out.println(i +" " + b[i]);
}
System.out.println("HI Finish this ");

}
}