import java.util.ArrayList;
import java.util.*;
//Generics Class Stack
public class Stack<T> {
    //Declaring arraylist of T Generic...NOw if we pass any int it will automatically take it...
    private ArrayList<T> stack;
    //Constructor...
    public Stack(){
        //Making Arraylist of T object
        stack = new ArrayList<T>();
    }
    //Pop Function ..Here return type is T which will automatically get by is its int,double or anything else.
    public T pop(){
        if(stack.isEmpty()){
            System.out.println("Stack IS Empty");
            throw new EmptyStackException();
        }    
        else{
            T element = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return element;
        }           
    }
    //Passing value of T type because t will automaticallly recognize which type of data is
    public void push(T value){
        stack.add(value);
    }
}