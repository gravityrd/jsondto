package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * An event object describes a user action with an item.
 */
@SuppressWarnings("WeakerAccess")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GravityEvent {

	/**
	 * The identifier of the item which was viewed/etc. by the user.
	 */
	public String itemId;

	/**
	 * The identifier of the user who generated the event.
	 */
	public String userId;

	/**
	 *
	 * A cookieId should be a permanent identifier for the end users computer, preserving its value across browser sessions.
	 * This way not logged in users can be recognized, if they have logged in previously from the same computer.
	 * The cookieId should be always specified.
	 *
	 */
	public String cookieId;

	/**
	 * The UNIX timestamp of the event, in seconds.
	 * The default value is the current timestamp.
	 */
	public int time = (int) (System.currentTimeMillis() / 1000);

	/**
	 *
	 * The event type determines the namevalues which can be passed.
	 * <p>Possible list event types, which can be expanded based on what can the external system support:</p>
	 * <table border="1" summary="event types">
	 *	<tr><th><code>Event Type</code><th>Category</th><th>Description</th><th>NameValues for the event</th></tr>
	 *	<tr><td><code>VIEW</code></td><td>GENERAL</td><td>The user viewed the info page of an item.</td><td></td></tr>
	 *	<tr><td><code>BUY</code></td><td>GENERAL</td><td>The user bought an item.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>OrderId</code></td><td></td></tr>
	 *			<tr><td><code>UnitPrice</code></td><td>Formatted as a decimal number, for example 1234 or 12345.67</td></tr>
	 *			<tr><td><code>Currency</code></td><td></td></tr>
	 *			<tr><td><code>Quantity</code></td><td>Formatted as a decimal number.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>RATING</code></td><td>GENERAL</td><td>The user rated an item.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>Value</code></td><td>The value of the rating.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>ADD_TO_CART</code></td><td>GENERAL</td><td>The user added an item to the shopping cart.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>Quantity</code></td><td></td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>REMOVE_FROM_CART</code></td><td>GENERAL</td><td>The user removed an item from the shopping cart.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>Quantity</code></td><td></td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>ADD_TO_FAVORITES</code></td><td>GENERAL</td><td>The user added the item to his favorites.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>ListId</code></td><td>Use if the webshop supports multiple favorites lists.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>REMOVE_FROM_FAVORITES</code></td><td>GENERAL</td><td>The user removed an item from his favorites.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>ListId</code></td><td>Use if the webshop supports multiple favorites lists.</td></tr>
	 *		</table>
	 *	</td></tr>
	 * 	<tr><td><code>REC_CLICK</code></td><td>GENERAL</td><td>The user clicked on a recommended item.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>Position</code></td><td>The position of the clicked item in the recommendation list. The position of the first item is 1.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>LOGIN</code></td><td>GENERAL</td><td>The user logged in to the site. For this event the cookieId and also the userId must be specified.</td><td></td></tr>
	 *	<tr><td><code>ADD_TO_WISHLIST</code></td><td>ADDITIONAL</td><td>The user added the item to his wishlist.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>ListId</code></td><td>Use if the webshop supports multiple wishlists.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>REMOVE_FROM_WISHLIST</code></td><td>ADDITIONAL</td><td>The user removed an item from his wishlist.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>ListId</code></td><td>Use if the webshop supports multiple wishlists.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>HIDE_PRODUCT</code></td><td>ADDITIONAL</td><td>The user hides a product that should not be recommended to him.</td><td></td></tr>
	 *	<tr><td><code>UNHIDE_PRODUCT</code></td><td>ADDITIONAL</td><td>The user unhides a product that he marked as hidden previously.</td><td></td></tr>
	 *	<tr><td><code>PRODUCT_SEARCH</code></td><td>ADDITIONAL</td><td>A list of products was displayed to the user, for example by browsing a category or by free text search.</td><td>
	 *		<table summary="parameters">
	 *			<tr><td><code>SearchString</code></td><td>The search string, if the list is based on a free text search.</td></tr>
	 *			<tr><td><code>Filter.*</code></td><td>If the listing is based on comparing an item namevalue to a filter value, you can provide the actual filter here.
	 *				For example, if the user was browsing a specific category, name='Filter.CategoryId' and value='CategoryA' can be specified.</td></tr>
	 *		</table>
	 *	</td></tr>
	 *	<tr><td><code>NEXT_RECOMMENDATION</code></td><td>ADDITIONAL</td><td>The user asked for more recommendation.</td><td></td></tr>
	 *	<tr><td><code>COMMENT</code></td><td>ADDITIONAL</td><td>The user wrote a comment for the item.</td><td></td></tr>
	 *	<tr><td><code>NOT_INTERESTED</code></td><td>ADDITIONAL</td><td>The user would not like this item and similar items to be recommended to him, but he also does not want to give a negative rating for this item.</td><td></td></tr>
	 *	<tr><td><code>LETTER_READ</code></td><td>ADDITIONAL</td><td>T The user read a letter which sent for him by the system (eg. a newsletter).</td><td></td></tr>
	 *	<tr><td><code>CLICK_OUT</code></td><td>PRICE COMPARISON</td><td>The user jumps to an external webshop to buy the product. Used by price comparison sites.</td><td></td></tr>
	 *	<tr><td><code>LANCE</code></td><td>AUCTION</td><td>The user place a bid on the item.</td><td><code>Value</code>The value of the bid as a decimal number.</td></tr>
	 *	<tr><td><code>LETTER_SEND</code></td><td>AUCTION, ADVERTISING</td><td>The user sent a message to the advertiser.</td><td></td></tr>
	 *	<tr><td><code>ADD_ITEM</code></td><td>AUCTION, ADVERTISING</td><td>The user added an item to the site.</td><td></td></tr>
	 *	<tr><td><code>FREE_VIEW</code></td><td>MEDIA</td><td>The user wached/listened an item for free.</td><td><code>Duration</code>How long the user wached the item in seconds as a decimal number.</td></tr>
	 *	<tr><td><code>PAID_VIEW</code></td><td>MEDIA</td><td>The user payed for waching/listening an item.</td><td>
	 *      <table summary="parameters">
	 *			<tr><td><code>Duration</code></td><td>How long the user wached the item in seconds. A decimal number.</td></tr>
	 *			<tr><td><code>Value</code></td><td>How much the user payed for waching the item. A decimal number.</td></tr>
	 *		</table>
	 *  </td></tr>
	 *	<tr><td><code>SUBSCRIPTION_VIEW</code></td><td>MEDIA</td><td>The user watched an item that was available for him by a subscription.</td><td>
	 *      <table summary="parameters">
	 *			<tr><td><code>Duration</code></td><td>How long the user wached the item in seconds. A decimal number.</td></tr>
	 *		</table>
	 *  </td></tr>
	 *	<tr><td><code>FOLLOW_USER</code></td><td>SOCIAL</td><td>The user follows an other user.</td><td><code>OtherUserId</code>The identifier of the followed user.</td></tr>
	 *	<tr><td><code>SHARE</code></td><td>SOCIAL</td><td>The user share the item on a social site (eg. Facebook, Twitter,...).</td><td></td></tr>
	 *	<tr><td><code>REDEEM</code></td><td>COUPON</td><td>The user redeem the item (eg. a coupon).</td><td></td></tr>
	 * </table>
	 *
	 */
	public String eventType;

	/**
	 * NameValues provide additional description of the event.
	 * There can multiple NameValues with the same name.
	 * The order of NameValues will not be preserved, but the order of the values for the same name will be preserved.
	 */
	public GravityNameValue[] nameValues;

	/**
	 * It should be an id of a previous recommendation, if this event is a consequence of a recommendation.
	 * See {@link GravityItemRecommendation#recommendationId}.
	 */
	public String recommendationId;

	@Override
	public String toString() {
		return "GravityEvent{" + "itemId='" + itemId + '\'' +
				", userId='" + userId + '\'' +
				", cookieId='" + cookieId + '\'' +
				", time=" + time +
				", eventType='" + eventType + '\'' +
				", nameValues=" + Arrays.toString(nameValues) +
				", recommendationId='" + recommendationId + '\'' +
				'}';
	}
}
