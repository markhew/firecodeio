// java.util.* has been imported for this problem.
// You don't need any other imports.

/*
You're given a 2D board which contains an m x n matrix of chars - char[][] board. 
Write a method - printPaths that prints all possible paths from the top left cell to the bottom right cell. 
Your method should return an ArrayList of Strings, where each String represents a path with characters appended in the order of movement. 
You're only allowed to move down and right on the board. 
The order of String insertion in the ArrayList does not matter.
*/


public ArrayList<String> printPaths(char[][] board){
    ArrayList<String> paths = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    search(0,0, board, sb,paths);
    return paths;
}

public void search(int i, int j, char[][] board, StringBuilder sb, ArrayList out){
    int rows = board.length-1;
    int cols = board[0].length-1;
    //If method passes over the board, stop and return
    if(i > rows || j > cols)return;
    //Append current character to board
    sb.append(board[i][j]);
    //If the current character is the last cell, add it to the list of output arrays
    if(i==rows && j == cols){
        out.add(sb.toString());
        sb.deleteCharAt(sb.length()-1);
        return;
    }
    //Go to one cell below and right of the current cell
    search(i+1,j,board,sb,out);
    search(i,j+1,board,sb,out);
    sb.deleteCharAt(sb.length()-1);

}