/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PreSenter;


import Model.UserLogin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Thai Style
 */
public class UserPreSenter  implements UserModel{
    private UserLogin userLogin;
    private UserView callback;
    public UserPreSenter(UserView callback){
        this.callback=callback;
     userLogin=new UserLogin(this);
        
    }
    public void HanlerLoginUser(String user,String pass){
      userLogin.LoginUser(user, pass);
    }
    public void HanLerRegistUser(String User,String pass,int maquyen){
        userLogin.RegistUser(User, pass, 1);
    }
    public void HanlerChangePassWord(String ten,String pass,String keyword){
        userLogin.ChangePassWord(ten, pass, keyword);
    }
   
  

    

    @Override
    public void OnLoginSucess() {
        callback.OnSucess();
    }

    @Override
    public void OnLoginFailed() {
        callback.OnFail();
    }

    @Override
    public void OnLoginError() {
        callback.OnError();
    }

    @Override
    public void getDataUser(String tenusser, int maquyen) {
        callback.getDaUser(tenusser,maquyen);
    }

    @Override
    public void OnLoginStudent() {
        callback.OnLoginSudent();
    }

    
}
