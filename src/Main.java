//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Declaration
    Scanner scanner = new Scanner(System.in);

    // Single-dimensional array
    String[] products = { "Cosy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};

    // Two-dimensional array
    int[][] sales = new int[3][3];

    // Input from the user's side
    for (int i = 0; i < products.length; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
            sales[i][j] = scanner.nextInt();
        }
    }

    System.out.println();

    // Product and PrintProduct classes
    Product productObj = new Product(sales, products);
    PrintProduct printer = new PrintProduct(productObj);

    // Play out the report
    printer.printReport();

}
