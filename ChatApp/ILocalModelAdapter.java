package common;

import java.awt.Component;
import java.util.function.Supplier;

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
	 * @param componentFactory
	 */
	public void appendComponent(Supplier<Component> componentFactory);
}
