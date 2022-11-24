import javax.swing.*;
import java.awt.*;
import javax.swing.Box.*;
import javax.swing.UIManager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.sql.*;

public class Profile extends JFrame {

    public Profile() {
        setTitle("Example App");
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);

        JPanel jPanel1 = new JPanel();
        JButton jButton1 = new JButton();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel8 = new JLabel();
        JLabel  jLabel7 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JPanel jPanel3 = new JPanel();
        JButton jButton2 = new JButton();
        JPanel jPanel4 = new JPanel();
        JButton jButton3 = new JButton();
        JPanel jPanel5 = new JPanel();
        JButton jButton4 = new JButton();
        JPanel jPanel6 = new JPanel();
        JButton jButton5 = new JButton();
        JPanel jPanel7 = new JPanel();
        JButton jButton6 = new JButton();
        JPanel jPanel8 = new JPanel();
        JButton jButton7 = new JButton();
        JButton jButton8 = new JButton();
        JButton jButton9 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(74, 31, 61));

        jButton1.setText("Logout");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        });

        jButton8.setText("Cancel");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    jButton8ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        });

        jButton9.setText("Save");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    jButton9ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        });

        jPanel2.setBackground(new Color(74, 31, 61));
        jPanel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel8.setIcon(new ImageIcon("E:\\Agung\\Semester 3\\UAS\\OBP\\Project UAS\\App S Car(intelij)\\src\\main\\resources\\PP.png"));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jLabel7.setFont(new Font("Tahoma", 0, 14));
        jLabel7.setForeground(new Color(0, 204, 0));
        jLabel7.setText("Welcome to Einesday!");

        jLabel9.setFont(new Font("Tahoma", 0, 12));
        jLabel9.setForeground(new Color(0, 204, 0));
        jLabel9.setText("Your one-day car solution");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jButton1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

        try {
            Connection conn = MySQLConnection.getConnection();

            String query = "SELECT * FROM user";

            PreparedStatement prep = conn.prepareStatement(query);
            ResultSet resultSet = prep.executeQuery();

            while (resultSet.next()) {
                String Nama = resultSet.getString("Nama");
                String Phone = resultSet.getString("Phone");
                String Email = resultSet.getString("Email");
                jButton2.setText(Nama);
                jButton3.setText(Email);
                jButton5.setText(Phone);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

        jButton2.setBackground(new Color(74, 31, 61));
        jButton2.setFont(new Font("Tahoma", 0, 14));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel4.setPreferredSize(new Dimension(157, 46));

        jButton3.setBackground(new Color(74, 31, 61));
        jButton3.setFont(new Font("Tahoma", 0, 14));


        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel5.setPreferredSize(new Dimension(157, 46));

        jButton4.setBackground(new Color(74, 31, 61));
        jButton4.setFont(new Font("Tahoma", 0, 14));
        jButton4.setText("Language");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new Color(255, 255, 255));
        jPanel6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel6.setPreferredSize(new Dimension(157, 48));

        jButton5.setBackground(new Color(74, 31, 61));
        jButton5.setFont(new Font("Tahoma", 0, 14));

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new Color(255, 255, 255));
        jPanel7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel7.setPreferredSize(new Dimension(157, 48));

        jButton6.setBackground(new Color(74, 31, 61));
        jButton6.setFont(new Font("Tahoma", 0, 14));
        jButton6.setText("Driver License");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new Color(255, 255, 255));
        jPanel8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel8.setPreferredSize(new Dimension(157, 48));

        jButton7.setBackground(new Color(74, 31, 61));
        jButton7.setFont(new Font("Tahoma", 0, 14));
        jButton7.setText("More Settings");

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jButton8.setBackground(new Color(255, 0, 0));
        jButton8.setText("Cancel");

        jButton9.setBackground(new Color(51, 153, 255));
        jButton9.setText("Save");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jPanel5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton8))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                .addGap(38, 38, 38))
        );

        pack();
    }


    private void jButton1ActionPerformed(ActionEvent evt) throws Exception {
        Login loginForm = new Login();

        Logout.logOut(this, loginForm );
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        Main mainMenu = null;
        try {
            mainMenu = new Main();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mainMenu.setVisible(true);
        this.dispose();
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        Main mainMenu = null;
        try {
            mainMenu = new Main();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mainMenu.setVisible(true);
        this.dispose();
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
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

}