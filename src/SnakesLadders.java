
import java.util.ArrayList;
import java.util.List;

public class SnakesLadders {

  public static void main(String[] args) {
	MainWindow mainW = new MainWindow();
	mainW.setVisible(true);
	/*
	//Prompt for number of players.
	int numPlayers = 0;
	while (numPlayers <= 0 || numPlayers > 6) {
	  //System.out.print("Please enter the number of player (1-6): " );
	  // numPlayers = scan.nextInt(); ###Ingresar cantidad de jugadores
	}

	//Initialize the players.
	List<Player> players = new ArrayList<>();
	for (int idx = 0; idx < numPlayers; idx++) {
	  String nombre = "Juan";//###Ingresar el nombre.
	  Player player = new Player(nombre);
	  players.add(player);
	}

	//Initialize the board.
	Board board = new Board(players);

	//Loop until a player reaches the final spot.
	//Players take turns to roll the die and move on the board
	boolean done = false;
	int playerIdx = 0;
	int roll;
	while (!done) {
	  //Player takes turn
	  Player currPlayer = players.get(playerIdx);
	  roll = currPlayer.takeTurn();

	  //Update the board
	  done = board.movePlayer(currPlayer, roll);

	  //Print the board
	  board.actualize(players);

	  //If we're done, print end message.
	  if (done) {
		System.out.println(currPlayer + " wins");
	  }

	  //Set up for next player
	  playerIdx++;
	  if (playerIdx == numPlayers) {
		playerIdx = 0;
	  }
	 */
  }
}
