import java.util.*;

public class CaloriesFromFat {

    public static int[] gr = {9, 4, 4, 4, 7};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            double tCal = 0;
            double calF = 0;
            boolean end = true;
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.equals("-")) break;
                end = false;
                StringTokenizer st = new StringTokenizer(line);
                int count = 0;
                double[] calCounts = new double[5];
                int cals = 0; int per = 0;
                while(st.hasMoreTokens())
                {
                    String data = st.nextToken();
                    int val = Integer.parseInt(data.substring(0, data.length() - 1));
                    char type = data.charAt(data.length() - 1);
                    switch(type)
                    {
                        case 'g':
                            calCounts[count] = gr[count] * val;
                            cals += calCounts[count];
                            break;
                        case 'C':
                            calCounts[count] = val;
                            cals += val;
                            break;
                        case '%':
                            calCounts[count] = -val/100.0;
                            per += val;
                            break;
                    }
                    count++;
                }
                double total = cals/(1 - per/100.0);
                for(int i = 0; i < 5; i++) if(calCounts[i] < 0) calCounts[i] = Math.abs(calCounts[i] * total);
                for(int i = 0; i < 5; i++) tCal += calCounts[i];
                calF += calCounts[0];
            }
            if(end) break;
            System.out.println(Math.round(calF/tCal * 100) + "%");
        }
    }
}
