public class StringTest {
    public static void main(String[] args) {
        String str=new String("We are students");
        String str1=new String("We are students");
        String ip="192.168.1.1";
        int size=str.length();
        System.out.println(size);
        int shift_num=str.indexOf("are");
        System.out.println(shift_num);
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0));
        System.out.println(str.replace("are","ARE"));
        boolean b=(str==str1);
        String[] sp=ip.split("\\.");
        System.out.println(b);
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        for(String x:sp){
            System.out.println(x);
        }

    }
}
