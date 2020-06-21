public class Branches {
    private String AddressLocation;
    private String HoursofBusiness;
    private long Ph;
    private String Branch_Manager;
    private Employee[] employeelist;

    public String getAddressLocation() {
        return AddressLocation;
    }

    public void setAddressLocation(String addressLocation) {
        AddressLocation = addressLocation;
    }

    public String getHoursofBusiness() {
        return HoursofBusiness;
    }

    public void setHoursofBusiness(String hoursofBusiness) {
        HoursofBusiness = hoursofBusiness;
    }

    public long getPh() {
        return Ph;
    }

    public void setPh(long ph) {
        Ph = ph;
    }

    public String getBranch_Manager() {
        return Branch_Manager;
    }

    public void setBranch_Manager(String branch_Manager) {
        Branch_Manager = branch_Manager;
    }

    public Employee[] getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(Employee[] employeelist) {
        this.employeelist = employeelist;
    }

    public static void hireemployee(int Employee) {
        if (Employee <= 21) {
        System.out.println("hire employee");
    }else {
            System.out.println("no hiring");

        }
    }
}
