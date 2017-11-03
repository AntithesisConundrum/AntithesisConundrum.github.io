package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

import provided.datapacket.DataPacket;

/**
 * This interface provides the ability to communicate with a remote chat room.
 * 
 * There should be one ICommunicate object per room per person.
 * 
 * Note that this is an RMI server object and should be treated as such; this object
 * should NEVER be sent in its entirety, but rather stubbified before sending.
 */
public interface ICommunicate extends Remote {
	
	/**
	 * Returns the IConnect stub of this user.
	 * For use in "auto-connect" back
	 * @return IConnect for this user
	 */
	public DataPacket<IConnect, ICommunicate> getIConnect() throws RemoteException;
	
	/**
	 * Gets the preferred name for a user within a given chat.
	 * @return DataPacket with String of the user's preferred name and their ICommunicate stub
	 * @throws RemoteException in the case that there is some error sending the message
	 */
	public DataPacket<String, ICommunicate> getUserInfo() throws RemoteException;
	
	/**
	 * Sends a message to the group chat represented by this ICommunicate object.
	 * @param data - the message to be sent
	 * @throws RemoteException in the case that there is some error sending the message
	 */
	public void sendMsg(DataPacket<?, ICommunicate> data) throws RemoteException;
}
