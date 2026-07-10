public class subString{
    public static String substring(String str, int si, int ei){
        String substr= "";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);
        return substr;
    }

    public static void main(String args[]){
        String str = "HelloWorld";
        substring(str, 0, 3);
    }
}