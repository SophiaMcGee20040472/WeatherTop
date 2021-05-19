# Name : Sophia McGee
# Student Number:20040472




- Brief description of the WeatherTop App developed:

For this app I have designed a fun feel using blues and yellows throughout to give a summer weather like feel.
It starts with a starter page with text that directs you to where you need to sign up or log in.
Once you have signed up or login you are redirected to the dashboard.
If you are new, an empty page with add station options will appear where you can enter a new station which will be listed alphabetically with a summary display.
Then you can chose to view your folder and add readings inside(you also have the option to delete readings).
These readings will then display in your station. I have included weather trend display,weather icon updates on weathercode entered.
This station also displays a table of stats that has been entered by the user.
I have included a date using my addReadings method to save the date when the readings are being saved.
I have an admin page which displays all inputs of weather throughout the site.I have an about page with some nice visuals which carries the blue yellow theme.
I have used many methods to help calculate stats such as windChill(),fahrenheit()(equations used for both),weatherCode()(a switch statement used),Beaufort(),weatherDirection(),weatherDirection() there are many more
they can be found in my StationCtrl model. I have used my StationCtrl index and called these methods taking what I need from my models getters and setters.
I have used try catch to make sure none of my methods throw up an error.I have used four models Member, Reading, Stat,and Station.These contain my constructors, getters and setters.
I have used 6 controllers About,Accounts,Admin,Dashboard,Start and my controller with most of my method in StationCtrl.
About, Admin and Start are to help render these pages the other 3 controllers have methods for adding,deleting,saving and calculating information.
I have used 5 tags and 7 html pages actually being displayed with them all extending to main html page for the semantic ui style sheet layout.
This App is designed to be fun and playful.

- Known bugs/problems:
when no readings are in my cards on stations they are all different levels.
Windchill calculation one set of readings are correct and the other is off by 0.01 for some reason.
not sure if my weathertrend logic is a hundred percent as I am limited on time but html is correctly set up using if statements to take the information.

-Referencing
https://www.journaldev.com/16094/java-collections-sort
https://blog.catzie.net/java-method-to-convert-degrees-into-directions-16-wind-compass-rose/
https://www.guru99.com/math-java.html
https://www.codegrepper.com/code-examples/typescript/get+last+n+elements+from+list+java
https://www.w3schools.com/java/tryjava.asp?filename=demo_date_format
https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html
https://stackoverflow.com/questions/32152442/semantic-ui-footer-at-the-end
https://stackoverflow.com/questions/16904174/playframework-looping-over-a-list/39177406
https://www.geeksforgeeks.org/date-class-java-examples/#:~:text=The%20Date%20class%20of%20java,date%20and%20time%20with%20java.&text=Date()%20%3A%20Creates%20date%20object%20representing%20current%20date%20and%20time.
https://www.youtube.com/watch?v=0fKg7e37bQE&ab_channel=LearnCode.academy   
https://www.youtube.com/watch?v=S7TbHDN8EXA&ab_channel=DevWorldDevWorld     
https://www.youtube.com/watch?v=lR_hYwCAaH4&ab_channel=TheCodingTrainTheCodingTrainVerified
https://www.freecodecamp.org/news/10-important-git-commands-that-every-developer-should-know/
https://dzone.com/articles/top-20-git-commands-with-examples
https://github.com/wit-hdip-comp-sci-2020/play-template-1 
https://www.youtube.com/watch?v=wrb7Gge9yoE&ab_channel=Codecademy


*/