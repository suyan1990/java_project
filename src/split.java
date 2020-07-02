public class split {
    public static void main(String[] args) {
        String str="192.168.1.1";
        String[] first_array=str.split("\\.");
        for(String x:first_array){
            System.out.println(x);
        }
        String[] Second_array=str.split("\\.",2);
        for(String x:Second_array){
            System.out.println(x);
        }

    }
}
