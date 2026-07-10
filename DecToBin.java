public class DecToBin{
    public static void DecToBin(int decNum){
        int myNum=decNum;
        int binNum=0;
        int pow=0;

        while(decNum>0){
            int remainder= decNum%2;
            binNum = binNum + (remainder*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
            
        }
    System.out.println("Binary Number of " + myNum + " is " +binNum);
    }
    public static void main(String args[]){
        DecToBin(5);
    }
    

}