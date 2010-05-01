package match;

import java.util.List;
import java.util.Map;

import org.eclipse.m2m.atl.engine.emfvm.lib.AbstractStackFrame;
import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;
import org.eclipse.m2m.atl.engine.emfvm.lib.Operation;

public class ProperTermSimilarity implements LibExtension {

	@Override
	public void apply(ExecEnv execEnv, Map<String, Object> options) {
		Operation opGetProperTerm = new Operation(2,  "getProperTerm") {		
			public Object exec(AbstractStackFrame frame) {
				Object localVars[] = frame.getLocalVars();
				String cad = (String)localVars[0];
				List distractors = (List)localVars[1];
				return TermProcessor.Instance().getProperTerm(cad, distractors);
			}
		};
		execEnv.registerOperation(String.class, opGetProperTerm);
		

	}

}
