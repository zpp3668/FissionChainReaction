/*
 * 碰撞后的原子核模型
 */
package application.Model;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;

public class Nucleus {	
	private int no;
	private Circle circle;		//用圆来描绘碰撞后的原子核
	private int Xvelocity;		//横坐标方向速度
	private int Yvelocity;		//纵坐标方向速度
	private int XCoordinates;	//横坐标
	private int YCoordinates;	//纵坐标
	private RadialGradient gradient;//填色
	
	public Nucleus(int X,int Y,int Xv,int Yv) {
		XCoordinates=X;
		YCoordinates=Y;
		Xvelocity=Xv;
		Yvelocity=Yv;
		//设置渐变颜色
		gradient = new RadialGradient(  0,  .1,  40,  40,  15,  false,  
	    		CycleMethod.NO_CYCLE,  new Stop(0, Color.WHITE),  new Stop(1, Color.GREEN));
	    circle = new Circle(40,40,15); 
	    circle.setCenterX(XCoordinates);
		circle.setCenterY(YCoordinates);
	    circle.setFill(gradient);
	}
	
	public void setNo(int no) {
		this.no=no;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setColor() {
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
	
	public int getXCoordinates() {
		return XCoordinates;
	}
	
	public void setYCoordinates(int Coordinates) {
		this.YCoordinates=Coordinates;
	}
	
	public int getYCoordinates() {
		return YCoordinates;
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
