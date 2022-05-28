// HashMap<String, ArrayList<String>> requests = new HashMap<>();
// requests.put(
//     "ada", new ArrayList<>(Arrays.asList(
//         new String[] {"mon", "tue", "wed", "fri", "sat", "sun"}
//     ))
// );
// requests.put(
//     "emma", new ArrayList<>(Arrays.asList(
//         new String[] {"tue", "wed", "thu", "sun"}
//     ))
// );
// requests.put(
//     "remy", new ArrayList<>(Arrays.asList(
//         new String[] {"mon", "sat"}
//     ))
// );
// requests.put(
//     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
// );
// ChefScheduler.schedulable(requests);

// This call to schedulable should return true. Monday has been requested off by two chefs, for example, 
// but Emma and Zach can cover. No chef will be overworked. Here is a possible schedule (all shifts are 8 hours):

// Monday    : Emma, Zach
// Tuesday   : Zach, Remy
// Wednesday : Zach, Remy
// Thursday  : Remy, Ada
// Friday    : Remy, Emma
// Saturday  : Emma, Zach
// Sunday    : Zach, Remy

// This call to schedulable should return false because Zach will be unable to cover Sunday alone.




// Example 2
// HashMap<String, ArrayList<String>> requests = new HashMap<>();
// requests.put(
//     "emma", new ArrayList<>(Arrays.asList(
//         new String[] {"sun"}
//     ))
// );
// requests.put(
//     "remy", new ArrayList<>(Arrays.asList(
//         new String[] {"sun"}
//     ))
// );
// requests.put(
//     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
// );
// ChefScheduler.schedulable(requests);




// Example 3
// HashMap<String, ArrayList<String>> requests = new HashMap<>();
// requests.put(
//     "ada", new ArrayList<>(Arrays.asList(
//         new String[] {"mon", "tue", "wed", "thu", "fri", "sat"}
//     ))
// );
// requests.put(
//     "emma", new ArrayList<>(Arrays.asList(
//         new String[] {"tue", "wed", "thu", "sun"}
//     ))
// );
// requests.put(
//     "remy", new ArrayList<>(Arrays.asList(
//         new String[] {"mon", "fri", "sun"}
//     ))
// );
// requests.put(
//     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
// );
// ChefScheduler.schedulable(requests);

// This call to schedulable should return false because Zach would have to
//  work in excess of 5 days in order to cover all needed shifts.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class ChefScheduler {

    public static void main(String[] args){
        System.out.println(schedulable());
    }

    public static boolean schedulable(
        HashMap<String, ArrayList<String>> requests
    ) {
        boolean flag = false;
        int maxHoursinWeek = 40;
        int maxWorkingDays = 5;
        int hoursPerDay = 8;
          
        ArrayList<String> weeks = new ArrayList<String>(); 
        weeks.add("mon");
        weeks.add("tue");
        weeks.add("wed");
        weeks.add("thu");
        weeks.add("fri");
        weeks.add("sat");
        weeks.add("sun");
        
        int count = 0;
      
        for(String week : weeks){
          for(String name : requests.keySet()) {
            ArrayList<String> freeDays = new ArrayList<String>();
            freeDays.add("mon");
            freeDays.add("tue");
            freeDays.add("wed");
            freeDays.add("thu");
            freeDays.add("fri");
            freeDays.add("sat");
            freeDays.add("sun");

             freeDays.removeAll(requests.get(name)); // removes the days for chef that are off
//              System.out.println(name + " " + freeDays);
//              System.out.println("Total working days for " + name + " is " + maxWorkingDays);
             
             int workingDays = freeDays.size();
             int totalHoursOfWork = workingDays*hoursPerDay;
            
//              if(totalHoursOfWork > 40){
//                 System.out.println(freeDays + " for " + name);
//              }
            
//              if(workingDays > maxWorkingDays){
//                return false;
//              }
             
             for(String free : freeDays){
                 if(week == free && count != 2){ // match every day with chef's free day
                    System.out.println(name + " will work on "+ free);
                    count++;
                    break;
                 }
             }
              
//              if(count >= 2){
//                flag = true;
//                count = 0;
//              }
          }
          
          //System.exit(-1);
        }
      
        return flag;
    }
}



// import java.util.*;
// import static org.junit.Assert.assertEquals;
// import org.junit.Test;


// public class ChefSchedulerTest {
    
//     @Test
//     public void itShouldWorkOnBasicExamples() {
//         HashMap<String, ArrayList<String>> requests = new HashMap<>();
//         requests.put(
//             "ada", new ArrayList<>(Arrays.asList(
//                 new String[] {"mon", "tue", "wed", "fri", "sat", "sun"}
//             ))
//         );
//         requests.put(
//             "emma", new ArrayList<>(Arrays.asList(
//                 new String[] {"tue", "wed", "thu", "sun"}
//             ))
//         );
//         requests.put(
//             "remy", new ArrayList<>(Arrays.asList(
//                 new String[] {"mon", "sat"}
//             ))
//         );
//         requests.put(
//             "zach", new ArrayList<>(Arrays.asList(new String[] {}))
//         );
//         assertEquals(
//             "it should work on a basic example.",
//             true, ChefScheduler.schedulable(requests)
//         );
        
//         requests.clear();
//         requests.put(
//             "emma", new ArrayList<>(Arrays.asList(
//                 new String[] {"sun"}
//             ))
//         );
//         requests.put(
//             "remy", new ArrayList<>(Arrays.asList(
//                 new String[] {"sun"}
//             ))
//         );
//         requests.put(
//             "zach", new ArrayList<>(Arrays.asList(new String[] {}))
//         );
//         assertEquals(
//             "it should handle an example where there isn't enough coverage on a day.",
//             false, ChefScheduler.schedulable(requests)
//         );
    
//         requests.clear();
//         requests.put(
//             "ada", new ArrayList<>(Arrays.asList(
//                 new String[] {"mon", "tue", "wed", "thu", "fri", "sat"}
//             ))
//         );
//         requests.put(
//             "emma", new ArrayList<>(Arrays.asList(
//                 new String[] {"tue", "wed", "thu", "sun"}
//             ))
//         );
//         requests.put(
//             "remy", new ArrayList<>(Arrays.asList(
//                 new String[] {"mon", "fri", "sun"}
//             ))
//         );
//         requests.put(
//             "zach", new ArrayList<>(Arrays.asList(new String[] {}))
//         );
//         assertEquals(
//             "it should handle an example where an employee would need to work in excess of 5 days.",
//             false, ChefScheduler.schedulable(requests)
//         );
    }
}