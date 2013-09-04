/* CoE 2SI4 - Assignment 1 */

import java.io.*;

public class Textstat
{
    public static void main(String[] args)
    {
        int i=0,numWords=0,numLines=0,numChars=0,numDigits=0;
        int numLetters=0,numSpaces=0,numOthers=0;
        char c; // for storing the character being read from the text file
        String name=args[0]; // stores the name of the input file being entered in the string for further use
        try
        {
            System.out.println("\n\nStatistics of file : "+name+"\n\n");
            BufferedReader in = new BufferedReader(new FileReader(args[0]));// associates a stream of characters for the input file
            while((i=in.read())>=0)	// reading the file till its end is reached
            {
                c=(char)i; // c contains the value of the character read from the file
                numChars++;// counts the number by incrementing itself by one each time
                if(Character.isWhitespace(c)) //returns true if character is a white-space(with carriage return & newline character)
                    numSpaces++; // counts the number of spaces by incrementing by 1
                
                if(Character.isLetter(c)) // returns true if character is a letter
                    numLetters++; // counts the number of letters by incrementing by 1
            	
                if(Character.isDigit(c)) // returns true if character is a digit
                    numDigits++; // counts the number of digits by incrementing by 1
                
                if(c =='\n') //checks whether the character is a newline character
                    numLines++; // if yes, counts the number of lines by incrementing by 1
                
                System.out.print(c);
            }
            
            numOthers=numChars-(numLetters+numDigits+numSpaces); // finds number of other characters using total number of characters
            numWords=numSpaces+1; // calculates number of words by adding 1 to the number of spaces
            numLines++;
            
            /* prints the number of letters, digits,white spaces,words,lines and other characters. */
            System.out.println("\n\nNumber of Characters= "+numChars);
            System.out.println("Number of Letters= "+numLetters);
            System.out.println("Number of Digits= "+numDigits);
            System.out.println("Number of White Spaces= "+numSpaces);
            System.out.println("Number of Words= "+numWords);
            System.out.println("Number of Lines= "+numLines);
            System.out.println("Number of Other Characters= "+numOthers);
            
            in.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}

