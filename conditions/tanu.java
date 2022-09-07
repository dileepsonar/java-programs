class Counter{
       public static void main(String[]args){
             byte[]seats={23,25,27,29,31,20,18,16,14,12,10,8,6,33,35,39,4,2};
              System.out.println("size of array"+seats.length); 
              for (byte s =0; s<18; s++)
              if (seats[s]<13){
              System.out.println(seats[s]+"is even");   
           }
              else{
              System.out.println(seats[s]+"is odd"); 
                     }
              }
       }


       


       