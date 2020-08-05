package application.Help;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Help extends Application {
	private Stage stage=new Stage();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub	
		primaryStage.setTitle("动画显示说明");
		Scene scene =new Scene(new Group(),450,350);
		Group root=(Group)scene.getRoot();
		try {
			Text text1= new Text();
			text1.setX(5);
			text1.setY(20);
			text1.setFill(Color.BLACK);
			text1.setFont(Font.font ("Verdana", 15));
			text1.setWrappingWidth(445);
			text1.setText("●该动画显示由三个界面组成：“用户选择” “随机生成” “无原子核”");
			
			Text text2= new Text();
			text2.setX(5);
			text2.setY(35);
			text2.setFill(Color.BLACK);
			text2.setFont(Font.font ("Verdana", 15));
			text2.setWrappingWidth(445);
			text2.setText("●用户选择（由于没有进行输入内容是否在有效范围的判断，因此请输入有效范围以便程序运行）：");
			
			Text text3= new Text();
			text3.setX(10);
			text3.setY(70);
			text3.setFill(Color.BLACK);
			text3.setFont(Font.font ("Verdana", 15));
			text3.setWrappingWidth(445);
			text3.setText("（1）原子核数目范围：正整数 ");
			
			Text text4= new Text();
			text4.setX(10);
			text4.setY(85);
			text4.setFill(Color.BLACK);
			text4.setFont(Font.font ("Verdana", 15));
			text4.setWrappingWidth(445);
			text4.setText("（2）中子速度范围：整数值 ");
			
			Text text5= new Text();
			text5.setX(10);
			text5.setY(100);
			text5.setFill(Color.BLACK);
			text5.setFont(Font.font ("Verdana", 15));
			text5.setWrappingWidth(445);
			text5.setText("（3）原子核上下边界范围：0-350");
			
			Text text6= new Text();
			text6.setX(10);
			text6.setY(115);
			text6.setFill(Color.BLACK);
			text6.setFont(Font.font ("Verdana", 15));
			text6.setWrappingWidth(445);
			text6.setText("（4）原子核左右边界范围：0-450 ");
			
			Text text7= new Text();
			text7.setX(10);
			text7.setY(130);
			text7.setFill(Color.BLACK);
			text7.setFont(Font.font ("Verdana", 15));
			text7.setWrappingWidth(445);
			text7.setText("（5）中子方向：0-代表向左，1-代表向右");
			
			Text text8= new Text();
			text8.setX(5);
			text8.setY(145);
			text8.setFill(Color.BLACK);
			text8.setFont(Font.font ("Verdana", 15));
			text8.setWrappingWidth(445);
			text8.setText("●红色小球代表中子，蓝色大球代表碰撞前的原子核，绿色大球代表碰撞后分裂出来的原子核");
			
			Text text9= new Text();
			text9.setX(5);
			text9.setY(180);
			text9.setFill(Color.BLACK);
			text9.setFont(Font.font ("Verdana", 15));
			text9.setWrappingWidth(445);
			text9.setText("●窗口不会自动关闭，每运行完一个窗口需要自行关闭");
			
						
			root.getChildren().add(text1);
			root.getChildren().add(text2);
			root.getChildren().add(text3);
			root.getChildren().add(text4);
			root.getChildren().add(text5);
			root.getChildren().add(text6);
			root.getChildren().add(text7);
			root.getChildren().add(text8);
			root.getChildren().add(text9);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void showWindows() throws Exception{
		start(stage);
	}
}
