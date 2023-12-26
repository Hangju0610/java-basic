package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("카트의 최대치를 넘었습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i< itemCount; i++) {
            System.out.println("상품명: "+ items[i].getName() + ", 합계 : " + (items[i].getTotalPrice()));
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    /**
     * TotalPrice 반환
     * 추후 다시 사용할 수 있기 때문에 따로 메서드를 제작
     * 캡슐화 사용
     * @return totalPrice
     */
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }

}
