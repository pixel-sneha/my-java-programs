public class BillGenerator {
    public double generateBill(int itemTotal) {
        return roundToTwoDecimals(itemTotal);
    }

    public double generateBill(int itemTotal, int discount) {
        double finalAmount = itemTotal - discount;
        if (finalAmount < 0) finalAmount = 0;
        return roundToTwoDecimals(finalAmount);
    }

    public double generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal * (1.0 - discountPercent / 100.0);
        if (finalAmount < 0) finalAmount = 0;
        return roundToTwoDecimals(finalAmount);
    }

    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        BillGenerator generator = new BillGenerator();

        int regularTotal = 1200;
        double regularFinal = generator.generateBill(regularTotal);
        System.out.println("Customer Type: Regular");
        System.out.println("Item Total: Rs " + regularTotal);
        System.out.println("Final Bill Amount: Rs " + String.format("%.2f", regularFinal));
        System.out.println();

        int privilegedTotal = 2500;
        int flatDiscount = 300; 
        double privilegedFinal = generator.generateBill(privilegedTotal, flatDiscount);
        System.out.println("Customer Type: Privileged");
        System.out.println("Item Total: Rs " + privilegedTotal);
        System.out.println("Flat Discount: Rs " + flatDiscount);
        System.out.println("Final Bill Amount: Rs " + String.format("%.2f", privilegedFinal));
        System.out.println();

        int festiveTotal = 4000;
        double percentDiscount = 15.0;
        double festiveFinal = generator.generateBill(festiveTotal, percentDiscount);
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Item Total: Rs " + festiveTotal);
        System.out.println("Discount Percent: " + percentDiscount + "%");
        System.out.println("Final Bill Amount: Rs " + String.format("%.2f", festiveFinal));
        System.out.println();

        String category = "privileged";
        int total = 1800;
        System.out.println("Dynamic selection example for category: " + category);
        switch (category.toLowerCase()) {
            case "regular":
                System.out.println("Final Bill: Rs " + String.format("%.2f", generator.generateBill(total)));
                break;
            case "privileged":
                int discount = 200;
                System.out.println("Final Bill: Rs " + String.format("%.2f", generator.generateBill(total, discount)));
                break;
            case "festive":
                double pct = 10.0;
                System.out.println("Final Bill: Rs " + String.format("%.2f", generator.generateBill(total, pct)));
                break;
            default:
                System.out.println("Unknown category. Treating as regular.");
                System.out.println("Final Bill: Rs " + String.format("%.2f", generator.generateBill(total)));
        }
    }
}