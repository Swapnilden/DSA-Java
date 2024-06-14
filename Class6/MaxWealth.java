// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth{
  public statc void main(String[] args){
    
  }

  public int maximumWealth(int[][] accounts) {
    // person = row
    // account = col
    int ans = Integer.MIN_VALUE;
    for(int[] ints : accounts){
      // when you start a new col, take a new sum for that row
      int sum = 0;
      for(int anInt : ints){
        sum += anInt;
      }
      // now we have sum of accounts of person
      // check with overall ans
      if (sum > ans){
        ans = sum;
      }
    }
    return ans;
  }
}
