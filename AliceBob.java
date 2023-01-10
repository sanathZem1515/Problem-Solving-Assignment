import java.util.*;

public class AliceBob {
    
    static void findWinner(int n,int even, int odd) {
        
        int reqEvens = n/2;
            int reqOdds = 0;
        
            if(n%2 != 0) {
                reqEvens ++;
            }
            
            boolean ans = false;
            
            // System.out.println("evens "+even+"  odds   "+odd);
        
            while(reqEvens >= 0) {
                // System.out.println("required evens "+reqEvens+" required odds   "+reqOdds);
                if((reqEvens*2) - 1 <= even && (reqOdds * 2) <= odd) {
                    ans = true;
                    break;
                }
                
                if(reqOdds*2 -1 <= odd && reqEvens *2 <= even)  {
                    ans = true;
                    break;
                }
                reqEvens-=2;
                reqOdds += 2;
            }
            
            // while(reqOdds >= 0) 
            
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
