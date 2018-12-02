import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void test001() {
        System.out.println("Hello World!");
    }

    @Test
    public void test002() {
        System.out.println("Hello World!Dfmdkfmkmdfkfmksdmfksmf");
    }

    @Test
    public void test003() {
        int number;

        number = 4;

        System.out.println(number);
    }

    @Test
    public void test004() throws Exception {
        String myStringVarible = "String type variable value";

        System.out.println(myStringVarible);

    }

    public void myMethod(String myParameter){
        System.out.println(myParameter);
    }

    @Test
    public void test005() {
        myMethod("My message");
    }

    @Test
    public void test006() throws Exception {
        String myString1 = "Value from string1";
        String myString2 = "Value from string2";


        System.out.println(myString1 + "kjfnsknskdfjnvksdjfnv" + myString2 + 1231234545);
    }

    @Test
    public void test007() throws Exception {
        myAnotherMethod2Params("Message1", "Message2");
    }

    private void myAnotherMethod2Params(String message1, String message2) {
        System.out.println(message1 + " " + message2);
    }


    @Test
    public void test008() {
        int numberOfUsers = 5;
        int numberOfAccounts = 10;
        myOwnMethod(numberOfUsers, numberOfAccounts);
    }

    @Test
    public void test009() {
        int numberOfClassrooms = 2;
        int numberOfKitchens = 1;
        myOwnMethod(numberOfClassrooms, numberOfKitchens);
    }

    public void myOwnMethod(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    @Test
    public void test010() {
        myAnotherMethod2Params("a", "b");
        myOwnMethod(1,2);
    }

    @Test
    public void test011() {
        int variableA = 120;
        int variableB = 125;
        printParam1minusParam2(variableA, variableB);
    }

    public void printParam1minusParam2(int parameter1, int parameter2) {
        int result;
        result = parameter1 - parameter2;
        System.out.println(result);
    }

    //new test
    //new own method
    //3 params: 2 number params, 1 string param
    //print message with the addition of the numbers
    @Test
    public void test_3ParamsWithMessage() {
        String myMessageToPrint = "Here is the result:";
        int variableA = 123;
        int variableB = 126;

        printParam1plusParam2Message(myMessageToPrint, variableA, variableB);

    }

    private void printParam1plusParam2Message(String myMessageToPrint, int param1, int param2) {
        System.out.println(myMessageToPrint + " " + (param1 + param2));
    }

    @Test
    public void testLogicalOperations() throws Exception {
        boolean variable1 = true;
        boolean variable2 = false;

        printOR(variable1, variable2); // 1 + 0 = 1;
        printAND(variable1, variable2);// 1 * 0 = 0;

    }

    public void printOR(boolean variable1, boolean variable2) {
        boolean result;
        result = variable1 || variable2;
        System.out.println(result);
    }

    public void printAND(boolean variable1, boolean variable2) {
        boolean result;
        result = variable1 && variable2;
        System.out.println(result);
    }

    @Test
    public void test_ifStatement() {
        boolean elementIsVisible = true;

        boolean elementNotVisible = true;

        if(elementIsVisible){
            System.out.println("Click on the element");
        } else {
            System.out.println("Refresh the page OR wait OR fail the test");
        }

        if(elementNotVisible){
            System.out.println("Refresh the page OR wait OR fail the test");
        }
    }
}
