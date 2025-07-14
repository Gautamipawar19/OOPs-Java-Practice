package com.capgemini.recurit.itskills;
import biz.cybersuccess.training.CyberSuccessSkills;
import com.mettle.Assessment;

class CapgeminiHiring extends CyberSuccessSkills
{
	public static void main(String args[])
	{
		CapgeminiHiring ch = new CapgeminiHiring();
		ch.java();
		ch.testing();
		ch.python();
		Assessment ass = new Assessment();
		ass.startAssessment();
		ass.stopAssessment();
	}
}