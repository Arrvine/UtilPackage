package stu.gw.util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * @author Arrvine
 * 该工具主是为swing窗口编程服务
 * 提供了四个方法来显示四个窗口，显示消息、显示警告、显示错误、进行选择
 */
public class ViewTool {
	public static final String TITLE = "温馨提示";
	
	public ViewTool() {
	}
	
	public static void showMessage(JFrame jfame, String message) {
		JOptionPane.showMessageDialog(jfame, message, TITLE, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void showWarnning(JFrame jfame, String message) {
		JOptionPane.showMessageDialog(jfame, message, TITLE, JOptionPane.WARNING_MESSAGE);
	}
	
	public static void showError(JFrame jfame, String message) {
		JOptionPane.showMessageDialog(jfame, message, TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public static int getChoice(JFrame jfame, String message, int optionType) {
		return JOptionPane.showConfirmDialog(jfame, message, TITLE, optionType);
	}
	
}
