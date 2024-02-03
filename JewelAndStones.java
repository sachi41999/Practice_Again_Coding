import java.util.Scanner;

public class JewelAndStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String jewels=sc.nextLine();
        String stones=sc.nextLine();

        System.out.println(numJewelsInStones(jewels,stones));

        sc.close();
    }

    public static int numJewelsInStones(String jewels,String stones){

        String str=stones;
        for(int i=0;i<jewels.length();i++){
            str=str.replaceAll(jewels.charAt(i)+"","");
          
        }
        
        return stones.length()-str.length();


    }
}
