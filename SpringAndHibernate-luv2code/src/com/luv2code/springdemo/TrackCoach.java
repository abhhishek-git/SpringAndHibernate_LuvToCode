package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService myFurtuneService) {
		fortuneService = myFurtuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k from Track Coach";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Trackcoach: inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrachCoach: inside method doMyCleanupStuff");
	}
	
	//add a destroy method

}
