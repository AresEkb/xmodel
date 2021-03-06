/**
 */
package org.w3._2007.xml.schema.versioning.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLSchemaVersioningXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLSchemaVersioningXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        XMLSchemaVersioningPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XMLSchemaVersioningResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XMLSchemaVersioningResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XMLSchemaVersioningResourceFactoryImpl());
        }
        return registrations;
    }

} //XMLSchemaVersioningXMLProcessor
