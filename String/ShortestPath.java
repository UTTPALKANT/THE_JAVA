package String;

public class ShortestPath {
    // fUNCTION declare 
    public static float getSortestPath(String path){
        // float x=0;
        // float y=0;
        // float N=0;
        // float S=0;
        // float E=0;
        // float W=0;
       // float x,y=0; //Can't
          float x=0,y=0;// here initialize the folling value!
        for(int i=0;i<path.length();i++){
            float dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
                
            }
            else if (dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        float x2=x*x,y2=y*y;
        float displacement= (float)Math.sqrt(x2+y2);
        return displacement;
    }
    public static void main(String args[]){
        String  path = "WNEENESENNN"; // O/P=5.0;
        //String path ="NS";   //OUTPUT =0.0;
        System.out.println(getSortestPath(path));
    }
    
}
