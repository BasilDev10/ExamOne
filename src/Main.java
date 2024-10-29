import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        QuizOne();
        QuizTwo();
        QuizThree();
        QuizFour();
        QuizFive();

    }
    public static void QuizOne(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter first number :");
        numbers.add(input.nextInt());
        System.out.println("Enter second number :");
        numbers.add(input.nextInt());
        System.out.println("Enter third number :");
        numbers.add(input.nextInt());
        int largest = -999999999;

        for(int item: numbers){
            if(item > largest){
                largest = item;
            }
        }
        System.out.println("Largest number is : "+largest);
    }

    public static void QuizTwo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text :");
        String text = input.nextLine();
        System.out.println("Enter index want to print");
        int index = input.nextInt();

        if(index > text.length()-1){
            System.out.println("index out of bounds");
            return;
        }
        System.out.println("Character is : "+text.charAt(index));

    }
    public static void QuizThree(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput = "";
        do{
            System.out.println("Enter number or type out to exit:");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }

            numbers.add(Integer.parseInt(userInput));

        }while (true);
        System.out.println("Total sum number : "+sumNumbers(numbers));

    }
    public static int sumNumbers(ArrayList<Integer> numbers){
        int sum = 0;
        for(int item: numbers){
            sum += item;
        }
        return sum;
    }
    public static void QuizFour(){

        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];
        int i =0;

        do {
            System.out.println("Enter number ;");
            numbers[i] = input.nextInt();
            i++;
        }while (i < numbers.length);

        isPositiveOrNegative(numbers);

    }
    public static void isPositiveOrNegative(int [] numbers){
        for(int item: numbers){
            if(item == 0){
                System.out.println(item + " is Zero");
            }else if(item > 0){
                System.out.println(item + " is Positive");
            }else{
                System.out.println(item + " is Negative");
            }
        }
    }
    public static void QuizFive(){

        Scanner input = new Scanner(System.in);

        String [] texts = new String[4];
        String userInput = "";


        int i = 0;
        do {
            System.out.println("Enter text:");
            userInput = input.nextLine();
            texts[i] =userInput;
            i++;
        }while (i < texts.length);

        System.out.println("Shortest word is "+findShortestWord(texts));
    }
    public static String findShortestWord(String [] texts){
        String shortestWord = "";

        for (String item: texts){
            if(item.length() < shortestWord.length()|| shortestWord.length() ==0){
                shortestWord = item;
            }
        }
        return shortestWord;
    }
}