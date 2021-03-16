/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PreSenter;

import Model.Detaimodel;
import Model.GiangVienModel;
import Model.KetQuaNThuModel;
import Model.KhoaModel;
import Model.LopModel;
import Model.SinhVien;
import Model.TienDoModel;

/**
 *
 * @author Thai Style
 */
public class GiaoDucPreSenter implements GiaoDucModel{
    private KhoaModel k;
    private GiaoDucView callback;
    private LopModel lopModel;
    private SinhVien sv;
    private GiangVienModel giangVienModel;
    private Detaimodel detaimodel;
    private TienDoModel tienDoModel;
    private KetQuaNThuModel ketQuaNThuModel;
   
    public GiaoDucPreSenter(GiaoDucView callback) {
        this.callback = callback;
        k=new KhoaModel(this);
        lopModel=new LopModel(this);
        sv=new SinhVien(this);
        giangVienModel=new GiangVienModel(this);
        detaimodel=new Detaimodel(this);
        tienDoModel=new TienDoModel(this);
        ketQuaNThuModel=new KetQuaNThuModel(this);
    }
    public void HanlerInsertKhoa(String ten,String truong,String sdt){
        k.InsertKhoa(ten, truong, sdt);
    }
    public void HanlerUpdateKhoa(String ten,String truong,String sdt){
        k.UpDateKhoa(ten, truong, sdt);
    }
    public void HanlerTimKiemKhoa(String ten){
        k.TimKiemKhoa(ten);
    }
    public void HanlerDeleteKhoa(String ten){
        k.HanlerDelete(ten);
    }
    public void HanlerReadDataKhoa(){
        k.ReadDataKhoa();
    }
    public void HanlerInsertLop(int makhoa,String ten){
        lopModel.InsertLop(makhoa,  ten);
    }
    public void HanlerTimKiemLop(String ten){
        lopModel.TimKiemLop(ten);
    }
    public void HanlerDeleteLop(String ten){
        lopModel.HanlerDeleteLOp(ten);
    }
    public void HanlerUpdateLop(int makhoa,String tenlop){
        lopModel.UpDateLop(tenlop, makhoa);
    }
    public void HanlerInsertSinhVien(int malop, String ten, String ngaysinh, int gioitinh,String diachi, String sdt, String email){
        sv.InsertSinhVien(malop, ten, ngaysinh, gioitinh,  diachi, sdt,email);
    }
    public void HanlerReadDataSV(){
        sv.HanlerReadDataSV();
    }
    public void HanlerReadDataLop(){
        lopModel.ReadDataLop();
    }
    public void HanlerTimKiemSV(String ten){
        sv.TimKiemSinhVien(ten);
    }
     public void HanlerTimKiemSVMa(String ten){
        sv.TimKiemSinhVienMa(ten);
    }
     
