public class Bank {
    private Customer[] allcustomer;
    private Branches[] allcbranches;
    private int totalEmployee;

    public Customer[] getAllcustomer() {
        return allcustomer;
    }

    public void setAllcustomer(Customer[] allcustomer) {
        this.allcustomer = allcustomer;
    }

    public Branches[] getAllcbranches() {
        return allcbranches;
    }

    public void setAllcbranches(Branches[] allcbranches) {
        this.allcbranches = allcbranches;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }
}