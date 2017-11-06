package com.rule.runners;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rule.classes.*;

public class DemoRulesTest {

	public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // Set up People and Pets       	
            Person johnDoe = new Person("male", "John", "Doe", 50, JobType.DOCTOR, new ArrayList<Pet>());
            Person janeDoe = new Person("female", "Jane", "Doe", 50, JobType.LAWYER, new ArrayList<Pet>());
            Person tomBrady = new Person("male", "Tom", "Brady", 40, JobType.ATHLETE, new ArrayList<Pet>());
            Person jillDoe = new Person("female", "Jill", "Doe", 61, JobType.LAWYER, new ArrayList<Pet>());
            Person davidOrtiz = new Person("male", "David", "Ortiz", 40, JobType.ATHLETE, new ArrayList<Pet>());
            Person sallyDoe = new Person("female", "Sally", "Doe", 28, JobType.LAWYER, new ArrayList<Pet>());
            
            Pet rocco = new Pet(PetType.DOG, "Rocco", 5, johnDoe);
            Pet squirt = new Pet(PetType.FISH, "Squirt", 1, johnDoe);
            Pet fluffy = new Pet(PetType.CAT, "Fluffy", 7, jillDoe);
            Pet fido = new Pet(PetType.DOG, "Fido", 2, tomBrady);
            
            johnDoe.addPet(rocco);
            johnDoe.addPet(squirt);
            jillDoe.addPet(fluffy);
            tomBrady.addPet(fido);
            
            
            // Fire the rules
            kSession.insert(johnDoe);
            kSession.insert(janeDoe);
            kSession.insert(tomBrady);
            kSession.insert(jillDoe);
            kSession.insert(davidOrtiz);
            kSession.insert(sallyDoe);
            
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
