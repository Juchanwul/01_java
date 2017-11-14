package java31.st1swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class frmEmail extends JFrame {
    
    private JPanel contentPane;
    private JLabel lblName;
    private JLabel label;
    private JLabel label_1;
    private JTextField a;
    private JTextField b;
    private JLabel label_2;
    private JTextField c;
    private JLabel lblEmail;
    private JLabel label_4;
    private JTextField Emailtxt;
    private JButton btnNewButton;
    private JTextArea textArea;
    private JButton btnNewButton_1;
    private JButton btnRemove;
    private JButton btnDefault;
    private JLabel lblMailFormat;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnPlainText;
    private JRadioButton rdbtnCostom;
    private JButton btnCancle;
    private JButton btnOk;
    private JPanel panel;
    private JPanel panel_1;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmEmail frame = new frmEmail();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public frmEmail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 443, 488);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblName());
        contentPane.add(getLabel());
        contentPane.add(getLabel_1());
        contentPane.add(getA());
        contentPane.add(getB());
        contentPane.add(getLabel_2());
        contentPane.add(getC());
        contentPane.add(getLabel_4());
        contentPane.add(getEmailtxt());
        contentPane.add(getTextArea());
        contentPane.add(getLblMailFormat());
        contentPane.add(getRdbtnNewRadioButton());
        contentPane.add(getRdbtnPlainText());
        contentPane.add(getRdbtnCostom());
        contentPane.add(getBtnCancle());
        contentPane.add(getBtnOk());
        contentPane.add(getPanel());
        contentPane.add(getPanel_1());
    }
    private JLabel getLblName() {
        if (lblName == null) {
        	lblName = new JLabel("Name");
        	lblName.setFont(new Font("굴림", Font.BOLD, 12));
        	lblName.setBounds(32, 22, 57, 15);
        }
        return lblName;
    }
    private JLabel getLabel() {
        if (label == null) {
        	label = new JLabel("이름");
        	label.setFont(new Font("굴림", Font.BOLD, 12));
        	label.setBounds(32, 56, 57, 15);
        }
        return label;
    }
    private JLabel getLabel_1() {
        if (label_1 == null) {
        	label_1 = new JLabel("직책");
        	label_1.setFont(new Font("굴림", Font.BOLD, 12));
        	label_1.setBounds(32, 84, 57, 15);
        }
        return label_1;
    }
    private JTextField getA() {
        if (a == null) {
        	a = new JTextField();
        	a.setBounds(68, 53, 116, 21);
        	a.setColumns(10);
        }
        return a;
    }
    private JTextField getB() {
        if (b == null) {
        	b = new JTextField();
        	b.setBounds(68, 81, 116, 21);
        	b.setColumns(10);
        }
        return b;
    }
    private JLabel getLabel_2() {
        if (label_2 == null) {
        	label_2 = new JLabel("아이디");
        	label_2.setFont(new Font("굴림", Font.BOLD, 12));
        	label_2.setBounds(219, 84, 57, 15);
        }
        return label_2;
    }
    private JTextField getC() {
        if (c == null) {
        	c = new JTextField();
        	c.setBounds(269, 81, 116, 21);
        	c.setColumns(10);
        }
        return c;
    }
    private JLabel getLblEmail() {
        if (lblEmail == null) {
        	lblEmail = new JLabel("E-mail");
        	lblEmail.setBounds(12, 10, 44, 15);
        	lblEmail.setFont(new Font("굴림", Font.BOLD, 12));
        }
        return lblEmail;
    }
    private JLabel getLabel_4() {
        if (label_4 == null) {
        	label_4 = new JLabel("이메일주소");
        	label_4.setFont(new Font("굴림", Font.BOLD, 12));
        	label_4.setBounds(32, 168, 72, 15);
        }
        return label_4;
    }
    private JTextField getEmailtxt() {
        if (Emailtxt == null) {
        	Emailtxt = new JTextField();
        	Emailtxt.setBounds(101, 165, 191, 21);
        	Emailtxt.setColumns(10);
        }
        return Emailtxt;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("Add");
        	btnNewButton.setBounds(289, 30, 87, 36);
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        String email = Emailtxt.getText();
        	        String text = textArea.getText();
        	        String val = text +"\r\n"+email;
        	        textArea.setText(val);
        	        Emailtxt.setText("");
        	        
        	    }
        	});
        	btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
        }
        return btnNewButton;
    }
    private JTextArea getTextArea() {
        if (textArea == null) {
        	textArea = new JTextArea();
        	textArea.setBounds(32, 203, 260, 95);
        	
        	
        }
        return textArea;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("Edit");
        	btnNewButton_1.setBounds(289, 76, 87, 23);
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	    }
        	});
        	btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
        }
        return btnNewButton_1;
    }
    private JButton getBtnRemove() {
        if (btnRemove == null) {
        	btnRemove = new JButton("Remove");
        	btnRemove.setBounds(289, 109, 87, 23);
        	btnRemove.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    }
        	});
        	btnRemove.setFont(new Font("굴림", Font.BOLD, 12));
        }
        return btnRemove;
    }
    private JButton getBtnDefault() {
        if (btnDefault == null) {
        	btnDefault = new JButton("Default");
        	btnDefault.setBounds(289, 142, 87, 23);
        	btnDefault.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    }
        	});
        	btnDefault.setFont(new Font("굴림", Font.BOLD, 12));
        }
        return btnDefault;
    }
    private JLabel getLblMailFormat() {
        if (lblMailFormat == null) {
        	lblMailFormat = new JLabel("Mail Format");
        	lblMailFormat.setFont(new Font("굴림", Font.BOLD, 12));
        	lblMailFormat.setBounds(32, 315, 92, 15);
        }
        return lblMailFormat;
    }
    private JRadioButton getRdbtnNewRadioButton() {
        if (rdbtnNewRadioButton == null) {
        	rdbtnNewRadioButton = new JRadioButton("HTML");
        	rdbtnNewRadioButton.setFont(new Font("굴림", Font.BOLD, 12));
        	rdbtnNewRadioButton.setBounds(28, 336, 67, 23);
        }
        return rdbtnNewRadioButton;
    }
    private JRadioButton getRdbtnPlainText() {
        if (rdbtnPlainText == null) {
        	rdbtnPlainText = new JRadioButton("Plain Text");
        	rdbtnPlainText.setFont(new Font("굴림", Font.BOLD, 12));
        	rdbtnPlainText.setBounds(101, 336, 104, 23);
        }
        return rdbtnPlainText;
    }
    private JRadioButton getRdbtnCostom() {
        if (rdbtnCostom == null) {
        	rdbtnCostom = new JRadioButton("Costom");
        	rdbtnCostom.setFont(new Font("굴림", Font.BOLD, 12));
        	rdbtnCostom.setBounds(209, 336, 87, 23);
        }
        return rdbtnCostom;
    }
    private JButton getBtnCancle() {
        if (btnCancle == null) {
        	btnCancle = new JButton("Cancle");
        	btnCancle.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        System.exit(0); 
        	        
        	    }
        	});
        	btnCancle.setFont(new Font("굴림", Font.BOLD, 12));
        	btnCancle.setBounds(329, 379, 80, 43);
        }
        return btnCancle;
    }
    private JButton getBtnOk() {
        if (btnOk == null) {
        	btnOk = new JButton("OK");
        	btnOk.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        String message = "";
        	        message += textArea.getText()+"\r\n";
        	        message += a.getText()+"\r\n";
                    message += b.getText()+"\r\n";
                    message += c.getText()+"\r\n";
        	                
        	        JOptionPane.showMessageDialog(null, message);
        	        
        	    }
        	});
        	btnOk.setFont(new Font("굴림", Font.BOLD, 12));
        	btnOk.setBounds(237, 379, 80, 43);
        }
        return btnOk;
    }
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
        	panel.setBounds(12, 10, 397, 107);
        	panel.setLayout(null);
        }
        return panel;
    }
    private JPanel getPanel_1() {
        if (panel_1 == null) {
        	panel_1 = new JPanel();
        	panel_1.setBorder(new LineBorder(new Color(51, 153, 255), 2, true));
        	panel_1.setBounds(12, 127, 397, 241);
        	panel_1.setLayout(null);
        	panel_1.add(getLblEmail());
        	panel_1.add(getBtnNewButton());
        	panel_1.add(getBtnNewButton_1());
        	panel_1.add(getBtnRemove());
        	panel_1.add(getBtnDefault());
        }
        return panel_1;
    }
}
