package org.mindhub.optional;

import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Computer c = new Computer();
		SoundCard s = new SoundCard();
		USB u = new USB("3.0");
		s.setUsb(u);
		c.setSoundCard(s);
		printUsbVersion2(c);
	}

	public static void printUsbVersion2(Computer c) {
//		c.getSoundCard().ifPresentOrElse(card -> System.out.println(card), () -> {
//			System.out.println("Card dosn't exist");
//		});

//		SoundCard soundCard = c.getSoundCard().orElse(new SoundCard());
//		System.out.println(soundCard);

		c.getSoundCard().flatMap(card -> card.getUsb()).filter(usb -> "3.0".equals(usb.getVersion()))
				.ifPresentOrElse(usb -> System.out.println(usb.getVersion()), () -> {
					throw new NoSuchElementException();
				});

//		System.out.println(c.getSoundCard().get());
//		soundCard.isEmpty();
//		soundCard.isPresent();
	}

//	public static void printUsbVersion(Computer computer) {
//		if (computer != null && computer.getSoundCard() != null && computer.getSoundCard().getUsb() != null) {
//			System.out.println(computer.getSoundCard().getUsb().getVersion());
//		} else {
//			System.out.println("There is null somwhere");
//		}
//	}

}
