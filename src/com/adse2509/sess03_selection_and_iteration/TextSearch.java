package com.adse2509.sess03_selection_and_iteration;

/**
 * Java program to search for some text in a paragraph using a while loop.
 * 
 * @author pascal
 */
public class TextSearch 
{
    public static void main(String[] args) 
    {
        // Paragraph to search text within
        String paragraph = "Video provides a powerful way to help you prove your "
                + "point. When you click Online Video, you can paste in the embed"
                + " code for the video you want to add. You can also type a keyword"
                + " to search online for the video that best fits your document.";
        
        // Word/text to search for
        String textToSearch = "video";
        boolean found = false; // Variable to indicate whether the text has been found
        int index = 0;

        // Use a while loop to search for the text 
        while (index < paragraph.length()) 
        {    
            // Check if the substring matches the text to search
            if (index + textToSearch.length() <= paragraph.length()
                    && paragraph.substring(index, index + textToSearch.length()).equals(textToSearch)) 
            {
                found = true;
                break; // Exit the loop since text is found
            }
            index++; // Increment the index to check the next character
        }

        // Display/output the results
        if (found) 
        {
            System.out.println("The text/word '" + textToSearch + "' was found "
                    + "at index: " + index);
        } 
        else 
        {
            System.out.println("Unfortunately, the text/word '" + textToSearch +
                    "' was not found in the paragraph.");
        }
    }
}
