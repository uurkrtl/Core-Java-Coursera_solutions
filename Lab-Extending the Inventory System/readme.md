# Lab: Extending the Inventory System

## **Objective**

This lab will provide some additional functionality to assist us in testing the inventory system as well as the final constructor that is needed.

## **Overview**

In this lab you will:

-   Create the **ClassicalCD** constructor
    
-   Create a report method
    
-   Use the report method to verify that all of your inventory system classes are coded correctly
    

## **Step by Step Instructions**

{You may also download a copy of these instructions via the link at the bottom of this page.}

**Exercise 1: ClassicalCD Constructor**

1. Write a constructor for the **ClassicalCD** class that takes 7 arguments (**title**, **price**, **quantity**, **composer**, an array of **performers**, **location** and **release date**).

2. Ensure that you use your super class constructor to manage the **title**, **price** and **quantity**. Use your **addPerformer()** method to help with setting the array of performers so that you do not overflow the array.

3. In the **main()** method of **InventoryDriver**, create two **ClassicalCDs**. The **ClassicalCD** constructor will require an array for performers. Create an array for each new CD and pass it to the constructor. Here is an example:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/exBhZ1SeRuOQYWdUnmbjjA_5ac2fe02e1444cb2b2868bef1b0fedf4_Image-10-1.png?expiry=1703116800000&hmac=oZjrIKP9bhQ93p-HuK1Ak4ZCKltVup8K-1iNgcr7a4A)

**Exercise 2: Creating the Inventory Class**

4. Create a new class in the **com.javaoo.store** package named **Inventory**. This class will not have any data members at this point. It will just provide some general functionality for our inventory system.

5. Create a **public static** method in the **Inventory** class named **produceReport()**. This method will accept an array of **Item** objects and will return a **void**.

6. The **produceReport()** method should print out the **Title**, **Price** and **Quantity** for each item in the array. In addition, at the end of the report there should be line which displays the total count of items and the total value of all items. The beginning of the report should have an appropriate header.

7. From the **main()** method in **InventoryDriver**, call the **produceReport()** method passing your array of **Items** that you created in the previous lab. Remember that this is a static method and must be called a bit differently than the other methods you have been working with. Verify that your items are printed and the totals are calculated correctly.

**Challenge Exercise**

8. Experiment with different techniques for making the output line up well and look professional. This is not as easy as it might seem and will take some additional processing. A **switch** statement based on the title length might help.

9. Also, you might want to experiment with the **java.text.DecimalFormat** class for formatting your total price to two decimal places.