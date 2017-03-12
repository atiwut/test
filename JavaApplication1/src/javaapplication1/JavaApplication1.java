
package javaapplication1;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args) {
    String path = "C:\\Users\\Boss\\Downloads\\New folder\\Dev_Test_2016\\1.working_time.log";
    File file = new File(path);
    try {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("number of people: ");
        number = sc.nextInt();
        number = number - 1;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line[] = new String[100];
        int i=0,j=1;
        int count=0;
        int index[] = new int[5];
        index[0]=0;
        while((line[i] = br.readLine()) != null){	 
         i++;
        }        
        br.close();   
        String name,dayF,timeF,dayL,timeL;
        while(count<line[number].length()){
            if((line[number].charAt(count))=='|'){
                index[j] = count;     
                j++;
            }
            count++;
        }
        name = line[number].substring(index[0],index[1]);
        dayF = line[number].substring(index[1]+1,index[2]);
        timeF = line[number].substring(index[2]+1,index[3]);
        dayL = line[number].substring(index[3]+1,index[4]);
        timeL = line[number].substring(index[4]+1);
        
        System.out.println("ชื่อ : "+name);
        System.out.println("วันเริ่มงาน : "+dayF);
        System.out.println("เวลาเริ่มงาน : "+timeF);
        System.out.println("วันเสร็จงาน : "+dayL);
        System.out.println("เวลาเลิกงาน : "+timeL);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f = new SimpleDateFormat("hh:mm");
        try {
            Date date = new Date();
            Date date1 = new Date();
            Date date2 = new Date();
            date = df.parse(dayF);
            date1 = f.parse(timeF);
            date2 = f.parse(timeL);
            int hour1 = date1.getHours();
            int minute1 = date1.getMinutes();
            int hour2 = date2.getHours();
            int minute2 = date2.getMinutes();
            double price = 0.00;
            //System.out.println(date);

            SimpleDateFormat sdf = new SimpleDateFormat("u dd/MM/yyyy");
            String dateDefult;
            dateDefult = sdf.format(date);
            String subDay;
            subDay = dateDefult.substring(0,1);
            //System.out.println(dateDefult);
            //System.out.println(subDay);
            int dayBefore = Integer.parseInt(subDay);
            
            if(dayBefore < 6){
                if((((hour1==8)&&(minute1<=5)) || (hour1<8)) &&((hour2==17)&&(minute2<30)) ){
                    price = 290;
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }
                else if((((hour1==8)&&(minute1<=5)) || (hour1<8)) &&(((hour2==17)&&(minute2>=30)) || (hour2>17))){
                    price = 290*(1.5);
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }
                else if(((hour1==8)&&(minute1>5)) || (hour1>8 && hour1<17)){
                    price = 290-(0.604*(((hour1-8)*60)+1));
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }
            }
            else{
                if((((hour1==8)&&(minute1<=5)) || (hour1<8)) &&((hour2==17)&&(minute2<30)) ){
                    price = 290*1.5;
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }
                else if((((hour1==8)&&(minute1<=5)) || (hour1<8)) &&((hour2==17)&&(minute2>=30))){
                    price = 290*(2);
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }
                else if(((hour1==8)&&(minute1>5)) || (hour1>8 && hour1<17)){
                    price = 1.5*(290-(0.604*(((hour1-8)*60)+1)));
                    System.out.println("ได้รับเงิน "+price+" บาท"); 
                }               
            }
            

        } catch (ParseException e) {
            e.printStackTrace();
        }



        }catch (IOException e){
            e.printStackTrace();
        }
    /*SimpleDateFormat df = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
    String startDateString;
    Scanner sc  = new Scanner(System.in);    
    startDateString = sc.nextLine();
    //String startDateString = "2015/03/11 10:20:56";
    
    try {
        Date date = new Date();
        date = df.parse(startDateString);
        System.out.println(date);
        
        SimpleDateFormat sdf = new SimpleDateFormat("u dd MM yyyy hh:mm:ss");
        String dateDefult;
        dateDefult = sdf.format(date);
        
        String subDay;
        subDay = dateDefult.substring(0,1);
        System.out.println(dateDefult);
        System.out.println(subDay);
        int day = Integer.parseInt(subDay);
        if(day < 6){
            if()
        }
        
        else{
            
        }
          
    } catch (ParseException e) {
        e.printStackTrace();
    }
    */
    }
    
}
