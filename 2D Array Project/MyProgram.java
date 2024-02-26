//add your information, date, and description here

public class MyProgram {

    public static void main(String[] args) {
        //Create a 2D array called matrix that is 5 x 5 
        //Fill the 2D array with random numbers 1 - 15
        int[][] matrix = new int[5][5];
        for(int j =0; j < matrix.length; j++){
            for(int k = 0; k < matrix[0].length; k++){
                matrix[j][k] = (int)(Math.random()*15)+1;
            }
        }
        
        System.out.println("Original Matrix");
        //Write a print2dArray method after the main section that will traverse 
        //the entire array and print each row on separate lines

        //call the print2dArray method to print the original matrix
        print2dArray(matrix);
        System.out.println();
        System.out.println("Sum of each Row:");
       //1. Write a code segment that prints the sum of each row using For loops
        int sum = 0;
        for(int q=0; q < matrix.length; q++){
            for(int w=0; w < matrix[0].length; w++){
                sum = sum + matrix[q][w];
            }
            System.out.println("Row " + q + " Sum: " + sum);
            sum = 0;
        }   


        System.out.println();
       
        //2. Write a code segment that prints the sum of each column using For loops
        System.out.println("Sum of each Column");
        int sum1 = 0;
        for(int co=0; co < matrix[0].length; co++){
            for(int ro=0; ro < matrix.length; ro++){
                sum1 = sum1 + matrix[ro][co];
            }
            System.out.println("Column " + co + " Sum: " + sum1);
            sum1 =0;
        }


        System.out.println();
       
       //3.  Write a code segment that adds & displays the total sum of all the integer
       //    elements AROUND THE BORDER of a 2D array using For loops
       sum = 0;
       for(int row=0; row < matrix.length; row++){
           for(int col=0; col < matrix[0].length; col++){
               if((row == 0)||(col ==0)||(row ==matrix.length-1)||(col==matrix.length-1)){
                   sum = sum + matrix[row][col];
               }

           }
       }
       System.out.println("Sum around the border: " + sum);
       // This is a foolish, brute force attempt!
        //print specified output for part 3 as shown in example      
              
       // 4. Write a code segment that adds & prints the sum of the elements
        // INSIDE THE BORDER of a 2D array using For loops
       sum = 0;
       for(int row=0; row < matrix.length; row++){
           for(int col=0; col < matrix[0].length; col++){
               if(!(row == 0)||!(col ==0)||!(row ==matrix.length-1)||!(col==matrix.length-1)){
                   sum = sum + matrix[row][col];
               }

           }
       }
       System.out.println("Sum inside the border: " + sum);
        
        

	  //print specified output for part 4 as shown in example      

        // 5. Write a code segment that adds & prints the sum of the elements 
        // that are even numbers.
            
        sum = 0;
        for(int q=0; q < matrix.length; q++){
            for(int w=0; w < matrix[0].length; w++){
                if(matrix[q][w]%2==0){
                    sum = sum + matrix[q][w];
                }
            }
        }  
        System.out.println("The sum of the even elements: " + sum);
	  //print specified output for part 5 as shown in example      
        // 6. Write a code segment that adds & prints the sum of the elements that
        // are found in rows with even indices (i.e. rows 0, 2, 4, etc.) or columns with 
        // odd indices (i.e. columns 1, 3, 5, etc.)
        sum = 0;
        for(int q=0; q < matrix.length; q++){
            for(int w=0; w < matrix[0].length; w++){
                if((q%2==0)||(!(w%2==0))){
                    sum = sum + matrix[q][w];
                }
            }
        } 
        System.out.println("The sum of the elements whose row is even or column is odd is: " + sum);
 
        

	  //print specified output for part 6 as shown in example      

        System.out.println();

        // 7. Swap the values of column 1 and column 3 using For Loops
        System.out.println("Swapped Columns 1 and 3: ");
        for(int roww=0; roww < matrix.length; roww++){
           for(int coll=0; coll < matrix[0].length; coll++){
                if(coll == 1){
                    System.out.print("\t" + matrix[roww][3]);
                }
                else if(coll == 3){
                    System.out.print("\t" + matrix[roww][1]);
                }
                else{
                    System.out.print("\t" + matrix[roww][coll]);
                }
           }
           System.out.println();
       }
       

	
	  //print using the print2dArray methon
	   System.out.println();



       // 8. Search the matrix for a random number 1 - 15 and assign it to variable num, 
       // count then print the number of occurrences of num that are in the matrix. 
       int num = (int)(Math.random()*15)+1;
       int count =0; 
       for(int row=0; row < matrix.length; row++){
           for(int col=0; col < matrix[0].length; col++){
               if (num == matrix[row][col]){
                   count++;
               }
           }
       }
	  //print specified output for part 8 as shown in example      
	   System.out.println("Number of occurrences of the number " + num + " is: " + count);
    }// end of main method
    
    // Write method to print a 2D array as rows and columns
    // add a tab between each element using  + "\t" inside the print statement
    public static void print2dArray(int[][] array)
    {
	//your code goes here
	    for(int[] arr : array){
	        for(int a : arr){
	            if(a-9 > 0){
	                System.out.print(a + "\t");
	            }
	            else{
	                System.out.print(a + "\t");
	            }
	        }
	        System.out.println();
	    }
    } // end of print2dArray method
}// end of Main class