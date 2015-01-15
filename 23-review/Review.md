Review of Cards Against Insanity

### Link

https://github.com/angelachan64/Cards_Against_Insanity

### CAI.java

Lines 1-7: Imports

Lines 17-25: Actionlistener for keys (If pressed the newgame button, start a game)

Lines 32 - 74: Constructor: Creates the window, setting up the size, title, and other window values. Creates a new game button and load game button

### Driver.java

Creates a new instance of CAI.java

### game.java

'game' should really be 'Game'

Lines 20-68: Constructor: Creates the window, sets it up.
	32 - 38: Loads the background file 'background.jpg'
	39 - 67: Creates a setup environment where the user enters their name and submits it, then confirms the change.
	70 - 111: Action listener for the buttons, then at line 99 it creates a random chance for the player to become a panda
	113 - 122: Paint methods
	125: Main method, creates new 'game' instance

### quest.java

Again, should be 'Quest'

Does nothing much as of yet, creates a new window with nothing in it.
