package java31.st2table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmBooks extends JFrame {
    
    // List
    private static List<Book> books = null;
    
    private JPanel            contentPane;
    private JScrollPane       scrollPane;
    private static JTable     table;
    private JButton           btnNewButton;
    private JButton           button;
    private JButton           button_1;
    private JButton           button_2;
    private JLabel            bookid;
    private JLabel            bookname;
    private JLabel            publisher;
    private JLabel            year;
    private JLabel            Price;
    private JLabel            Useyn;
    private JLabel            Authid;
    private JTextField        textField;
    private JTextField        textField_1;
    private JTextField        textField_2;
    private JTextField        textField_3;
    private JTextField        textField_4;
    private JTextField        textField_5;
    private JCheckBox         chckbxNewCheckBox;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmBooks frame = new frmBooks();
                    frame.setVisible(true);
                    
                    // 기초 데이터 생성
                    initData();
                    
                    // 데이터 바인딩
                    frame.refreshTable(books, table);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public static void initData() {
        books = new ArrayList<>();
        books.add(new Book(1, "operating system", "wiley", "2003", 30700, false,
                1));
        books.add(new Book(2, "mysql", "oreilly", "2009", 58700, true, 2));
        books.add(new Book(3, "java", "hall", "2013", 40000, true, 3));
        books.add(new Book(4, "first sql", "wiley", "2015", 57700, true, 4));
        
    }
    
    /**
     * Create the frame.
     */
    public frmBooks() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 533, 455);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getScrollPane());
        contentPane.add(getBtnNewButton());
        contentPane.add(getButton());
        contentPane.add(getButton_1());
        contentPane.add(getButton_2());
        contentPane.add(getBookid());
        contentPane.add(getBookname());
        contentPane.add(getPublisher());
        contentPane.add(getYear());
        contentPane.add(getPrice());
        contentPane.add(getUseyn());
        contentPane.add(getAuthid());
        contentPane.add(getTextField());
        contentPane.add(getTextField_1());
        contentPane.add(getTextField_2());
        contentPane.add(getTextField_3());
        contentPane.add(getTextField_4());
        contentPane.add(getTextField_5());
        contentPane.add(getChckbxNewCheckBox());
    }
    
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setBounds(12, 10, 482, 147);
            scrollPane.setViewportView(getTable());
        }
        return scrollPane;
    }
    
    private JTable getTable() {
        if (table == null) {
            table = new JTable();
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = table.getSelectedRow();
                    String savedId = table.getValueAt(row, 0).toString();
                    String name = table.getValueAt(row, 1).toString();
                    String expr = table.getValueAt(row, 2).toString();
                    String year1 = table.getValueAt(row, 3).toString();
                    String price1 = table.getValueAt(row, 4).toString();
                    String useyn1 = table.getValueAt(row, 5).toString();
                    String authid1 = table.getValueAt(row, 6).toString();
                    bookid.setText(savedId);
                    bookname.setText(name);
                    publisher.setText(expr);
                    year.setText(year1);
                    Price.setText(price1);
                    Useyn.setText(useyn1);
                    Authid.setText(authid1);
                    
                }
            });
            table.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "bookid", "bookname", "publisher", "year",
                            "price", "use_yn", "authid" }));
        }
        return table;
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
            btnNewButton = new JButton("조회");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            btnNewButton.setBounds(22, 167, 68, 23);
        }
        return btnNewButton;
    }
    
    private JButton getButton() {
        if (button == null) {
            button = new JButton("추가");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            button.setBounds(102, 167, 68, 23);
        }
        return button;
    }
    
    private JButton getButton_1() {
        if (button_1 == null) {
            button_1 = new JButton("수정");
            button_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            button_1.setBounds(182, 167, 68, 23);
        }
        return button_1;
    }
    
    private JButton getButton_2() {
        if (button_2 == null) {
            button_2 = new JButton("삭제");
            button_2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            button_2.setBounds(262, 167, 68, 23);
        }
        return button_2;
    }
    
    private JLabel getBookid() {
        if (bookid == null) {
            bookid = new JLabel("bookid");
            bookid.setBounds(22, 215, 46, 15);
        }
        return bookid;
    }
    
    private JLabel getBookname() {
        if (bookname == null) {
            bookname = new JLabel("bookname");
            bookname.setBounds(22, 240, 68, 15);
        }
        return bookname;
    }
    
    private JLabel getPublisher() {
        if (publisher == null) {
            publisher = new JLabel("publisher");
            publisher.setBounds(22, 265, 57, 15);
        }
        return publisher;
    }
    
    private JLabel getYear() {
        if (year == null) {
            year = new JLabel("year");
            year.setBounds(22, 290, 46, 15);
        }
        return year;
    }
    
    private JLabel getPrice() {
        if (Price == null) {
            Price = new JLabel("price");
            Price.setBounds(22, 315, 46, 15);
        }
        return Price;
    }
    
    private JLabel getUseyn() {
        if (Useyn == null) {
            Useyn = new JLabel("use_yn");
            Useyn.setBounds(22, 340, 46, 15);
        }
        return Useyn;
    }
    
    private JLabel getAuthid() {
        if (Authid == null) {
            Authid = new JLabel("authid");
            Authid.setBounds(22, 365, 46, 15);
        }
        return Authid;
    }
    
    private JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setBounds(101, 212, 116, 21);
            textField.setColumns(10);
        }
        return textField;
    }
    
    private JTextField getTextField_1() {
        if (textField_1 == null) {
            textField_1 = new JTextField();
            textField_1.setColumns(10);
            textField_1.setBounds(102, 237, 116, 21);
        }
        return textField_1;
    }
    
    private JTextField getTextField_2() {
        if (textField_2 == null) {
            textField_2 = new JTextField();
            textField_2.setColumns(10);
            textField_2.setBounds(101, 262, 116, 21);
        }
        return textField_2;
    }
    
    private JTextField getTextField_3() {
        if (textField_3 == null) {
            textField_3 = new JTextField();
            textField_3.setColumns(10);
            textField_3.setBounds(101, 287, 116, 21);
        }
        return textField_3;
    }
    
    private JTextField getTextField_4() {
        if (textField_4 == null) {
            textField_4 = new JTextField();
            textField_4.setColumns(10);
            textField_4.setBounds(101, 312, 116, 21);
        }
        return textField_4;
    }
    
    private JTextField getTextField_5() {
        if (textField_5 == null) {
            textField_5 = new JTextField();
            textField_5.setColumns(10);
            textField_5.setBounds(101, 362, 116, 21);
        }
        return textField_5;
    }
    
    private JCheckBox getChckbxNewCheckBox() {
        if (chckbxNewCheckBox == null) {
            chckbxNewCheckBox = new JCheckBox("New check box");
            chckbxNewCheckBox.setBounds(101, 336, 115, 23);
        }
        return chckbxNewCheckBox;
    }
    
    public void refreshTable(List<Book> list, JTable table) {
        Object[] tempObject = new Object[7]; // JTable 컬럼개수
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // table 위치를 0부터 시작하도록 설정
        for (Book obj : list) {
            
            tempObject[0] = obj.getBookid();
            tempObject[1] = obj.getBookname();
            tempObject[2] = obj.getPublisher();
            tempObject[3] = obj.getYear();
            tempObject[4] = obj.getPrice();
            // tempObject[5] = obj.getUse_yn();
            tempObject[6] = obj.getAuthid();
            
            model.addRow(tempObject);
        }
        
        //JTable 첫번째 로우에 focus 추가
        if(model.getRowCount()>0){
            table.setRowSelectionInterval(0, 0);
        }
        table.setModel(model);
    }
    
}