    public void HanlerDeleteSV(String ten){
        sv.HanlerDeleteSinhVien(ten);
    }
    public void HanlerUpdateSV(int malop, String ten, String ngaysinh, int gioitinh,  String diachi, String sdt, String email){
        sv.UpDateSinhVien(malop, ten, ngaysinh, gioitinh,  diachi, sdt, email);
    }
    public void HanlerInsertGV(int makhoa,String tengv,String ngaysinh,String hocvi,int gioitinh,
            String diachi,String SoDTGV,String Email,String chuyennganh){
        giangVienModel.InsertSGiangVien(makhoa, tengv, ngaysinh, hocvi, gioitinh, diachi, SoDTGV, Email, chuyennganh);
    }
    public void HanlerTimKiemGV(String ten){
        giangVienModel.TimKiemGV(ten);
    }
    public void HanlerDeleteGV(String ten){
        giangVienModel.HanlerDeleteGV(ten);
    }
    public void HanlerUpdateGV(int makhoa,String tengv,String ngaysinh,String hocvi,int gioitinh,
            String diachi,String SoDTGV,String Email,String chuyennganh){
        giangVienModel.UpDateGV(makhoa, tengv, ngaysinh, hocvi, gioitinh,  diachi, SoDTGV, Email, chuyennganh);
    }
    public void HanlerInsertDeTai(String ten,String nguoihd,String thoigian){
        detaimodel.InsertDeTai(ten, nguoihd, thoigian);
    }
    public void HanlerDeleteDetai(String ten){
        detaimodel.HanlerDelete(ten);
    }
    public void HanlerUpdateDeTai(String ten,String nguoihd,String time){
        detaimodel.UpDateDetai(ten, nguoihd, time);
    }
    public void HanlerTimKiemDeTai(String ten){
        detaimodel.TimKiemDetai(ten);
    }
    public void HanlerInsertTienDo(String madetai,String thoigianbaocao,String tiendothuchien,String nguoibaocao,String ghichu){
        tienDoModel.InsertTienDo(madetai, thoigianbaocao, tiendothuchien, nguoibaocao, ghichu);
    }
    public void HanlerUpdateTienDo(String madetai,String thoigianbaocao,String tiendothuchien,String nguoibaocao,String ghichu){
        tienDoModel.UpDateTienDo(madetai, thoigianbaocao, tiendothuchien, nguoibaocao, ghichu);
    }
    public void HanlerDeleteTienDo(String ten){
        tienDoModel.HanlerDeleteTienDo(ten);
    }
    public void HanlerTimKiemTienDo(String ten){
        tienDoModel.TimKiemTienDo(ten);
    }
    public void HanlerReadDataDeTai(){
        detaimodel.ReadDataDeTai();
    }
    public void HanlerInsertNghiemThu(String madetai,String ThoigianNT,String ThoigianBD,String ThoigianKT,float Kinhphi ,String Ketluan){
        ketQuaNThuModel.InsertNghiemThu(madetai, ThoigianNT, ThoigianBD, ThoigianKT, Kinhphi, Ketluan);
    }
    public void HanlerTimKiemNghiemThu(String ten){
        ketQuaNThuModel.TimKiemNghiemThu(ten);
    }
    public void HanlerDeleteNghiemThu(String ten){
        ketQuaNThuModel.HanlerDeleteNghiemThu(ten);
    }
    public void HanlerUpdateNghiemThu(String madetai,String ThoigianNT,String ThoigianBD,String ThoigianKT,float Kinhphi ,String Ketluan){
        ketQuaNThuModel.UpDateNghiemThu(madetai, ThoigianNT, ThoigianBD, ThoigianKT, Kinhphi, Ketluan);
    }
    public void HanlerReadDataNghiemThu(String madetai){
        ketQuaNThuModel.ReadDataNghiemThu(madetai);
    }

    @Override
    public void OnSucess() {
        callback.OnSucess();
        
    }
    @Override
    public void Error() {
        callback.OnError();
    }

    @Override
    public void getDataTimKiem(String ten, String truongkhoa, String sdt) {
        callback.getDataTimKiem(ten,truongkhoa,sdt);
    }

    @Override
    public void getDataKhoa(int makhoa, String ten, String truongkhoa, String sdt) {
        callback.getDataKhoa(makhoa,ten,truongkhoa,sdt);
    }

    @Override
    public void getDataTimKiemLop(int makhoa, String tenlop) {
        callback.getDataTimKiemLop(makhoa,tenlop);
    }

    @Override
    public void getDataLop(int makhoa, int malop, String tenlop) {
       callback.getDataLop(makhoa,malop,tenlop);
    }

    public void getDataTimKiemSinhVien(int malop, String ten, String ngaysinh, int gioitinh,  String diachi, String sdt, String email) {
        callback.getDataTimKiemSinhVien( malop,  ten,  ngaysinh,  gioitinh,   diachi,  sdt,  email);
    }

    public void getDataTimKiemGV(int makhoa, String ten, String ngaysinh, String hocvi, int gioitinh,  String diachi, String sdt, String email,String chuyennganh) {
        callback.getDataTimKiemGV(makhoa,ten,ngaysinh,hocvi,gioitinh,diachi,sdt,email,chuyennganh);
    }
   
    

    

    @Override
    public void getDataTimKiemTienDo(String maBC, String madetai, String thoigianbaocao, String tiendothuchien, String nguoibaocao, String ghichu) {
        callback.getDataTimKiemTienDo(maBC,madetai,thoigianbaocao,tiendothuchien,nguoibaocao,ghichu);
    }

    @Override
    public void getDataTimKiemNghiemThu(String mant, String madetai, String tgnt, String tgbd, String tgkt, float kinhphi, String ketluan) {
        callback.getDataTimKiemNghiemThu(mant,madetai,tgnt,tgbd,tgkt,kinhphi,ketluan);
    }

}
