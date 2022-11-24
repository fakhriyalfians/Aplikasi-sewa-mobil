import javax.swing.*;
import java.sql.*;

public class Operations {

    public static boolean isLogin(String Nama, String Password) {
        try {
            Connection conn = MySQLConnection.getConnection();

            String query = "SELECT userID, Nama, Phone, Email, Password FROM user WHERE Nama = '" + Nama + "' AND Password = '" + Password + "'";

            PreparedStatement prep = conn.prepareStatement(query);
            ResultSet resultSet = prep.executeQuery();

            while(resultSet.next()) {
                LoginSession.userID = resultSet.getInt("userID");
                LoginSession.Nama = resultSet.getString("Nama");
                LoginSession.Phone = resultSet.getString("Phone");
                LoginSession.Email = resultSet.getString("Email");

                return true;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return false;
    }
}
