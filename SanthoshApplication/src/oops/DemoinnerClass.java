package oops;

import oops.OuterClass.DefInnerClass;
import oops.OuterClass.StaticInnerClass;

class OuterClass{
	 int x=10;
	 class DefInnerClass{
		 public int myClassFunc() {
			 return x;
		 }
	 }
	 static class StaticInnerClass{
		 int y=20;
	 }
 }
public class DemoinnerClass {
	public static void main(String[] args) {
		
		OuterClass myOuterClass=new OuterClass();
		DefInnerClass  myDefInnerClass=myOuterClass.new DefInnerClass();
		
		StaticInnerClass myStaticInnerClass=new StaticInnerClass();
		System.out.println("X: "+myDefInnerClass.myClassFunc());
		System.out.println("Y: "+myStaticInnerClass.y);
	}

}
