# Jarvis-2.0
Your very own chatbot designed for windows.
The Project provides a chatbot for your PC.Just type on the textfield and get the things done.Currently jarvis can open some of the pc applications 
like MS-office ,Paint,Calc and you can also specific the path of file that you want to open on certain command.Moreover,you can talk to him anytime.
Jarvis comes with its on music player, So now play music just with a click.Various are also there, including Jarvis getting tired(for fun)

The best part is ,Jarvis always learns .Teach him as much as you can.The more you interact, the better it will become.

The code is easy to read and self explainatory.

installation:

PREREQUISITES

--JAVA Virtual Machine is required to run the project

--yahooWeather API      (https://developer.yahoo.com/weather/)

--Sphinx speechtts API    ( https://cmusphinx.github.io/)

--JAVAZOOM API       (www.javazoom.net/javalayer/sources.html)

Moreover for storing data MySQL is also required:
Setup MySQL        --follow this link   (https://www.mysql.com/)

Steps to Follow:

2 Tables are to be created:

-player --- Stores the name of the songs played to create a playlist

-ques  ---  Stores the Questions that Jarvis isn't able to answer at first along with the answers that the user tells

Change the name of tables if you want in the code.By default the password is set to root and username is also root(Change in code to the one you have specificed while creating the tables)

Note---Most of the jarvis.java inside the src folder and mp3.java are the main code files to edit in.MP3.java contains more than just mp3 player code
