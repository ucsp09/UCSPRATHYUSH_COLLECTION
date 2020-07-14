package com.ucsp09.app;

public class App 
{
    public static void main( String[] args )
    {
        CustomList<Integer> list=new CustomList<>();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        list.addElement(6);
        System.out.println("*************************************");
        list.printElements();
        list.removeElement(3);
        list.removeElement(1);
        System.out.println("*************************************");
        list.printElements();
        System.out.println("*************************************");
        System.out.println(list.getElement(2));
        System.out.println("*************************************");
        System.out.println(list.getElement(0));
        System.out.println("*************************************");
    }
}
