public class RichestCustomerWealth {
    public class Solution {
        public int maximumWealth(int[][] accounts) {
            int M = accounts.length;
            int[] wealth = new int[M];
            for(int i = 0; i < M ; i++){
                int N = accounts[i].length;
                for(int j = 0 ; j < N ; j++){
                    wealth[i] = wealth[i] + accounts[i][j];
                }
            }
            int highest_wealth = -1;
            for(int i = 0 ; i < M ;i++){
                if(highest_wealth < wealth[i]){
                    highest_wealth = wealth[i];
                }
            }
            return highest_wealth ;
        }
    }
}
