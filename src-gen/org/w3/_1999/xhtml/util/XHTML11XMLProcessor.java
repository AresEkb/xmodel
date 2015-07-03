/**
 */
package org.w3._1999.xhtml.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.w3._1999.xhtml.XHTML11Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XHTML11XMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XHTML11XMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        XHTML11Package.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XHTML11ResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XHTML11ResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XHTML11ResourceFactoryImpl());
        }
        return registrations;
    }

} //XHTML11XMLProcessor
