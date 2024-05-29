/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import model.ImageCustom;

/**
 *
 * @author HOAN
 */
class ImageCustomRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        ImageCustom item = (ImageCustom) value;
        setText("");  // Hiển thị đường dẫn (hoặc bạn có thể thay đổi để hiển thị thông tin khác)
        setIcon(item.getIcon());  // Đặt icon
        return this;
    }
}
