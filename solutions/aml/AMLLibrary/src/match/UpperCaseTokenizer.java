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
import java.util.List;

public class UpperCaseTokenizer implements Tokenizer {
	
	
	public List<String> tokenize (String cad) {
		
		List<String> rCad = new ArrayList<String>();
		char[] cadChar = cad.toCharArray();
		ArrayList<Integer> cUpperIndexes = new ArrayList<Integer>();
		int i = 0;
		while(i < cadChar.length) {
			
			if (Character.isUpperCase(cadChar[i])) {
				cUpperIndexes.add(i);
			}
			i++;
		}
		
		cUpperIndexes.add(cadChar.length);
		
		int startIndex = 0, endIndex = 0;
		Iterator<Integer> ite = cUpperIndexes.iterator();
		
		while(ite.hasNext()){
			
			endIndex = ite.next();
			rCad.add(cad.substring(startIndex, endIndex).trim().toLowerCase());
			
			startIndex = endIndex;
		}
		// delete first and last whitespace
		
		String firstCad = rCad.get(0); 
		if (firstCad.equals("")) {
			rCad.remove(0); 
		}
		
		return rCad;
	}
		
}
