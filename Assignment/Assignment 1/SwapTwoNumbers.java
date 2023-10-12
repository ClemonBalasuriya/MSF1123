class SwapTwoNumbers{
public static void main(String[] args){
int num1 = 2, num2 = 5, temp;
System.out.println("Before swap: Num_1= "+num1+ " Num_2= " +num2);
temp=num1;
num1=num2;
num2=temp;
System.out.println("After swap: Num_1= "+num1+ " Num_2= " +num2);
}
}