package org.mindhub.optional;

public class USB {
	private String version;

	public USB(String version) {
		if (version == null) {
			throw new IllegalArgumentException("Version must not be null");
		}

		this.version = version;
	}

	public String getVersion() {
		return version;
	}

}
