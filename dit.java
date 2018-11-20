import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class dit
{
public static void main(String[] args) throws IOException
{
final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
Date date = new Date();
String str = String.format("%tD", date );
System.out.println(str);
char[] cur=str.toCharArray();
char[] sec={cur[3],cur[4],' ',cur[0],cur[1],' ','2','0',cur[6],cur[7]};
String str2=new String(sec);
System.out.println("*********************************************************");
System.out.println(" we are here to help you ");
System.out.println("keep ur baby away from diseases");
System.out.println("*********************************************************");
System.out.println();
System.out.println("enter your baby's date of birth");
String firstInput = reader.readLine();
final String secondInput =str2;
final LocalDate firstDate = LocalDate.parse(firstInput,formatter);
final LocalDate secondDate = LocalDate.parse(secondInput,formatter);
final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
System.out.println(days);
long da=days,d=days;
String str1[]=new String[14];
str1[0]="Bacillus Calmette–Guérin (BCG) ,Oral polio vaccine (OPV 0) ,Hepatitis B(Hep-B1)";
str1[1]= "Diptheria, Tetanus and Pertussis vaccine (DTwP 1), Inactivated polio vaccine (IPV 1),Hepatitis B (Hep – B2) ,Haemophilus influenzae type B (Hib 1),Rotavirus 1 ,Pneumococcal conjugate vaccine (PCV 1)";
str1[2]="Diptheria, Tetanus and Pertussis vaccine (DTwP 2),Inactivated polio vaccine(IPV2),Haemophilusinfluenzae type B (Hib 2),Rotavirus 2,Pneumococcal conjugate vaccine (PCV 2)";
str1[3]="Diptheria, Tetanus and Pertussis vaccine (DTwP 3),Inactivated polio vaccine (IPV 3) , Haemophilus influenzae type B (Hib 3),Rotavirus 3,Pneumococcal conjugate vaccine (PCV 3)";
str1[4]="Oral polio vaccine (OPV 1),Hepatitis B (Hep – B3)";
str1[5]="oral polio vaccine(opv 2),Measles, Mumps, and Rubella (MMR – 1)";
str1[6]="Typhoid Conjugate Vaccine";
str1[7]="Hepatitis A (Hep – A1)";
str1[8]="Measles, Mumps, and Rubella (MMR 2),Varicella 1,PCV booster";
str1[9]="Diphtheria, Perussis, and Tetanus (DTwP B1/DTaP B1),Inactivated polio vaccine (IPV B1),Haemophilus influenzae type B (Hib B1)";
str1[10]="Hepatitis A (Hep – A2)";
str1[11]="Booster of Typhoid Conjugate Vaccine";
str1[12]="Diphtheria, Perussis, and Tetanus (DTwP B2/DTaP B2),Oral polio vaccine (OPV 3),Varicella 2,Measles, Mumps, and Rubella (MMR 3)";
str1[13]="Tdap/Td,Human Papilloma Virus (HPV)";
int t=0;
int j[]=new int[14];
j[0]=0;
j[1]=42;
j[2]=70;
j[3]=98;
j[4]=183;
j[5]=274;
j[6]=274;
j[7]=365;
j[8]=457;
j[9]=486;
j[10]=547;
j[11]=730;
j[12]=2191;
j[13]=4383;
long s;
int i=0;
for(i=0;i<14;i++)
{
da=d-j[i];
if(days<=j[i])
{
t=i;
break;
}
}
System.out.println(da);
if(da>0)
{
System.out.println("the person doesn't need any baby vaccination");
}
else if(t<=14)
{
System.out.println("baby needs "+str1[t]+" vaccination in "+LocalDate.parse(firstInput, formatter).plusDays(j[t]));
System.out.println();
}
System.out.println("do you want to know the vaccines which are given before");
String init=reader.readLine();
if(init.equalsIgnoreCase("yes"))
{
for(int k=0;k<i;k++)
{
System.out.print(LocalDate.parse(firstInput, formatter).plusDays(j[k]));
System.out.println(" "+str1[k]);
}
System.out.println();
System.out.println("vaccine need for future");
for(int k=i;k<14;k++)
{
System.out.print(LocalDate.parse(firstInput, formatter).plusDays(j[k]));
System.out.println(" "+str1[k]);
}
System.out.println("******************* thank you ***************************");
}
}
}
