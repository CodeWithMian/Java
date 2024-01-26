
import java.util.*;
class Vehicle{
int model;
String name,price;
Vehicle(){
model=0;
name="";
price="";
}
Vehicle(String name, String price, int model){
this.name=name;
this.price=price;
}
public void setModel(int model){
this.model=model;
}
public void setName(String name){
this.name=name;
}
public void setPrice(String price){
this.price=price;
}
public int getModel(){
return model;
}
public String getName(){
return name;
}
public String getPrice(){
return price;
}
public void display(){
System.out.println("Name:"+ getName());
System.out.print("Price:"+ getPrice());
System.out.println("Model:"+getModel());
}
}
public class Assignment1{
public static void main(String[] args){
Vehicle obj1=new Vehicle("Toyota Aqua","30Lakh \n",2020);
Vehicle obj2=new Vehicle();
obj2.setName("Volvo");
obj2.setPrice("60Lakh \n");
obj2.setModel(2020);
ArrayList<Vehicle> a= new ArrayList<Vehicle>();
a.add(obj1);
a.add(obj2);
System.out.println("Student ID: Mc210400560");
for(int i=0;i<a.size();i++){
obj1=(Vehicle) a.get(i);
obj1.display();
System.out.println();
}
}
}