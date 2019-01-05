package Load;

import java.io.IOException;

public class LoadSpace {
	public static Space[][] space;
	
	public static void  LoadSpaceTree() {
			space = new Space[5][9];
			space[0][0] = new Space(100,170,67,227,127,287);
			space[0][1] = new Space(260,170,227,385,127,287);
			space[0][2] = new Space(420,170,385,555,127,287);
			space[0][3] = new Space(580,170,555,713,127,287);
			space[0][4] = new Space(740,170,713,861,127,287);
			space[0][5] = new Space(900,170,861,1035,127,287);
			space[0][6] = new Space(1060,170,1035,1177,127,287);
			space[0][7] = new Space(1220,170,1177,1339,127,287);
			space[0][8] = new Space(1380,170,1339,1520,127,287);
			
			space[1][0] = new Space(100,330,67,227,287,447);
			space[1][1] = new Space(260,330,227,385,287,447);
			space[1][2] = new Space(420,330,385,555,287,447);
			space[1][3] = new Space(580,330,555,713,287,447);
			space[1][4] = new Space(740,330,713,861,287,447);
			space[1][5] = new Space(900,330,861,1035,287,447);
			space[1][6] = new Space(1060,330,1035,1177,287,447);
			space[1][7] = new Space(1220,330,1177,1339,287,447);
			space[1][8] = new Space(1380,330,1339,1520,287,447);
			
			space[2][0] = new Space(100,490,67,227,447,625);
			space[2][1] = new Space(260,490,227,385,447,625);
			space[2][2] = new Space(420,490,385,555,447,625);
			space[2][3] = new Space(580,490,555,713,447,625);
			space[2][4] = new Space(740,490,713,861,447,625);
			space[2][5] = new Space(900,490,861,1035,447,625);
			space[2][6] = new Space(1060,490,1035,1177,447,625);
			space[2][7] = new Space(1220,490,1177,1339,447,625);
			space[2][8] = new Space(1380,490,1339,1520,447,625);
			
			space[3][0] = new Space(100,650,67,227,625,775);
			space[3][1] = new Space(260,650,227,385,625,775);
			space[3][2] = new Space(420,650,385,555,625,775);
			space[3][3] = new Space(580,650,555,713,625,775);
			space[3][4] = new Space(740,650,713,861,625,775);
			space[3][5] = new Space(900,650,861,1035,625,775);
			space[3][6] = new Space(1060,650,1035,1177,625,775);
			space[3][7] = new Space(1220,650,1177,1339,625,775);
			space[3][8] = new Space(1380,650,1339,1520,625,775);
			
			space[4][0] = new Space(100,810,67,227,775,945);
			space[4][1] = new Space(260,810,227,385,775,945);
			space[4][2] = new Space(420,810,385,555,775,945);
			space[4][3] = new Space(580,810,555,713,775,945);
			space[4][4] = new Space(740,810,713,861,775,945);
			space[4][5] = new Space(900,810,861,1035,775,945);
			space[4][6] = new Space(1060,810,1035,1177,775,945);
			space[4][7] = new Space(1220,810,1177,1339,775,945);
			space[4][8] = new Space(1380,810,1339,1520,775,945);
			
			
			
					
	}
}
