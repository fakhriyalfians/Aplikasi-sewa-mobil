import javax.swing.*;

public class Logout {
    public static void logOut(Profile profileForm, Login loginForm) throws Exception {
        LoginSession.isLoggedIn = false;

        profileForm.setVisible(false);

        loginForm.setVisible(true);


    }
}


