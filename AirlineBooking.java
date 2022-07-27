import javax.swing.*;    
import java.awt.event.*; 
import java.awt.*; 
//username=admin ;password=admin
class Login implements ActionListener
{   JFrame J1=new JFrame("LOGIN");
    JLabel label,label1;
	JPasswordField value;
	JLabel l1,l2;
	JButton b1;
	final JTextField text;
	Login()
	{
    label = new JLabel("LOGIN PAGE");   
	label.setFont(new Font("Algerian", Font.BOLD, 30));
	label.setForeground(Color.BLACK);	
    label.setBounds(50,50, 380,35);	
	label.setOpaque(false);
    value = new JPasswordField();   
    value.setBounds(100,175,100,30);   
    l1=new JLabel("Username:");    
    l1.setBounds(20,120, 80,30);    
    l2=new JLabel("Password:");    
    l2.setBounds(20,175, 80,30);   
    text = new JTextField();
	text.setBounds(100,120, 100,30);  	
    b1 = new JButton("Login");  
    b1.setBounds(100,250, 80,30); 
	b1.addActionListener(this);
    J1.add(value); 
	J1.add(l1); 
	J1.add(label); 
	J1.add(l2); 
	J1.add(b1);
	J1.add(text); 	
    J1.setSize(300,350);  
	J1.setLayout(null);
    J1.setVisible(true);
	J1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
    public void actionPerformed(ActionEvent ae)
	{ 
		String passValue=new String(value.getPassword());
		String userValue=text.getText();
        if (userValue.equals("admin") && passValue.equals("admin")) 
		{     
		J1.dispose();
		new Passenger();
        }  
        else
		{   
            JOptionPane.showMessageDialog(J1,"Enter valid username and password!!","Alert",JOptionPane.WARNING_MESSAGE);  
        }    
    }  
} 
class Passenger implements ActionListener
{   
	JFrame J2=new JFrame();
	JLabel title,name,passid,gender,age,dob,add,email,mno,res;
	JTextField tname,tpassid,emailid,tmno,tage;
	JRadioButton male,female;
	ButtonGroup gengp;
	JComboBox date,month,year;
	JButton sub,reset,next;
	JTextArea tadd,tout;
	String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    String months[]= { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
    String years[] = { "1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000", "2001", "2002","2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019","2020" };
    Passenger()
	{ 
        J2.setTitle("Passenger Details");  
        J2.setSize(900, 700); 
		title = new JLabel("PASSENGER DETAILS");
		title.setFont(new Font("Algerian", Font.BOLD, 30));
	    title.setForeground(Color.BLACK);	
	    title.setOpaque(false);
        title.setSize(400, 60);
        title.setLocation(150, 0);
        J2.add(title);
		name = new JLabel("Name");
        name.setSize(100, 20);
        name.setLocation(100, 100);
        J2.add(name);
        tname = new JTextField();
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        J2.add(tname); 
		passid = new JLabel("Passport ID");
        passid.setSize(100, 20);
        passid.setLocation(100, 150);
        J2.add(passid);
        tpassid = new JTextField();
        tpassid.setSize(190, 20);
        tpassid.setLocation(200, 150);
        J2.add(tpassid);
        gender = new JLabel("Gender");
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        J2.add(gender);
        male = new JRadioButton("Male");
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        J2.add(male); 
        female = new JRadioButton("Female");
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        J2.add(female); 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
		age = new JLabel("Age");
        age.setSize(50, 20);
        age.setLocation(100, 250);
        J2.add(age);
		tage = new JTextField();
        tage.setSize(50, 20);
        tage.setLocation(200, 250);
        J2.add(tage);
		dob = new JLabel("DOB");
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        J2.add(dob);
        date = new JComboBox(dates);
        date.setSize(50, 20);
        date.setLocation(200, 300);
        J2.add(date);
        month = new JComboBox(months);
        month.setSize(60, 20);
        month.setLocation(250, 300);
        J2.add(month); 
        year = new JComboBox(years);
        year.setSize(60, 20);
        year.setLocation(320, 300);
        J2.add(year); 
        add = new JLabel("Address");
        add.setSize(100, 20);
        add.setLocation(100, 350);
        J2.add(add);		
		tadd = new JTextArea();
        tadd.setSize(150, 50);
        tadd.setLocation(200, 350);
        tadd.setLineWrap(true);
        J2.add(tadd);		
		email = new JLabel("Email Id");
        email.setSize(100, 20);
        email.setLocation(100, 450);
        J2.add(email);
        emailid = new JTextField();
        emailid.setSize(150, 20);
        emailid.setLocation(200, 450);
        J2.add(emailid);
		mno = new JLabel("Mobile No.");
        mno.setSize(100, 20);
        mno.setLocation(100, 500);
        J2.add(mno);
        tmno = new JTextField();
        tmno.setSize(150, 20);
        tmno.setLocation(200, 500);
        J2.add(tmno);
		sub = new JButton("Submit");
        sub.setSize(100, 20);
        sub.setLocation(150, 550);
        sub.addActionListener(this);
        J2.add(sub);
        reset = new JButton("Reset");
        reset.setSize(100, 20);
        reset.setLocation(270, 550);
        reset.addActionListener(this);
        J2.add(reset);
		next = new JButton("Book Flight");
        next.setSize(100, 20);
        next.setLocation(210, 600);
        next.addActionListener(this);
        J2.add(next);
		tout = new JTextArea();
        tout.setSize(300, 300);
        tout.setLocation(500, 200);
        tout.setLineWrap(true);
        tout.setEditable(false);
        J2.add(tout);
        res = new JLabel("");
        res.setSize(500, 25);
        res.setLocation(500, 150);
		res.setFont(new Font("Calibri", Font.BOLD, 20));
	    res.setForeground(Color.BLACK);	
	    res.setOpaque(false);
        J2.add(res);
		J2.setLayout(null);
		J2.setVisible(true);
		J2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}	
    public void	actionPerformed(ActionEvent	e)
	{
	    if (e.getSource() == sub) 
		{
                String data1="";
                String data =  "\n Passport ID: " + tpassid.getText() + "\n\n" + " Name : " + tname.getText() + "\n\n";
                if (male.isSelected())
                    data1 = " Gender : Male" + "\n\n";
                else
                    data1 = " Gender : Female" + "\n\n";
                String data2 = " DOB : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n\n";
                String data3 = " Age : " + tage.getText()+"\n\n"+" Address : " + tadd.getText()+"\n\n"+" Email ID: "+ emailid.getText()+"\n\n"+ " Mobile No."+tmno.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Passenger Details Confirmed");
            }
        else if (e.getSource() == reset) 
		{
            String def = "";
            tname.setText(def);
			tpassid.setText(def);
            tadd.setText(def);
			emailid.setText(def);
            res.setText(def);
            tout.setText(def);
			tmno.setText(def);
			tage.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
		else if(e.getSource() == next)
		{
			J2.dispose();
			new Flight();
		}
    }
}  	
class Flight implements ActionListener
{
	JFrame J3=new JFrame();
	JLabel head,jd,from,to,Class,res1,res2,res3;
	JComboBox date1,month1,year1,tfrom,tto;
	JRadioButton eco,busi;
	ButtonGroup classgp;
	JButton sub1,reset1;
	JTextArea tout1;
	String dd[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    String mm[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
    String yy[] = { "2021","2022","2023"};
	String list[] = { "Chennai","Mumbai","Delhi","Bangalore","Hyderabad","Kochi","Kolkata","Ahmedabad","Goa","Patna","Lucknow","Pune","Jaipur"};
	Flight()
	{
		J3.setTitle("Flight Details");  
        J3.setSize(900, 700);
		head=new JLabel("FLIGHT BOOKING");
		head.setSize(400,60);
		head.setLocation(150,0);
		head.setFont(new Font("Algerian", Font.BOLD, 30));
	    head.setForeground(Color.BLACK);	
	    head.setOpaque(false);
		J3.add(head);
		jd=new JLabel("Journey Date");
		jd.setSize(100,20);
		jd.setLocation(100,100);
		J3.add(jd);
		date1 = new JComboBox(dd);
        date1.setSize(50, 20);
        date1.setLocation(200,100);
        J3.add(date1);
        month1 = new JComboBox(mm);
        month1.setSize(60, 20);
        month1.setLocation(250,100);
        J3.add(month1); 
        year1 = new JComboBox(yy);
        year1.setSize(60, 20);
        year1.setLocation(320,100);
        J3.add(year1);
		from=new JLabel("From");
		from.setSize(100,20);
		from.setLocation(100,150);
		J3.add(from);
		tfrom = new JComboBox(list);
        tfrom.setSize(100, 20);
        tfrom.setLocation(200,150);
        J3.add(tfrom);
		to=new JLabel("To");
		to.setSize(100,20);
		to.setLocation(100,200);
		J3.add(to);
		tto = new JComboBox(list);
        tto.setSize(100, 20);
        tto.setLocation(200,200);
        J3.add(tto);
		Class = new JLabel("Class");
        Class.setSize(100, 20);
        Class.setLocation(100, 250);
        J3.add(Class);
        eco = new JRadioButton("Economy");
        eco.setSelected(true);
        eco.setSize(80, 20);
        eco.setLocation(200, 250);
        J3.add(eco); 
        busi = new JRadioButton("Business");
        busi.setSelected(false);
        busi.setSize(80, 20);
        busi.setLocation(280, 250);
        J3.add(busi);
        classgp = new ButtonGroup();
        classgp.add(eco);
        classgp.add(busi);
		tout1 = new JTextArea();
        tout1.setSize(300, 250);
        tout1.setLocation(500, 100);
        tout1.setLineWrap(true);
        tout1.setEditable(false);
        J3.add(tout1);
		sub1 = new JButton("Confirm");
        sub1.setSize(100, 20);
        sub1.setLocation(150, 300);
        sub1.addActionListener(this);
        J3.add(sub1);
        reset1 = new JButton("Reset");
        reset1.setSize(100, 20);
        reset1.setLocation(270, 300);
        reset1.addActionListener(this);
	    J3.add(reset1);
		res1 = new JLabel("");
        res1.setSize(500, 25);
        res1.setLocation(500, 50);
		res1.setFont(new Font("Calibri", Font.BOLD, 20));
		res1.setForeground(Color.BLACK);
        res1.setOpaque(false);
        J3.add(res1);
		res2 = new JLabel("");
        res2.setSize(700, 100);
        res2.setLocation(150, 350);
		res2.setFont(new Font("Serif", Font.BOLD, 25));
		res2.setForeground(Color.BLACK);
        res2.setOpaque(false);
        J3.add(res2);
		res3 = new JLabel("");
        res3.setSize(500, 100);
        res3.setLocation(150, 450);
		res3.setFont(new Font("Serif", Font.BOLD, 25));
		res3.setForeground(Color.BLACK);
        res3.setOpaque(false);
        J3.add(res3);
		J3.setLayout(null);
		J3.setVisible(true);
		J3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	public void actionPerformed(ActionEvent a)
	{
		if (a.getSource() == sub1) 
		{
			String flightno="",dtime="",price="",d2="";
			String d="\n Journey Date : "+(String)date1.getSelectedItem() + "/"+ (String)month1.getSelectedItem() + "/" + (String)year1.getSelectedItem() + "\n\n";
			String d1=" From : " + (String)tfrom.getSelectedItem() + "\n\n To : " + (String)tto.getSelectedItem() + "\n\n";
			if(eco.isSelected())
				d2=" Class : Economy"+"\n\n";
			else
				d2=" Class : Business"+"\n\n";
			if((String)tfrom.getSelectedItem() == "Chennai")
			{
				if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 11210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 11220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 11230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 11240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 11250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 11260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 11270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 11280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 11290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 11300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 11310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 11320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Mumbai")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 12210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 12220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 12230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 12240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 12250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 12260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 12270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 12280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 12290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 12300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 12310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 12320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Delhi")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 13210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 13220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 13230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 13240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 13250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 13260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 13270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 13280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 13290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 13300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 13310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 13320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Bangalore")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 14210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 14220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 14230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 14240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 14250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 14260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 14270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 14280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 14290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 14300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 14310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 14320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Hyderabad")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 15210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 15220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 15230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 15240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 15250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 15260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 15270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 15280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 15290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 15300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 15310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 15320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Kochi")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 16210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 16220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 16230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 16240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 16250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 16260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 16270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 16280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 16290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 16300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 16310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 16320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Kolkata")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 17210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 17220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 17230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 17240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 17250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 17260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 17270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 17280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 17290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 17300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 17310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 17320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Ahmedabad")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 18210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 18220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 18230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 18240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 18250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 18260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 18270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 18280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 18290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 18300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 18310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 18320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Goa")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 19210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 19220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 19230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 19240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 19250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 19260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 19270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 19280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 19290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 19300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 19310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 19320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Patna")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 19210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 19220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 19230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 19240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 19250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 19260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 19270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 19280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 19290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 19300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 19310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 19320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Lucknow")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 20210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 20220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 20230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 20240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 20250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 20260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 20270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 20280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 20290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 20300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 20310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 20320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Pune")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 21210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 21220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 21230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 21240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 21250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 21260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 21270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 21280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 21290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 21300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 21310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Jaipur")
				{
					flightno=" Flight No : 21320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			else if((String)tfrom.getSelectedItem() == "Jaipur")
			{
				if((String)tto.getSelectedItem() == "Chennai")
				{
					flightno=" Flight No : 22210"+"\n\n";
					dtime=" Departure Time : 08:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Delhi")
				{
					flightno=" Flight No : 22220"+"\n\n";
					dtime=" Departure Time : 09:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
				else if((String)tto.getSelectedItem() == "Bangalore")
				{
					flightno=" Flight No : 22230"+"\n\n";
					dtime=" Departure Time : 10:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Hyderabad")
				{
					flightno=" Flight No : 22240"+"\n\n";
					dtime=" Departure Time : 11:30 AM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2500 ";
					else
						price=" Ticket Charge : Rs.6000 ";
				}
				else if((String)tto.getSelectedItem() == "Kochi")
				{
					flightno=" Flight No : 22250"+"\n\n";
					dtime=" Departure Time : 12:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.2000 ";
					else
						price=" Ticket Charge : Rs.5000 ";
				}
				else if((String)tto.getSelectedItem() == "Kolkata")
				{
					flightno=" Flight No : 22260"+"\n\n";
					dtime=" Departure Time : 01:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Ahmedabad")
				{
					flightno=" Flight No : 22270"+"\n\n";
					dtime=" Departure Time : 02:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4500 ";
					else
						price=" Ticket Charge : Rs.10000 ";
				}
				else if((String)tto.getSelectedItem() == "Goa")
				{
					flightno=" Flight No : 22280"+"\n\n";
					dtime=" Departure Time : 03:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.3000 ";
					else
						price=" Ticket Charge : Rs.7000 ";
				}
				else if((String)tto.getSelectedItem() == "Patna")
				{
					flightno=" Flight No : 22290"+"\n\n";
					dtime=" Departure Time : 04:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.11000 ";
				}
				else if((String)tto.getSelectedItem() == "Lucknow")
				{
					flightno=" Flight No : 22300"+"\n\n";
					dtime=" Departure Time : 05:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.5000 ";
					else
						price=" Ticket Charge : Rs.12000 ";
				}
				else if((String)tto.getSelectedItem() == "Pune")
				{
					flightno=" Flight No : 22310"+"\n\n";
					dtime=" Departure Time : 06:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.4000 ";
					else
						price=" Ticket Charge : Rs.9000 ";
				}
				else if((String)tto.getSelectedItem() == "Mumbai")
				{
					flightno=" Flight No : 22320"+"\n\n";
					dtime=" Departure Time : 07:30 PM "+"\n\n";
					if(eco.isSelected())
						price=" Ticket Charge : Rs.6000 ";
					else
						price=" Ticket Charge : Rs.14000 ";
				}
			}	
			tout1.setText(d+d1+d2+flightno+dtime+price);
			tout1.setEditable(false);
			res1.setText("Flight Ticket Booked and Emailed");
			res2.setText("Thank you for Booking your Flight Ticket with us");
			res3.setText("Have a Comfortable and Safe Journey");
        }
        else if (a.getSource() == reset1) 
		{
            String def = "";
            res1.setText(def);
			res2.setText(def);
			res3.setText(def);
            tout1.setText(def);
			tfrom.setSelectedIndex(0);
			tto.setSelectedIndex(0);
            date1.setSelectedIndex(0);
            month1.setSelectedIndex(0);
            year1.setSelectedIndex(0);
        }
	}
}
public class AirlineBooking
{
    public static void main(String[] args) throws Exception
    {
        new Login();
    }
}