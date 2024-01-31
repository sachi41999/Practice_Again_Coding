import java.util.Scanner;

public class DefangingIpAdrress{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String adress=sc.nextLine();

        DefangingIpAdrress dip=new DefangingIpAdrress();
        System.out.println(dip.modifyDefangingIPAddress(adress));

        sc.close();
    }

    //alternate solution
    // public String modifyDefangingIPAddress(String adress){
    //     return adress.replaceAll(".", "[.]")
    // }

    public String modifyDefangingIPAddress(String address){
        String new_address="";
        for(int i=0;i<address.length();i++){
            if(String.valueOf(address.charAt(i)).equals(".")){
                new_address+="[.]";
                continue;
            }
            new_address+=address.charAt(i);
        }

        return new_address;
    }
}