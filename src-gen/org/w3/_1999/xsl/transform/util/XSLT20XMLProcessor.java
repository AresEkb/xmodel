/**
 */
package org.w3._1999.xsl.transform.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.w3._1999.xsl.transform.XSLT20Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XSLT20XMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XSLT20XMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        XSLT20Package.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XSLT20ResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XSLT20ResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XSLT20ResourceFactoryImpl());
        }
        return registrations;
    }

} //XSLT20XMLProcessor
