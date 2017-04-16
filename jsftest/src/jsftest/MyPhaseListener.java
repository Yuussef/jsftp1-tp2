package jsftest;

import javax.faces.event.PhaseListener;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseEvent;

public class MyPhaseListener implements PhaseListener  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void beforePhase(PhaseEvent pe){
		System.out.println("avant la phase" + pe.getPhaseId());
		
	}
	public void afterPhase(PhaseEvent pe){
		System.out.println("Apres la phase" + pe.getPhaseId());
	}
	public PhaseId getPhaseId(){
		return PhaseId.ANY_PHASE;
	}

}
