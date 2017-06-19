package com.company;

public class Main {
    static int iLength;
    static int jLength;
    static int inArow;
    static Room[][] array;
    static Room[][] verticalTrue = new Room[][] {  {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
    static Room[][] noInfection = new Room[][] { {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
    static Room[][] test = new Room[][] {
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };

    static Room[][] horizontalTrue = new Room[][] { {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },{new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }, {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) } };
    static Room[][] GennaEasy = new Room[][] { {new Room(false),new Room(true),new Room(false),new Room(false),new Room(false),new Room(false)},{new Room(true),new Room(false),new Room(false),new Room(false),new Room(false),new Room(false)},{new Room(true),new Room(false),new Room(false),new Room(true),new Room(false),new Room(true)},{new Room(false),new Room(true),new Room(false),new Room(true),new Room(true),new Room(true)}, {new Room(false),new Room(false),new Room(false),new Room(false),new Room(false),new Room(false)} };
    static boolean fBreak;
    static boolean outBreak;
    public static void main(String[] args) {
	// write your code here
        inArow = 0;
        boolean OUTBREAK = isOutbreak(GennaEasy);
                System.out.print(OUTBREAK);
    }
    public static boolean isOutbreak(Room[][] floor) {
        outBreak = false;
        array = floor;
        fBreak = false;
        iLength = floor.length;
        jLength = floor[0].length;
        for (int i = 0; i < iLength; i++) {
            for(int j = 0; j< jLength; j++){
                inArow = 0;
                if(floor[i][j].isInfected) {
                    System.out.print("X");
                }
                else {
                    System.out.print("O");
                }
             int x = checkNeigbhors(inArow,i,j);
            }
            System.out.println();
        }
        return fBreak;
    }
    public static class Room {
        public final boolean isInfected;
        public boolean visited = false;
        Room(boolean infected){
            isInfected = infected;
        }
    }
    public static int checkNeigbhors(int newPos, int i, int j){
        int pos = newPos;
        if(array[i][j].isInfected && !array[i][j].visited) {
            pos++;
            array[i][j].visited =true;
            if(pos == 5){
                if(array[i][j].isInfected)
                    fBreak = true;
            }
        }
        else {
            if (!array[i][j].visited) {
                array[i][j].visited = true;
            }
            return pos;
        }
            if (array[i][j].isInfected) {
                if (j + 1 < jLength && !outBreak && !array[i][j+1].visited){
                    pos = checkNeigbhors(pos, i, j+1);
                }
                if(i - 1 > -1 && !outBreak && !array[i-1][j].visited){
                        pos = checkNeigbhors(pos, i-1,j);
                }
                if (j - 1 > -1 && !outBreak && !array[i][j-1].visited){
                    pos = checkNeigbhors(pos, i, j-1);
                }
                if (i + 1 < iLength && !outBreak && !array[i+1][j].visited){
                    pos = checkNeigbhors(pos, i+1,j);
                }
            }
        return pos;
    }
}
