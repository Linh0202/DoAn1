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
public interface UserView {

    
    void OnSucess();

    void OnFail() ;

    void OnError() ;

    public void getDaUser(String tenusser, int maquyen);

    public void OnLoginSudent();
    
}
