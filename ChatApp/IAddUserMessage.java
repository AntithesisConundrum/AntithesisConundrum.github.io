package common;

/**
 * Should be sent to a user to inform them to add
 * the user returned by getUser to their group.
 *
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 * 
 * As this is a "well known type", the command for
 * this type should be written as an anonymous inner
 * class to your model so that it can directly reference
 * your model's set of users.
 */
public interface IAddUserMessage {
	/**
	 * Gets the user to be added.
	 * @return An ICommunicate stub of the user to
	 * be added.
	 */
	public ICommunicate getUser();
}
