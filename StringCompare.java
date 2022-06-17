public class StringCompare {
    public static void main(String []args){
        System.out.println(compareStr("ddddd","dddd"));
        System.out.println(compareStr("dddd","dddd"));
        System.out.println(compareStr("dddd","ddddd"));
    }
    public static String compareStr(String a, String b){
        if (a.length() > b.length())
            return "true";
        else if (a.length()==b.length())
            return  "Equal String Length";
        return "false";
    }
}
