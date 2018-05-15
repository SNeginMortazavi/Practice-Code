package imageSmoother;

public class ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
		int[][] result = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++){
        	for(int j = 0; j < M[0].length; j++){
        		result[i][j] = Smoother(M, i, j);
        	}
        }
        return result;
    }
	
	public int Smoother(int[][] M, int i, int j){
		int count = 0;
		int sum = 0;
		for(int r = i - 1; r <= i + 1; r++){
			for(int c = j - 1; c <= j + 1; c++){
				if(isValid(M, r, c)) {
					count++;
					sum = sum + M[r][c];
				}
			}
		}
		return (int) Math.floor(sum/count);
	}
	
	public boolean isValid(int[][] M, int i, int j){
		if(i < 0 || i > M.length - 1 ||j < 0 || j > M[0].length - 1) return false;
		return true;
	}
	
	public static void main(String[] args){
		int[][] nums = {{1,1,1},
		                {1,0,1},
		                {1,1,1}};
		ImageSmoother app = new ImageSmoother();
		int[][] result = app.imageSmoother(nums);
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				System.out.print(result[i][j] + " ");
			}
		}
	}
}
