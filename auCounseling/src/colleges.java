import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class colleges {
    public static void name()
    {
        String[] clgName = {"RTC","KRISHNA","CMS","PSG","KARPAGAM"};

    }
    public static void main(String[] args) {
        int i=0;
        int[] cutOff;
        Map<String, Integer> collegeName = null;
        cutOff = new int[collegeName.size()];
        collegeName = new HashMap<>();
        // keys and values (Collage, Collage code)
        collegeName.put("RTC", 7218);
        collegeName.put("KARPAGAM(A)", 7178);
        collegeName.put("PSG", 7180);
        collegeName.put("PR", 8212);
        collegeName.put("CMS", 7204);
        collegeName.put("CIT(A)", 7105);
        Scanner ip = new Scanner(System.in);
        String college = ip.nextLine();
        int colleges = 0;
        switch (colleges) {
            case 0:
                if (80 <cutOff[i]) {
                    System.out.println(collegeName);
                    System.out.println("YOU CAN CHOOSE ANY COLLAGE ABOVE THE LIST OF COLLAGE");
                }
                if(80>cutOff[i]){
                }
        }
    }
}
