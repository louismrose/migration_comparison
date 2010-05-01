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
import java.util.List;
import java.util.StringTokenizer;

abstract public class SymbolTokenizer implements Tokenizer {
	
	private String symbol;
	
		
	SymbolTokenizer (String symbolArg) {
		symbol = symbolArg;
	}
	
	public List<String> tokenize (String cad) {
		
		StringTokenizer s = new StringTokenizer(cad, symbol);
		List<String> outCad = new ArrayList<String>();
		while (s.hasMoreTokens()) {
	         outCad.add(s.nextToken().trim().toLowerCase()) ;
	     }
		
		return outCad;
	}
	
	
		
}
