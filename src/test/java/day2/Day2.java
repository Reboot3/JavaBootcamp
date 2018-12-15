package day2;

import day2.Dog;
import day2.Point;
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

    @Test
    public void test020() throws Exception {
        int i = 0;

        for (;i < 5;) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void test021() throws Exception {
        boolean elementIsNotVisible = true;

        int i = 0;

        while (elementIsNotVisible && i < 100) {
            System.out.println("Element is still NOT VISIBLE");
            i++;

//            if(i > 100){
//                elementIsNotVisible = false;
//            }

        }
    }

    @Test
    public void test022() throws Exception {
        int[] integerArray = {2, 0, 1, 3};
        printArray(integerArray);
    }

    @Test
    public void test023() throws Exception {
        String[] arrayOfStrings = {"string1", "string2", "string3"};

        for (String eachElement : arrayOfStrings) {
            System.out.println(eachElement);
        }
    }

    @Test
    public void test024() throws Exception {
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }

    @Test
    public void test025() throws Exception {

        String myString1 = "Value1";
        String myString2 = "Value2";

        String result = "";
        result = combineTwoStrings(myString1, myString2);
        myPrint(result);
    }

    private void myPrint(String result) {
        System.out.println(result);
    }

    private String combineTwoStrings(String myString1, String myString2) {
        String result;
        result = myString1 + myString2;
        return result;
    }

    @Test
    public void test026() throws Exception {
        int number1 = 10;
        int number2 = 20;

        int sum =0;
        System.out.println(sum);
        sum = mySum(number1, number2);
        System.out.println(sum);
    }

    private int mySum(int number1, int number2) {
        return number1+number2;
    }

    // write a method with 2 parameters: array and integer, method returns element equal to parameter


    @Test
    public void test027() throws Exception {
        int[] arr1 = {1,2,4,5};
        int returnElement=returnElement(arr1,3);
        System.out.println(returnElement);

    }

    private int returnElement(int[] arr1, int number) {
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==number){
                return arr1[i];
            }
        }
        return 0;
    }

    //input: 2 Integer arrays
    //return combination of 2 arrays


    @Test
    public void test028() throws Exception {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] result = joinTwoArrays(array1, array2);
        printArray(result);

    }

    public void printArray(int[] inputArray) {
        for (int number : inputArray) {
            System.out.println(number);
        }
    }

    private int[] joinTwoArrays(int[] array1, int[] array2) {
        int newSize = array1.length + array2.length;

        int[] result = new int[newSize];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            result[array1.length + j] = array2[j];
        }

        return result;
    }

    @Test
    public void test029() throws Exception {
        int[]  input = {123, 4565, 6356};

       // traverseAndFind(input);
       // ifElementIs5Print();
    }

    @Test
    public void test030() throws Exception {
        Point myPointObject = new Point();

        String name = "Buddy";
        int age = 5;
        String breed = "bulldog";

        Dog myPetBuddy = new Dog(name, age, breed);
        Dog myPetBruno = new Dog("Bruno", 6, "lab");

        System.out.println(myPetBuddy.age);

        System.out.println("myPetBruno object has a field name with value:" + myPetBruno.name);

        myPetBruno.bark();

        myPetBruno.eat("dog food");

        myPetBruno.eat("candy");
    }

    @Test
    public void test031() throws Exception {

        Dog.run();

    }

    @Test
    public void test032() throws Exception {
        User user = new User();


    }
}