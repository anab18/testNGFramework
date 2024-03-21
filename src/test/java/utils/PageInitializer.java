package utils;
import pages.DashBoardPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashBoardPage dash;



    public static void initializePageObjects(){
        login = new LoginPage();
        dash = new DashBoardPage();

    }
}