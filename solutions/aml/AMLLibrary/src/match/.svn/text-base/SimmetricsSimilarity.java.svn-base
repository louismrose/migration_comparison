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

import java.util.Map;

import org.eclipse.m2m.atl.engine.emfvm.lib.AbstractStackFrame;
import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;
import org.eclipse.m2m.atl.engine.emfvm.lib.Operation;

import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein;

public class SimmetricsSimilarity implements LibExtension {

	@Override
	
	public void apply(ExecEnv execEnv, Map<String, Object> options) {
			
		Operation opGetStringSim = new Operation(2, "getStringSim") {
				public Object exec(AbstractStackFrame frame) {
					Object localVars[] = frame.getLocalVars();
					double ret = 0;
					String s1 = (String)localVars[0];
					String s2 = (String)localVars[1];
					if((s1.length() > 0) && (s2.length() > 0))
						ret = new Levenshtein().getSimilarity(s1, s2);
					return new Double(ret);
				}
			};		
			execEnv.registerOperation(String.class, opGetStringSim);
			
		
	}

}
