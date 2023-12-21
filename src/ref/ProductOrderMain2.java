package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = {productOrder1, productOrder2, productOrder3};
        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder newProductOrder = new ProductOrder();
        newProductOrder.productName = productName;
        newProductOrder.price = price;
        newProductOrder.quantity = quantity;
        return newProductOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액: " + totalAmount);
        return totalAmount;
    }

}
