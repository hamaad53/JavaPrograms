class GreetByMarks{
public static void main(String args[]){
int marks = Integer.parseInt(args[0]); 
switch(marks/10){
case 10:
System.out.println(“A+ grade Excellent”);
break;
case 9:
System.out.println(“A grade Very Good”);
break;
case 8:
System.out.println(“B+ Grade Good”);
break;
case 7:
System.out.println(“B Grade Good”);
break;
case 6:
System.out.println(“C+ Grade Can Do Better”);
break;
case 5:
System.out.println(“C Grade Work Hard”);
break;
case 4:
System.out.println(“D Grade Poor”);
break;
case 3:
case 2:
case 1:
case 0:
System.out.println(“F Grade Very Poor”);
break;
default:
System.out.println(“Invalid value Entered”);
}
}
}
