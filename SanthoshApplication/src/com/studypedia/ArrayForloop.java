package com.studypedia;

public class ArrayForloop {

	public static void main(String[] args) {
		
		//Calculate average age
		//Lowest age
		int[] ages= {20,45,78,18,65,55,42,21};
		float averageAge,sum=0;
		int lowestAge=ages[0];
		for(int age:ages)
		{
			sum+=age;
			if(lowestAge>age) {
				lowestAge=age;
			}
		}
        averageAge=sum/ages.length;
        System.out.println("Average Age "+averageAge);
        System.out.println("Lowest Age "+lowestAge);
        
        //Multidimensional  array
        
        int[] [] count= {{1,2,3,4 },{5,6,7,8,9}};
        for(int i=0;i<=1;i++) 
        {
        	for(int j=0;j<count[i].length;j++) 
        	{
        		System.out.println(count[i][j]);
        	}
        }
        //another method
        for(int [] counts:count)
        {
        	 for(int countes:counts) {
        		 System.out.println(countes);
        	 }
        	
        }
        
	}

}
