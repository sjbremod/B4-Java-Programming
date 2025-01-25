package day32_custom_classes;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto;

public Offer (String company,String location){
    this.company=company;
    this.location=location;

}
    public Offer (String company,String location,double salary){
        this.company=company;
        this.location=location;
        this.salary=salary;

    }

    public Offer(String location, String company, double salary, boolean isFullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

    public String toString() {

    String result = "offer info: ";

    result += "\n\tlocation: "+ location;
    result += "\n\tCompany: "+ company;
    result+= "\n\tsalary: "+ ((salary>0)? "$"+salary : "info not available.");
    result+= "\n\tis full time: "+ ((isFullTime)? "full time": "either not full time or not availble");
    result+= "\n\tnumber of PTO: "+ ((pto>0)?pto : "0 days as pto or info not available");


        return result;
    }

}
