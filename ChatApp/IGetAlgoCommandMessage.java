package common;

/**
 * Should be sent to a user to request an algoCommand
 * corresponding to the class returned by requestedClass.
 * 
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 * 
 * As this is a "well known type", the command for
 * this type should be written as an anonymous inner
 * class to your model so that it can directly reference
 * your model's algorithm.
 */
public interface IGetAlgoCommandMessage {
	/**
	 * This should return the class that the sender of
	 * this message needs an AlgoCommand for.
	 * @return needed class
	 */
	public Class<?> requestedClass();
}
