package common;

import java.awt.Component;
import java.util.function.Supplier;

import provided.datapacket.DataPacketAlgo;

/**
 * This is the adapter between AlgoCommands and the model.
 * This must be the "A" generic for your ADataPacketAlgoCmds.
 */
public interface ILocalModelAdapter {
	/**
	 * Append some text to the view.
	 * @param text to append
	 */
	public void appendText(String text);
	
	/**
	 * Send a Component factory method off to the view;
	 * the view should then invoke the supplier and append
	 * the result to the view.
	 * 
	 * This message passes a Supplier<Component> instead of
	 * a Component so that the GUI thread isn't blocked in
	 * the model.
	 * @param componentFactory  factory for making a component
	 */
	public void appendComponent(Supplier<Component> componentFactory);
	
	
	/**
	 * Removes a person (ICommunicate) from the chatroom, as represented by a
	 * set of ICommunicates.
	 * @param person
	 */
	public void removePerson(ICommunicate person);
	
	/**
	 * Adds a person (ICommunicate) to the chatroom, as represented by a
	 * set of ICommunicates.
	 * @param person
	 */
	public void addPerson(ICommunicate person);
	
	/**
	 * Gets the visitor for messages for the user from the model
	 * @return The visitor for messages
	 */
	public DataPacketAlgo<Void, Void> getDataPacketAlgo();
	
	/**
	 * Gets the ICommunicate that represents the user in the current group.
	 * @return The ICommunicate stub that represents the user in the current group.
	 */
	public ICommunicate getUser();
}
