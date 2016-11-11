package soundsystem.components;

import org.springframework.stereotype.Component;

import soundsystem.CompactDisc;

//SEVERE: Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener@2aaf7cc2] to prepare test instance [soundsystem.CDPlayerTest@1b1473ab]
//org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'soundsystem.CDPlayerTest': Unsatisfied dependency expressed through field 'cd': No qualifying bean of type [soundsystem.CompactDisc] is defined: expected single matching bean but found 2: sgtPeppers,sgtPeppers2; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [soundsystem.CompactDisc] is defined: expected single matching bean but found 2: sgtPeppers,sgtPeppers2
//	
// Above error occurs when you define 2 component for the same bean
@Component("lonelyHeartsClub")
public class SgtPeppers2 implements CompactDisc {

	 private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	 private String artist = "The Sandeep";
			  
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}
}
