/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maya;

/**
 *
 * @author dos5385
 */
public class LoginCntl {
    userList theUserList;
    LoginUI theLoginUI;
    public LoginCntl(){
        showLoginUI();
        theUserList = new userList();
    }
    
    public void showLoginUI(){
        theLoginUI = new LoginUI(this);
        theLoginUI.setVisible(true);
    }
    
    public void authenticate(String uname, String pass){
       if(theUserList.authenticate(uname, pass)){
           theLoginUI.setVisible(false);
           MainMenuCntl theMainMenuCntl = new MainMenuCntl();
           
       }else
           theLoginUI.authenticateFailure();
    }
}
