/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakib
 */
public class Container<T> {
    private static final int MAX_LENGTH = 10;
    
    private T[] items;
    private int currentIndex = 0;
    
    public Container(){
        items = (T[]) new Object[MAX_LENGTH];
        
    }
    
    public void addItem(T item){
        if(currentIndex <MAX_LENGTH){
        items[currentIndex++] = item;
        }else{
        
            System.out.println("Container is full.");
            
        }
    }
    
    public T getItem(int index){
    if(index>MAX_LENGTH){
    throw new IllegalArgumentException("Index can't be lager than max");
    }
    return items[index];
    }
    
    public void printAll(){
    for(int  i=0; i<currentIndex; i++){
        System.out.println(items[i]+", ");
    }
    }
    
    public static void main(String[] Args){
        Container<Integer> container = new Container<Integer>();
        container.addItem(1);
        container.addItem(2);
        container.printAll();
    }
}
