import org.testng.annotations.Test;

public class Day2 {

    @Test
    public void test001() {
        System.out.println("Welcome to Day 2");
    }

    @Test
    public void test002() {
        printString("Hello World!");
        printString("true");
    }

    @Test
    public void test003() {
        printFullName("Aleksei", "Petrovski");
    }


    private void printString(String textToPrint){
        System.out.println(textToPrint);
    }

    private void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    @Test
    public void test004() {
        printString(true,"Some Text");
        printString(false,"Some another Text");
    }

    private void printString(Boolean isEnablePrint, String printValue){
        if(isEnablePrint) {
            System.out.println(printValue);
        } else {
            System.out.println("NOT TRUE");
        }

    }


    @Test
    public void test005() {
        printFirstLastName(true,"Ponnu","Sadanandan");
        printFirstLastName(false,"Ponnu","Sadanandan");
    }

    private void printFirstLastName(boolean isenablePrint, String firstName, String lastName) {
        if(isenablePrint){
            System.out.println(firstName+" "+lastName);
        }
    }

    @Test
    public void test006(){
        compareIntger(9);
        compareIntger(11);
    }

    public void compareIntger(int number){
        if (number>10){
            System.out.println("More");
        } else{
            System.out.println("Less");
        }


    }

    @Test
    public void test007() {
        twoInt(15,11);

    }
    public void twoInt(int a, int b) {
        if (a > b) {
            System.out.println("OK");
        }
    }


    @Test
    public void test008() {
       compareInt(20,30,10);
       compareInt(20,3,10);
    }

    private void compareInt(int a, int b, int c) {
        if(a>b){
            System.out.println(c);
        } else {
            System.out.println("Happy Saturday!!!!");
        }
    }

    @Test
    public void test009(){
        functionB(true,10, 5);
        functionB(false,10,20);
        functionB(true,10,20);
        functionB(false,20,10);

    }
    private void functionB (Boolean isEnabled, int a, int b){
        if (a>b){
            if (isEnabled) {
                System.out.println("Hello World!");
            }

        } else {
            System.out.println("Portnov computer school");
        }
    }

    @Test
    public void test010() {
        int[] array1 = {10,20,30,40};
        System.out.println(array1[3]);
    }

    @Test
    public void test011(){
        int[] array = {1,2,3,4,5,6};
        printIndex(array, 3);
        printIndex(array, 7);
    }
    private void printIndex(int array[], int index){
        System.out.println(array[index]);
    }


    @Test
    public void test012(){
        int[] array = {1,2,3,4,5,6};
        printSafeIndex(array, -1);
        printSafeIndex(array, 6);
        printSafeIndex(array, 5);
        printSafeIndex(array, 0);
    }
    private void printSafeIndex(int array[], int index) {
        if (index < array.length && index >= 0) {
            System.out.println(array[index]);
        } else {
            System.out.println("Out of array boundary");
        }
    }

    @Test
    public void test013() {
        int[] ar1 = {1,2,3,4,5,6};
        int[] ar2 = {1,2,3,4};
        compareSizeOfArrays(ar1, ar2);
    }

    private void compareSizeOfArrays (int array1[], int array2[]){
        if (array1.length > array2.length){
            System.out.println("First Array Is Greater");
        }
    }

    @Test
    public void test014() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    @Test
    public void test015() {
        int[] array1={1,2,3,4,5};
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }

    @Test
    public void test016()
    {
        int[] array1={1,2,3,4,5};
        multiplyArrayElements(array1,5);
    }

    private void multiplyArrayElements(int[] array1, int i) {
        for(int j=0;j<array1.length;j++)
        {
            System.out.println(array1[j]*i);
        }
    }


    @Test
    public void test017() {
        int[] array1 = {1, 2, 3, 4, 5};
        compareArrayElements(array1, 3);
    }

    private void compareArrayElements(int[] array1, int pivot) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < pivot) {
                System.out.println("Element in index " + i + " is lesser than pivot");
            } else {
                System.out.println("Element in index " + i + " is larger than pivot");
            }
        }
    }
    @Test
    public void test018(){
        int[] arr = {2,4,8,1,5};
        countNumbersLessThanPivot(arr,3);
    }
    private void countNumbersLessThanPivot(int[] array,int pivot){
        int count = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] < pivot){
                count++;
            }
        }
        System.out.println(count);

    }

    @Test
    public void test019() {
        int[] arr = {2, 4, 8, 1, 5};
        printRev(arr);
    }

    public void printRev(int[] arr1){
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);

        }
    }

    



















}


















