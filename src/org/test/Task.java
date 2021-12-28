package org.test;


import java.util.ArrayList;
import java.util.List;

public class Task {
public static void main(String[] args) {
List<Integer> li=new ArrayList<>();
li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
li.add(60);
System.out.println(li);
int size = li.size();
System.out.println(size);
Integer integer = li.get(1);
System.out.println(integer);
li.add(4, 55);
System.out.println(li);
li.set(5, 60);
System.out.println(li);
boolean contains2 = li.contains(50);
System.out.println(contains2);
li.remove(1);
System.out.println(li);
boolean contains = li.contains(30);
System.out.println(contains);
li.clear();
System.out.println(li);



}}
