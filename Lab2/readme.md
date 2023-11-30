# Lab-2: # Using Primitive Data Types

## **Objective**

This lab will begin to introduce the Java syntax to the new Java programmer. You will create your first Java program and experiment with using different primitive data types.

## **Overview**

In this lab you will create a new Java project and your first Java class. While the details of object-oriented programming and Java class structure are yet to come, this initial Java class will allow you to begin writing some basic Java code.

## **Step By Step Instructions**

{You may also download a copy of these instructions via the link at the bottom of this page.}

## **Create a Workspace, Project, and Package**

1. Launch your IDE and use the default workspace for your lab exercises. The default workspace location should be left unchanged in this environment and it is: **/home/developer/eclipse-workspace**, so just click the **Launch** button.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/SeQsoMDJRV2kLKDAyaVdfw_d0c4c13fe1914bb0b49ca104cb7d2e90_Image-2-1.png?expiry=1701475200000&hmac=CVHec71MRRKQeBQ6k-oca2JXDND-LD05OUddsuNseFk)

2. Create a new Java project for the first few exercises. Name the project **ClassExercises**.



a. Select **File** -> **Project...**

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/S59icKoXRQSfYnCqF-UEFQ_fcd784b1f30d4bbfaa7fad19f12be935_Image-2-2.png?expiry=1701475200000&hmac=7VsrhHtRZwzKmtD0dtRoa2dNrvk0zS9jjadeYjGJMu8)

b. Select **Java Project**

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/u50QAl1GThOdEAJdRt4TlA_e9c5facef4ad4854b515bf1cb6f325cc_Image-2-3.png?expiry=1701475200000&hmac=q5FbVc62S4iaW9V0kyF6WRXetrwtQeNkIDzWcUZ2ksA)

c. Enter **ClassExercises** as the Project Name and click the **Finish** button.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/x_AbVy9hTY2wG1cvYa2Ntg_19627f8fa77244f58503bbfe0c8daca3_Image-2-4.png?expiry=1701475200000&hmac=ppow-1lYORGeIKgx9xnf6EuKZRVu6DygrVAEqrSg9ic)

d. Click the Open Perspective button to change to the Java perspective.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/eHwyRxULTfm8MkcVC635pQ_2125067480ee4d2d977aeab3b4dd668d_Image-2-5.png?expiry=1701475200000&hmac=s6-rp9uS5Tobq18qxUWzUSWAWmSozpUe91bfu4YiPww)

3. Create a package named **com.lq.exercises**. This can be done in most IDEs by right-clicking on the project name and selecting New > Package.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/VKSVDuAdSv6klQ7gHTr-tA_3593c7dd1e954e0cb03dd4112b8d2d49_Image-2-6.png?expiry=1701475200000&hmac=ns-c2paaLqavLu8cekOEzTVL-iZsyvLDQUiecxLJhKc)

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/kIwqfK8ETlyMKnyvBE5c7A_85b6a961f8cb4ec793bd97ce66cc73f1_Image-2-7.png?expiry=1701475200000&hmac=oQMuqOJqa2WxMrEz7bGV0yb9g9grJwuXoU1srMn2Qdg)

4. Create a new class named **Lab2** in the **com.lq.exercises** package. This can be done in most IDEs by right-clicking on the package and selecting **New > Class**.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/SmXU40p-Rb-l1ONKfiW_AQ_3743538c88714a79b1f7dda63553d0ac_Image-2-8.png?expiry=1701475200000&hmac=STv0fNGWUe4EyY6dVSAVipMIUHAS96MHMAybuvaiF5o)

The new class wizard will appear. Enter the name of the class, check the box for a main method, and check the generate comments method. Click the **Finish** button.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/S5AcCQniRTKQHAkJ4rUymw_2328cf235b4046e1939d0fb4003f7051_Image-2-9.png?expiry=1701475200000&hmac=dMDWQkAo2sz9YtHiRKGuBZfmXnDQcugQ1G18u0OZ34c)

