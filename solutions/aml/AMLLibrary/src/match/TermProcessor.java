/*******************************************************************************

 * Copyright (c) 2009 Ecole des Mines de Nantes.

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kelly Garces - initial API and implementation and/or initial documentation
 *******************************************************************************/ 

package match;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class TermProcessor {

	DistractorFilter f;
	static TermProcessor instance;
	LinkedHashSet<Tokenizer> tokenizerSet;
		
	TermProcessor() {
		tokenizerSet = new LinkedHashSet<Tokenizer>();
		f = new DistractorFilter();
		initTokenizers();
	}
	
	public static TermProcessor Instance() {
				
		if (instance == null) {
			
			instance = new TermProcessor();
		} 
				
		return instance;
	}
	
	public void initTokenizers() {
		try {			
			// Tokenizers order is relevant, if there is not tokenizer applying, UpperCaseTokenizer is default 
			String[] tokenizers = {"UnderScoreTokenizer", "HyphenTokenizer", "UpperCaseTokenizer"};
			for(int i=0; i<tokenizers.length; i++){
				tokenizerSet.add((Tokenizer) Class.forName("match." + tokenizers[i]).newInstance());
			}	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> getProperTerm (String cad, List<String> distractors) {
				
		Iterator<Tokenizer> ite = tokenizerSet.iterator();
		List<String> tokCad;
		Tokenizer t;
		while(ite.hasNext()) {
			t = (Tokenizer) ite.next();
			tokCad = t.tokenize(cad);
			String tok = tokCad.get(0);
			if(!tok.equals(cad.toLowerCase())) {
				return f.filter(tokCad, distractors);
			} 			
		}
		 		
		List<String> sameCad = new ArrayList<String>();
		sameCad.add(cad);
		return sameCad;
		
	}
}
