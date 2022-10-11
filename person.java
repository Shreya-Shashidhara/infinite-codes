import java.util.Scanner;

public class person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;
    person(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber ){
        this.mobileNumber=mobileNumber;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setbloodgroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
    public void displayPersonalDetails(){
        System.out.println("Name:"+name);
        System.out.println("Date of Birth:"+dateOfBirth);
        System.out.println("Gender:"+gender);
        System.out.println("Mobile Number:"+mobileNumber);
        System.out.println("Blood Group:"+bloodGroup);
    }
}
class Donor extends person{
    private String BloodBankName;
    private String donorType;
    private String donationDate;
    public Donor() {
    }
    public String getBloodBankName(){
        return BloodBankName;
    }
    public void setBloodBankName(String BloodBankName ){
        this.BloodBankName=BloodBankName;
    }
    public String getdonorType(){
        return donorType;
    }
    public void setdonorType(String donorType ){
        this.donorType=donorType;
    }
    public String getDonationDate(){
        return donationDate;
    }
    public void setDonationDate(String donationDate){
        this.donationDate=donationDate;
    }
    public void displayDonationDetails(){
        System.out.println("Donation Details:");
        super.displayPersonalDetails();
        System.out.println("Blood Bank Name:"+BloodBankName);
        System.out.println("Donor Type:"+donorType);
        System.out.println("Donation Date:"+donationDate);
    }
    }
class main {
    public static void main(String[] args){
        Donor d = new Donor();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name:");
        d.setName(sc.nextLine());
        System.out.println("Enter the Date Of Birth:");
        d.setDateOfBirth(sc.nextLine());
        System.out.println("Enter the Gender:");
        d.setGender(sc.nextLine());
        System.out.println("Enter the Mobile Number:");
        d.setMobileNumber(sc.nextLine());
        System.out.println("Enter the Blood Group:");
        d.setbloodgroup(sc.nextLine());
        System.out.println("Enter the Blood Bank Name:");
        d.setBloodBankName(sc.nextLine());
        System.out.println("Enter the Donor Type:");
        d.setdonorType(sc.nextLine());
        System.out.println("Enter the Donation Date:");
        d.setDonationDate(sc.nextLine());
        d.displayDonationDetails();

    }

}

