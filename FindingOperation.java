import java.util.Scanner;

public class FindingOperation {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        String operation[]=new String[len];
        int count=0;
        while(count<len){
            operation[count]=sc.next();
            count++;
        }
        FindingOperation opf=new FindingOperation();
        System.out.println(opf.OperationFind(operation));
        sc.close();
    }

    public int OperationFind(String[] operation){
       
        int x=0;
        int count=0;
        while(count<operation.length){
            if(operation[count].contains("--")){
                x-=1;
                count++;
                continue;
            }
            x+=1;
            count++;

        }
        return x;
    }
}
