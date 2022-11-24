import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.awt.*;


public class signUp extends JFrame {


    public signUp() {
        initComponents();
    }

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel namaapp = new JLabel();
        JLabel jLabel2 = new JLabel();
        JButton backBtn = new JButton();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        fieldNama = new JTextField();
        JLabel jLabel5 = new JLabel();
        fieldPhone = new JTextField();
        JLabel jLabel6 = new JLabel();
        fieldEmail = new JTextField();
        JLabel jLabel7 = new JLabel();
        jCheckBox1 = new JCheckBox();
        JButton signUpBtn = new JButton();
        fieldPass = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(74, 31, 61));

        jLabel1.setIcon(new ImageIcon("E:\\Agung\\Semester 3\\UAS\\OBP\\Project UAS\\App S Car(intelij)\\src\\main\\resources\\car copy.png"));

        namaapp.setBackground(new Color(255, 255, 255));
        namaapp.setFont(new Font("Verdana", 0, 14));
        namaapp.setForeground(new Color(255, 255, 255));
        namaapp.setText("Welcome to Einesday!");

        jLabel2.setFont(new Font("Tahoma", 0, 12));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Your one-day car rental solution");

        backBtn.setText("BACK TO LOGIN");
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(namaapp)
                                                        .addComponent(jLabel2)
                                                        .addComponent(backBtn))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namaapp)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addContainerGap())
        );

        jLabel3.setFont(new Font("Palatino Linotype", 0, 20));
        jLabel3.setText("SIGN UP");

        jLabel4.setFont(new Font("Tahoma", 1, 14));
        jLabel4.setText("Nama/Username");

        jLabel5.setFont(new Font("Tahoma", 1, 14));
        jLabel5.setText("Phone");

        jLabel6.setFont(new Font("Tahoma", 1, 14));
        jLabel6.setText("Email");

        jLabel7.setFont(new Font("Tahoma", 1, 14));
        jLabel7.setText("Password");

        jCheckBox1.setIcon(new ImageIcon("E:\\Agung\\Semester 3\\UAS\\OBP\\Project UAS\\App S Car(intelij)\\src\\main\\resources\\eye.png"));
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        signUpBtn.setText("SIGN UP");
        signUpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(fieldNama)
                                                        .addComponent(fieldPhone)
                                                        .addComponent(fieldEmail)
                                                        .addComponent(fieldPass, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox1)
                                                .addContainerGap(38, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(144, 144, 144))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(signUpBtn)
                                                                .addGap(143, 143, 143))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(fieldNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(fieldPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldPass))
                                .addGap(36, 36, 36)
                                .addComponent(signUpBtn)
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }

    private void backBtnActionPerformed(ActionEvent evt) {
        Login ln = null;
        try {
            ln=new Login();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ln.setVisible(true);
        this.dispose();
    }

    private void jCheckBox1ActionPerformed(ActionEvent evt) {
        if(jCheckBox1.isSelected())
        {
            fieldPass.setEchoChar((char)0);
        }
        else
        {
            fieldPass.setEchoChar('*');
        }
    }

    private void signUpBtnActionPerformed(ActionEvent evt) {
        try {
            Connection conn = MySQLConnection.getConnection();

            String query = "INSERT INTO user (Nama, Phone, Email, Password) VALUES (?, ?, ?, ?)";

            PreparedStatement prep = conn.prepareStatement(query);

            prep.setString(1, fieldNama.getText());
            prep.setString(2, fieldPhone.getText());
            prep.setString(3, fieldEmail.getText());
            prep.setString(4, String.valueOf(fieldPass.getPassword()));

            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registered Successfully");

        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    private JTextField fieldEmail;
    private JTextField fieldNama;
    private JPasswordField fieldPass;
    private JTextField fieldPhone;
    private JCheckBox jCheckBox1;

}
