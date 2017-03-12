
package javaapplication1;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class NewClass {
    public static void main(String[] args) {
    String path = "C:\\Users\\Boss\\Downloads\\New folder\\Dev_Test_2016\\1.working_time.log";
    File file = new File(path);
    try {
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line[] = new String[100];
        int i=0;
        while((line[i] = br.readLine()) != null){	 
         i++;
        }        
        br.close(); 
        int index[] = new int[6];
        String data[][] = new String[i][5];
        index[0]=0;
        int count=0,k=0,j=1,x=0;
        while(line[k] != null){         
        while(count<line[k].length()){
            index[5] = line[k].length()-1;
            if((line[k].charAt(count))=='|'){
                index[j] = count;
                data[k][x] = line[k].substring(index[j-1],index[j] );
                j++;
                x++;
            }
            count++;
        }        
        k++;
        }
        System.out.println(data[0][3]);
        /*name = line[number].substring(index[0],index[1]);
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



        */}catch (IOException e){
            e.printStackTrace();
        }
    
}
}
