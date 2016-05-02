# SupermarketExercise

Please implement your solution in Java.
You can spend as little or as much time as you need to complete the exercise, however, you should
use this as an opportunity to impress us! We expect to see your best code, working and tested. Your
design skills will be taken into account as well.
The problem
Provide us with the code implementation of a supermarket checkout that calculates the total price
of a basket of items. For simplicity we will use individual letters to identify our items (A, B, C and so
forth). Each item is priced individually. We also have multi-priced items: when you buy a certain
number of items you pay a fixed price for all of them. For instance, item ‘B’ costs £1.50 but this week
we have an offer – “buy three ‘B’s and they’ll cost you £3.50”. This week’s prices are:
Item Unit Special
Price 
--------------------------
A £2.00 2 for £3.00
B £1.50 3 for £3.50
C £1.25
D £1.00
Checkout should accept items in any order, for example:
If we scan three items in the order A, B and A then checkout should recognise two A’s at the special
price of £3.00 + one B at £1.50 giving a total price for all 3 items of £4.50.
Pricing changes frequently, the code should be able to work with new offers and calculate the right
price each time.


Solution Description
--------------------------

There are 3 folders in the archive.
One is a Java implementation as a Maven project, one is the javadoc for it and I added a python implementation for it as well. The python implementation has comments along the code to make it easier to follow.

I have to mention that I started doing the java implementation using Gradle, but ran into some dependency conflicts with the cucumber API, so I was forced to migrate to Maven.
Everything is 100% unit tested as I approached the project with a TDD mindset. It also has an integration test scenario using cucumber testing multiple situations. 

If lines 20-27 of the Launcher class get commented in and lines 14-17 get commented out then the app can be started expecting input from the console.

As the nature of the exercise did not have a database connection or anything like that I stuck to either providing a flag for generating a random number of items, or providing the number explicitly.

I  needed to rely on quite a few 3rd party libraries for the testing purposes, which is only ideal in this case and not in a corporate environment, where introducing outside dependencies means supporting APIs that might change at any given time.
