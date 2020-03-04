PreRequisites:
===============
1.	The machine on which the script is to be run must have JRE1.8 or higher.
2.	The machine on which the script is to be run must have Maven 3.5 or higher.

Steps to Run the scripts:
==========================
1.	Import project as ‘Existing maven project’
2.	Open Command Prompt and change directory to your project location using the following command:
cd /path/of/the/workspace
3.	Then run the following command to download all the dependencies and execute test cases:
mvn clean verify

Other details:
===================
1.	Currently, scripts will run on Google chrome. If you want to run it on other browsers then please check the drivers 
present in ‘drivers’ folder and the browser versions on the machine. Make sure they are compatible.

Test Report:
================
1.	In order to check the report after execution go to target -> site -> serenity -> index.html
2.	Open index.html file to see the Test report.



