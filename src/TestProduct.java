import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProduct {

    @Test
    // Making sure that the method in the Product goes back to the total products that has been sold
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int[][] mockSales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] products = {"Cosy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        Product product = new Product(mockSales, products);

        Assertions.assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    //Verifying if the GetAverageSales does the same but goes back to the number of products that has been sold
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[][] mockSales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] products = {"Cosy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        Product product = new Product(mockSales, products);

        Assertions.assertEquals(17.0, product.GetAverageProductsSold(), 0.001);
    }
}
