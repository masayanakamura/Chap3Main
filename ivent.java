package Chap3Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ivent{
	int x=45;
	int thp=15;
	int lv=1,hp=20,ak=6,def=5,flg;
	int exp=0;
	double a,d;
	BufferedImage msg;
	
	public void paint (Graphics g,int h,int type){
		Font f=new Font("TimesRoman",Font.ITALIC,20);//Font名："TimesRoman", "Courier", "Helvetica" 等
													 //Fontスタイル：Font.PLAIN, Font.BOLD, Font.ITALIC 等
		x+=30;
		if(x>=420){
			x=45;
			messege(g);
		}
		if(h==1){
			g.setFont(f);
			g.setColor(new Color(0, 0, 255));
			g.drawString("Hello World", 726, x);
		}
		else if(h==2){
			 g.setFont(f);
			g.setColor(new Color(255, 0, 0));
			g.drawString("敵"+thp, 726, x);
		}
		if(thp<=0){
			x+=30;
			switch(type){
				case 1:
					exp=exp+50;
					break;
			}
			 g.setFont(f);
			g.setColor(Color.green);
			g.drawString("exp "+exp, 726, x);
			if(exp>=lv*100){
				x+=30;
				lv++;
				hp=hp+(hp/10);
				d=1+(lv/10+0.1)*ak+(1-(lv/10)*ak);
				a=(lv/10+0.15)*def+(1-(lv/10)*def)-1;
				def= (int) (Math.floor(d)+def);
				ak=(int) (Math.floor(a)+ak);
				g.setFont(f);
				g.setColor(new Color(222,200,122));
				g.drawString("Lv　"+lv+" HP"+hp+" ATK "+ak+" DEF "+def+" a"+a+" d"+d, 716, x);
			}
			thp=20;
		}
		System.out.println(x);
	}
	 /************************* メッセージウィンドウ ***************************/
	 public void messege(Graphics g){
		 try{this.msg = ImageIO.read(this.getClass().getResource("ウィンドウ.gif"));}catch(IOException e){e.printStackTrace();}
			g.drawImage(msg,700,20,300,500, null, null);
	}
	 public void damege(int act){
		 switch(act){
		 case 1:
			 thp=thp-ak;
			 break;
		 }
	 }
}

