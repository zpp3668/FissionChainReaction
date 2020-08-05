/*
 * 原子核模型
 */
package application.Model;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;

public class NucleusModel {	
	private int no;
	private Circle circle;		//用两个连接的圆来描绘原子核
	private int Xvelocity;		//横坐标方向速度
	private int Yvelocity;		//纵坐标方向速度
	private int XCoordinates;	//横坐标
	private int YCoordinates;	//纵坐标
	private RadialGradient gradient;
	
	public NucleusModel() {
		Random rand = new Random();  
		//圆的位置不得超出显示范围
		XCoordinates=rand.nextInt(430) + 1;
		YCoordinates=rand.nextInt(330) + 1;
		//设置渐变颜色
		gradient = new RadialGradient(  0,  .1,  40,  40,  20,  false,  
	    		CycleMethod.NO_CYCLE,  new Stop(0, Color.WHITE),  new Stop(1, Color.BLUE));
	    circle = new Circle(40,40,20); 
		Xvelocity=0;
		Yvelocity=0;	
		//中心坐标
		circle.setCenterX(XCoordinates);
		circle.setCenterY(YCoordinates);
	    circle.setFill(gradient);
	}
	
	public void setCoordinates(int XCoordinatesMin,int XCoordinatesMax,int YCoordinatesMin,int YCoordinatesMax) {
		Random rand = new Random();  
		XCoordinates=rand.nextInt(XCoordinatesMax-XCoordinatesMin+1) + XCoordinatesMin;
		circle.setCenterX(XCoordinates);
		YCoordinates=rand.nextInt(YCoordinatesMax-YCoordinatesMin+1) + YCoordinatesMin;
		circle.setCenterY(YCoordinates);
	}
	
	public void setNo(int no) {
		this.no=no;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setColor() {
		//被碰撞后设置颜色为白色，以达到去除的目的
		RadialGradient gradient1 = new RadialGradient(  0,  .1,  40,  40,  20,  false,  
	    		CycleMethod.NO_CYCLE,  new Stop(0, Color.WHITE),  new Stop(1, Color.WHITE));
		circle.setFill(gradient1);
	}
	
	public int getXVelocity() {
		return Xvelocity;
	}
	
	public int getYVelocity() {
		return Yvelocity;
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle=circle;
	}
	
	public void setXvelocity(int velocity) {
		this.Xvelocity=velocity;
	}
	
	public void setYvelocity(int velocity) {
		this.Yvelocity=velocity;
	}
	
	public void setXCoordinates(int Coordinates) {
		this.XCoordinates=Coordinates;
	}
	
	public void setYCoordinates(int Coordinates) {
		this.YCoordinates=Coordinates;
	}
	
	public int getX() {
		int X;
		double xMin = circle.getBoundsInParent().getMinX();  
		double xMax = circle.getBoundsInParent().getMaxX();  
		X=(int)((xMax+xMin)/2);
		// TODO Auto-generated method stub
		return X;
	}
	
	public int getY() {
		int Y;
		double yMin = circle.getBoundsInParent().getMinY();  
		double yMax = circle.getBoundsInParent().getMaxY();  
		Y=(int)((yMax+yMin)/2);		
		// TODO Auto-generated method stub
		return Y;
	}
	
	public int getSize() {
		// TODO Auto-generated method stub		
		return 20;
	}
}
