package oops;

interface FirstInterface{
	public void firstFunction();
}
interface SecondInterface{
	public void secondFunction();
}
class SingleImplentens implements FirstInterface{
	public void firstFunction() {
		System.out.println("Single implements");
	}
}
class MultipleImplements implements FirstInterface,SecondInterface{
	public void firstFunction() {
		System.out.println("Multiple first implements");
	}
	public void secondFunction() {
		System.out.println("Multiple second implements");
	}
}
public class DemoInterface {
public static void main(String[] args) {
	SingleImplentens singleImplentens=new SingleImplentens();
	singleImplentens.firstFunction();
	MultipleImplements multipleImplements=new MultipleImplements();
	multipleImplements.firstFunction();
	multipleImplements.secondFunction();
}
}
