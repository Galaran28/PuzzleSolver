package puzzleSolver;

/**
 * Bishop.java
 *
 * File:
 *	$Id: Bishop.java,v 1.3 2013/05/03 22:27:19 cas5420 Exp $
 *
 * Revisions:
 *	$Log: Bishop.java,v $
 *	Revision 1.3  2013/05/03 22:27:19  cas5420
 *	Finished Puzzle solver, just need to comment.
 *
 *	Revision 1.3  2013/05/03 13:52:10  cas5420
 *	Completed chess solver, debugging
 *
 */

import java.util.HashSet;

/**
 * Defines Bishop piece.
 * @author Chris Sleys
 *
 */
public class Bishop extends Piece{
	/**
	 * Initializes inherited values.
	 * @param name Name of Bishop
	 * @param X Length of the board on x-axis
	 * @param Y Length of the board on y-axis
	 */
	public Bishop(String name, int X, int Y) {
		super(name, X, Y);
	}

	@Override
	public HashSet<Point> getMoves(Point init) {
		return super.diagonalMoves(init);
	}

}
