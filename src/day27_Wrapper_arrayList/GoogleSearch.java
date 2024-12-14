package day27_Wrapper_arrayList;

public class GoogleSearch {
    public static void main(String[] args) {

        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";

        searchResultInfo = searchResultInfo.replace("(","").replace(")","");
        String [] reusltInArr = searchResultInfo.split(" ");
        String time = reusltInArr[reusltInArr.length-2];
        System.out.println(time);

        double time1= Double.parseDouble(time); // converts string to double primitive
       // Double time2 = Double.valueOf(time);// converts string to Double wrapper class object

        if(time1<0.5){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        // we did the same thing with ternary
        System.out.println(time1 <.5 ? "pass" : "fail");
    }
}
