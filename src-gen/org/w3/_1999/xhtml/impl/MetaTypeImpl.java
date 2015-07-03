/**
 */
package org.w3._1999.xhtml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.w3._1999.xhtml.MetaType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getHttpEquiv <em>Http Equiv</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.MetaTypeImpl#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaTypeImpl extends MinimalEObjectImpl.Container implements MetaType {
    /**
     * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContent()
     * @generated
     * @ordered
     */
    protected static final String CONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContent()
     * @generated
     * @ordered
     */
    protected String content = CONTENT_EDEFAULT;

    /**
     * The default value of the '{@link #getHttpEquiv() <em>Http Equiv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHttpEquiv()
     * @generated
     * @ordered
     */
    protected static final String HTTP_EQUIV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHttpEquiv() <em>Http Equiv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHttpEquiv()
     * @generated
     * @ordered
     */
    protected String httpEquiv = HTTP_EQUIV_EDEFAULT;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected static final String LANG1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang1()
     * @generated
     * @ordered
     */
    protected String lang1 = LANG1_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheme()
     * @generated
     * @ordered
     */
    protected static final String SCHEME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheme()
     * @generated
     * @ordered
     */
    protected String scheme = SCHEME_EDEFAULT;

    /**
     * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpace()
     * @generated
     * @ordered
     */
    protected static final SpaceType SPACE_EDEFAULT = SpaceType.DEFAULT_LITERAL;

    /**
     * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpace()
     * @generated
     * @ordered
     */
    protected SpaceType space = SPACE_EDEFAULT;

    /**
     * This is true if the Space attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spaceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MetaTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getMetaType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContent() {
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContent(String newContent) {
        String oldContent = content;
        content = newContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__CONTENT, oldContent, content));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHttpEquiv() {
        return httpEquiv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHttpEquiv(String newHttpEquiv) {
        String oldHttpEquiv = httpEquiv;
        httpEquiv = newHttpEquiv;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__HTTP_EQUIV, oldHttpEquiv, httpEquiv));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang(String newLang) {
        String oldLang = lang;
        lang = newLang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__LANG, oldLang, lang));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang1() {
        return lang1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang1(String newLang1) {
        String oldLang1 = lang1;
        lang1 = newLang1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__LANG1, oldLang1, lang1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScheme(String newScheme) {
        String oldScheme = scheme;
        scheme = newScheme;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__SCHEME, oldScheme, scheme));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpaceType getSpace() {
        return space;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpace(SpaceType newSpace) {
        SpaceType oldSpace = space;
        space = newSpace == null ? SPACE_EDEFAULT : newSpace;
        boolean oldSpaceESet = spaceESet;
        spaceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.META_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSpace() {
        SpaceType oldSpace = space;
        boolean oldSpaceESet = spaceESet;
        space = SPACE_EDEFAULT;
        spaceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.META_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSpace() {
        return spaceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XHTML11Package.META_TYPE__CONTENT:
                return getContent();
            case XHTML11Package.META_TYPE__HTTP_EQUIV:
                return getHttpEquiv();
            case XHTML11Package.META_TYPE__LANG:
                return getLang();
            case XHTML11Package.META_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.META_TYPE__NAME:
                return getName();
            case XHTML11Package.META_TYPE__SCHEME:
                return getScheme();
            case XHTML11Package.META_TYPE__SPACE:
                return getSpace();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XHTML11Package.META_TYPE__CONTENT:
                setContent((String)newValue);
                return;
            case XHTML11Package.META_TYPE__HTTP_EQUIV:
                setHttpEquiv((String)newValue);
                return;
            case XHTML11Package.META_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.META_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.META_TYPE__NAME:
                setName((String)newValue);
                return;
            case XHTML11Package.META_TYPE__SCHEME:
                setScheme((String)newValue);
                return;
            case XHTML11Package.META_TYPE__SPACE:
                setSpace((SpaceType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XHTML11Package.META_TYPE__CONTENT:
                setContent(CONTENT_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__HTTP_EQUIV:
                setHttpEquiv(HTTP_EQUIV_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__SCHEME:
                setScheme(SCHEME_EDEFAULT);
                return;
            case XHTML11Package.META_TYPE__SPACE:
                unsetSpace();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XHTML11Package.META_TYPE__CONTENT:
                return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
            case XHTML11Package.META_TYPE__HTTP_EQUIV:
                return HTTP_EQUIV_EDEFAULT == null ? httpEquiv != null : !HTTP_EQUIV_EDEFAULT.equals(httpEquiv);
            case XHTML11Package.META_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.META_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.META_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XHTML11Package.META_TYPE__SCHEME:
                return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
            case XHTML11Package.META_TYPE__SPACE:
                return isSetSpace();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (content: ");
        result.append(content);
        result.append(", httpEquiv: ");
        result.append(httpEquiv);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
        result.append(", name: ");
        result.append(name);
        result.append(", scheme: ");
        result.append(scheme);
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //MetaTypeImpl
