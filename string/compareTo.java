public class compareTo {
    public static void main (String args[]){
        String fruits[]= {"apple", "banana", "pineapple"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length;i++){
            int str =largest.compareToIgnoreCase(fruits[i]);
            if(str<0){
              largest= fruits[i];
            }

            
        }
        System.out.println(largest);
    }
    
}
