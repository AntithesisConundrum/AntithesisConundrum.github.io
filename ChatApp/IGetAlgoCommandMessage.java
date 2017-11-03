package common;

import provided.datapacket.DataPacket;

/**
 * Message type that should be sent to a user to request an algoCommand
 * corresponding to the class returned by requestedClass.
 * 
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 */
public interface IGetAlgoCommandMessage {
	/**
	 * This should return the original message that the sender of
	 * this message needs an AlgoCommand for.
	 * @return needed class
	 */
	public DataPacket<?, ICommunicate> getOriginalMessage();
}