5. The **Lab2** class will open in the editor. It will contain a beginning curly brace ‘{‘and an ending curly brace ‘}’ for the class definition. Proceed with the lab exercises that follow.

## **Implement the main() method**

6. Remove the TODO comment. It is there only to remind you that the method was automatically created for you and that you must implement what the method is to do.

7. Add a print statement to your main() method that says, “**Hello World!**”. We will cover the details of how this all works later but for now it will look like the following:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/tSf3JnwwQQmn9yZ8MFEJlQ_d2ceeaf91c7242368788b7905954d7cb_Image-2-10.png?expiry=1701475200000&hmac=aYJnxmUpdjyCIs5A65rGBVpON04nKTLHe2TQyg7CMn8)

8. Save your changes and execute your small Java program. In most IDEs this can be accomplished by right-clicking on the class name and selecting **Run As > Java Application** or by clicking the run button on the toolbar.

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/LpXogZSnRcKV6IGUpwXCBg_f9b608c4408e4bbd845bf17bd072bd05_Image-2-11.png?expiry=1701475200000&hmac=hBnjk6dQemOzHKivBMN7poSpo7Ed8sAD5TF0SPOHqv8)

9. View the results in the console view. It should be similar to the following:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/4jkL76SORvi5C--kjvb42Q_83d41ae176e948c4b02686a9b4cdd390_Image-2-12.png?expiry=1701475200000&hmac=l2hEzW6S9SW3J4mtInnqIDpoqMMPuRQjp-XnN6IvmiM)

## **Define Primitive Data Types**

10. At the beginning of the main() method, declare the following variables with the specified characteristics:

a. An int with the name **width** and no initial value.

b. An int with the name **height** and no initial value.

c. An int with the name **area** and no initial value.

d. A double with the name **radius** and an initial value of 10.0.

e. A double with the name **pi** and an initial value of 3.14.

f. A boolean with the name **result** and an initial value of **true**.

In the body of the main() method, perform the following variable assignments:

g. Assign a value of **8** to **width**.

h. Assign a value of **12** to **height**.

i. Assign a value of **96** to **area**.

11. Near the bottom of the main() method, print the values of each variable using System.out.println(). Use the following as a guide:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/ALUPIyDqRrq1DyMg6ra69A_b484f91607ec4b67a9f16c9414affea8_Image-2-13.png?expiry=1701475200000&hmac=3q9xN-VT3ZFPP9NnuPdYWmBwP1IHAgUxPY3n_oXZ73I)

12. Execute your program. Your output should be similar to the following:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/-Q2FOOaWQoWNhTjmlkKFPA_76c5613784494a2ca931d1a3bf3dd363_Image-2-14.png?expiry=1701475200000&hmac=7tn1Pb2RLEewt8qzZX_K-I5UCioeo7TJZoW7-HnxI-4)

## **Define Arrays**

13. Near the top of your main() method, define the following arrays:

j. An array of 12 **int**s named **daysInMonths**.

k. An array of 12 **String** references named **monthNames** – initialize this array at the time it is declared with the names of the 12 months (refer to your course book for the syntax).

14. Write 12 lines of code to assign the number of days in each month to the **daysInMonths[]** array elements (do not worry about leap year!). See output in step 16 below for days in months.

15. Write a print statement for each month that will display the name of the month and the number of days it contains. Use the following as a guide:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/D6ER71zIRHWhEe9cyDR1Pw_ba28e87245d34c2ca8b55f592f6e18a0_Image-2-16.png?expiry=1701475200000&hmac=UDybqZ-Ig6yNiVtLnZCWsMTnIQC2TiVziK8tWiK4bM0)

If you are already familiar with loops, you may use them. If not, then use 12 output statements.

16. Execute your program. Your output should be similar to the following:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/VAehGg44QNWHoRoOOFDVPw_073db545f72d42dda370fb870fc65bed_Image-2-15.png?expiry=1701475200000&hmac=pwkIkwi5EokQMdjcW7NTdXFitAPtP78NTzMwgd-fSIU)