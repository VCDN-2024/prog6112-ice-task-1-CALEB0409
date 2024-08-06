/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstoreinventory;

/**
 *
 * @author Caleb Ragaven
 */
    import javax.swing.JOptionPane;
public class BookStoreInventory 
{


   
    public static void main(String[] args)
    {
      // Phase 1: Create an array with five book titles
        String[] books = {"Harry Potter", "The Great Gatsby", "To Kill a Mockingbird", "Pride and Prejudice", "Othello"};

        // Phase 4: Prompt the user whether they would like to use the insertion sort algorithm in ascending or descending order
        String userChoice = JOptionPane.showInputDialog(null, "Would you like to sort the books in ascending or descending order? (Type 'ascending' or 'descending')").trim().toLowerCase();

        if (userChoice.equals("ascending")) 
        {
            // Sort in ascending order
            insertionSortAscending(books);
            // Display the sorted books
            JOptionPane.showMessageDialog(null, "Sorted Books in Ascending Order:\n" + String.join(", ", books));
        } 
        else if (userChoice.equals("descending")) 
        {
            // Sort in descending order
            insertionSortDescending(books);
            // Display the sorted books
            JOptionPane.showMessageDialog(null, "Sorted Books in Descending Order:\n" + String.join(", ", books));
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Please type 'ascending' or 'descending'.");
        }
    }

    // Phase 2: Using the insertion sort algorithm to sort the array in ascending order
    public static void insertionSortAscending(String[] arr) 
    {
        // Traverse from 1 to arr.length
        for (int i = 1; i < arr.length; i++) 
        {
            String key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Phase 3: Using the insertion sort algorithm to sort the array in descending order
    public static void insertionSortDescending(String[] arr) 
    {
        // Traverse from 1 to arr.length
        for (int i = 1; i < arr.length; i++) 
        {
            String key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1], that are less than key, to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) < 0) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    } 
    }
    

