package CollegeLab.OperatingSystem;

import java.util.Scanner;

public class Fcfs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of processes :");
        int n = sc.nextInt();

        int []pid = new int[n];
        int[]at = new int[n];
        int[]bt = new int[n];
        int[]ct = new int[n];
        int[]tat = new int[n];
        int[]wt = new int[n];

        System.out.println("Enter burst time for each processes");
        for(int i=0;i<n;i++){
            pid[i]=i+1;
            at[i]=i+1;
            System.out.println("Burst time for p"+pid[i]+" : ");
            bt[i]=sc.nextInt();
        }
        ct[0]=at[0]+bt[0];
        for(int i=1;i<n;i++){
            ct[i]=ct[i-1]+bt[i];
        }
        for(int i=0;i<n;i++){
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
        }

        System.out.println("\nP\tAT\tBt\tCT\tTAT\tWT");
        for(int i=0;i<n;i++){
            System.out.println("p"+pid[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
        }
    }



    //Output :
    //enter the number of processes :
    //3
    //Enter burst time for each processes
    //Burst time for p1 :
    //5
    //Burst time for p2 :
    //3
    //Burst time for p3 :
    //8
    //
    //P	AT	Bt	CT	TAT	WT
    //p1	1	5	6	5	0
    //p2	2	3	9	7	4
    //p3	3	8	17	14	6
}
