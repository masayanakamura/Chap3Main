package Chap3Main;

class bunkimoto {
	int i=0,zahyo=0;
	int[][] zibun,idouhuka,teki,map = null; 
	
	int mapbnk(int x,int y){
		
		zibun = new int[10][10];
		idouhuka= new int[10][10];
		teki= new int[10][10];
		/*‰Šú‰»‚Í
		 •Ï” = new int[][]{{        },};‚ÌŒ`‚Å
		 		  */
				int j=0,h=0;
				switch(x){
				case 0: j=0;break;
				case 70: j=1;break;
				case 140: j=2;break;
				case 210: j=3;break;
				case 280: j=4;break;
				case 350: j=5;break;
				case 420: j=6;break;
				case 490: j=7;break;
				case 560: j=8;break;
				case 630: j=9;break;
				}
				switch(y){
				case 30: h=0;break;
				case 100: h=1;break;
				case 170: h=2;break;
				case 240: h=3;break;
				case 310: h=4;break;
				case 380: h=5;break;
				case 450: h=6;break;
				case 520: h=7;break;
				case 590: h=8;break;
				case 660: h=9;break;
				}
				
				
				if(map[h][j] == 1){
					if(j==0){idouhuka[h][0] = 1;}
					zibun[h][j] = j * 70;
				}else //zibun[h][j] = 1;
		//		System.out.println("ZIBUN " +zibun[h][0]+ " "+ "IDOUHUKA"+ idouhuka[h][0]+" ");
				if(map[h][j] == 2){
					if(j==0){for(int bousi=0;bousi<10;bousi++){zibun[h][bousi]= 1;}}
					idouhuka[h][j] = j * 70; 
				}else{} //idouhuka[h][j] = 1;
					
				
				if(zibun[h][0]==1){
					zibun[h][0]=100;
					idouhuka[h][0]=100;
				}
				
			//	System.out.print(map[h][j]);
				
		switch(y){
		case 30:
		
			 if(x == zibun[0][0]||x == zibun[0][1]||x == zibun[0][2]||x == zibun[0][3]||x == zibun[0][4]||x == zibun[0][5]||x == zibun[0][6]||x == zibun[0][7]||x == zibun[0][8]||x == zibun[0][9])i=1;
			else if(x == idouhuka[0][0]||x == idouhuka[0][1]||x == idouhuka[0][2]||x == idouhuka[0][3]||x == idouhuka[0][4]||x == idouhuka[0][5]||x == idouhuka[0][6]||x == idouhuka[0][7]||x == idouhuka[0][8]||x == idouhuka[0][9])i=2;
		//	if(x == 0||x == 110||x == 190||x == 350||x == 430||x == 510)i=3;
		//	System.out.print("case 30 " +i+ " ");
			 break;
		case 100:
			
			if(x == zibun[1][0]||x == zibun[1][1]||x == zibun[1][2]||x == zibun[1][3]||x == zibun[1][4]||x == zibun[1][5]||x == zibun[1][6]||x == zibun[1][7]||x == zibun[1][8]||x == zibun[1][9])i=1;
			else if(x == idouhuka[1][0]||x == idouhuka[1][1]||x == idouhuka[1][2]||x == idouhuka[1][3]||x == idouhuka[1][4]||x == idouhuka[1][5]||x == idouhuka[1][6]||x == idouhuka[1][7]||x == idouhuka[1][8]||x == idouhuka[1][9])i=2;
		//	System.out.print("case 100 " +i+ " ");
			break;
		case 170:
			
			if(x == zibun[2][0]||x == zibun[2][1]||x == zibun[2][2]||x == zibun[2][3]||x == zibun[2][4]||x == zibun[2][5]||x == zibun[2][6]||x == zibun[2][7]||x == zibun[2][8]||x == zibun[2][9])i=1;
			else if(x == idouhuka[2][0]||x == idouhuka[2][1]||x == idouhuka[2][2]||x == idouhuka[2][3]||x == idouhuka[2][4]||x == idouhuka[2][5]||x == idouhuka[2][6]||x == idouhuka[2][7]||x == idouhuka[2][8]||x == idouhuka[2][9])i=2;
		//	System.out.print("case 170 " +i+ " ");
			break;
		case 240:
			
			if(x == zibun[3][0]||x == zibun[3][1]||x == zibun[3][2]||x == zibun[3][3]||x == zibun[3][4]||x == zibun[3][5]||x == zibun[3][6]||x == zibun[3][7]||x == zibun[3][8]||x == zibun[3][9])i=1;
			else if(x == idouhuka[3][0]||x == idouhuka[3][1]||x == idouhuka[3][2]||x == idouhuka[3][3]||x == idouhuka[3][4]||x == idouhuka[3][5]||x == idouhuka[3][6]||x == idouhuka[3][7]||x == idouhuka[3][8]||x == idouhuka[3][9])i=2;
		//	System.out.print("case 240 " +i+ " ");
			break;
		case 310:
			
			if(x == zibun[4][0]||x == zibun[4][1]||x == zibun[4][2]||x == zibun[4][3]||x == zibun[4][4]||x == zibun[4][5]||x == zibun[4][6]||x == zibun[4][7]||x == zibun[4][8]||x == zibun[4][9])i=1;
			else if(x == idouhuka[4][0]||x == idouhuka[4][1]||x == idouhuka[4][2]||x == idouhuka[4][3]||x == idouhuka[4][4]||x == idouhuka[4][5]||x == idouhuka[4][6]||x == idouhuka[4][7]||x == idouhuka[4][8]||x == idouhuka[4][9])i=2;
		//	System.out.print("case 310 " +i+ " ");
			break;
		case 380:
			
			if(x == zibun[5][0]||x == zibun[5][1]||x == zibun[5][2]||x == zibun[5][3]||x == zibun[5][4]||x == zibun[5][5]||x == zibun[5][6]||x == zibun[5][7]||x == zibun[5][8]||x == zibun[5][9])i=1;
			else if(x == idouhuka[5][0]||x == idouhuka[5][1]||x == idouhuka[5][2]||x == idouhuka[5][3]||x == idouhuka[5][4]||x == idouhuka[5][5]||x == idouhuka[5][6]||x == idouhuka[5][7]||x == idouhuka[5][8]||x == idouhuka[5][9])i=2;
		//	System.out.print("case 380 " +i+ " ");
			break;
		case 450:
			
			if(x == zibun[6][0]||x == zibun[6][1]||x == zibun[6][2]||x == zibun[6][3]||x == zibun[6][4]||x == zibun[6][5]||x == zibun[6][6]||x == zibun[6][7]||x == zibun[6][8]||x == zibun[6][9])i=1;
			else if(x == idouhuka[6][0]||x == idouhuka[6][1]||x == idouhuka[6][2]||x == idouhuka[6][3]||x == idouhuka[6][4]||x == idouhuka[6][5]||x == idouhuka[6][6]||x == idouhuka[6][7]||x == idouhuka[6][8]||x == idouhuka[6][9])i=2;
		//	System.out.print("case 450 " +i+ " ");
			break;
		case 520:
			
			if(x == zibun[7][0]||x == zibun[7][1]||x == zibun[7][2]||x == zibun[7][3]||x == zibun[7][4]||x == zibun[7][5]||x == zibun[7][6]||x == zibun[7][7]||x == zibun[7][8]||x == zibun[7][9])i=1;
			else if(x == idouhuka[7][0]||x == idouhuka[7][1]||x == idouhuka[7][2]||x == idouhuka[7][3]||x == idouhuka[7][4]||x == idouhuka[7][5]||x == idouhuka[7][6]||x == idouhuka[7][7]||x == idouhuka[7][8]||x == idouhuka[7][9])i=2;
		//	System.out.print("case 520 " +i+ " ");
			break;
		case 590:
			
			if(x == zibun[8][0]||x == zibun[8][1]||x == zibun[8][2]||x == zibun[8][3]||x == zibun[8][4]||x == zibun[8][5]||x == zibun[8][6]||x == zibun[8][7]||x == zibun[8][8]||x == zibun[8][9])i=1;
			else if(x == idouhuka[8][0]||x == idouhuka[8][1]||x == idouhuka[8][2]||x == idouhuka[8][3]||x == idouhuka[8][4]||x == idouhuka[8][5]||x == idouhuka[8][6]||x == idouhuka[8][7]||x == idouhuka[8][8]||x == idouhuka[8][9])i=2;
		//	System.out.print("case 590 " +i+ " ");
			break;
		case 660:
			
			if(x == zibun[9][0]||x == zibun[9][1]||x == zibun[9][2]||x == zibun[9][3]||x == zibun[9][4]||x == zibun[9][5]||x == zibun[9][6]||x == zibun[9][7]||x == zibun[9][8]||x == zibun[9][9])i=1;
			else if(x == idouhuka[9][0]||x == idouhuka[9][1]||x == idouhuka[9][2]||x == idouhuka[9][3]||x == idouhuka[9][4]||x == idouhuka[9][5]||x == idouhuka[9][6]||x == idouhuka[9][7]||x == idouhuka[9][8]||x == idouhuka[9][9])i=2;
		//	System.out.print("case 660 " +i+ " ");
			break;
		
		}
	//	System.out.println(i);
		
		
		return i;
	}

}

