/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.main;

import Views.panel.trangChuJPanel;
import Views.panel.danhMucJPanel;
import Views.panel.thongBaoJPanel;
import Views.panel.themBaiVietJPanel;
import Views.danhChoAdmin.danhChoAdminJPanel;
import Views.trangCaNhan.trangCaNhanJPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author giahu
 */
public class chuyenManHinhController {

    private static JPanel root;
    private static String kindSelected = "";
    private static int firstLoad = 0;
    private static List<danhMucBean> listItem = null;

    public chuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public static void setView(JPanel item) {
        if (firstLoad == 0) {
            setChangeBackground("TrangChu");
            firstLoad++;
        }
        System.out.println("firstLoad " + firstLoad);
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(item);
        root.validate();
        root.repaint();
    }

    public void setEvent(List<danhMucBean> listItem) {
        this.listItem = listItem;
        for (danhMucBean item : listItem) {
            item.getJbtn().addMouseListener(new btnEvent(item.getKind(), item.getJbtn()));
        }
    }

    class btnEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JButton jbtn;

        public btnEvent(String kind, JButton jbtn) {
            this.kind = kind;
            this.jbtn = jbtn;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("đã click");

        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Đã ấn chuyển màn hình");
            switch (kind) {
                case "TrangChu" ->
                    node = new trangChuJPanel();
                case "ThemBaiViet" ->
                    node = new themBaiVietJPanel();
                case "ThongBao" ->
                    node = new thongBaoJPanel();
                case "TrangCaNhan" ->
                    node = new trangCaNhanJPanel();
                case "DanhChoAdmin" ->
                    node = new danhChoAdminJPanel();
                case "DanhMuc" ->
                    node = new danhMucJPanel();
                default -> {
                }
            }

            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("thả");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("đã enter");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }

    }

    private static void setChangeBackground(String kind) {
        kindSelected = kind;

        for (danhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kindSelected)) {
                item.getJbtn().setOpaque(true);
            } else {
                System.out.println("tắt màu " + item.getKind());
                item.getJbtn().setOpaque(false);
            }
        }

    }

}
