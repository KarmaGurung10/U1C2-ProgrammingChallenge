public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares * price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        int x = (int)Math.round(totalStock);
        return x;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
     int x = (int)(userDouble * 100);
     int a = ((x) % 10 + 1) % 10;
     int b = ((x/10) % 10 + 1) % 10;
     int c = ((x/100) % 10 + 1) % 10;
     int d = ((x/1000) % 10 + 1) % 10;
     int e = ((x/10000) % 10 + 1) % 10;
     double num = (a + b * 10 + c * 100 + d * 1000 + e * 10000)/100.0;
     return num;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
