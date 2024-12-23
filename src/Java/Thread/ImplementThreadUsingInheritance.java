
package Java.Thread;

 class ImplementThreadUsingInheritance extends Thread{
public void run(){
int a = 10;
int b = 12;
int result = a+b;
System.out.println("Thread started running..");
System.out.println("Sum of two number is: "+result);
}
public static void main(String[] args){
ImplementThreadUsingInheritance t1 = new ImplementThreadUsingInheritance();
t1.start();
}
}