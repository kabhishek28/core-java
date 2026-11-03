class VoteBank{

static public void main(String... kash){


int                 age    = 10;


int relust = VoteBank.checkAge(   age , "rishi");
System.out.println(relust);
VoteBank.checkAera();
}



static void checkAera(){
System.out.println("RAJAJINAGAR");
}




static int  checkAge(int age ,String name){  


System.out.println(age);
System.out.println(name);

if(age <= 18){
	
           //"rihi"                                                                "rishi"
	return  age - 10 ;
}else{
	return age + 10;
}


   }




}