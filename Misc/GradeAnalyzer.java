import java.util.ArrayList;
class GradeAnalyzer{
  public GradeAnalyzer(){
    
  }
 /* public int getAverage(ArrayList<Integer> grades){
    if(grades.size()<1){
      System.out.println("Error: Less than one.");
        return 0;
    }else{
      int sum=0;
      for(int grade:ArrayList<Integer> grades){
        sum+=grade;
      }
      int average=sum/grades.size();
        System.out.println(average);
      return average;
    }
  }*/
  //somethings wrong with this method
    public static void main(String[] args){
      ArrayList<Integer> myClassroom=new ArrayList<Integer>();
      myClassroom.add(98);
      myClassroom.add(92);
      myClassroom.add(88);
      myClassroom.add(75);
	myClassroom.add(61);
      myClassroom.add(89);
      myClassroom.add(95);
      myClassroom.add(85);
   // myClassroom.getAverage();
  }
}