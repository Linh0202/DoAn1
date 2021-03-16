
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


public class Detai extends javax.swing.JFrame
implements ActionListener,GiaoDucView{
 private GiaoDucPreSenter gd;
 private String User;
 private int maquyen;
    
    public Detai(String U,int ma) {
        initComponents();
        gd=new GiaoDucPreSenter(this);
        HanlerEvents();
        User=U;
        maquyen=ma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        txttendetai = new javax.swing.JTextField();
        txthuongdan = new javax.swing.JTextField();
        txtthoigian = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        btntimkiem = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Đề tài");
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cập nhật danh mục đề tài");

        jLabel3.setText("Tên đề tài:");

        jLabel4.setText("Người hướng dẫn:");

        jLabel5.setText("Thời gian đăng ký:");

        btnsua.setText("Sửa");

        btnxoa.setText("Xóa");

        btnhuy.setText("Hủy");

        txttendetai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttendetaiActionPerformed(evt);
            }
        });

        back.setText("back");

        btntimkiem.setText("Tìm Kiếm");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnsua)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnxoa)
                        .addGap(71, 71, 71)
                        .addComponent(btnhuy)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttendetai, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txthuongdan)
                            .addComponent(txtthoigian))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btntimkiem))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttendetai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthuongdan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtthoigian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnhuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btntimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttendetaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttendetaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttendetaiActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txthuongdan;
    private javax.swing.JTextField txttendetai;
    private javax.swing.JTextField txtthoigian;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btntimkiem){
            String ten = txttimkiem.getText().toString().trim();// tim kiem theo ten khoa
            if(ten.length()>0){
                gd.HanlerTimKiemDeTai(ten);
            }
        }else if(e.getSource()==btnsua){
            String ten=txttendetai.getText().toString().trim();
            String nguoihd=txthuongdan.getText().toString().trim();
            String thoigian=txtthoigian.getText().toString().trim();
              SimpleDateFormat spd= new SimpleDateFormat("yyyy-MM-dd");
              try {
                  spd.parse(thoigian);
                  if(ten.length()>0 && nguoihd.length()>0){
                      gd.HanlerUpdateDeTai(ten, nguoihd, thoigian);
                  }
              } catch (ParseException ex) {
                  JOptionPane.showMessageDialog(rootPane, "Dinh dang sai","thong bao",1);
              }
        }else if(e.getSource()==btnhuy){
            txttendetai.setText(null);
            txthuongdan.setText(null);
            txtthoigian.setText(null);
        }else if(e.getSource()==btnxoa){
            String ten=txttendetai.getText().toString().trim();// xoa theo ten de tai
            if(ten.length()>0){
                gd.HanlerDeleteDetai(ten);
            }
        }else if(e.getSource()==back){
            new GDmain(User,maquyen).setVisible(true);
            this.dispose();
        }
    }

    @Override
    public void OnSucess() {
        JOptionPane.showMessageDialog(rootPane, "Sucess","thong bao",1);
    }

    @Override
    public void OnError() {
       JOptionPane.showMessageDialog(rootPane, "Failed","thong bao",1);
    }

    @Override
    public void getDataTimKiem(String ten, String hd, String thoigian) {
         txthuongdan.setText(hd);
         txttendetai.setText(ten);
         txtthoigian.setText(thoigian);
         
    }

    @Override
    public void getDataKhoa(int makhoa, String ten, String truongkhoa, String sdt) {
        
    }

    @Override
    public void getDataTimKiemLop(int makhoa, String tenlop) {
        
    }

    @Override
    public void getDataLop(int makhoa, int malop, String tenlop) {
       
    }

   
    public void getDataTimKiemSV(int malop, String tensv, String ngaysinh, int gioitinh,  String diachi, String sdt, String email) {
        
    }

   
    public void getDataTimKiemGV(int makhoa, String tengv, String ngaysinh, String hocvi, int gioitinh, String diachi, String sdt, String email, String chuyennganh) {
       
    }
    private void HanlerEvents() {
        btntimkiem.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
        btnhuy.addActionListener(this);
        back.addActionListener(this);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
