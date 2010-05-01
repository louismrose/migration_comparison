package match;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.m2m.atl.engine.emfvm.lib.AbstractStackFrame;
import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;
import org.eclipse.m2m.atl.engine.emfvm.lib.Operation;

import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.ISynsetID;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;

/**
 * implements methods that compare terms by using the Wordnet API developed by
 * Mark Finlayson http://projects.csail.mit.edu/jwi/
 * @author garces
 *
 */
public class JWISimilarity implements LibExtension {

	static IDictionary dict;
	static {
		String wnhome = System.getenv("WNHOME");
		String path = wnhome + File.separator + "dict";
		URL url;
		try {
			url = new URL("file", null, path);
			// construct the dictionary object and open it
			dict = new Dictionary(url);
			dict.open();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.err.println("The Wordnet directory path is wrong");
			e.printStackTrace();
		}
	}
	@Override
	public void apply(ExecEnv execEnv, Map<String, Object> options) {
		
		
		
		Operation opJwiSimilarity = new Operation(3, "jwiSimilarity") {

			@Override
			public Object exec(AbstractStackFrame frame) {
				Object localVars[] = frame.getLocalVars();
				String wildCard = (String) localVars[0]; 
				List<String> noun1Proper = (List<String>)localVars[1];
				List<String> noun2Proper = (List<String>)localVars[2];
				return jwiSimilarity(noun1Proper, noun2Proper);
			}

	};
	execEnv.registerOperation(String.class, opJwiSimilarity);
	
	}
	
	public Double jwiSimilarity (List<String> noun1Proper, List<String> noun2Proper) {
		Double acum = 0.0;
		Double sim;
		int count = 0;
//		System.out.println("here");
		for(Iterator<String> ite1 = noun1Proper.iterator(); ite1.hasNext();){
			String subNoun1 = ite1.next();
			for(Iterator<String> ite2 = noun2Proper.iterator(); ite2.hasNext();){
				
				String subNoun2 = ite2.next();
//				System.out.println("*********");
//				System.out.println(subNoun1);
//				System.out.println(subNoun1.length());
//				System.out.println(subNoun2);
//				System.out.println(subNoun2.length());
				
				sim = compareRelatedSynsets(subNoun1, subNoun2);
				if (!sim.isNaN()) { 
					acum = acum + sim; 
				}
				
				
				count++;
			}
		}
		return acum / count;
	}
	
	public Double compareRelatedSynsets (String noun1, String noun2) {		
		
		List<ISynsetID> myList = getRelatedSynsets(noun1);
		List<ISynsetID> myList2 = getRelatedSynsets(noun2);
		
		return jaccardDistance(myList, myList2);
		
		
	}
	
	private Double jaccardDistance (List myList, List myList2) {
		
		List<ISynsetID> intersection = new ArrayList<ISynsetID>(myList);
		intersection.retainAll(myList2);
		Double intersSize = new Double(intersection.size());
		Double unionSize = new Double (myList.size() + myList2.size());
			
		return intersSize/unionSize;
		
	}
	
	private List<ISynsetID>  getRelatedSynsets (String noun){
		
		List<ISynsetID> list = new ArrayList<ISynsetID>();
		
		IIndexWord idxWordNoun = dict.getIndexWord(noun, POS.NOUN);
		if (idxWordNoun != null) {
			
			List<IWordID> listWordNoun = idxWordNoun.getWordIDs();
								
			for(Iterator<IWordID> ite = listWordNoun.iterator(); ite.hasNext();){
				IWordID wordID1 = ite.next();
				IWord word = dict.getWord(wordID1);
				ISynset synset = word.getSynset();
				list.addAll(synset.getRelatedSynsets());
			}
		
		}
		
		return list;
		
	}
	/**
	 * implementation of method proposed in Euzenat's book pag. 90
	 * @param noun1
	 * @param noun2
	 * @return
	 */	
	public Double compareSynonyms (String noun1, String noun2) {
		
		
		List<String> myListSynonyms = getSynomyns(noun1);
		List<String> myList2Synonyms = getSynomyns(noun2);
				
		
		return jaccardDistance(myListSynonyms, myList2Synonyms);
	}
	
	private List<String>  getSynomyns (String noun){
		
		List<String> list = new ArrayList<String>();
		
		IIndexWord idxWordNoun = dict.getIndexWord(noun, POS.NOUN);
		if (idxWordNoun != null) {
			
			List<IWordID> listWordNoun = idxWordNoun.getWordIDs();
								
			for(Iterator<IWordID> ite = listWordNoun.iterator(); ite.hasNext();){
				IWordID wordID1 = ite.next();
				IWord word = dict.getWord(wordID1);
				ISynset synset = word.getSynset();
				for(IWord w : synset.getWords()) {
					list.add(w.getLemma());
				}
			}
		
		}
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		/*
		SenseKeyParser sKeyP = SenseKeyParser.getInstance();
		ISenseKey dog = sKeyP.parseLine("dog eats something");
		ISenseKey cat = sKeyP.parseLine("cat");
		
		System.out.println(dog.compareTo(cat));
*/
		TermProcessor t = TermProcessor.Instance();
		
		String noun1 = "Person" ;
		List<String> noun1Proper = t.getProperTerm(noun1, Collections.EMPTY_LIST);
		
		String noun2 = "Family";		
		List<String> noun2Proper = t.getProperTerm(noun2, Collections.EMPTY_LIST);
		
		
		JWISimilarity j = new JWISimilarity();
		
		j.jwiSimilarity(noun1Proper, noun2Proper);
		
	}	
}
