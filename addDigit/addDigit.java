public class addDigit {
	
	//Method 1
    public static int addDigits(int num) {
        int temp = num;
        while(temp >= 10){
            temp = addInt(temp);
        }
        return temp;
    }
    
    public static int addInt(int num){
        int temp = num;
        int sum = 0;
        while(true){
            if(temp / 10 < 1){
                sum = sum + temp;
                break;
            }
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        return sum;
    }
    
    //Method 2
    public static int addDigits2(int num, int total){
    	if(num >= 10){
    		return addDigits2(num/10, total + (num % 10));
    	}
    	else if(num + total >= 10){
    		return (num + total)/10 + (num + total)%10;
    	}
    	else{
    		return num + total;
    	}
    }
    
    public static void main(String[] args){
    	int total=0;
    	int num = Integer.parseInt(args[0]);
    	System.out.println(addDigits2(num,total));
    	System.out.println(addDigits(num));
    }
}
