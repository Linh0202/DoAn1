/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PreSenter;

/**
 *
 * @author Thai Style
 */
public interface UserModel {

   
    public void OnLoginSucess();

    public void OnLoginFailed();

    public void OnLoginError();

    public void getDataUser(String tenusser, int maquyen);

    public void OnLoginStudent();

  
    
    
}
