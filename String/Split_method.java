package String;
import java.util.*;
public class Split_method {
  //USE OF SPLIT method!!!
  public static void main(String args[]){
  String str="Uttpal and Vikas are a couple!!";
  String arr[]=str.split(" ");
  
  for(int i=0;i<arr.length;i++){
  String newStr=arr[i];
  for(int j=newStr.length()-1;j>=0;j--){
  System.out.print(newStr.charAt(j));
  }
  System.out.print(" ");
  }
  }
  }

