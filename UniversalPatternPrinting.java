import java.util.Scanner;

public class UniversalPatternPrinting {
    public static void main(String[] args) {
        // The size of the alphabet is set by the matrix size which is given as input by the user
        System.out.print("Enter the size of the alphabet: ");
        Scanner s = new Scanner(System.in);

        // integer "n" is the variable that specifies the size of the matrix
        int n = s.nextInt(); //Consider n=5 for optimal size


        //For every letter to be printed it is assumed to be in the form of matrix and used two for loops which prints the stars in a manner called rows and columns//

// Here is the code to print "A"
        for (int i= 0; i <n; i++){
            for (int j= 0;j<n; j++){
                if (i==0 || j==0|| j==(n-1)||i==(n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");  // Space is given after each letter for easy identification


// Here is the code to print "B"

            for (int j= 0;j<n; j++){
                if (i==0||j==0||i==n/2||j==n-1||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "C"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==0||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

// Here is the code to print "D"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==0+1||i==n-1||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

// Here is the code to print "E"

            System.out.print("  ");

            for (int j= 0;j<n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
// Here is the code to print "F"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==0||((i==n/2)&&j<=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "G"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==0||i==n-1||((j==n-1)&&(i>n/2))||((i==n/2)&&(j>n/2))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "H"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||i==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "I"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||i==n-1||j==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "J"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==n/2||(i==n-1)&& j<n/2||j==0&&i==n-2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "K"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==((n/2)-1)||((i+j==n-1)&&j>=n/2)||(i==j && j>=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "L"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==n-1||j==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "M"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||((i+j==n-1)&&j>=n/2)||(i==j && j<=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "N"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||((i==j))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "O"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||i==0||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "P"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||((j==n-1)&&i<=n/2)||i==n/2||i==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "Q"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0 && (j<=((3*n)/4))||j==0 && (i<=((3*n)/4))||i==((3*n)/4) && j<=((3*n)/4)||j==((3*n)/4) && (i<=((3*n)/4))||(i==j&&j>=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "R"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||((j==n-1)&&i<=n/2)||i==n/2||i==0||(i==j&&j>=n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "S"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==0&&i<n/2||i==n/2||j==n-1&&i>n/2||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "T"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||j==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "U"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==n-1||j==0||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "V"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==n/2&&i==n-1||(i==0&&j==0)||(i==0&&j==n-1) ||j==((3*n)/4)&&i==n/2||j==n/4&&i==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "W"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (j==0||j==n-1||(i+j==n-1)&&j<=n/2||(i==j)&&j>n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "X"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==j||j+i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "Y"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==j&&j<=n/2||j+i==n-1&&j>n/2||j==n/2&&i>n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
// Here is the code to print "Z"

            System.out.print("  ");

            for (int j= 0;j<n; j++){
                if (i==0||i==n-1||i+j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
