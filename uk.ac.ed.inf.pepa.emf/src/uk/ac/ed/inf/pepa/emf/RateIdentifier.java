/*******************************************************************************
 * Copyright (c) 2006, 2009 University of Edinburgh.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the BSD Licence, which
 * accompanies this feature and can be downloaded from
 * http://groups.inf.ed.ac.uk/pepa/update/licence.txt
 *******************************************************************************/
/*
 * Created on 08-Aug-2006
 *
 */
package uk.ac.ed.inf.pepa.emf;

/**
 * A <code>Rate</code> with a name. It represents declarations made in the
 * rate declaration section of a <code>.pepa</code> file, e.g.
 * <p>
 * <code>r = 1.0;</code>
 * 
 * @author mtribast
 * @model 
 *  
 */
public interface RateIdentifier extends FiniteRate {
    
    /**
     * @return the name 
     * @model
     */
    public String getName();

    
	/**
	 * Sets the value of the '{@link uk.ac.ed.inf.pepa.emf.RateIdentifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

}