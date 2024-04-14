public class buy_sellStocks {
    public static int maxProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE , maxProfit = 0, profit = 0;
        for(int i = 0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,2,6,4};
        System.out.println("Max profit will be: " + maxProfit(prices));
    }
}
