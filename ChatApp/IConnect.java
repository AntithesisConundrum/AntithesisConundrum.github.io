package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;
import provided.datapacket.*;

/**
 * Connection API to allow other users to join this users' groups.
 * Should never be sent itself; only the stub should ever be sent.
 * 
 * This RMI server should be bound to the local registry with the
 * static BOUND_PORT and BOUND_NAME.
 * 
 * This is an RMI Server, and should be treated as such!
 */
public interface IConnect extends Remote {
	/**
	 * The name the ICompute object will be bound to in the RMI Registry
	 */
	public static final String BOUND_NAME = "Connect";

	/**
	 * The port that the client will use to communicate with the IConnect object
	 * Note that this port must be opened of inbound traffic on the server machine
	 */
	public static final int BOUND_PORT = 2100;
	
	/**
	 * The remote user will use this function to request this
	 * user's groups.
	 * 
	 * Important note: The actual groups that are returned are
	 * defined by the implementation of IConnect. (It's valid
	 * to only return a subset of groups or even the empty set!)
	 * 
	 * @return A set of groups that this user is in,
	 * where a group is represented by a set of ICommunicate objects.
	 */
	//TODO: Is IConnect the correct S param here?
	public DataPacket<Set<Set<ICommunicate>>, IConnect> requestGroups() throws RemoteException;
	
}