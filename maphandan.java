package Chap3Main;


public class maphandan {
	int maphndn(int x2,int y2){
		int i=0;
		if(x2<700&&y2<730&&x2>=0&&y2>=30)i=1;
		else if(x2>1330&&y2<=660&&x2<=2030&&y2>=30)i=3;
		else if(x2>=700&&y2<=660&&x2<=1330&&y2>=30)i=2;		
		else if(x2<=630&&y2>=730&&x2>=0&&y2<=1360)i=4;
		else if(x2>=1400&&y2>=730&&x2<=2030&&y2<=1360)i=6;
		else if(x2>=700&&y2>=730&&x2<=1330&&y2<=1360)i=5;	
		else if(x2<=630&&y2>=1430&&x2>=0&&y2<=2060)i=7;
		else if(x2>=1400&&y2>=1430&&x2<=2030&&y2<=2060)i=9;
		else if(x2>=700&&y2>=1430&&x2<=1330&&y2<=2060)i=8;
		
			return i;
	}

}
