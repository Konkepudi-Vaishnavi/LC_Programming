class Solution {
    public boolean checkDivisibility(int n) {
        
        int sd = 0;
        int pd = 1;
        int temp = n; 

        while(temp>0){
            int rem = temp%10;
            sd+=rem;
            pd*=rem;
            temp/=10;    
        }
        
        int res = sd+pd;

        if(n%res == 0){
            return true;
        }
        else{
            return false;
        }
    }
}