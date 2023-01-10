import java.util.*;

public class AliceBob {
    
    static void findWinner(int n,int even, int odd) {
        
            
            boolean ans = false;
        
            if(odd%4 == 0 || odd % 4 == 3){
                ans = true;
            }
            
            if(odd%4==2){
                ans = false;
            }
            
            if(odd%4==1){
                if(even%2==0){
                    ans = false;
                }
                else{
                    ans = true;
                }
            }
            
            if(ans) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        for(int t=0;t<T;t++) {
        
            int n = s.nextInt();
            int even = 0;
            int odd = 0;
        
            for(int i=0;i<n;i++) {
                int val = s.nextInt();
                if(val % 2 == 0) {
                    even++;
                }   
                else {
                    odd++;
                }
            }
        
            findWinner(n,even,odd);
            
        }
    }
} 
/*

4
3
1 3 5
4
1 3 5 7
4
1 2 3 4
4
10 20 30 40

*/
