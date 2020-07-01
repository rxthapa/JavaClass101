

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

    public void hireemployees(Employee emp) {
        int i;
        for( i=0;i<employeelist.length;i++){
            if(employeelist[i]==null){
                break;
            }

        }employeelist[i]=emp;

    }
    public void increaseSalary(int amount){
     
        for(int i=0;i<employeelist.length;i++){
            employeelist[0].setSalary(employeelist[0].getSalary()+amount);

        }

    }
}

