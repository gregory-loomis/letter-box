# letter-box
Letter Boxed Game
Letter Boxed is a game created by the New York Times. The rules are listed below. Technically there is no “winning” in the rules, but ther real goal is to use all of the letters in just 2 words. 

Start slowly to get the hang of it. 

How to Play Letter Boxed
Create words using letters round the square
Connect letters to spell words
Words must be at least 3 letters long
Consecutive letters cannot be from the same side
The last letter of a word becomes the first letter of the next word 
eg. THY > YES > SINCE
Letters can be used as many times as you want, even if they appeared in a previous word, BUT NOT CONSECUTIVELY. (You could never have a word like accent, or collect. No double letters allowed)
Words cannot be proper nouns or hyphenated
No cussing either, sorry
Use all letters to solve!

<pre>    K   R   A 
C              H
L              D
O              P
    B   I   S 
</pre>

You will be programming this game, so let’s start with decomposing the algorithms.

This will be text based, using System.out.println and Scanner, so don’t worry about making a GUI
The puzzle will be manually input at the start. You don’t need to generate random letters. Instead, the user will enter 3 comma separated letters at a time. Eg. K, R, A <enter> 
After the game setup is complete, the user is prompted to enter a word.
The computer needs to see if the word follows the rules: (list the rules that you need to check.)

.
.
.
.
…


What will the program do if the word is not valid?





After a valid word, print the letters that remain unused. If no letters are left unused, tell the user that they solved the puzzle in ___ words (however many words they used)

Break down each of the list items in step 4. 
For example, let’s say you listed 
A. is the word a valid English word?  
Import a dictionary of words
Iterate through the list to see if the word they submitted exists in the dictionary.




What else? Anything we haven’t done?
Eg. What happens if the user wants to undo? How do they remove or change a word. Go back and add that to your break down.

Write the pseudocode for this program




Make a flowchart for this program






