import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class babygui implements ActionListener 
{
JFrame f1;
JLabel l0;
JLabel l1,l2,l3;
JButton b1,b2;
JTextField t1;
JFrame f2;
JScrollPane p1;
JTextArea ta1;
JPanel pl;
String str2;
ImageIcon im = new ImageIcon("cute_baby2.jpg");
	babygui()
	{	
		Date date = new Date();
		String str=String.format("%tD", date );
		char[] cur=str.toCharArray();
		char[] sec={cur[3],cur[4],' ',cur[0],cur[1],' ','2','0',cur[6],cur[7]};
		str2=new String(sec);
		f1=new JFrame("babyvaccination");
		f1.setSize(600,400);
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setResizable(false);
		l0=new JLabel(im);
		l0.setBounds(0,0,600,400);
		f1.add(l0);
		l1=new JLabel("baby's date of birth  :");
		l0.add(l1);
		l1.setVisible(true);
		l1.setBounds(140,100,150,20);
		l1.setBackground(Color.white);
		t1=new JTextField();
		l0.add(t1);
		t1.setBounds(290,100,150,20);
		l2=new JLabel("today's date  :");
		l0.add(l2);
		l2.setBounds(400,10,100,20);
		l3=new JLabel(str2);
		l0.add(l3);
		l3.setBounds(500,10,100,20);
		b1=new JButton("Enter");
		l0.add(b1);
		b1.setBounds(290,150,80,30);
		b1.setBackground(Color.lightGray);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		f2=new JFrame();
		ta1=new JTextArea();
		p1=new JScrollPane(ta1);
		f2.setVisible(true);
		f2.setSize(600,400);
		f2.setLayout(null);
		f2.add(p1);
		p1.setBounds(50,50,500,250);
		JLabel l = new JLabel("",im,JLabel.CENTER);
		l.setBounds(0,0,600,400);
		f2.add(l);
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String firstInput =t1.getText();
		String secondInput =str2;
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
		if(da>0)
		{
			ta1.setText("the person doesn't need any baby vaccination");
		}
		else if(t<=14)
		{
			ta1.setText("baby needs "+str1[t]+" vaccination in "+LocalDate.parse(firstInput, formatter).plusDays(j[t]));
		}
}
	
	public static void main(String args[])
	{
		new babygui();
	}
}

