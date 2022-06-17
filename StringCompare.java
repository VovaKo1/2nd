public class StringCompare {
    public static void main(String []args){
        System.out.println(compareStr("ddddd","dddd"));
    }


    public static boolean compareStr(String a, String b){
        return a.length() > b.length();
    }
}
