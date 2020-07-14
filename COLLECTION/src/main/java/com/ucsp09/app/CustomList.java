package com.ucsp09.app;
import java.util.Arrays;
public class CustomList<E>{
    private int size=0;
    private int capacity=10;
    private Object elements[];
    private void extendCapacity()
    {
        int newSize=elements.length*2;
        elements=Arrays.copyOf(elements,newSize);
    }
    public CustomList()
    {
        elements=new Object[capacity];
    }
    public void addElement(E element)
    {
        if(size==elements.length)
            extendCapacity();
        elements[size++]=element;
    }
    @SuppressWarnings("unchecked")
    public void removeElement(int index)
    {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("Index:"+index+"Size:"+size);
        System.arraycopy(elements,index+1,elements,index,elements.length-(index+1));
        size--;
    }
    public int getSize()
    {
        return size;
    }
    @SuppressWarnings("unchecked")
    public E getElement(int index)
    {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("Index:"+index+"Size:"+size);
        return (E)elements[index];
    }
    public void printElements()
    {
        for(int i=0;i<size;i++)
            System.out.println(elements[i]);
    }
}