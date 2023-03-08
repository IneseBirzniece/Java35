package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine().toUpperCase().trim();
        //to upper case pārveido visu uz lielajiem burtiem, tad vieglāk salīdzināt, nav jutīgs uz burtiem
        //trim - ja kaut kur ir atstarpes pirms vai pēc, to noņem


        if (name.equals("BOB")){
            //aiz punnkta ir funkcionalitāte, equals salīdzina
            System.out.println("Your name is Bob");
        }else{
            System.out.println("Your name is not Bob");
        }

        if (name.equalsIgnoreCase("Bob")){
            //aiz punnkta ir funkcionalitāte, equals salīdzina
            System.out.println("Your name is Bob");
        }else{
            System.out.println("Your name is not Bob");
        }*/

/*
        //combine string values

        String text1 = "This is ";
        String text2 = "new text";
        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("In this string there are " + result.length() + " characters");
        //also count spaces

        //indexOf
        System.out.println(result.indexOf("is"));
        //looking for string "is" - rezultāts 2 (rāda 2. vietu, jo tur atrodas šis string T=0, h=1 is =2) jo this arī beidzas ar is
        //lai atrastu tikai vārdu " is " - rāda 4

        //charAt

        System.out.println(result.charAt(0));

        //replace
        String greetings = "This is holiday time. \nHave an nice holiday.";


        System.out.println(greetings.replaceAll("holiday", "Christmas"));
        System.out.println(greetings.replaceFirst("holiday", "Christmas"));

        //nav īsti opcijas kā aizvietot tikai otro vai pēdējo "holiday",
        // var skatīties viarākus vārdus kopā un aizvietot tos, ja nekur tekstā tie neatkārtojas tādā pašā secībā

        //substring
        String introduction = "Hello there! My name is Bob and I'm 35";
        System.out.println(introduction.substring(13));
        System.out.println(introduction.substring(6, 11));


        String bobsAge = introduction.substring(introduction.length()-2).trim();

        System.out.println(bobsAge);

        int bobsAgeAsInteger = Integer.parseInt(bobsAge);
        //ja ieliek 35 vietā 6 - vienu skaitli, tad nepārveidos uz skaitli; no atstarpes bobsAge var tikt vaļā ar .trim

        if (bobsAgeAsInteger >= 18){
            //nevar uz integer kā iepriekš, jo šis string ir non-primitive data type

            System.out.println("Bob is an adult");
        }else {
            System.out.println("Bob is a child");
        }*/



        //wrapper class
        int temp1 = 36;
        Integer temp2 = 36;
        //Integer - nonprimitive data type

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.56258456662";
        String booleanStrValue = "true";
        String longStrValue = "12554848454545";


        // no string uz data type
        int intValue = Integer.parseInt(intStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);




    }
}
