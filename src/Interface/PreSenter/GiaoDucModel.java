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
public interface GiaoDucModel {

    public void OnSucess();

    public void Error();

    public void getDataTimKiem(String ten, String truongkhoa, String sdt);

    public void getDataKhoa(int  makhoa, String ten, String truongkhoa, String sdt);

    public void getDataTimKiemLop(int makhoa, String tenlop);

    public void getDataLop(int makhoa, int malop, String tenlop);

    public void getDataTimKiemSinhVien(int malop, String ten, String ngaysinh, int gioitinh,  String diachi , String sdt, String email);
    public void getDataTimKiemGV(int makhoa, String ten, String ngaysinh, String hocvi,int gioitinh,  String diachi , String sdt, String email,String chuyennganh);

    public void getDataTimKiemTienDo(String maBC
            ,String madetai, String thoigianbaocao, String tiendothuchien, String nguoibaocao, String ghichu);

    public void getDataTimKiemNghiemThu(String mant, String madetai, String tgnt, String tgbd, String tgkt, float kinhphi, String ketluan);

 
}
