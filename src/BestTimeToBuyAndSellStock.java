public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {2,1,2,0,1};
        int l = 0;
        int r = 1;
        int maxP = 0;
        while (r < prices.length) {
            if(prices[l] < prices[r] ) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);

            } else {
                l = r;
            }
            r++;
            System.out.println(maxP);
        }

//        for (int i = 0; i < prices.length; i++) {
//                if(prices[i] > large) {
//                    large = prices[i]; // 2
//                    highestPriceDay = i; // 0
//                } else if (prices[i] < small && buyDay >= highestPriceDay) {
//                    small = prices[i]; // 0
//                    buyDay = i; // 3
//                }           //small = 2
//                for(int j = i + 1; j < prices.length; j++) {
//                    if(prices[j] >= small && prices[j] >= sellDayPrice) {
//                        sellDayPrice = prices[j];
//                        sellDay = j;
//                    } else if (j > sellDay ) {
//
//
//                    }
//                }
//            }
//            int profit = sellDayPrice - small;
//            System.out.println(sellDayPrice);
//            System.out.println(small);
//            System.out.println(buyDay);
//            if(profit > 0) {
//                System.out.println(profit);
//            } else {
//                System.out.println(0);
//            }
        }
    }


