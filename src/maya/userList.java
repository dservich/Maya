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
public class userList {
    
    private String[][] accountInfo = new String[10][2];
    
    public userList(){
        for(int i =0; i <accountInfo.length;i++){
            accountInfo[i][0] = "username" + i;
            accountInfo[i][1] = "password" + i;
        }
        
        for(int i =0; i <accountInfo.length;i++){
           System.out.println(accountInfo[i][0] + " " + accountInfo[i][1]);
        }
    }
    public boolean authenticate(String uname, String pass){
        System.out.println("entered values: " + uname + " " + pass);
        for(int i = 0; i< accountInfo.length;i++){
            if(accountInfo[i][0].equals(uname) && accountInfo[i][1].equals(pass)){
                return true;
            }
        }
        
        return false;
    }
}
