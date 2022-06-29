package com.inversionOfControl.springDemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today's fortune is that hard work will bring you success...eventually ;)";
	}

}
