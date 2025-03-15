package BusReservation;


public class Bus {

 private int busNo;
 private boolean ac;
 private int capacity;
	
	Bus(int busNo,boolean ac,int capacity){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	
   public boolean getAC() {
		return ac;
	}
  
	public void setAC(boolean AC) {
		ac=AC;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getBusNo() {
		return busNo;
	}
	
	public void setBusNo(int busNo) {
		this.busNo=busNo;
	}
	
	public void DisplayBusInfo() {
		System.out.println("Bus no:"+busNo+" AC:"+ac+" Capacity:"+capacity);
	}
}
