package Udemy;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxcapacity=500;
    private int defaultpasswordlength=10;
    private String alternativeEmail;
    private String companySuffix=".aeyceompany.com";

    //constructor to receive the fname and last name

    public Email(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email Created: "+this.firstname+" "+this.lastname);
        this.department=setDepartment();
        System.out.println("Department:"+this.department);
        this.password=randomPassword(defaultpasswordlength);
        System.out.println("Your Password is"+this.password);

        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companySuffix;
        System.out.println("Your Email is: "+ email);



    }
    //ask for the department
    private String setDepartment(){
        System.out.print("New worker:"+firstname+"Enther the department code\n1 for sale\n2 for accounting\n3 for development \n0 for none");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){return "sales"; }
        else if(depChoice==2){return "accounting"; }
        else if(depChoice==3){return "development"; }
        else{return" ";}


    }private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123455564!@#$%&";
        char[] password = new char[length];
        int i;
        for (i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }


        //set the mailbox capacity
    public void setMailboxcapacity(int capacity){
        this.mailboxcapacity=capacity;
    }
    public  void setAlternativeEmail(String altEmail){
        this.alternativeEmail=altEmail;
    }
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailboxcapacity(){return mailboxcapacity;}
    public String getAlternativeEmail(){return alternativeEmail;}
    public String getPassword(){return password;}

    public String showInfo() {
    return "DIsplay Name:"+firstname +" "+lastname+
            "\nCOmpany Email:"+email+
            "\nMailBox Capacity:"+ mailboxcapacity+ "mb";
    }
        //set the alternative email
        //change the password


}
