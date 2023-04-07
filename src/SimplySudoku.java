import java.util.*;
import java.io.*;

public class SimplySudoku {

    private static boolean checkRow(int[][] grid, int val, int row)
    {
        for(int i = 0; i < 9; i++)
            if(grid[row][i] == val)
                return false;
        return true;
    }

    private static boolean checkCol(int[][] grid, int val, int col)
    {
        for(int i = 0; i < 9; i++)
            if(grid[i][col] == val)
                return false;
        return true;
    }

    private static boolean checkBox(int[][] grid, int val, int box)
    {
        for(int i = 0; i < 9; i++)
            if(grid[box / 3 * 3 + i / 3][box % 3 * 3 + i % 3] == val)
                return false;
        return true;
    }

    private static void genArr(boolean[][][] pos, int[][] grid)
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                for(int v = 0; v < 9; v++)
                {
                    pos[v][i][j] = checkRow(grid, v + 1, i) && checkCol(grid, v + 1, j) && checkBox(grid, v + 1, i / 3 * 3 + j / 3);
                }
            }
        }
    }

    private static boolean uniqRow(int[][] grid, boolean[][][] pos, int row)
    {
        for(int k = 0; k < 9; k++)
        {
            int loc = 0; int count = 0;
            for(int i = 0; i < 9; i++)
            {
                if(grid[row][i] == 0 && pos[k][row][i]) {
                    loc = i; count++;
                }
            }
            if(count == 1)
            {
                grid[row][loc] = k+1;
                return true;
            }
        }
        return false;
    }

    private static boolean uniqCol(int[][] grid, boolean[][][] pos, int col)
    {
        for(int k = 0; k < 9; k++)
        {
            int loc = 0; int count = 0;
            for(int i = 0; i < 9; i++)
            {
                if(grid[i][col] == 0 && pos[k][i][col]) {
                    loc = i; count++;
                }
            }
            if(count == 1)
            {
                grid[loc][col] = k+1;
                return true;
            }
        }
        return false;
    }

    private static boolean uniqBox(int[][] grid, boolean[][][] pos, int box)
    {
        for(int k = 0; k < 9; k++)
        {
            int loc = 0; int count = 0;
            for(int i = 0; i < 9; i++)
            {
                if(grid[box / 3 * 3 + i / 3][box % 3 * 3 + i % 3] == 0 && pos[k][box / 3 * 3 + i / 3][box % 3 * 3 + i % 3]) {
                    loc = i; count++;
                }
            }
            if(count == 1)
            {
                grid[box / 3 * 3 + loc / 3][box % 3 * 3 + loc % 3] = k+1;
                return true;
            }
        }
        return false;
    }

    private static boolean singVal(int[][] grid, boolean[][][] pos, int row, int col)
    {
        if(grid[row][col] != 0) return false;
        int count = 0; int loc = 0;
        for(int i = 0; i < 9; i++)
        {
            if(pos[i][row][col]) {
                count++; loc = i;
            }
        }
        if(count == 1)
        {
            grid[row][col] = loc + 1;
            return true;
        }
        return false;
    }

    private static boolean solve(int[][] grid, int count)
    {
        if(count == 81) return true;
        boolean[][][] pos = new boolean[9][9][9];
        genArr(pos, grid);
        for(int i = 0; i < 9; i++)
        {
            if(uniqRow(grid, pos, i)) return solve(grid, count + 1);
            if(uniqCol(grid, pos, i)) return solve(grid, count + 1);
            if(uniqBox(grid, pos, i)) return solve(grid, count + 1);
        }
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(singVal(grid, pos, i, j)) return solve(grid, count + 1);
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        //whao so comment
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = new int[9][9];
        int count = 0;
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if(grid[i][j] != 0) count++;
            }
        }
        boolean worked = solve(grid, count);
        System.out.println(worked ? "Easy" : "Not easy");
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++) {
                if(grid[i][j] == 0) System.out.print(". ");
                else System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}