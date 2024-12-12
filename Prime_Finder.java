import java.util.Scanner;

public class Prime_Finder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Prime = new int[n];
        Prime[0]=2;
        int i,j,count;
        count=1;

        System.out.println(Prime[3]);
        for(i=3;i<n;i++){
            boolean is_prime = true;
            for(j=0;j<n;j++){
                if(Prime[j]!=0){
                    if(i%Prime[j]==0){
                        is_prime=false;
                    }
                }
                else{break;}
            }
            if(is_prime){
                Prime[count]=i;
                count++;
            }
        }
        
        for(i=0;i<count;i++){
            System.out.print(Prime[i]+"  ");
        }


    }
}
