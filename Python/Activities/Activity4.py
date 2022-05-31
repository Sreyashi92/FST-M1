player1= input("Enter player 1 name:")
player2= input("Enter player 2 name:")
while True:
  ans1= input(player1 +" Choose rock,paper or scissor: ")
  ans2= input(player2 +" Choose rock,paper or scissor: ")

  if ans1==ans2 :
   print("Tie")
  elif ans1=='rock':
     if ans2=='scissor':
      print("Rock wins")
     else :
      print("Paper win")
  elif ans1=="scissor":
     if ans2=="paper":
      print("Scissor wins")
     else:
      print("Rock wins")
  elif ans1=="paper":
    if ans2=="rock":
        print("Paper wins")
    else :
        print("Scissor wins")
  else:
    print("Invalid Combination")

  repeat = input("Do you want another round? Yes/No:")
  if (repeat=="yes"):
      pass
  elif(repeat=="no"):
      raise SystemExit
  else:
      print("Invalid option")
      raise SystemExit
      

         



