public class Bank {
    private Customer[] allcustomer;
    private Branches[] allcbranches;
    private int Salary;
    private int totalEmployee;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Customer[] getAllcustomer(Customer[] customerarray) {
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
    public void increaseSalary(int amount){
        if(Salary<=amount) {
            Salary = Salary + 1000;

        }else{
            Salary=Salary+0;



        }
       /* public String customerLookup(){    //customerLookuop(string fname). Looks for the customer and return customer data
            int j;
            for(int j=0;j<allcustomer.length;j++);
            allcustomer[j].getFname();
            return String;

        */



    }public void employeeWork(String name){          //find branchname where a employee works(lookup with fname)


        int n;
        for(n=0; n<allcbranches.length;n++){
            allcbranches[n].getEmployeelist();
            if(allcbranches.equals(name));
            return;

        }
    }

}
