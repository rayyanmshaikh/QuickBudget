package View;

import Styling.Style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class SignIn extends JPanel implements ActionListener {
    // Components of the Form
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[];
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[];


    public SignIn(OverFrame frame) {
        setLayout(null);

        ArrayList<String> lst_yrs = new ArrayList<>();
        int endYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int year = endYear; year >= endYear - 150; year--) lst_yrs.add(String.valueOf(year));
        years = lst_yrs.toArray(new String[0]);

        ArrayList<String> all_days = new ArrayList<>();
        for(int num = 1; num <= 31; num++) all_days.add(String.valueOf(num));
        dates = all_days.toArray(new String[0]);


        title = new JLabel("Registration Form");
        title.setFont(Style.selection);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        add(title);

        name = new JLabel("Name");
        name.setFont(Style.selection);
        name.setSize(100, 20);
        name.setLocation(100, 100);
        add(name);

        tname = new JTextField();
        tname.setFont(Style.text);
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(Style.selection);
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        add(mno);

        tmno = new JTextField();
        tmno.setFont(Style.text);
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(Style.selection);
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(Style.text);
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(Style.text);
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(Style.selection);
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        add(dob);

        date = new JComboBox(dates);
        date.setFont(Style.text);
        date.setSize(50, 20);
        date.setLocation(200, 250);
        add(date);

        month = new JComboBox(months);
        month.setFont(Style.text);
        month.setSize(60, 20);
        month.setLocation(250, 250);
        add(month);

        year = new JComboBox(years);
        year.setFont(Style.text);
        year.setSize(60, 20);
        year.setLocation(320, 250);
        add(year);

        add = new JLabel("Address");
        add.setFont(Style.selection);
        add.setSize(100, 20);
        add.setLocation(100, 300);
        add(add);

        tadd = new JTextArea();
        tadd.setFont(Style.text);
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        add(tadd);

        sub = Style.styleButton("Submit", 20);
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        add(sub);

        reset = Style.styleButton("Reset", 20);
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        add(reset);

        tout = new JTextArea();
        tout.setFont(Style.text);
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        add(tout);

        res = new JLabel("");
        res.setFont(Style.selection);
        res.setSize(500, 25);
        res.setLocation(100, 500);
        add(res);

        resadd = new JTextArea();
        resadd.setFont(Style.text);
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        add(resadd);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String data1;
            String data
                    = "Name : "
                    + tname.getText() + "\n"
                    + "Mobile : "
                    + tmno.getText() + "\n";
            if (male.isSelected())
                data1 = "Gender : Male"
                        + "\n";
            else
                data1 = "Gender : Female"
                        + "\n";
            String data2
                    = "DOB : "
                    + date.getSelectedItem()
                    + "/" + month.getSelectedItem()
                    + "/" + year.getSelectedItem()
                    + "\n";

            String data3 = "Address : " + tadd.getText();
            tout.setText(data + data1 + data2 + data3);
            tout.setEditable(false);
            res.setText("Registration Successful");
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }

    @Override
    public String toString() {
        return "SignIn";
    }
}
