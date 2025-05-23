package LeetcodeHard;

import java.lang.reflect.Field;

public class TrappingRainWater {

	    public void trap() throws Exception {
	    	
	    	TrappingRainWaterInpOBJ trappingRainWaterInpOBJ =  new TrappingRainWaterInpOBJ();
	    	trappingRainWaterInpOBJ.setInput1(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
	    	trappingRainWaterInpOBJ.setInput2(new int[] {4,2,0,3,2,5});
	    	
	    
	    	
	    	Class c = trappingRainWaterInpOBJ.getClass();
	    	Field[] fields = c.getDeclaredFields();
	    	
	    	int[] height ;
	    	for(Field field : fields)
	    	{
	    		field.setAccessible(true);
	    		height = (int[])field.get(trappingRainWaterInpOBJ);
	    	
	    		
	        int[] left = new int[height.length];
	        int[] right = new int[height.length];

	        int val = 0;

	        for(int i = 0; i < height.length; i++)
	        {
	            if(height[i] > val)
	            {
	                left[i] = height[i];
	                val = height[i];  
	            }
	            else{
	                left[i] = val;
	            }
	        }

	        val = 0;

	        for(int i = height.length - 1; i >= 0; i--)
	        {
	            if(height[i] > val)
	            {
	                right[i] = height[i];
	                val = height[i];  
	            }
	            else{
	                right[i] = val;
	            }
	        }
	        
	        int ans = 0;

	        for(int i = 0 ; i < height.length; i++)
	        {
	            ans += Math.min(left[i], right[i]) - height[i];
	        }

	        System.out.println("answer is => "+ans);
	        
	    	}
	    }
	    }

