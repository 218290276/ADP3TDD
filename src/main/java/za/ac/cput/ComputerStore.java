package za.ac.cput;

public class ComputerStore {
    private int hardrivePrice;
    private int motherboardPrice;
    private int ramPrice;
    private int total;

    public int gethardrivePrice() {
        return hardrivePrice;
    }

    public void sethardrivePrice(int hardrivePrice) {
        this.hardrivePrice = hardrivePrice;
    }

    public int getmotherboardPrice() {
        return motherboardPrice;
    }

    public void setmotherboardPrice(int motherboardPrice) {
        this.motherboardPrice = motherboardPrice;
    }

    public int getramPrice() {
        return ramPrice;
    }

    public void setramPrice(int ramPrice) {
        this.ramPrice = ramPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ComputerStore(int hardrivePrice, int motherboardPrice, int ramPrice, int total) {
        this.hardrivePrice = hardrivePrice;
        this.motherboardPrice = motherboardPrice;
        this.ramPrice = ramPrice;
        this.total = total;
    }

    @Override
    public String toString() {
        return "ComputerStore{" +
                "hardrivePrice=" + hardrivePrice +
                ", motherboardPrice=" + motherboardPrice +
                ", ramPrice=" + ramPrice +
                ", total=" + total +
                '}';
    }

    public static void main(String[] args) {
        int hardrivePrice = 1000;
        int motherboardPrice =  5000;
        int ramPrice = 2000;
        int hardriveAmount= 2;
        int ramAmount= 4;
        int motherboardAmount= 1;
        int hardriveTotal = hardrivePrice * hardriveAmount;
        int motherboardTotal= motherboardPrice* motherboardAmount;
        int ramTotal= ramPrice * ramAmount;
        int total = ramTotal + motherboardTotal + hardriveTotal;
        System.out.println("Your total price is: " + total);
    }


}