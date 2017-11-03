package common;

import provided.datapacket.ADataPacketAlgoCmd;
import provided.datapacket.DataPacket;

/**
 * Message type that should be sent to a user to send (an algoCommand for
 * and unknown message type) to a receiver.
 * 
 * Considered a "well known type"; it is required
 * that you have a command for this type!
 * 
 */

public interface ISendAlgoCommandMessage {
	
	/**
	 * This should return the algoCommand that the sender of
	 * this message needs to process and unknown type.
	 * @return needed command
	 */
	public ADataPacketAlgoCmd<Void, Object, Void, ILocalModelAdapter, DataPacket<?, ICommunicate>> getCommand();
	
	/**
	 * The original message, which was unknown to the receiver in the past, is now re-sent to the receiver.
	 * @return the original message.
	 */
	public DataPacket<?, ICommunicate> getOriginalMessage();

}
