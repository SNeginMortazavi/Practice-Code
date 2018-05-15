package canPlaceFlowers;

public class CanPlaceFlowers {
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 * @param flowerbed
	 * @param n
	 * @return
	 */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int i = 0;
       while(n > 0 && i < flowerbed.length){
    	   if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
    		   n--;
    		   flowerbed[i] = 1;
    	   }
    	   i++;
       }
       if(n == 0) return true;
       return false;
    }
    public static void main(String[] args){
    	int[] nums = {1,0,0,0,1,0,0};
    	int n = 2;
    	CanPlaceFlowers app = new CanPlaceFlowers();
    	System.out.print(app.canPlaceFlowers(nums, n));
    }
}
