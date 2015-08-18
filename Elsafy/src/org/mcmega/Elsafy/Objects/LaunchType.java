package org.mcmega.Elsafy.Objects;

public enum LaunchType {
	
	ICE_BLAST(1),
	SNOW_PILLAR(2),
	SNOWFLAKE(3),
	ICE_SPIKES(4);
	
	private int option;
	
	LaunchType(int option){
		this.option = option;
	}

}
