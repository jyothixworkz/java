class ifelseifcondition{
public static void main(String[] args){
boolean withdraw=false;
boolean ministatement=false;
boolean checkballance=false;
//boolean ministatement=!true;
//boolean withdraw=!true;
//boolean checkballance=!true;

if (withdraw){
System.out.println("enter amount");
}
else if(ministatement){
System.out.println("collect statement");
}
else if(checkballance){
System.out.println("account ballance is=0");
}
else{ 
System.out.println("sorry u select nothing");
}
}
}