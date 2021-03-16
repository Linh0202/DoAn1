/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.PreSenter.GiaoDucPreSenter;
import Interface.PreSenter.GiaoDucView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Penguin
 */
public class Lop extends javax.swing.JFrame 
implements GiaoDucView,ActionListener{
   private GiaoDucPreSenter gd;
   private String Users;
   private int maquyens;
    public Lop(String User,int maquyen) {
        initComponents();
        gd=new GiaoDucPreSenter(this);
        gd.HanlerReadDataKhoa();
        HanlerEvents();
        Users=User;
        maquyens=maquyen;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        makhoajbox = new javax.swing.JComboBox<String>();
        txttenlop = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Lớp");
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cập nhật danh mục lớp");

        jLabel2.setText("Mã khoa");

        jLabel4.setText("Tên lớp");

        makhoajbox.setToolTipText("");

        btnthem.setText("Thêm");

        btnsua.setText("Sửa");

        btnxoa.setText("Xóa");

        btnhuy.setText("Hủy");

        btnback.setText("Back");

        btntimkiem.setText("Tìm Kiếm");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnthem)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addComponent(btnback))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnsua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btnxoa)
                                .addGap(20, 20, 20))
                            .addComponent(makhoajbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttenlop, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnhuy)
                            .addComponent(btntimkiem, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(btnback))
                .addGap(10, 10, 10)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(makhoajbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnhuy))
                .addContainerGap(54, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> makhoajbox;
    private javax.swing.JTextField txttenlop;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void OnSucess() {
        JOptionPane.showMessageDialog(rootPane, "Sucess","Thông Báo",1);
    }

    @Override
    public void OnError() {
        JOptionPane.showMessageDialog(rootPane, "Falied","Thông Báo",1);
    }

    @Override
    public void getDataTimKiem(String ten, String truongkhoa, String sdt) {
       
    }

    @Override
    public void getDataKhoa(int makhoa, String ten, String truongkhoa, String sdt) {
         makhoajbox.addItem(String.valueOf(makhoa));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnthem){
           int k=Integer.parseInt( String.valueOf(makhoajbox.getSelectedItem()).trim());
           String ten=txttenlop.getText().toString().trim();
           gd.HanlerInsertLop( k, ten);
       }else if(e.getSource()==btnback){
           new GDmain(Users,maquyens).setVisible(true);
           this.dispose();
       }else if(e.getSource()==btntimkiem){
           String ten= txttimkiem.getText().toString().trim();// tim kiem theo ten lop
           gd.HanlerTimKiemLop(ten);
       }else if(e.getSource()==btnhuy){
           txttenlop.setText(null);
           txttimkiem.setText(null);
       }else if(e.getSource()==btnxoa){
           String ten=txttenlop.getText().toString().trim();// xoa theo ten lop
           gd.HanlerDeleteLop(ten);
       }else if(e.getSource()==btnsua){
           int k =Integer.parseInt(String.valueOf(makhoajbox.getSelectedItem()));
           String ten=txttenlop.getText().toString().trim();
           gd.HanlerUpdateLop(k, ten);
       }
    }

    private void HanlerEvents() {
        btnthem.addActionListener(this);
        btnhuy.addActionListener(this);
        btnsua.addActionListener(this);
        btnxoa.addActionListener(this);
         btnback.addActionListener(this);
         btntimkiem.addActionListener(this);
    }

    @Override
    public void getDataTimKiemLop(int makhoa, String tenlop) {
        makhoajbox.setSelectedItem(String.valueOf(makhoa));
        txttenlop.setText(tenlop);
    }

    @Override
    public void getDataLop(int makhoa, int malop, String tenlop) {
       
    }

   

    @Override
    public void getDataTimKiemGV(int makhoa, String ten, String ngaysinh, String hocvi, int gioitinh, String diachi, String sdt, String email, String chuyennganh) {
      
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