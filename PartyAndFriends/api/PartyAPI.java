/**
 * The APIs for the party system of Party and Friends
 * 
 * @author Simonsator
 * @version 1.0.0
 */
package partyAndFriends.api;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import partyAndFriends.party.PartyManager;
import partyAndFriends.party.PlayerParty;

/**
 * The APIs for the party system of Party and Friends
 * 
 * @author Simonsator
 * @version 1.0.0
 */
public class PartyAPI {
	/**
	 * Returns the party, if the given player is in a party or null if he is not
	 * in a party
	 * 
	 * @param player
	 *            The player
	 * @return Returns the party, if the given player is in a party or null if
	 *         he is not in a party
	 */
	public static PlayerParty getParty(ProxiedPlayer player) {
		return PartyManager.getParty(player);
	}

}
