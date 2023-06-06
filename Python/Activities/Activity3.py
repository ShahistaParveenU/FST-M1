player1=input("Hey, Player1 - What's your name:?  ")
player2=input("Hey, Player2 - What's your name:?  ")
player1input=input("Hey, "+player1+" Please choose one- Rock,Paper or Scissor:  ").lower()
player2input=input("Hey, "+player2+" Please choose one- Rock,Paper or Scissor:  ").lower()
if (player1input==player2input):
    print("Its a tie match")
elif((player1input=="rock") & (player2input=="scissor")):
    print("Rock wins, well done "+player1)
elif((player1input=="rock") & (player2input=="paper")):
    print("Paper wins, well done "+player2)
elif((player1input=="paper") & (player2input=="rock")):
    print("Paper wins, well done "+player1)
elif((player1input=="paper") & (player2input=="scissor")):
    print("Scissor wins, well done "+player2)
elif((player1input=="scissor") & (player2input=="paper")):
    print("Scissor wins, well done "+player1)
elif((player1input=="scissor") & (player2input=="rock")):
    print("Rock wins, well done "+player2)
else:
    print("Please enter a valid input!")
