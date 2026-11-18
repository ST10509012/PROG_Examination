public class Product implements IProduct {
    private int[][] salesData;
    private String[] productNames;

    // Data Information
    public Product(int[][] salesData, String[] productNames) {
        this.salesData = salesData;
        this.productNames = productNames;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int[] row : salesData) {
            count += row.length;
        }
        // Returns the average across all product-month entries
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int bestIndex = 0;

        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                bestIndex = i;
            }
        }
        int i;
        return productNames[i = bestIndex] + " (" + maxSales + ")";
    }
}
