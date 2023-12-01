# Lab: Creating Objects

## **Objective**

This lab will provide practice in creating objects and calling methods and constructors.

## **Overview**

In this lab you will:

-   Create a test class
    
-   Instantiate several objects using constructors
    
-   Utilize get and set methods
    
-   Utilize other business methods
    
-   Fine tune the behavior of the **Box** Class
    

## **Step by Step Instructions**

{You may also download a copy of these instructions via the link at the bottom of this page.}

**Exercise 1: Creating Objects**

1. Create a new class named **BoxDriver** in the **com.lq.exercises** package. Ensure that this class has a **main()** method defined.

2. In the main method of **BoxDriver**, create two **Box** objects using the keyword new.

a. A box named **box1** with a length of 5, a width of 6 and a height of 7

b. A box named **box2** where all three sides are 10

3. Using the get methods, print out the value for each attribute of both boxes. Ensure that the attributes were set correctly by the **Box** constructors. Execute the main method for **BoxDriver**. The output should be like the following. If there are any errors in your **Box** code at this point, correct them and re-run the test.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/WDHbnu2ETuyx257thF7s5g_746d37ca3a9c49c991a4cf2e6cd29caa_Image-6-1.png?expiry=1701561600000&hmac=ILZlEun83TolEQCghw2hN4AlTt1HF6qJ4dpyntPr08k)

**Exercise 2: Test Business Methods**

4. Ensure that your set methods work correctly. Call each set method for **box1** changing the values to the following and then use the get methods to ensure that the attributes were set correctly.

a. Length = 3

b. Width = 4

c. Height = 5

5. Call the **getVolume()** and **getSurfaceArea()** methods on box1 and ensure they are functioning correctly. If not, fix the code and re-test.

6. Execute the **printBox()** for **box1**. Ensure that it is functioning correctly. If not, fix the code and re-test.

7. Using the **setLength()** method, change the length of box1 to -5. Execute the **printBox()** method again. What happens? You should receive a message stating that the box contains invalid attributes.

8. In order to avoid setting attributes to invalid values, re-code the set methods of the **Box** class to only accept values greater than 0. If a value less than or equal to zero is detected, print an error message like the following:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/FIEJsau8RgSBCbGrvKYE5Q_95873193511d4c1080c7a263934e14c1_Image-6-2.png?expiry=1701561600000&hmac=OzsPq0dfnpXBTIZAngHS2DxN5Rvk1g518m0oyKv5aeQ)

9. Re-run your **BoxDriver** main method. You should now receive an error message when you try and set the **length** to -5. Test the other two set methods in the same manner.

**Challenge Exercise**

10. Change the **Box** constructors so that new boxes can only be created with valid attributes. If a constructor detects an invalid parameter, use a default value of 1 (one).