package org.mindhub.optional;

import java.util.Optional;

public class SoundCard {
	private Optional<USB> usb;

	public Optional<USB> getUsb() {
		return usb;
	}

	public void setUsb(USB usb) {
		this.usb = Optional.of(usb);
	}

	@Override
	public String toString() {
		return "SoundCard [usb=" + usb + "]";
	}

}
