class Solution {
    public int fib(int n) {
    int firstNum=0;
    int secondNum=1;
    int sum=0;
    if(n==1){
        return 1;
    }
    for(int i=2; i<=n; i++){
        sum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = sum;
    }
    return sum;
    }
}