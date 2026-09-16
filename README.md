# Video-Game-Tracker-Personal-Project-

Video Game Tracker is a basic Java command line program that allows you to record information on the video games you have played.

What it does

Prompts you for:
Game name
Platform (e.g., PS5)
Whether you finished the main story
Whether you reached 100% completion
Hours played
Your rating (out of 10)
A short written review

Creates a VideoGames object with that information
Appends a clean, readable entry to VideoGames.txt
Asks if you want to add another game (and loops if you say yes)

Project structure

VideoGames.java – Data class that holds all the game information and provides a nice toString() for writing to the file.
Main.java – The interactive program that gathers input from the user and saves it.
VideoGames.txt – The persistent text file that stores all your logged games (currently contains entries for GTA 5, Detroit: Become Human, and Hogwarts Legacy).

This is a simple game journal/backlog tracking app that operates entirely from the command line interface and keeps all its data in a text file.
