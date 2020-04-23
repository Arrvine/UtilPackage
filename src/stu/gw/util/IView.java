package stu.gw.util;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;


/**
 * @author Arrvine
 *	该工具定义了窗口编程的大概框架，提供了窗口的基本要素
 */
public interface IView {
	Font topicFont = new Font("微软雅黑", Font.BOLD, 32);
	Font normalFont = new Font("宋体", Font.PLAIN, 16);
	Font smallFont = new Font("宋体", Font.PLAIN, 14);
	Font tinyFont = new Font("宋体", Font.PLAIN, 12);
	
	int topicFontSize = topicFont.getSize();
	int normalFontSize = normalFont.getSize();
	
	Color topicColor = new Color(3, 31, 203);
	
	int PADDING = 5;
	
	Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
	
	default void initView() {
		init();
		dealEvent();
	}
	
	void init();
	void reinit();
	void dealEvent();
	JFrame getFrame();
	
	default void showView() throws FrameIsNullException {
		JFrame frame = getFrame();
		if (frame == null) {
			throw new FrameIsNullException("窗口为NULL！");
		}
		frame.setVisible(true);
		reinit();
	}
	
	default void exitView() throws FrameIsNullException {
		JFrame frame = getFrame();
		if (frame == null) {
			throw new FrameIsNullException("窗口为NULL！");
		}
		frame.dispose();
	}
	
}
