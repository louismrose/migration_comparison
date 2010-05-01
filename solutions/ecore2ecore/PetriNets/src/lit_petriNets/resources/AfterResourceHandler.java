package lit_petriNets.resources;
/*******************************************************************************
 * Copyright (c) 2009 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************
 *
 * $Id$
 */


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lit_petriNets.Lit_petriNetsFactory;
import lit_petriNets.Lit_petriNetsPackage;
import lit_petriNets.PTArc;
import lit_petriNets.Place;
import lit_petriNets.TPArc;
import lit_petriNets.Transition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

public class AfterResourceHandler extends BasicResourceHandler {

	@Override
	public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
		final Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
		
		for(Entry<EObject, AnyType> entry : extMap.entrySet()) {
			handleUnknownData(entry.getKey(), entry.getValue());
		}
	}

	private void handleUnknownData(EObject eObj, AnyType unknownData) {
		
		handleUnknownFeatures(eObj, unknownData.getMixed());
		handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
	}
	
	private Collection<EObject> getEObjects(String href, Resource resource) {
		Collection<EObject> eObjects = new ArrayList<EObject>();
		String[] ids = String.valueOf(href).split(" ");
		for (String id : ids) {
			EObject eObject = resource.getEObject(id.trim());
			if (eObject != null) {
				eObjects.add(eObject);
			}
		}
		return eObjects;
	}
	
	private void handleUnknownFeatures(EObject owner, FeatureMap featureMap) {
		for (Iterator<FeatureMap.Entry> iter = featureMap.iterator(); iter.hasNext();) {
			final FeatureMap.Entry entry = iter.next();
			
			if (Lit_petriNetsPackage.eINSTANCE.getTransition().isInstance(owner)) {
				Resource resource = owner.eResource();
				
				if (entry.getEStructuralFeature().getName().equals("src")) {
					Collection<EObject> places = getEObjects(String.valueOf(entry.getValue()), resource);
					for (EObject place : places) {
						Place p = (Place) place;
						PTArc arc = Lit_petriNetsFactory.eINSTANCE.createPTArc();
						arc.setNet(p.getNet());
						arc.setSrc(p);
						arc.setDst((Transition) owner);
					}
				}
				else if (entry.getEStructuralFeature().getName().equals("dst")) {
					Collection<EObject> places = getEObjects(String.valueOf(entry.getValue()), resource);
					for (EObject place : places) {
						Place p = (Place) place;
						TPArc arc = Lit_petriNetsFactory.eINSTANCE.createTPArc();
						arc.setNet(p.getNet());
						arc.setSrc((Transition) owner);
						arc.setDst(p);
					}
				}
			}
			
			/*
			if (isJobItem(owner)) {
				if (isEmployee(entry.getEStructuralFeature())) {
					migrateEmployee((JobItem)owner, (String)entry.getValue());
					iter.remove();	
				}
			} else {
				System.err.println("Not a job item: " + owner);
			}
			*/
		}
	}
	
	/*
	private boolean isJobItem(EObject eObject) {
		return ExtractsubclassPackage.eINSTANCE.getJobItem().isInstance(eObject);
	}
	
	private boolean isEmployee(EStructuralFeature feature) {
		return "employee".equals(feature.getName());
	}
	
	private void migrateEmployee(JobItem owner, String employee) {
		if (employee.length() > 0) {
			final LabourItem replacement = ExtractsubclassFactory.eINSTANCE.createLabourItem();
			replacement.setJobPrice(owner.getJobPrice());
			replacement.setTotalPrice(owner.getTotalPrice());
			replacement.setEmployee(employee);
			
			replace(((extractsubclass.System)owner.eContainer()).getItems(), owner, replacement);
		}
	}

	private static <T> void replace(List<T> list, T existing, T replacement) {
		final int index = list.indexOf(existing);
		list.remove(index);
		list.add(index, replacement);
	} */
}
