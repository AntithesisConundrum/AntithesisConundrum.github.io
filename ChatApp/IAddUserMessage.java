package common;

/**
 * Message type that is sent to other users to inform them to add
 * the user returned by getUser to their group.
 *
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 *
 */
public interface IAddUserMessage {
	/**
	 * Gets the user to be added.
	 * @return An ICommunicate stub of the user to
	 * be added.
	 */
	public ICommunicate getUser();
}
