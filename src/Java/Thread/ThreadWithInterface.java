
package Java.Thread;

class ThreadWithInterface implements Runnable{
String name;
Thread thread;
ThreadWithInterface(String name){
this.name = name;
thread = new Thread(this, name);
System.out.println("A New Thread: "+thread+"is created\n");
thread.start();
}

public void run(){
try{
for(int j = 5; j>0; j--){
System.out.println(name+":"+j);
Thread.sleep(1000);
}
}catch(InterruptedException e){
System.out.println(name+"thread interrupted");
}
System.out.println(name+"Thread Exiting.");
}
}

class Main{
public static void main(String args[]){
new ThreadWithInterface("1st");
new ThreadWithInterface("2nd");
new ThreadWithInterface("3rd");
try{
Thread.sleep(8000);
}catch(InterruptedException exception){
System.out.println("Inturruption occurs in Main Thread.");
}
System.out.println("We are exiting form main thread");
}


}