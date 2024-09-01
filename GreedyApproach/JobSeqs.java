// package GreedyApproach;

// import java.util.ArrayList;
// import java.util.Collection;

// import javax.print.attribute.standard.JobName;

// public class JobSeqs {
//     static class Job{
//         int id;
//         int deadline;
//         int profit;
//         Job(int i,int d,int p){
//             id=i;
//             profit=p;
//             deadline=d;
//         }
//     }
//     public static void main(String[] args) {
//         int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
//         ArrayList<job> jobs= new ArrayList<>();

//         for(int i=0;i<jobsInfo.length;i++){
//             jobs.add(new Job(i, jobsInfo[i][0],jobsInfo[i][1]));
//         }
//         Collection.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit);
//     }
// }
