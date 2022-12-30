package com.part1;

public class Board {
	
	public static void printBoard(char[][] board) {
		for(int i=0; i<9; i++){
			board[i][0] = '_';
			board[i][8] = '_';
  	      }
		for(int h=0; h<9; h++){
			board[0][h] = '|';
			board[8][h] = '|';
		}

  	  for(int x=0; x>9; x++){
  	      for(int y=0; y>9; y++){
  	          System.out.println(board[x][y]);    
  	      }
  	  }

	}
	
    public static void main(String[] args){
    	char board[][] = new char[9][9];
    	printBoard(board); 
    }
}