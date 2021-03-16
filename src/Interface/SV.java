package Interface;

import Interface.PreSenter.GiaoDucPreSenter;
import Interface.PreSenter.GiaoDucView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SV extends javax.swing.JFrame
implements GiaoDucView,ActionListener{
    private GiaoDucPreSenter gd;
    private String User;
    private int maquyen;
    public SV(String U,int ma) {
        initComponents();
        gd=new GiaoDucPreSenter(this);
        gd.HanlerReadDataLop();
        HanlerEvents();
        User=U;
        maquyen=ma;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        malopcombox = new javax.swing.JComboBox<>();
        txthoten = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Sinh viên");
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cập nhật danh mục sinh viên");

        jLabel2.setText("Mã lớp:");

        jLabel4.setText("Họ tên:");

        jLabel5.setText("Ngày sinh:");

        jLabel6.setText("Số điện thoại:");

        jLabel8.setText("Địa chỉ:");

        jLabel9.setText("Email:");

        jLabel10.setText("Giới tính:");

        btnthem.setText("Thêm");

        btnsua.setText("Sửa");

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnhuy.setText("Hủy");

        txtsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdtActionPerformed(evt);
            }
        });

        radio1.setText("Nam");

        radio2.setText("Nữ");

        btntimkiem.setText("Tìm Kiếm");

        btnback.setText("Back");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(radio1)
                .addGap(18, 18, 18)
                .addComponent(radio2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnthem)
                        .addGap(54, 54, 54)
                        .addComponent(btnsua)
                        .addGap(49, 49, 49)
                        .addComponent(btnxoa)
                        .addGap(50, 50, 50)
                        .addComponent(btnhuy))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtngaysinh)
                            .addComponent(txthoten, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(malopcombox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 185, Short.MAX_VALUE))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(txtemail))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(193, 193, 193)
                        .addComponent(btntimkiem)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(malopcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(radio1)
                            .addComponent(radio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem)
                            .addComponent(btnsua)
                            .addComponent(btnhuy)
                            .addComponent(btnxoa))
                        .addGap(18, 18, 18)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntimkiem)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnback))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txtsdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdtActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> malopcombox;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void OnSucess() {
        JOptionPane.showMessageDialog(rootPane, "Sucess","Thông Báo",1);
    }

    @Override
    public void OnError() {
        JOptionPane.showMessageDialog(rootPane, "Failed","Thông Báo",1);
    }

    @Override
    public void getDataTimKiem(String ten, String truongkhoa, String sdt) {
       
    }

    @Override
    public void getDataKhoa(int makhoa, String ten, String truongkhoa, String sdt) {
        
    }

    @Override
    public void getDataTimKiemLop(int makhoa, String tenlop) {
       
    }

    @Override
    public void getDataLop(int makhoa, int malop, String tenlop) {
        malopcombox.addItem(String.valueOf(makhoa));
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnback){
            new GDmain(User,maquyen).setVisible(true);
           this.dispose();
        }else if(e.getSource()==btnthem){
             SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");// Nam- thang- Ngay
                int malop=Integer.parseInt(malopcombox.getSelectedItem().toString().trim());
                String ten=txthoten.getText().toString().trim();
              
                int  gioitinh=0;
               
                if(radio1.isSelected()){
                    gioitinh=1;
                    radio2.setSelected(false);
                }
                if(radio2.isSelected()){
                    gioitinh=0;
                     radio1.setSelected(false);
                }
             
                String diachi=txtdiachi.getText().toString().trim();
                String sdt=txtsdt.getText().toString().trim();
                String Email=txtemail.getText().toString().trim();
            try {
               String ngaysinh=txtngaysinh.getText().toString().trim();
                sdf.parse(ngaysinh);
                if(ten.length()>0  &&  diachi.length()>0 &&
                        sdt.length()>0 && Email.length()>0){
                    gd.HanlerInsertSinhVien(malop, ten, ngaysinh, gioitinh, diachi, sdt, Email);
                }  else{
                     JOptionPane.showMessageDialog(rootPane, "khong de trong","Thong Bao",1);
                }
                
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Sai Định Dạng : yyyy-MM-dd","Thong bao",1);
            }
            
                    
        }else if(e.getSource()==btntimkiem){
            String ten=txttimkiem.getText().toString().trim();// tim kiem theo ten sv
            gd.HanlerTimKiemSV(ten);
        }else if(e.getSource()==btnxoa){
            String ten=txthoten.getText().toString().trim();
            gd.HanlerDeleteSV(ten);
        }else if(e.getSource()==btnhuy){
            txtdiachi.setText(null);
             txtemail.setText(null); txthoten.setText(null);
               txtngaysinh.setText(null); txtsdt.setText(null);
              
        }else if(e.getSource()==btnsua){
             SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");// Nam- thang- Ngay
                int malop=Integer.parseInt(malopcombox.getSelectedItem().toString().trim());
                String ten=txthoten.getText().toString().trim();
              
                int  gioitinh=0;
               
                if(radio1.isSelected()){
                    gioitinh=1;
                }
                if(radio2.isSelected()){
                    gioitinh=0;
                }
               
                String diachi=txtdiachi.getText().toString().trim();
                String sdt=txtsdt.getText().toString().trim();
                String Email=txtemail.getText().toString().trim();
            try {
               String ngaysinh=txtngaysinh.getText().toString().trim();
                sdf.parse(ngaysinh);
                if(ten.length()>0  &&  diachi.length()>0 &&
                        sdt.length()>0 && Email.length()>0){
                    gd.HanlerUpdateSV(malop, ten, ngaysinh, gioitinh, diachi, sdt, Email);
                }  else{
                     JOptionPane.showMessageDialog(rootPane, "khong de trong","Thong Bao",1);
                }
                
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Sai Định Dạng : yyyy-MM-dd","Thong bao",1);
            }
        }
        
    }

    private void HanlerEvents() {
        btnthem.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
        btnhuy.addActionListener(this);
        btnback.addActionListener(this);
        btntimkiem.addActionListener(this);
    }

    @Override
    public void getDataTimKiemGV(int makhoa, String ten, String ngaysinh, String hocvi, int gioitinh,  String diachi, String sdt, String email, String chuyennganh) {
       
    }

    @Override
    public void getDataTimKiemTienDo(String maBC, String madetai, String thoigianbaocao, String tiendothuchien, String nguoibaocao, String ghichu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getDataTimKiemNghiemThu(String mant, String madetai, String tgnt, String tgbd, String tgkt, float kinhphi, String ketluan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getDataTimKiemSinhVien(int malop, String ten, String ngaysinh, int gioitinh, String diachi, String sdt, String email) {
         malopcombox.setSelectedItem(String.valueOf(malop));
       txthoten.setText(ten);
       txtngaysinh.setText(ngaysinh);
       if(gioitinh==0){
           radio2.setSelected(true);
       }else{
           radio1.setSelected(true);
       }
       txtdiachi.setText(diachi);
       txtsdt.setText(sdt);
       txtemail.setText(email);
    }
}
