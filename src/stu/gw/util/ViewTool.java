package stu.gw.util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * @author Arrvine
 * �ù�������Ϊswing���ڱ�̷���
 * �ṩ���ĸ���������ʾ�ĸ����ڣ���ʾ��Ϣ����ʾ���桢��ʾ���󡢽���ѡ��
 */
public class ViewTool {
	public static final String TITLE = "��ܰ��ʾ";
	
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
