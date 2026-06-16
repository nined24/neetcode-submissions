class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> h = new HashSet<>(); 
        char temp = '.';
        for(int i=0;i<board.length;i++){
            h.removeAll(h);
            for(int j=0;j<board.length;j++){
                if(board[i][j]==temp){
                    
                    continue;
                }
                else{
                    
                    if(h.contains(board[i][j])){
                        return false;
                    }
                    else{
                        h.add(board[i][j]);
                    }
                }
            }
        }
        h.removeAll(h);

        for(int i=0;i<board.length;i++){
            h.removeAll(h);
            
            for(int j=0;j<board.length;j++){
                if(board[j][i]==temp){
                    continue;
                }
                else{
                    if(h.contains(board[j][i])){
                        System.out.print("long");
                        return false;
                    }
                    else{
                        h.add(board[j][i]);
                    }
                }
            }
        }

        h.removeAll(h);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                h.removeAll(h);
                for(int k=i*3;k<(i*3)+3;k++){
                    for(int l=j*3;l<(j*3)+3;l++){
                        System.out.println(k+" "+l);
                        // System.out.println(board[k][l]);
                        if(board[k][l]==temp){
                            continue;
                        }
                        else{
                            if(h.contains(board[k][l])){
                                
                                return false;
                            }
                            else{
                                // System.out.println("add "+board[k][l]);
                                h.add(board[k][l]);
                                // System.out.println(h);
                            }
                        }
                    }
                }
            }
        }
        System.out.print(h);
        return true;
    }
}
