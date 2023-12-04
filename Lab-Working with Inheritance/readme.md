# Lab: Working with Inheritance

## **Objective**

This lab will provide some practice in using inheritance. You will also experiment with overriding methods and using information from an inherited class.

## **Overview**

In this lab you will:

-   Create a new class that extends an existing class
    
-   Implement methods using overriding
    
-   Add new functionality
    
-   Create objects and test your new code
    

## **Step by Step Instructions**

{You may also download a copy of these instructions via the link at the bottom of this page.}

**Exercise 1: Using the extends keyword**

1. Create a new class named **Cube** that extends **Box** and place it in the **com.lq.exercises** package in the **ClassExercises** project.

2. A **Cube** is like a **Box** however all three dimensions of a **Cube** must be the same. We simulated this in our **Box** class by providing a constructor that would set all 3 sides to the same value. We will formalize this here. We don’t really need any new attributes since we inherit everything we need from **Box**.

3. The first thing we need to do is define a constructor for **Cube**. Since a **Cube** must have all 3 sides set to the same value, our constructor only needs one parameter. We do not need to set any data in the **Cube** class so all we need is a call to our super class constructor [Hint: Use the **super** keyword as the first line in the **Cube** constructor].

4. **Cube** inherits all the public methods from **Box**. However, if we set the length of a **Cube** to a new value, we also want to guarantee that the height and width are updated as well. Override each of the following methods in the **Cube** class to guarantee this functionality. (Remember, an overridden method must have the exact same signature as the base class method it is overriding).

a. **setLength()**

b. **setWidth()**

c. **setHeight()**

Here is what it might look like for one of the methods. Note that the author chose to only change the value if a different one has been passed in.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/1iTk08HxRruk5NPB8Va7Qw_c0a632b4efa248e7a13abb87191bfe27_Image-9-1.png?expiry=1701820800000&hmac=PbUrgUvXzd5CkB-RVE0s_KQfvTT8TNGZhV5I_UISASU)

**Exercise 2: Adding Functionality to Cube**

5. Add two new methods to get and set the sides of the **Cube** to a value. These methods work in a similar manner to the **Box** methods but will only be available to cubes.

a. Create a **setSide()** method that takes one parameter of type **double** and returns a **void**. Ensure that the sides are set to a valid value (>0)

b. Create a **getSide()** method that takes no parameters and returns a **double**.

**Exercise 3: Try out the Cube class**

6. Create a new class named **CubeDriver** in the **com.lq.exercises** package. Ensure that this class has a **main()** method defined.

7. In the main method of **CubeTest**, create two **Cube** objects using the keyword **new**.

a. A cube named **cube1** with all sides set to 5

b. A cube named **cube2** with all sides set to 8

8. Using the get methods, print out the value for each attribute of both cubes. Ensure that the attributes were set correctly by the **Cube** constructor. Execute the **main()** method for **CubeDriver.** The output should be similar to the following. If there are any errors in your **Cube** code at this point, correct them and re-run the test.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/ssgnry5DTImIJ68uQ_yJeg_fbc0d9d6fe7d425188394c58919cece2_Image-9-2.png?expiry=1701820800000&hmac=T7uAaKvm42VMk4rMIZP2yO54_zMPFavCz9412CtmNpo)

9. Ensure that your set methods work correctly. Call the **setLength()** method for **Cube** cube1 and change the **length** to 20. Use the inherited **printBox()** method to ensure that all sides were set correctly. Do the same test again calling the **setSide()** method with a value of 40. Your output should look as follows:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/fhdyrbU5SNeXcq21OQjXJA_f9b91ee34c0e46d0b8f9726f14515ff4_Image-9-3.png?expiry=1701820800000&hmac=rpWmxOGR17tfZe74JfsEjMF57Bc4d1dS_cqVoiBKWUk)

10. Using the **setWidth()** method, change the width of **Cube** cube2 to -5. Did you receive the appropriate error message? Execute the **printBox()** method again and ensure that the value was not changed. Your output should look as follows:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/ciYsiDHRTfqmLIgx0c36ew_ab84c4cba1bb4d0c9e5ec6a4252b484c_Image-9-4.png?expiry=1701820800000&hmac=gFMCbJpEj9Vzq77-KB2UyGjHra_Z91TV6NKPyO7N22U)