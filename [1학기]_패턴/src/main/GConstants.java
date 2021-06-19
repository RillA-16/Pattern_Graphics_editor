package main;

import java.awt.Dimension;
import java.awt.Point;

import shapeTools.GOval;
import shapeTools.GRectangle;
import shapeTools.GLine;
import shapeTools.GPolygon;
import shapeTools.GShapeTool;
import shapeTools.GRoundRectangle;
import shapeTools.GArc;
import shapeTools.GPen;

public class GConstants {
	public static class CFrame {
		public final static Point point = new Point(350, 150);
		public final static Dimension dimesion = new Dimension(1200, 800);
	}
	
	public enum EDrawingStyle {
		e2PointDrawing,
		eNPointDrawing
	};
	
	public final static int wAnchor = 10;	
	public final static int hAnchor = 10;
	
	public enum EAction {
		eDraw,
		eMove,
		eResize,
		eRotate,
		eShear
	}
	
	public enum EShapeTool {
		
		eRectangle(new GRectangle(), "Rectangle" , "image/�簢��.png", "image/���û簢��.png"), 
		eOval(new GOval(), "Oval", "image/��.png", "image/���ÿ�.png"),
		eLine(new GLine(), "Line" , "image/��.png", "image/���ü�.png"),
		ePolygon(new GPolygon(), "Polygon" , "image/�ٰ���.png", "image/���ôٰ���.png"),
		eRoundRectangle(new GRoundRectangle(), "RoundRectangle" , "image/�ձٻ簢��.png", "image/���õձٻ簢��.png"),
		eArc(new GArc(), "Arc" , "image/ȣ.png", "image/����ȣ.png"),
		ePen(new GPen(), "Pen" , "image/��.png", "image/������.png");
		
		private GShapeTool shapeTool;
		private String text;
		private String icon;
		private String selectedIcon;

		private EShapeTool(GShapeTool shapeTool, String text, String icon, String selectedIcon) {
			this.shapeTool = shapeTool;
			this.text = text;
			this.icon = icon;
			this.selectedIcon = selectedIcon;
		}
		public GShapeTool getShapeTool() {
			return this.shapeTool;
		}
		public String getText() {
			return this.text;
		}
		public String getIcon() {
			return this.icon;
		}
		public String getSelectedIcon() {
			return this.selectedIcon;
		}
	}
	
	public enum EMenu {
		eFile("����"),
		eEdit("����"),
		eColor("����"),
		eLineEdit("�� ����"),
		eHelp("����");		
		private String text;
		private EMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EFileMenuItem {
		eNew("���θ����"),
		eOpen("����"),
		eSave("����"),
		eSaveAs("�ٸ��̸�����"),
		ePrint("����Ʈ"),
		eScreanShot("��ũ����"),
		eExit("������");
		
		private String text;
		private EFileMenuItem(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EEditMenuItem {
		eUndo("Undo", "ctrl + z", "Z" , "Event.CTRL_MASK"),
		eRedo("Redo", "ctrl + y" , "Y", "Event.CTRL_MASK"),
		eCut("Cut", "ctrl + x", "X", "Event.CTRL_MASK"),
		eDelete("Delete", "ctrl + delete", "DELETE", "Event.CTRL_MASK"),
		eCopy("Copy", "ctrl + c", "C", "Event.CTRL_MASK"),
		ePaste("Paste", "ctrl + v", "V", "Event.CTRL_MASK"),
		eGroup("Group","ctrl + g", "G", "Event.CTRL_MASK"),
		eUngroupe("UnGroup", "ctrl + u", "U", "Event.CTRL_MASK");
		
		
		private String text;
		private String shortcut;
		private String Keyboard;
		private String control;
		
		private EEditMenuItem(String text, String shortcut, String Keyboard, String control) {
			this.text = text;
			this.shortcut = shortcut;
			this.Keyboard = Keyboard;
			this.control = control;
		}
		public String getText() {
			return this.text;
		}
		
		public String getShortcut() {
			return this.shortcut;
		}
		
		public String getKeboardKey() {
			return this.Keyboard;
		}
		public String getcontrol() {
			return this.control;
		}
	}
	
	public enum EColorMenuItem {
		eFillColorShapeItem("�� ä���", "ctrl + f", "F" , "Event.CTRL_MASK"),
		eFillColorLineItem("�� �� �ٲٱ�", "ctrl + l", "L" , "Event.CTRL_MASK"),
		eFillColorPanelItem("���� �ٲٱ�", "ctrl + p", "P" , "Event.CTRL_MASK");
		
		private String text;
		private String shortcut;
		private String Keyboard;
		private String control;
		
		private EColorMenuItem(String text, String shortcut, String Keyboard, String control) {
			this.text = text;
			this.shortcut = shortcut;
		}
		public String getText() {
			return this.text;
		}
		public String getShortcut() {
			return this.shortcut;
		}
		public String getKeboardKey() {
			return this.Keyboard;
		}
		public String getcontrol() {
			return this.control;
		}
	}
	
	public enum ELineEditMenuItem {
		eLineWidth("�� ����"),
		eFullLineShape("�Ǽ�"),
		eDottedLineShape("����");
	
		private String text;
		private ELineEditMenuItem(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
}
