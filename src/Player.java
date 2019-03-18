
public class Player {

  private String name;
  private static Die die = new Die();

  //Initialize the fields
  public Player(String name) {
	this.name = name;
  }

  /**
   * This method plays out the player's turn.
   *
   * @return The number of spaces to move on the board.
   */
  public int takeTurn() {
	return 0;
  }

  @Override
  public String toString() {
	return name;
  }
}
