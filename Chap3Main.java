package Chap3Main;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Chap3Main extends JFrame {
	//private static final long serialVersionUID = 1L;
	int h=0,i=30;
	int mapx=0,mapy=0;
	JFrame mainwindow;
	BufferedImage img_back, chara,chara2,msg;
	AudioClip bgm,se;
	//PrefFrame frm2 = new PrefFrame("メッセージウィンドウ");
	ivent iv = new ivent();
	
	public static void main(String[] args) {
		new Chap3Main();
	}
	
	/*********************** ウィンドウ設定 ***********************/
	public Chap3Main(){
		this.mainwindow = new JFrame("ゲームウィンドウ");
		this.mainwindow.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainwindow.setResizable(false);
		this.mainwindow.setLocation(200,100);
		
	    mainwindow.setVisible(true);
	    
		//ウィンドウサイズ
		Insets in = this.mainwindow.getInsets();
		this.mainwindow.setSize(1000+ in.left + in.right , 700 +in.top + in.bottom);
		//キーボード
		this.mainwindow.addKeyListener(new test());
		
		//BGm,SE準備
		bgm=Applet.newAudioClip(getClass().getResource("tamhe10.mid"));
		se=Applet.newAudioClip(getClass().getResource("tama2.au"));
		
		/************************** 音楽 *****************************/
		bgm.loop();
		
	    //画像
		try{
			this.chara = ImageIO.read(this.getClass().getResource
					("主人公表面.gif"));
		}catch(IOException e){e.printStackTrace();}
		
		mapmake map = new mapmake();
		for(mapy=30;mapy <=  730-70;mapy+=70){
			for(mapx=0;mapx <=  700-70;mapx+=70){	
				map.mapmk(mapx,mapy,h,i,0,0,0);
			}
		}
		//ivent msg = new ivent();
		
		Graphics g1 = mainwindow.getGraphics();
		g1.drawImage(chara,210,240,70,70,mainwindow);
		iv.messege(g1);
		
	}	
	
	@SuppressWarnings("serial")
	/*************************** キーボードの処理 ****************************/
	 class test extends Applet implements KeyListener{
		int handan,x6,y6;
		 int x=210, y=240,x2,y2,x4,y4,i=0,j=330,hk=0,MAPnow=1;
		 int tekix=350,tekiy=100,tekix2,tekiy2;
		 BufferedImage  chara2,chara;
		private boolean isQ = false;
		private boolean isUP = false;
		private boolean isDOWN = false;
		private boolean isLEFT = false;
		private boolean isRIGHT = false;
		
	/*************************** キーボードの監視 ************************/
		public void ini(){
			addKeyListener(this);
		}
		 
	/**************************** キーボードが押された場合の処理  **************************/
			@Override
			public void keyPressed(KeyEvent arg0){
	/**************************キー状態（true）  ***************************/
				switch(arg0.getKeyCode() ){
				case KeyEvent.VK_Q:
					isQ=true;
					break;
				case KeyEvent.VK_UP:
					isUP=true;
					break;
				case KeyEvent.VK_DOWN:
					isDOWN=true;
					break;
				case KeyEvent.VK_LEFT:
					isLEFT=true;
					break;
				case KeyEvent.VK_RIGHT:	
					isRIGHT=true;
					break;
				}
				if(isQ==true&&isUP){System.out.println("UP");hk=1;}
				if(isQ==true&&isDOWN){System.out.println("DOWN");hk=2;}
				if(isQ==true&&isLEFT){System.out.println("LEFT");hk=3;}
				if(isQ==true&&isRIGHT){System.out.println("RIGHT");hk=4;}
			
			}
	/************************* キーボードが離された場合の処理************************/
			@Override
			public void keyReleased(KeyEvent arg0){
				
	/************************* キー状態(false) ***********************/
				switch(arg0.getKeyCode()){
			 		case KeyEvent.VK_Q:
			 			isQ=false;
			 			break;
			 		case KeyEvent.VK_UP:
			 			isUP=false;
			 			break;
			 		case KeyEvent.VK_DOWN:
			 			isDOWN=false;
			 			break;
			 		case KeyEvent.VK_LEFT:
			 			isLEFT=false;
			 			break;
			 		case KeyEvent.VK_RIGHT:	
			 			isRIGHT=false;
			 			break;
				}
			if(isQ!=true){
			/********************* 主人公の行動 ********************/
				switch(arg0.getKeyCode() ){
				case KeyEvent.VK_UP:
					x2=x;
					y2=y;
					x6=x4;
					y6=y4;
					tekix2=tekix;
					tekiy2=tekiy;
					
					if(i==0){
					y-=70;
					if(y < 0){
						y+=70;
					}
					else{x4=x;y4=y;
					x4 = x % 700;			
					if(y >= 1430){
						y4 = y % 1430;
						y4+=30;	}
					else if(y4 >= 730){
						y4 = y % 730;	
						y4+=30;
						}
					bunki11 i1 = new bunki11();
					bunki12 i2 = new bunki12();
					bunki13 i3 = new bunki13();
					bunki14 i4 = new bunki14();
					bunki15 i5 = new bunki15();
					bunki16 i6 = new bunki16();
					bunki17 i7 = new bunki17();
					bunki18 i8 = new bunki18();
					bunki19 i9 = new bunki19();
				
					switch(MAPnow){
					case 1:handan = i1.mapbnk(x4,y4);break;
					case 2:handan = i2.mapbnk(x4,y4);break;
					case 3:handan = i3.mapbnk(x4,y4);break;
					case 4:handan = i4.mapbnk(x4,y4);break;
					case 5:handan = i5.mapbnk(x4,y4);break;
					case 6:handan = i6.mapbnk(x4,y4);break;
					case 7:handan = i7.mapbnk(x4,y4);break;
					case 8:handan = i8.mapbnk(x4,y4);break;
					case 9:handan = i9.mapbnk(x4,y4);break;
					}
						
					maphandan MAP = new maphandan();
					int rizardon = MAP.maphndn(x,y);
					mapmake map = new mapmake();
					move test5 = new move();
					if(handan!=1){
						hk=1;				
						if(MAPnow != rizardon){
							for(mapy=30;mapy <=  730-70;mapy+=70){
								for(mapx=0;mapx <=  700-70;mapx+=70){	
									map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
								}
							}
						}
						MAPnow=test5.move2(x,y,x2,y2,hk,MAPnow,rizardon);
					}else {if(MAPnow != rizardon){
						for(mapy=30;mapy <=  730-70;mapy+=70){
							for(mapx=0;mapx <=  700-70;mapx+=70){	
								map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
							}
						}
						MAPnow=test5.move2(x,y,x2,y2,hk,MAPnow,rizardon);
						y-=70;
					}y+=70;}
				//	System.out.println(x4+" "+y4+" "+x6+" "+y6);
						Random rnd = new Random();
				        int cp = rnd.nextInt(4) + 1;
				        if(cp==1)tekix+=70;
				        if(cp==2)tekix-=70;
				        if(cp==3)tekiy+=70;
				        if(cp==4)tekiy-=70;
				        if(tekix < 0) tekix+=70;
			        	if(tekix > 2030) tekix+=70;
			        	if(tekiy < 0) tekiy+=70;
			        	if(tekiy > 2060) tekiy-=70;
						teki teki2 = new teki();
						teki2.a(tekix,tekiy,tekix2,tekiy2,cp,MAPnow);
					}
				}
		
					break;
				case KeyEvent.VK_DOWN:
					x2=x;
					y2=y;
					x6=x4;
					y6=y4;
					tekix2=tekix;
					tekiy2=tekiy;
					
					if(i==0){
						y+=70;
						if(y > 2060){
							y-=70;
						}
						
						else{x4=x;y4=y;
							x4 = x % 700;			
							if(y >= 1430){
								y4 = y % 1430;
								y4+=30;	}
							else if(y4 >= 730){
								y4 = y % 730;	
								y4+=30;}
						
							bunki11 i1 = new bunki11();
							bunki12 i2 = new bunki12();
							bunki13 i3 = new bunki13();
							bunki14 i4 = new bunki14();
							bunki15 i5 = new bunki15();
							bunki16 i6 = new bunki16();
							bunki17 i7 = new bunki17();
							bunki18 i8 = new bunki18();
							bunki19 i9 = new bunki19();
						
							
							switch(MAPnow){
							case 1:handan = i1.mapbnk(x4,y4);break;
							case 2:handan = i2.mapbnk(x4,y4);break;
							case 3:handan = i3.mapbnk(x4,y4);break;
							case 4:handan = i4.mapbnk(x4,y4);break;
							case 5:handan = i5.mapbnk(x4,y4);break;
							case 6:handan = i6.mapbnk(x4,y4);break;
							case 7:handan = i7.mapbnk(x4,y4);break;
							case 8:handan = i8.mapbnk(x4,y4);break;
							case 9:handan = i9.mapbnk(x4,y4);break;
							}
							maphandan MAP = new maphandan();
							int rizardon = MAP.maphndn(x,y);
							mapmake map = new mapmake();
							move test6 = new move();
						if(handan!=1){
							hk=2;
							if(MAPnow != rizardon){
								for(mapy=30;mapy <=  730-70;mapy+=70){
									for(mapx=0;mapx <=  700-70;mapx+=70){	
										map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
									}
								}
							}
						
							MAPnow=test6.move2(x,y,x2,y2,hk,MAPnow,rizardon);
						
						}else {if(MAPnow != rizardon){
							for(mapy=30;mapy <=  730-70;mapy+=70){
								for(mapx=0;mapx <=  700-70;mapx+=70){	
									map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
								}
							}
							
							MAPnow=test6.move2(x,y,x2,y2,hk,MAPnow,rizardon);
							y+=70;
						}y-=70;}			
					
							Random rnd = new Random();
					        int cp = rnd.nextInt(4) + 1;
					        if(cp==1)tekix+=70;
					        if(cp==2)tekix-=70;
					        if(cp==3)tekiy+=70;
					        if(cp==4)tekiy-=70;
					        if(tekix < 0) tekix+=70;
				        	if(tekix > 2030) tekix+=70;
				        	if(tekiy < 0) tekiy+=70;
				        	if(tekiy > 2060) tekiy-=70;
							teki teki2 = new teki();
							teki2.a(tekix,tekiy,tekix2,tekiy2,cp,MAPnow);
						}
					}
					break;
				case KeyEvent.VK_LEFT:
					x2=x;
					y2=y;
					x6=x4;
					y6=y4;
					tekix2=tekix;
					tekiy2=tekiy;
					if(i==0){
						x-=70;
						if(x < 0){
							x+=70;
						}
						else{x4=x;y4=y;
						x4 = x % 700;			
						if(y >= 1430){
							y4 = y % 1430;
							y4+=30;	}
						else if(y4 >= 730){
							y4 = y % 730;	
							y4+=30;}
						
						bunki11 i1 = new bunki11();
						bunki12 i2 = new bunki12();
						bunki13 i3 = new bunki13();
						bunki14 i4 = new bunki14();
						bunki15 i5 = new bunki15();
						bunki16 i6 = new bunki16();
						bunki17 i7 = new bunki17();
						bunki18 i8 = new bunki18();
						bunki19 i9 = new bunki19();
					
						switch(MAPnow){
						case 1:handan = i1.mapbnk(x4,y4);break;
						case 2:handan = i2.mapbnk(x4,y4);break;
						case 3:handan = i3.mapbnk(x4,y4);break;
						case 4:handan = i4.mapbnk(x4,y4);break;
						case 5:handan = i5.mapbnk(x4,y4);break;
						case 6:handan = i6.mapbnk(x4,y4);break;
						case 7:handan = i7.mapbnk(x4,y4);break;
						case 8:handan = i8.mapbnk(x4,y4);break;
						case 9:handan = i9.mapbnk(x4,y4);break;
						}
						maphandan MAP = new maphandan();
						int rizardon = MAP.maphndn(x,y);
						mapmake map = new mapmake();
						move test7 = new move();
						if(handan!=1){
						
							hk=3;
							
							if(MAPnow != rizardon){
								for(mapy=30;mapy <=  730-70;mapy+=70){
									for(mapx=0;mapx <=  700-70;mapx+=70){	
										map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
									}
								}
							}
							
							MAPnow=test7.move2(x,y,x2,y2,hk,MAPnow,rizardon);
						
					}else {if(MAPnow != rizardon){
						for(mapy=30;mapy <=  730-70;mapy+=70){
							for(mapx=0;mapx <=  700-70;mapx+=70){	
								map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
							}
							
						}
						
						MAPnow=test7.move2(x,y,x2,y2,hk,MAPnow,rizardon);
						x-=70;
					}x+=70;}
							Random rnd = new Random();
					        int cp = rnd.nextInt(4) + 1;
					        if(cp==1)tekix+=70;
					        if(cp==2)tekix-=70;
					        if(cp==3)tekiy+=70;
					        if(cp==4)tekiy-=70;
					        	if(tekix < 0) tekix+=70;
					        	if(tekix > 2030) tekix+=70;
					        	if(tekiy < 0) tekiy+=70;
					        	if(tekiy > 2060) tekiy-=70;
							teki teki2 = new teki();
							teki2.a(tekix,tekiy,tekix2,tekiy2,cp,MAPnow);
						
					}
					}
					break;
				case KeyEvent.VK_RIGHT:	
					x2=x;
					y2=y;
					x6=x4;
					y6=y4;
					tekix2=tekix;
					tekiy2=tekiy;
					if(i==0){
						x+=70;
						if(x > 2030){
							x-=70;
						}
						else{x4=x;y4=y;
							x4 = x % 700;			
							if(y >= 1430){
								y4 = y % 1430;
								y4+=30;	}
							else if(y4 >= 730){
								y4 = y % 730;	
								y4+=30;}
						
							bunki11 i1 = new bunki11();
							bunki12 i2 = new bunki12();
							bunki13 i3 = new bunki13();
							bunki14 i4 = new bunki14();
							bunki15 i5 = new bunki15();
							bunki16 i6 = new bunki16();
							bunki17 i7 = new bunki17();
							bunki18 i8 = new bunki18();
							bunki19 i9 = new bunki19();
						
							
							switch(MAPnow){
							case 1:handan = i1.mapbnk(x4,y4);break;
							case 2:handan = i2.mapbnk(x4,y4);break;
							case 3:handan = i3.mapbnk(x4,y4);break;
							case 4:handan = i4.mapbnk(x4,y4);break;
							case 5:handan = i5.mapbnk(x4,y4);break;
							case 6:handan = i6.mapbnk(x4,y4);break;
							case 7:handan = i7.mapbnk(x4,y4);break;
							case 8:handan = i8.mapbnk(x4,y4);break;
							case 9:handan = i9.mapbnk(x4,y4);break;
							}
							maphandan MAP = new maphandan();
							int rizardon = MAP.maphndn(x,y);
							mapmake map = new mapmake();
							move test8 = new move();
						if(handan!=1){
							
							hk=4;

							if(MAPnow != rizardon){
								for(mapy=30;mapy <=  730-70;mapy+=70){
									for(mapx=0;mapx <=  700-70;mapx+=70){	
										map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
									}	
								}
							}
							MAPnow=test8.move2(x,y,x2,y2,hk,MAPnow,rizardon);
						}else{ if(MAPnow != rizardon){
							for(mapy=30;mapy <=  730-70;mapy+=70){
								for(mapx=0;mapx <=  700-70;mapx+=70){	
									map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
								}	
							}
							
							MAPnow=test8.move2(x,y,x2,y2,hk,MAPnow,rizardon);
							x+=70;
						}x-=70;}
							Random rnd = new Random();
					        int cp = rnd.nextInt(4) + 1;
					        if(cp==1)tekix+=70;
					        if(cp==2)tekix-=70;
					        if(cp==3)tekiy+=70;
					        if(cp==4)tekiy-=70;
					        if(tekix < 0) tekix+=70;
				        	if(tekix > 2030) tekix+=70;
				        	if(tekiy < 0) tekiy+=70;
				        	if(tekiy > 2060) tekiy-=70;
							teki teki2 = new teki();
							teki2.a(tekix,tekiy,tekix2,tekiy2,cp,MAPnow);
						if((x4==700&&x6==630)||(x4==630&&x6==0)||(y4==660&&y6==30)||(y4==30))
							if(MAPnow != rizardon){
								for(mapy=30;mapy <=  730-70;mapy+=70){
									for(mapx=0;mapx <=  700-70;mapx+=70){	
										map.mapmk(mapx,mapy,x,y,MAPnow,0,0);
									}
									//System.out.println();
								}
								//MAPnow=test8.move2(x,y,x2,y2,hk,MAPnow,rizardon);
							}
					}
					}
					break;
				case KeyEvent.VK_SPACE:
					if(i==0){
				/************************** 音楽 *****************************/
						se.play();
						
						Graphics m1 = mainwindow.getGraphics();
						iv.paint(m1,1,0);
						
						tekix2=tekix;
						tekiy2=tekiy;
							Attack kougeki = new Attack();
							kougeki.Attack2(x,y,hk,MAPnow,tekix,tekiy);
							Random rnd = new Random();
					        int cp = rnd.nextInt(4) + 1;
					        if(cp==1)tekix+=70;
					        if(cp==2)tekix-=70;
					        if(cp==3)tekiy+=70;
					        if(cp==4)tekiy-=70;
					        if(tekix < 0) tekix+=70;
				        	if(tekix > 2030) tekix+=70;
				        	if(tekiy < 0) tekiy+=70;
				        	if(tekiy > 2060) tekiy-=70;
							teki teki2 = new teki();
							teki2.a(tekix,tekiy,tekix2,tekiy2,cp,MAPnow);
					}
					break;
				case KeyEvent.VK_ENTER:
					try{
						this.chara = ImageIO.read(this.getClass().getResource
								("イチゴ剣エフェクト1.gif"));
							
						this.chara2 = ImageIO.read(this.getClass().getResource
								("イチゴ剣エフェクト2.gif"));
						}catch(IOException e){e.printStackTrace();
						Graphics g2 = mainwindow.getGraphics();
						g2.drawImage(chara,280,380,70,70,mainwindow);
					break;
					
				}
				}
			}else{
				maphandan MAP = new maphandan();
				int rizardon = MAP.maphndn(x,y);
				move is = new move();
				mapmake remap = new mapmake();
				remap.mapmk(x, y,x,y,MAPnow,0,1);
				MAPnow=is.move2(x,y,x,y,hk,MAPnow, rizardon);
			}
		}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	 }
	 /************************* 主人公移動 *************************/
	 class move {
			BufferedImage  chara;
		
			int move2(int x, int y,int x2,int y2,int hk,int MAPnow,int rizardon){
				int x4=x,y4=y,x5,y5;
				
				try{
					switch(hk){
					case 1:this.chara = ImageIO.read(this.getClass().getResource
							("主人公裏面.gif"));
								break;
					case 2:this.chara = ImageIO.read(this.getClass().getResource
							("主人公表面.gif"));
							break;
							
					case 3:this.chara = ImageIO.read(this.getClass().getResource
							("主人公左向き.gif"));
						break;
					case 4:this.chara = ImageIO.read(this.getClass().getResource
							("主人公右向き.gif"));
						break;
					}
					}catch(IOException e){e.printStackTrace();
					}
				Graphics g = mainwindow.getGraphics();
				System.out.println(x4+" "+y4);
				
				int y3 = y;	
				x = x % 700;
				x2 = x2 % 700;
				
				if(y3 >= 1430){
					y = y % 1430;
					y2 = y2 % 1430;
					y+=30;
					y2+=30;
				}
				else if(y3 >= 730){
					y = y % 730;
					y2 = y2 % 730;
					y+=30;
					y2+=30;
				}
				
				y5=y;x5=x;
				switch(hk){
				case 1:y4-=70;y5-=70;break;
				case 2:y4+=70;y5+=70;break;
				case 3:x4-=70;x5-=70;break;
				case 4:x4+=70;x5+=70;break;
				}
				
				mapmake remap = new mapmake();
					remap.mapmk(x2, y2,x4,y4,MAPnow,0,1);
				
				maphandan MAP = new maphandan();
				
				g.drawImage(chara,x,y,70,70,mainwindow);
				return rizardon;
	 	}	
	 }
 	/*********************** 攻撃エフェクト ****************************/
	 class Attack extends Thread{
		 BufferedImage ak,chara3;
		 int dandoux,dandouy;
		 int dandoux2,dandouy2;
		// int tekihp=iv.thp;
		 int type=1;
		void Attack2(int x,int y,int muki,int MAPnow,int tekix,int tekiy){
			int x2 = x;
			int y2 = y;
			 try{
				 switch(muki){
				 case 1:this.ak = ImageIO.read(this.getClass().getResource
						 ("攻撃１上.gif"));
				 		break;
				 case 2:this.ak = ImageIO.read(this.getClass().getResource
						 ("攻撃１下.gif"));
				 		break;
				 case 3:this.ak = ImageIO.read(this.getClass().getResource
						 ("攻撃１左.gif"));
				 		break;
				 case 4:this.ak = ImageIO.read(this.getClass().getResource
						 ("攻撃１右.gif"));
				 		break;
				 }
			 }catch(IOException e){
				 e.printStackTrace();
			 }
			 Graphics g2 = mainwindow.getGraphics();
			 
			 	for(int i = 1;i < 7;i++){
			 		switch(muki){
			 		case 1:
			 			int y3 = y;	
						x = x % 700;
						if(y3 >= 1430){
							y = y % 1430;	
							y+=30;	
						}
						else if(y3 >= 730){
							y = y % 730;						
							y+=30;
						}
			 			g2.drawImage(ak,x,y+i*(-70),70,70,mainwindow);
			 			dandoux=x;
			 			dandouy=y+i*(-70);
			 			dandoux2=dandoux;
			 			dandouy2=dandouy;
			 			break;
			 		case 2:
			 			int y4 = y;	
						x = x % 700;					
						if(y4 >= 1430){
							y = y % 1430;	
							y+=30;	
						}
						else if(y4 >= 730){
						y = y % 730;						
							y+=30;
						}
			 			g2.drawImage(ak,x,y+i*70,70,70,mainwindow);
			 			dandoux=x;
			 			dandouy=y+i*70;
			 			dandoux2=dandoux;
			 			dandouy2=dandouy;
			 			break;
			 		case 3:
			 			int y5 = y;	
						x = x % 700;
						if(y5 >= 1430){
							y = y % 1430;	
							y+=30;	
						}
						else if(y5 >= 730){
							y = y % 730;						
							y+=30;
						}
			 			g2.drawImage(ak,x+i*(-70),y,70,70,mainwindow);
			 			dandoux=x+i*(-70);
			 			dandouy=y;
			 			dandoux2=dandoux;
			 			dandouy2=dandouy;
			 			break;
			 		case 4:
			 			int y6 = y;	
						x = x % 700;
						if(y6 >= 1430){
							y = y % 1430;	
							y+=30;	
						}
						else if(y6 >= 730){
							y = y % 730;						
							y+=30;
						}
			 			g2.drawImage(ak,x+i*70,y,70,70,mainwindow);
			 			dandoux=x+i*70;
			 			dandouy=y;
			 			dandoux2=dandoux;
			 			dandouy2=dandouy;
			 			break;
			 		}
			 		try{Thread.sleep(30);}catch(InterruptedException e){}
			 		mapmake remap = new mapmake();
					remap.mapmk(dandoux, dandouy,dandoux2,dandouy2,MAPnow,0,1);
			/**************************** ダメージ判定 ******************************/
			 		if(tekix==dandoux&&tekiy==dandouy){	
			 			Graphics m3 = mainwindow.getGraphics();
			 			iv.damege(1);
						iv.paint(m3,2,type);
						break;
			 		}
			 	}
			 }
	  }
	
	 /**************** マップメイククラス ******************/
class mapmake{
	Graphics g = mainwindow.getGraphics();
	BufferedImage img_back;
	void mapmk(int x,int y,int x2,int y2,int MAPnow,int tekihandan,int remap){
		maphandan mapmap = new maphandan();
		
		int kamex = mapmap.maphndn(x2, y2);
		
		bunki11 i1 = new bunki11();
		bunki12 i2 = new bunki12();
		bunki13 i3 = new bunki13();
		bunki14 i4 = new bunki14();
		bunki15 i5 = new bunki15();
		bunki16 i6 = new bunki16();
		bunki17 i7 = new bunki17();
		bunki18 i8 = new bunki18();
		bunki19 i9 = new bunki19();
	
		int part = 0;
		switch(kamex){
		case 1:part = i1.mapbnk(x,y);break;
		case 2:part = i2.mapbnk(x,y);break;
		case 3:part = i3.mapbnk(x,y);break;
		case 4:part = i4.mapbnk(x,y);break;
		case 5:part = i5.mapbnk(x,y);break;
		case 6:part = i6.mapbnk(x,y);break;
		case 7:part = i7.mapbnk(x,y);break;
		case 8:part = i8.mapbnk(x,y);break;
		case 9:part = i9.mapbnk(x,y);break;
		}
		if(remap==1)part=2;
		System.out.println("mapmake"+kamex);
		switch(part){
		case 0:
			try{
				this.img_back = ImageIO.read(this.getClass().getResource
						("歩行可能パネル１.gif"));
			}catch(IOException e){
			e.printStackTrace();
			}
			break;
			
		case 1:
			try{
				this.img_back = ImageIO.read(this.getClass().getResource
						("歩行不可能パネル１.gif"));
			}catch(IOException e){
			e.printStackTrace();
			}
			break;
		case 2:
			try{
				this.img_back = ImageIO.read(this.getClass().getResource
						("歩行可能パネル１.gif"));
			}catch(IOException e){
			e.printStackTrace();
			}
			break;
		}
		g.drawImage(img_back,x,y,70,70,mainwindow);
	}
}

	/**************** 敵行動クラス ****************/
public class teki {
	 BufferedImage img_back,chara;
	 
		 void a(int x,int y,int x2,int y2,int cp,int MAPnow){
			int muki = 0;
			int y4=y,x4=x;
			
			try{	
				switch(cp){
				case 1:this.chara = ImageIO.read(this.getClass().getResource
						("敵1裏.gif"));
							break;
				case 2:this.chara = ImageIO.read(this.getClass().getResource
						("敵1.gif"));
						break;
				case 3:this.chara = ImageIO.read(this.getClass().getResource
						("敵1裏.gif"));
							break;
				case 4:this.chara = ImageIO.read(this.getClass().getResource
						("敵1.gif"));
						break;	
					}
				}catch(IOException e){
				e.printStackTrace();
				}
			
			Graphics g1 = mainwindow.getGraphics();

			int y3 = y;	
			x = x % 700;
			x2 = x2 % 700;
			
			if(y3 >= 1430){
				y = y % 1430;
				y2 = y2 % 1430;
				y+=30;
				y2+=30;
			}
			else if(y3 >= 730){
				y = y % 730;
				y2 = y2 % 730;
				y+=30;
				y2+=30;
			}
			
				
			g1.drawImage(chara,x,y,70,70,mainwindow);
			
			mapmake remap = new mapmake();
			remap.mapmk(x2, y2,x4,y4,MAPnow,1,1);
		}
	}
}
/******************** マップ **********************/
class bunki11 extends bunkimoto{
	bunki11(){
	map = new int[][]{{1,1,1,1,1,1,1,1,1,1},
					   {1,1,1,1,1,1,1,1,1,1},
					   {1,1,2,2,2,2,2,1,1,1},
					   {1,1,2,2,2,2,2,1,1,1},
					   {1,1,2,2,2,2,2,2,2,2},
					   {2,2,2,2,2,2,2,2,2,2},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,2,2,2,2,1,1,1}};
	}
}
class bunki12 extends bunkimoto{
	bunki12(){
	map = new int[][]{{1,1,1,1,1,1,1,1,1,1},
					   {1,1,1,1,1,1,2,1,2,1},
					   {1,1,1,1,1,1,1,1,1,1},
					   {1,1,1,2,2,2,2,2,1,1},
					   {2,1,2,2,2,2,2,2,2,2},
					   {2,2,2,2,2,2,2,2,2,2},
					   {1,2,2,2,2,2,2,1,1,1},
					   {1,1,1,2,2,2,2,1,1,1},
					   {1,2,1,2,2,2,2,1,2,1},
					   {1,1,1,2,2,2,2,1,1,1}};
	}
}class bunki13 extends bunkimoto{
	bunki13(){
	map = new int[][]{{1,1,1,1,1,1,1,1,1,1},
					   {1,1,1,1,1,1,1,1,1,1},
					   {1,1,2,2,1,1,1,1,1,1},
					   {1,1,2,2,1,1,2,1,1,1},
					   {2,1,2,2,1,1,2,1,1,1},
					   {2,2,2,2,2,2,2,1,1,1},
					   {1,2,2,2,2,2,2,1,1,1},
					   {1,1,1,1,1,2,2,1,1,1},
					   {1,1,1,1,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1}};
	}
}class bunki14 extends bunkimoto{
	bunki14(){
	map = new int[][]{{1,1,1,2,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,2,2},
					   {1,1,2,2,2,2,2,2,2,2},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,2,2,2,2,1,1,1}};
	}
}class bunki15 extends bunkimoto{
	bunki15(){
	map = new int[][]{{1,1,1,2,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {2,1,2,1,1,1,1,2,2,2},
					   {2,2,2,1,1,1,1,2,2,2},
					   {1,2,2,1,1,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,2,2,2,2,1,1,1}};
	}
}class bunki16 extends bunkimoto{
	bunki16(){
	map = new int[][]{{1,1,1,1,2,2,1,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {2,1,2,2,2,1,2,1,1,1},
					   {2,2,2,2,2,2,2,2,1,1},
					   {1,2,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,1,2,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,2,2,2,2,1,1,1}};
	}
}class bunki17 extends bunkimoto{
	bunki17(){
	map = new int[][]{{1,1,1,2,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,2,2},
					   {1,1,2,2,2,2,2,2,2,2},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,1,1,1,1,1,1,1}};
	}
}class bunki18 extends bunkimoto{
	bunki18(){
	map = new int[][]{{1,1,1,2,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {2,1,2,2,2,2,2,2,2,2},
					   {2,2,2,2,2,2,2,2,2,2},
					   {1,2,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,1,1,1,1,1,1,1}};
	}
}class bunki19 extends bunkimoto{
	bunki19(){
	map = new int[][]{{1,1,1,2,2,2,2,1,1,1},
					   {1,1,1,1,2,2,1,1,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {2,1,2,2,2,2,2,2,2,1},
					   {2,2,2,2,2,2,2,2,2,1},
					   {1,2,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,2,2,2,2,2,2,1,1},
					   {1,1,1,1,1,1,1,1,1,1}};
	}
}


	

