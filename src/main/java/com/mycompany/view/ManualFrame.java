/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vu
 */
public class ManualFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(116,235,213);
            Color color2 = new Color(172,182,229);
            GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    
    CardLayout cardLayout;
    public ManualFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Hướng dẫn sử dụng");
        cardLayout = (CardLayout)(dynamicPanel.getLayout());
        cardLayout.show(dynamicPanel, "card1");
        
        //Home
        try{
            URL link = new URL("https://i.imgur.com/8C5DDuw.jpg");
            BufferedImage image = ImageIO.read(link);
            jLabel12.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        //Hướng dẫn crawl dữ liệu từ trang web
        try{
            URL link = new URL("https://i.imgur.com/bArbTa9.jpeg");
            BufferedImage image = ImageIO.read(link);
            jLabel1.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/qS3iDaF.jpeg");
            BufferedImage image = ImageIO.read(link);
            jLabel2.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        //Hướng dẫn xem lịch sử crawl
        try{
            URL link = new URL("https://i.imgur.com/zgLelF2.jpeg");
            BufferedImage image = ImageIO.read(link);
            jLabel17.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/vJT3HEa.jpeg");
            BufferedImage image = ImageIO.read(link);
            jLabel20.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/2rHKOQd.jpeg");
            BufferedImage image = ImageIO.read(link);
            jLabel23.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/3E6aM1j.jpg");
            BufferedImage image = ImageIO.read(link);
            jLabel28.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/2BSM4xB.jpg");
            BufferedImage image = ImageIO.read(link);
            jLabel31.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/l3neTDv.jpg");
            BufferedImage image = ImageIO.read(link);
            jLabel34.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
        
        try{
            URL link = new URL("https://i.imgur.com/UB90Krn.jpg");
            BufferedImage image = ImageIO.read(link);
            jLabel38.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        crawlManualButton = new javax.swing.JButton();
        historyManualButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        dynamicPanel = new javax.swing.JPanel();
        historyManualPanel = new javax.swing.JScrollPane();
        jPanel3 = new jPanelGradient();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        crawlManualPanel = new javax.swing.JScrollPane();
        jPanel1 = new jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        homePanel = new javax.swing.JScrollPane();
        jPanel4 = new jPanelGradient();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        homeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(homeButton);

        crawlManualButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crawlManualButton.setText("Hướng dẫn Crawl dữ liệu");
        crawlManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crawlManualButtonActionPerformed(evt);
            }
        });
        jPanel2.add(crawlManualButton);

        historyManualButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historyManualButton.setText("Hướng dẫn xem lịch sử crawl");
        historyManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyManualButtonActionPerformed(evt);
            }
        });
        jPanel2.add(historyManualButton);

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton);

        dynamicPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel16.setText("Hướng dẫn sử dụng chức năng xem lịch sử crawl");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 900, -1));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Hình 2: Thông tin chi tiết của một bài báo");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1400, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("<html>Khi muốn xem lịch sử crawl của một bài báo bất kì, chọn một dòng trong bảng danh sách các bài báo đã crawl, Nút \"Hiển thị\n<br/>nội dung\" sẽ hiện ra, ấn vào nút đó, thông tin chi tiết của bài báo hiện ra như hình dưới:\n</html>");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, -1));
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Hình 1: Giao diên của chức năng xem Lịch sử Crawl");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("<html>Chức năng của các nút trong hình 3:\n<br/>-Previous: Chuyển sang ảnh trước đó\n<br/>-Next: Chuyển ảnh kế tiếp\n<br/>-Download bài báo: Download các thông tin của bài báo dưới dạng file txt\n<br/>-Download ảnh: Download ảnh hiển thị hiện tại trong phần thông tin chi tiết bài báo dưới dạng file jpg\n<html/>");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2100, -1, -1));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1490, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("<html>\nKhi scroll phần thông tin chi tiết bài báo xuống dưới cùng, ta sẽ thấy các nút chức năng ở phần thông tin chi tiết bài báo như \n<br/>ở hình dưới:\n<html/>");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1430, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Hình 7: Kết quả Tìm kiếm");
        jLabel25.setToolTipText("");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 4920, -1, 40));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("<html>Chức năng của các nút trong hình 1: <br/>-Tải lại: Cập nhật lại bảng danh sách các trang web crawl được mới nhất <br/>-Tìm kiếm: Hiển thị giao diện tìm kiếm (Hình 6) <html/>");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("<html>Khi ấn vào nút \"Download bài báo\", Giao diện \"Lưu nội dung bài báo\" hiện ra, điền tên file và ấn \"Save\" để lưu thông tin bài\n<br/>báo\n<html/>");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2230, -1, -1));
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2290, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Hình 3: Các nút chức năng ở phần Thông tin chi tiết bài báo");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2070, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("<html>Nút \"Download ảnh\" lưu ảnh tương tự như lưu nội dung bài báo, nhưng ảnh được lưu sẽ là ảnh hiện tại đang hiển thị trên\n<br/>phần thông tin chi tiết bài báo\n<html/>");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2900, -1, -1));
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2960, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Hình 4: Giao diện \"Lưu nội dung bài báo\"");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2870, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Khi ấn vào nút tìm kiếm, giao diện tìm kiếm sẽ hiện ra như hình dưới:");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3550, -1, -1));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3590, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Hình 5: Giao diện \"Lưu ảnh\"");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 3520, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("<html>Chức năng của các nút trong hình 5:\n<br/>-Tìm kiếm: Hiển thị kết quả tìm kiếm\n<br/>-Thoát: Thoát chức năng tìm kiếm (Quay lại giao diện như hình 1)\n<br/>-Reset: Xóa toàn bộ các thông tin điền ở trong các mục tìm kiếm\n<html/>");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4190, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("<html>Để có thể thực hiện được chức năng tìm kiếm, nhập thông tin tìm kiếm vào các mục, sau đó ấn nút tìm kiếm, kết quả tìm kiếm\n<br/>sẽ hiển thị như hình dưới:\n<html/>");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4290, -1, -1));
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4350, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Hình 6: Giao diện Tìm kiếm");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 4160, -1, -1));

        historyManualPanel.setViewportView(jPanel3);

        dynamicPanel.add(historyManualPanel, "card2");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1030, 560));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1030, 560));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nhập link trang crawl và ấn nút Crawl");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("<html>Kết quả Crawl được sau khi nhập đường link: \"https://vnexpress.net/chua-tam-chuc-chat-kin-du-khach-4248332.html\" được<br/> hiển thị như trong hình 2</html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("<html>\nMột số nút trong hình 2:\n<br/>-Nút \"Lưu\": Lưu dữ liệu vừa crawl được (Bao gồm thời gian crawl, tác giả, thể loại, ảnh, ...) vào trong Cơ sở dữ liệu MongoDB\n<br/>-Nút \"Hủy\": Hủy toàn bộ dữ liệu crawl (Quay trở lại như hình 1)\n<br/>-Nút \"Next\": Chuyển ảnh tiếp theo\n<br/>-Nút \"Previous\": Quay lại ảnh trước đó\n</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Hình 1: Giao diện Crawl báo điện tử");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Hình 2: Kết quả Crawl");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("<html>Lưu ý\n<br/>-Chức năng trên chỉ phục vụ để crawl những trang web thuộc VNExpress, vậy nên khi crawl những trang web khác sẽ không<br/> hiển thị kết quả như ý muốn\n<br/>-Chức năng trên không hỗ trợ dữ liệu video, cho nên khi crawl các trang web chứa video, video sẽ không được lưu lại\n</html>");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1550, -1, 110));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel9.setText("Hướng dẫn sử dụng chức năng Crawl báo điện tử");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 870, -1));

        crawlManualPanel.setViewportView(jPanel1);

        dynamicPanel.add(crawlManualPanel, "card3");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel10.setText("Hướng dẫn sử dụng phần mềm VNExpressCrawler");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 890, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Giao diện phần mềm VNExpressCrawler");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1040, 520));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("<html>Danh sách các nút trên Giao diện Home\n<br/>-Hướng dẫn sử dụng: Hướng dẫn cách sử dụng phần mềm\n<br/>-Thông tin phần mêm: Các thông tin về phần mềm VNExpressCrawler \n</html>");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 820, -1, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Hình 1: Giao diện Phần mềm VNExpressCrawler");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("<html>Danh sách các nút trên thanh Menu chính\n<br/>-Home: Quay lại màn hình chính (Như hình 1)\n<br/>-Crawl: Chuyển sang chức năng crawl bài báo\n<br/>-Lịch sử: Chuyển sang chức năng xem danh sách các bài báo được lưu\n<br/>-Thoát: Thoát khỏi phần mềm\n</html>");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 580, -1));

        homePanel.setViewportView(jPanel4);

        dynamicPanel.add(homePanel, "card1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crawlManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crawlManualButtonActionPerformed
        // TODO add your handling code here:
        this.setTitle("Hướng dẫn sử dụng - Crawl dữ liệu từ trang web");
        dynamicPanel.setVisible(true);
        cardLayout.show(dynamicPanel, "card3");
    }//GEN-LAST:event_crawlManualButtonActionPerformed

    private void historyManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyManualButtonActionPerformed
        // TODO add your handling code here:
        this.setTitle("Hướng dẫn sử dụng - Xem lịch sử crawl");
        dynamicPanel.setVisible(true);
        cardLayout.show(dynamicPanel, "card2");
    }//GEN-LAST:event_historyManualButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.setTitle("Hướng dẫn sử dụng");
        dynamicPanel.setVisible(true);
        cardLayout.show(dynamicPanel, "card1");
    }//GEN-LAST:event_homeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManualFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crawlManualButton;
    private javax.swing.JScrollPane crawlManualPanel;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton historyManualButton;
    private javax.swing.JScrollPane historyManualPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
