package CollegeLab.OperatingSystem;

import java.util.Scanner;

public class Sjf {

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
            at[i]=0;
            System.out.println("p"+pid[i]+" BT: ");
            bt[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(bt[i]>bt[j]){
                    int t = bt[i]; bt[i]=bt[j]; bt[j]=t;

                    t=pid[i]; pid[i]=pid[j]; pid[j]=t;
                }
            }
        }

        ct[0]=bt[0];
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
}
