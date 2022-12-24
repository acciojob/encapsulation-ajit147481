package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    //Cannot resolve symbol 'setName'
    //obj.setName("ajit");
    obj.setName("ajit");
    System.out.println(obj.getName());
  }
}