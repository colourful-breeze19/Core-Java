/**
 * @enum Type
 * @author chahat
 * @description enum contains three itemtype namely raw,manufactured and imported.
 *
 */
package constant;

public enum Type {
	RAW("Raw"), MANUFACTURED("Manufactured"), IMPORTED("Imported");

	private String type;

	Type(String itemType) {
		type = itemType;
	}

	public String getType() {
		return type;
	}
}
