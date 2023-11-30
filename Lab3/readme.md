# Lab-3: Flow Control

## **Objective**

This lab will continue to introduce the Java syntax to the new Java programmer. You will focus on understanding and practicing with flow control syntax.

## **Overview**

In this lab you will experiment with the following:

-   Flow control using if
    
-   Loops using for and while
    
-   Flow control using break and continue
    
-   Flow control using switch
    

## **Step by Step Instructions**

{You may also download a copy of these instructions via the link at the bottom of this page.}

**Using Java Flow Control**

1. Create a new class named **Lab3** in the **com.lq.exercises** package. Ensure that the new **Lab3** class has a main() method. This can usually be added automatically in the IDE when you are creating the class. Use the following as a guide:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/buGLVS9-Tguhi1Uvfi4L4Q_1c5cf7706a83410e9a6c83711f7b1f02_Image-3-1.png?expiry=1701475200000&hmac=5CIRDZ7XmYFwQav9OHWVfWfi7ZHHyFI0dRufV7rBxLg)

**Exercise 1: for loop**

2. Create an array of **String** references named **daysOfWeek** and initialize it with the names of the days of the week starting with Sunday.

3. Write a for loop to print out each element of the array. Do this two ways – the first using the standard for loop, the second using the for-next construct.

4. Write another for loop to print out each element of the array in reverse. Note that the only way this can be done is by using the standard for loop.

**Exercise 2: while loop and continue**

5. Create a **while** loop that will print out only even numbers between 1 and 20.

6. Use the **continue** statement and an **if** statement to skip printing the odd numbers (i.e. increment the counter by 1 each time through the loop).

**Exercise 3: for loop**

7. Create a **for** loop that will print out all numbers between 1 and 100 except 50 thru 60.

**Exercise 4: switch statement**

8. Create a **while** loop that will execute the following code 12 times using a counter that starts at 1 and is incremented by 1 each time through the loop.

9. Within the while loop, create a switch statement that will print out the number of days in each of the months of the year.

10. Use fall through capabilities so that you only have one print statement for all of the months that contain 31 days. Do not worry about leap years.

11. Print out the name of the month as well. You can copy and paste your monthNames array from the previous lab to help make this easier.

**Challenge Exercise**

12. Create the necessary variables, loops and flow control to print March as a calendar. The calendar will have:

a. A heading with the days of the week

b. 5 rows with the days of the month in the correct column

c. Assume that March 1 starts on a Friday

d. Each week on the calendar should flow from Sunday – Saturday (left to right).

e. You can use the function **System.out.print()** to print information to the console without adding a carriage return.

13. The output should look as follows:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/LwJens89RcGCXp7PPQXBPw_fd40517e227f4cf5bc7a89fc5e72a25f_Image-2-17.png?expiry=1701475200000&hmac=gkvhdgJX0dZGQWsFNHZPRtOfSTxo63q6sKwHq5h2jWY)