package common;

/**
 * Message type that should be sent to a user to inform them to remove
 * the user returned by getUser from their group.
 *
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 */
public interface IRemoveUserMessage {
	/**
	 * Gets the user to be added.
	 * @return An ICommunicate stub of the user to
	 * be added.
	 */
	public ICommunicate getUser();
}
