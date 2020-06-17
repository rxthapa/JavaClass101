public class Branches {
    private String AddressLocation;
    private String HoursofBusiness;
    private long Ph;
    private Employee Branch_Manager;
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

    public Employee getBranch_Manager() {
        return Branch_Manager;
    }

    public void setBranch_Manager(Employee branch_Manager) {
        Branch_Manager = branch_Manager;
    }

    public Employee[] getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(Employee[] employeelist) {
        this.employeelist = employeelist;
    }
}
