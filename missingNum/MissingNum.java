public class MissingNum {

    static int findMissing(int[] nums) {
        int sum = 0;
        int total = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        for (int i = 0; i < nums.length + 1; i++){
            total = total + i;
        }

        return total - sum;
    }
    
    public static void main(String[] args){
    	int[] nums = new int[args.length];
    	for(int i = 0; i < args.length; i++){
    		nums[i] = Integer.parseInt(args[i]);
    	}
    	System.out.println(findMissing(nums));
    }
}
