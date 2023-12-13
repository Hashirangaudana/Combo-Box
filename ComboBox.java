import javax.security.auth.Subject;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class ComboBox extends JFrame {
 JComboBox cmbSemster;
 Vector subjects;
 DefaultComboBoxModel cmbMode2;
 JComboBox cmbsubjects;
    ComboBox() {

        setTitle("Combo App");
        setSize(400, 170);
        setLocation(600, 450);
  //1.define data(using vector/using arry)
  
  Vector sems = new Vector();
  sems.add("select semsters");
  sems.add("sem 1");
  sems.add("sem 2");
  sems.add("sem 3");
  sems.add("sem 4");
  sems.add("sem 5");
  sems.add("sem 6");
  

  //2.create empty combobox
  cmbSemster = new JComboBox();


  //3.create combox modle using above data    
  DefaultComboBoxModel cmbModel = new DefaultComboBoxModel(sems);

  //4.add data
  cmbSemster.setModel(cmbModel);
      

         subjects = new Vector<>();
        subjects.add("select a subject");
        

         cmbsubjects = new JComboBox<>();

        cmbMode2 = new DefaultComboBoxModel<>(subjects);

        cmbsubjects.setModel(cmbMode2);

        Container con = getContentPane();
        FlowLayout lay = new FlowLayout();
        con.setLayout(lay);

        con.add(cmbSemster);
        con.add(cmbsubjects);

        cmbSemster.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            
                cmbSemsterAp(e);
              
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void cmbSemsterAp(ActionEvent e){
        //System.out.println("Test -> ok");
      Object sitem = cmbSemster.getSelectedItem();
        //System.out.println(sitem);
        if (sitem.equals("sem 1")){
            subjects = new  Vector();
            subjects.add("select a subject");
            subjects.add("ip");
            subjects.add("cs");
            subjects.add("pc");
            subjects.add("im");
            subjects.add("is");

            cmbMode2 = new DefaultComboBoxModel<>(subjects);
            cmbsubjects.setModel(cmbMode2);

        }
    } 

}

