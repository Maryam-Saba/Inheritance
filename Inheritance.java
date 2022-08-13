class Parent 
{ 
 public void A1() 
 { 
 System.out.println("Parent"); 
 } 
} 
class Child extends Parent 
{ 
 public void A2() 
 { 
 System.out.println("Child"); 
 } 
} 
class Inheritance 
{
 public static void main(String[] args) 
 { 
 Child p=new Child(); 
 p.A1(); 
 p.A2(); 
 } 
} 