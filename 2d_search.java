class Solution {
    public boolean exist(char[][] board, String word) {
       
      
      int soltracker[][]=new int [board.length][board[0].length];
      
      for(int i=0;i<board.length;i++)
      {
        for(int j=0;j<board[i].length;j++)
        {
         
          if(board[i][j]==word.charAt(0))
            {
              if(this.isFind(board,word,i,j,0,soltracker))
                return true;
            }
        }
      }

     return false;
      
   
        
    }
  
public boolean isValid(char board[][],String word,int x,int y,int z)
  {
      if(x>=0 && y>=0 && x<board.length&&y<board[0].length && board[x][y]==word.charAt(z))
        return true;

      return false;
  }
 public boolean isFind( char board[][],String word,int x,int y,int z,int sol[][])
    {
      if(z==word.length())
      {
        return true;
      }

      
        if(isValid( board, word, x,y,z))
        {
          if(sol[x][y]==1)
               return false;

            else
            {
              sol[x][y]=1;

              z+=1;

              if(isFind(board,word,x+1,y,z,sol))
              {
                return true;
              }
                if(isFind(board,word,x-1,y,z,sol))
              {
                return true;
              }
                if(isFind(board,word,x,y+1,z,sol))
              {
                return true;
              }
                if(isFind(board,word,x,y-1,z,sol))
              {
                return true;
              }
            }
          
          
          sol[x][y]=0;
        }
     
        return false;
      
    }
  

}