# MobileAppTest


<p> I have created a mobile test automation project using Java, Appium, and Selenium. I chose the AppiumDriver class as the driver class for the project, as the project can be expanded to allow for easier testing on both platforms."</p>
<p>I tried my best to adhere to OOP principles and as I mentioned earlier, I created classes for each page I used in the tests with their respective locators, methods, and tests separated. My goal was to write clean code without any method repetition."</p>
<p>Sure, there are some points that I couldn't fix due to time constraints both during coding and refactoring, and I would like to mention them. </p>
<p> For example, due to different cases, the value of noReset=true needs to be changed according to the test. However, I added this to the setup method by creating a dictionary and passing it as a parameter, which caused me to repeat the AndroidSetup method 7 times in the test page. Actually, when setting up the structure, I aimed to eliminate these repetitions using the @BeforeMethod annotation of TestNG.</p>
<p> Of course, I couldn't do it because the annotation method doesn't accept parameters. When refactoring the project, I remembered the @Parameter annotation that I had used before, so I could use both the @BeforeMethod and avoid code repetition. However, I had to create an XML file for this, link the tests to that XML file, and run them from there. Converting the structure to this method would take some time due to the time constraint, so I couldn't use that method to complete the project on time.</p>
<p> The main goal of the project was to make the tests run successfully and avoid code repetition.</p>

<h3>Action Bar Tabs Test </h3>

https://user-images.githubusercontent.com/74761090/224572197-cb9e39e4-93cf-4e48-b536-03af5d167c28.mp4

<h3>Scrollable Tab (Horizontal and Vertical)</h3>

https://user-images.githubusercontent.com/74761090/224572310-e34a44c5-9318-43eb-a8d9-3a6ba1eca406.mp4
