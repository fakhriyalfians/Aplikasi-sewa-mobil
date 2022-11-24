import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel mobil = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel1 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel3 = new JLabel();
        JLabel labelUsername = new JLabel();
        fieldUsername = new JTextField();
        JLabel labelPassword = new JLabel();
        fieldPassword = new JPasswordField();
        JPanel jPanel3 = new JPanel();
        JButton btnSignUp = new JButton();
        JButton btnLogin = new JButton();
        JLabel jLabel5 = new JLabel();
        jCheckBox1 = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(74, 31, 61));

        mobil.setIcon(new ImageIcon("..\\App S Car(intelij)\\src\\main\\resources\\car copy.png"));

        jLabel2.setFont(new Font("Verdana", 0, 14));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Welcome to Einesday!");

        jLabel1.setFont(new Font("Tahoma", 0, 12));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Your one-day car rental solution ");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(mobil, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(mobil, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new Color(204, 204, 204));

        jLabel3.setFont(new Font("Palatino Linotype", 0, 20));
        jLabel3.setText("SIGN IN");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel3)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(69, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60))
        );

        labelUsername.setFont(new Font("Tahoma", 0, 14));
        labelUsername.setText("Username");

        labelPassword.setFont(new Font("Tahoma", 0, 14));
        labelPassword.setText("Password");

        jPanel3.setBackground(new Color(204, 204, 204));
        jPanel3.setForeground(new Color(255, 255, 255));

        btnSignUp.setFont(new Font("Tahoma", 0, 12));
        btnSignUp.setText("Not Registered Yet? Sign Up");
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignUp)
                                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(76, Short.MAX_VALUE)
                                .addComponent(btnSignUp)
                                .addGap(22, 22, 22))
        );

        btnLogin.setText("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new Font("Tahoma", 0, 12));
        jLabel5.setText("Forgot Your Password?");

        jCheckBox1.setIcon(new ImageIcon("..\\App S Car(intelij)\\src\\main\\resources\\eye.png")); // NOI18N
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
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
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelUsername)
                                                        .addComponent(labelPassword))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(fieldUsername, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                                .addComponent(fieldPassword))
                                                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelUsername)
                                        .addComponent(fieldUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPassword)
                                        .addComponent(fieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(btnLogin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void btnSignUpActionPerformed(ActionEvent evt) {
        signUp userReg = null;
        try {
            userReg = new signUp();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        userReg.setVisible(true);
        this.dispose();
    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        Operations operations = new Operations();

        try {
            String usernameStr = fieldUsername.getText();
            String passwdStr = String.valueOf(fieldPassword.getPassword());

            if(operations.isLogin(usernameStr, passwdStr)) {
                new Main().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username/Password Salah");
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void jCheckBox1ActionPerformed(ActionEvent evt) {
        if(jCheckBox1.isSelected())
        {
            fieldPassword.setEchoChar((char)0);
        }
        else
        {
            fieldPassword.setEchoChar('*');
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    private JPasswordField fieldPassword;
    private JTextField fieldUsername;
    private JCheckBox jCheckBox1;


}
