/**
 */
package org.w3._1999.xhtml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.w3._1999.xhtml.BaseType;
import org.w3._1999.xhtml.HeadType;
import org.w3._1999.xhtml.LinkType;
import org.w3._1999.xhtml.MetaType;
import org.w3._1999.xhtml.ObjectType;
import org.w3._1999.xhtml.ScriptType;
import org.w3._1999.xhtml.StyleType;
import org.w3._1999.xhtml.TitleType;
import org.w3._1999.xhtml.XHTML11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getXhtmlHeadOptsMix <em>Xhtml Head Opts Mix</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getXhtmlHeadOptsMix1 <em>Xhtml Head Opts Mix1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getScript1 <em>Script1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getMeta1 <em>Meta1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLink1 <em>Link1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getObject1 <em>Object1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getXhtmlHeadOptsMix2 <em>Xhtml Head Opts Mix2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getScript2 <em>Script2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getStyle2 <em>Style2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getMeta2 <em>Meta2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLink2 <em>Link2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getObject2 <em>Object2</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getBase1 <em>Base1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getXhtmlHeadOptsMix3 <em>Xhtml Head Opts Mix3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getScript3 <em>Script3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getStyle3 <em>Style3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getMeta3 <em>Meta3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLink3 <em>Link3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getObject3 <em>Object3</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getXhtmlHeadOptsMix4 <em>Xhtml Head Opts Mix4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getScript4 <em>Script4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getStyle4 <em>Style4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getMeta4 <em>Meta4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLink4 <em>Link4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getObject4 <em>Object4</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.HeadTypeImpl#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadTypeImpl extends MinimalEObjectImpl.Container implements HeadType {
    /**
     * The cached value of the '{@link #getXhtmlHeadOptsMix() <em>Xhtml Head Opts Mix</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlHeadOptsMix()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlHeadOptsMix;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected TitleType title;

    /**
     * The cached value of the '{@link #getXhtmlHeadOptsMix1() <em>Xhtml Head Opts Mix1</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlHeadOptsMix1()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlHeadOptsMix1;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected BaseType base;

    /**
     * The cached value of the '{@link #getXhtmlHeadOptsMix2() <em>Xhtml Head Opts Mix2</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlHeadOptsMix2()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlHeadOptsMix2;

    /**
     * The cached value of the '{@link #getBase1() <em>Base1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase1()
     * @generated
     * @ordered
     */
    protected BaseType base1;

    /**
     * The cached value of the '{@link #getXhtmlHeadOptsMix3() <em>Xhtml Head Opts Mix3</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlHeadOptsMix3()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlHeadOptsMix3;

    /**
     * The cached value of the '{@link #getTitle1() <em>Title1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle1()
     * @generated
     * @ordered
     */
    protected TitleType title1;

    /**
     * The cached value of the '{@link #getXhtmlHeadOptsMix4() <em>Xhtml Head Opts Mix4</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXhtmlHeadOptsMix4()
     * @generated
     * @ordered
     */
    protected FeatureMap xhtmlHeadOptsMix4;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

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
     * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfile()
     * @generated
     * @ordered
     */
    protected static final List<String> PROFILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfile()
     * @generated
     * @ordered
     */
    protected List<String> profile = PROFILE_EDEFAULT;

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
    protected HeadTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XHTML11Package.eINSTANCE.getHeadType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlHeadOptsMix() {
        if (xhtmlHeadOptsMix == null) {
            xhtmlHeadOptsMix = new BasicFeatureMap(this, XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX);
        }
        return xhtmlHeadOptsMix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript() {
        return getXhtmlHeadOptsMix().list(XHTML11Package.eINSTANCE.getHeadType_Script());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StyleType> getStyle() {
        return getXhtmlHeadOptsMix().list(XHTML11Package.eINSTANCE.getHeadType_Style());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MetaType> getMeta() {
        return getXhtmlHeadOptsMix().list(XHTML11Package.eINSTANCE.getHeadType_Meta());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkType> getLink() {
        return getXhtmlHeadOptsMix().list(XHTML11Package.eINSTANCE.getHeadType_Link());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject() {
        return getXhtmlHeadOptsMix().list(XHTML11Package.eINSTANCE.getHeadType_Object());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
        TitleType oldTitle = title;
        title = newTitle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__TITLE, oldTitle, newTitle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(TitleType newTitle) {
        if (newTitle != title) {
            NotificationChain msgs = null;
            if (title != null)
                msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__TITLE, null, msgs);
            if (newTitle != null)
                msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__TITLE, null, msgs);
            msgs = basicSetTitle(newTitle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__TITLE, newTitle, newTitle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlHeadOptsMix1() {
        if (xhtmlHeadOptsMix1 == null) {
            xhtmlHeadOptsMix1 = new BasicFeatureMap(this, XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1);
        }
        return xhtmlHeadOptsMix1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript1() {
        return getXhtmlHeadOptsMix1().list(XHTML11Package.eINSTANCE.getHeadType_Script1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StyleType> getStyle1() {
        return getXhtmlHeadOptsMix1().list(XHTML11Package.eINSTANCE.getHeadType_Style1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MetaType> getMeta1() {
        return getXhtmlHeadOptsMix1().list(XHTML11Package.eINSTANCE.getHeadType_Meta1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkType> getLink1() {
        return getXhtmlHeadOptsMix1().list(XHTML11Package.eINSTANCE.getHeadType_Link1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject1() {
        return getXhtmlHeadOptsMix1().list(XHTML11Package.eINSTANCE.getHeadType_Object1());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseType getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBase(BaseType newBase, NotificationChain msgs) {
        BaseType oldBase = base;
        base = newBase;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__BASE, oldBase, newBase);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(BaseType newBase) {
        if (newBase != base) {
            NotificationChain msgs = null;
            if (base != null)
                msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__BASE, null, msgs);
            if (newBase != null)
                msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__BASE, null, msgs);
            msgs = basicSetBase(newBase, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__BASE, newBase, newBase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlHeadOptsMix2() {
        if (xhtmlHeadOptsMix2 == null) {
            xhtmlHeadOptsMix2 = new BasicFeatureMap(this, XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2);
        }
        return xhtmlHeadOptsMix2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript2() {
        return getXhtmlHeadOptsMix2().list(XHTML11Package.eINSTANCE.getHeadType_Script2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StyleType> getStyle2() {
        return getXhtmlHeadOptsMix2().list(XHTML11Package.eINSTANCE.getHeadType_Style2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MetaType> getMeta2() {
        return getXhtmlHeadOptsMix2().list(XHTML11Package.eINSTANCE.getHeadType_Meta2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkType> getLink2() {
        return getXhtmlHeadOptsMix2().list(XHTML11Package.eINSTANCE.getHeadType_Link2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject2() {
        return getXhtmlHeadOptsMix2().list(XHTML11Package.eINSTANCE.getHeadType_Object2());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseType getBase1() {
        return base1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBase1(BaseType newBase1, NotificationChain msgs) {
        BaseType oldBase1 = base1;
        base1 = newBase1;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__BASE1, oldBase1, newBase1);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase1(BaseType newBase1) {
        if (newBase1 != base1) {
            NotificationChain msgs = null;
            if (base1 != null)
                msgs = ((InternalEObject)base1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__BASE1, null, msgs);
            if (newBase1 != null)
                msgs = ((InternalEObject)newBase1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__BASE1, null, msgs);
            msgs = basicSetBase1(newBase1, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__BASE1, newBase1, newBase1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlHeadOptsMix3() {
        if (xhtmlHeadOptsMix3 == null) {
            xhtmlHeadOptsMix3 = new BasicFeatureMap(this, XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3);
        }
        return xhtmlHeadOptsMix3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript3() {
        return getXhtmlHeadOptsMix3().list(XHTML11Package.eINSTANCE.getHeadType_Script3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StyleType> getStyle3() {
        return getXhtmlHeadOptsMix3().list(XHTML11Package.eINSTANCE.getHeadType_Style3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MetaType> getMeta3() {
        return getXhtmlHeadOptsMix3().list(XHTML11Package.eINSTANCE.getHeadType_Meta3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkType> getLink3() {
        return getXhtmlHeadOptsMix3().list(XHTML11Package.eINSTANCE.getHeadType_Link3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject3() {
        return getXhtmlHeadOptsMix3().list(XHTML11Package.eINSTANCE.getHeadType_Object3());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TitleType getTitle1() {
        return title1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTitle1(TitleType newTitle1, NotificationChain msgs) {
        TitleType oldTitle1 = title1;
        title1 = newTitle1;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__TITLE1, oldTitle1, newTitle1);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle1(TitleType newTitle1) {
        if (newTitle1 != title1) {
            NotificationChain msgs = null;
            if (title1 != null)
                msgs = ((InternalEObject)title1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__TITLE1, null, msgs);
            if (newTitle1 != null)
                msgs = ((InternalEObject)newTitle1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XHTML11Package.HEAD_TYPE__TITLE1, null, msgs);
            msgs = basicSetTitle1(newTitle1, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__TITLE1, newTitle1, newTitle1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getXhtmlHeadOptsMix4() {
        if (xhtmlHeadOptsMix4 == null) {
            xhtmlHeadOptsMix4 = new BasicFeatureMap(this, XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4);
        }
        return xhtmlHeadOptsMix4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptType> getScript4() {
        return getXhtmlHeadOptsMix4().list(XHTML11Package.eINSTANCE.getHeadType_Script4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StyleType> getStyle4() {
        return getXhtmlHeadOptsMix4().list(XHTML11Package.eINSTANCE.getHeadType_Style4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MetaType> getMeta4() {
        return getXhtmlHeadOptsMix4().list(XHTML11Package.eINSTANCE.getHeadType_Meta4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkType> getLink4() {
        return getXhtmlHeadOptsMix4().list(XHTML11Package.eINSTANCE.getHeadType_Link4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectType> getObject4() {
        return getXhtmlHeadOptsMix4().list(XHTML11Package.eINSTANCE.getHeadType_Object4());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__LANG, oldLang, lang));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__LANG1, oldLang1, lang1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getProfile() {
        return profile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProfile(List<String> newProfile) {
        List<String> oldProfile = profile;
        profile = newProfile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__PROFILE, oldProfile, profile));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XHTML11Package.HEAD_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XHTML11Package.HEAD_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX:
                return ((InternalEList<?>)getXhtmlHeadOptsMix()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__SCRIPT:
                return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__STYLE:
                return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__META:
                return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__LINK:
                return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__TITLE:
                return basicSetTitle(null, msgs);
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1:
                return ((InternalEList<?>)getXhtmlHeadOptsMix1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__SCRIPT1:
                return ((InternalEList<?>)getScript1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__STYLE1:
                return ((InternalEList<?>)getStyle1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__META1:
                return ((InternalEList<?>)getMeta1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__LINK1:
                return ((InternalEList<?>)getLink1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__OBJECT1:
                return ((InternalEList<?>)getObject1()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__BASE:
                return basicSetBase(null, msgs);
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2:
                return ((InternalEList<?>)getXhtmlHeadOptsMix2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__SCRIPT2:
                return ((InternalEList<?>)getScript2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__STYLE2:
                return ((InternalEList<?>)getStyle2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__META2:
                return ((InternalEList<?>)getMeta2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__LINK2:
                return ((InternalEList<?>)getLink2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__OBJECT2:
                return ((InternalEList<?>)getObject2()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__BASE1:
                return basicSetBase1(null, msgs);
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3:
                return ((InternalEList<?>)getXhtmlHeadOptsMix3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__SCRIPT3:
                return ((InternalEList<?>)getScript3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__STYLE3:
                return ((InternalEList<?>)getStyle3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__META3:
                return ((InternalEList<?>)getMeta3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__LINK3:
                return ((InternalEList<?>)getLink3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__OBJECT3:
                return ((InternalEList<?>)getObject3()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__TITLE1:
                return basicSetTitle1(null, msgs);
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4:
                return ((InternalEList<?>)getXhtmlHeadOptsMix4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__SCRIPT4:
                return ((InternalEList<?>)getScript4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__STYLE4:
                return ((InternalEList<?>)getStyle4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__META4:
                return ((InternalEList<?>)getMeta4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__LINK4:
                return ((InternalEList<?>)getLink4()).basicRemove(otherEnd, msgs);
            case XHTML11Package.HEAD_TYPE__OBJECT4:
                return ((InternalEList<?>)getObject4()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX:
                if (coreType) return getXhtmlHeadOptsMix();
                return ((FeatureMap.Internal)getXhtmlHeadOptsMix()).getWrapper();
            case XHTML11Package.HEAD_TYPE__SCRIPT:
                return getScript();
            case XHTML11Package.HEAD_TYPE__STYLE:
                return getStyle();
            case XHTML11Package.HEAD_TYPE__META:
                return getMeta();
            case XHTML11Package.HEAD_TYPE__LINK:
                return getLink();
            case XHTML11Package.HEAD_TYPE__OBJECT:
                return getObject();
            case XHTML11Package.HEAD_TYPE__TITLE:
                return getTitle();
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1:
                if (coreType) return getXhtmlHeadOptsMix1();
                return ((FeatureMap.Internal)getXhtmlHeadOptsMix1()).getWrapper();
            case XHTML11Package.HEAD_TYPE__SCRIPT1:
                return getScript1();
            case XHTML11Package.HEAD_TYPE__STYLE1:
                return getStyle1();
            case XHTML11Package.HEAD_TYPE__META1:
                return getMeta1();
            case XHTML11Package.HEAD_TYPE__LINK1:
                return getLink1();
            case XHTML11Package.HEAD_TYPE__OBJECT1:
                return getObject1();
            case XHTML11Package.HEAD_TYPE__BASE:
                return getBase();
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2:
                if (coreType) return getXhtmlHeadOptsMix2();
                return ((FeatureMap.Internal)getXhtmlHeadOptsMix2()).getWrapper();
            case XHTML11Package.HEAD_TYPE__SCRIPT2:
                return getScript2();
            case XHTML11Package.HEAD_TYPE__STYLE2:
                return getStyle2();
            case XHTML11Package.HEAD_TYPE__META2:
                return getMeta2();
            case XHTML11Package.HEAD_TYPE__LINK2:
                return getLink2();
            case XHTML11Package.HEAD_TYPE__OBJECT2:
                return getObject2();
            case XHTML11Package.HEAD_TYPE__BASE1:
                return getBase1();
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3:
                if (coreType) return getXhtmlHeadOptsMix3();
                return ((FeatureMap.Internal)getXhtmlHeadOptsMix3()).getWrapper();
            case XHTML11Package.HEAD_TYPE__SCRIPT3:
                return getScript3();
            case XHTML11Package.HEAD_TYPE__STYLE3:
                return getStyle3();
            case XHTML11Package.HEAD_TYPE__META3:
                return getMeta3();
            case XHTML11Package.HEAD_TYPE__LINK3:
                return getLink3();
            case XHTML11Package.HEAD_TYPE__OBJECT3:
                return getObject3();
            case XHTML11Package.HEAD_TYPE__TITLE1:
                return getTitle1();
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4:
                if (coreType) return getXhtmlHeadOptsMix4();
                return ((FeatureMap.Internal)getXhtmlHeadOptsMix4()).getWrapper();
            case XHTML11Package.HEAD_TYPE__SCRIPT4:
                return getScript4();
            case XHTML11Package.HEAD_TYPE__STYLE4:
                return getStyle4();
            case XHTML11Package.HEAD_TYPE__META4:
                return getMeta4();
            case XHTML11Package.HEAD_TYPE__LINK4:
                return getLink4();
            case XHTML11Package.HEAD_TYPE__OBJECT4:
                return getObject4();
            case XHTML11Package.HEAD_TYPE__ID:
                return getId();
            case XHTML11Package.HEAD_TYPE__LANG:
                return getLang();
            case XHTML11Package.HEAD_TYPE__LANG1:
                return getLang1();
            case XHTML11Package.HEAD_TYPE__PROFILE:
                return getProfile();
            case XHTML11Package.HEAD_TYPE__SPACE:
                return getSpace();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX:
                ((FeatureMap.Internal)getXhtmlHeadOptsMix()).set(newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT:
                getScript().clear();
                getScript().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__STYLE:
                getStyle().clear();
                getStyle().addAll((Collection<? extends StyleType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__META:
                getMeta().clear();
                getMeta().addAll((Collection<? extends MetaType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LINK:
                getLink().clear();
                getLink().addAll((Collection<? extends LinkType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__TITLE:
                setTitle((TitleType)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1:
                ((FeatureMap.Internal)getXhtmlHeadOptsMix1()).set(newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT1:
                getScript1().clear();
                getScript1().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__STYLE1:
                getStyle1().clear();
                getStyle1().addAll((Collection<? extends StyleType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__META1:
                getMeta1().clear();
                getMeta1().addAll((Collection<? extends MetaType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LINK1:
                getLink1().clear();
                getLink1().addAll((Collection<? extends LinkType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT1:
                getObject1().clear();
                getObject1().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__BASE:
                setBase((BaseType)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2:
                ((FeatureMap.Internal)getXhtmlHeadOptsMix2()).set(newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT2:
                getScript2().clear();
                getScript2().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__STYLE2:
                getStyle2().clear();
                getStyle2().addAll((Collection<? extends StyleType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__META2:
                getMeta2().clear();
                getMeta2().addAll((Collection<? extends MetaType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LINK2:
                getLink2().clear();
                getLink2().addAll((Collection<? extends LinkType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT2:
                getObject2().clear();
                getObject2().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__BASE1:
                setBase1((BaseType)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3:
                ((FeatureMap.Internal)getXhtmlHeadOptsMix3()).set(newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT3:
                getScript3().clear();
                getScript3().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__STYLE3:
                getStyle3().clear();
                getStyle3().addAll((Collection<? extends StyleType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__META3:
                getMeta3().clear();
                getMeta3().addAll((Collection<? extends MetaType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LINK3:
                getLink3().clear();
                getLink3().addAll((Collection<? extends LinkType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT3:
                getObject3().clear();
                getObject3().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__TITLE1:
                setTitle1((TitleType)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4:
                ((FeatureMap.Internal)getXhtmlHeadOptsMix4()).set(newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT4:
                getScript4().clear();
                getScript4().addAll((Collection<? extends ScriptType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__STYLE4:
                getStyle4().clear();
                getStyle4().addAll((Collection<? extends StyleType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__META4:
                getMeta4().clear();
                getMeta4().addAll((Collection<? extends MetaType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LINK4:
                getLink4().clear();
                getLink4().addAll((Collection<? extends LinkType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT4:
                getObject4().clear();
                getObject4().addAll((Collection<? extends ObjectType>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__ID:
                setId((String)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LANG:
                setLang((String)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__LANG1:
                setLang1((String)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__PROFILE:
                setProfile((List<String>)newValue);
                return;
            case XHTML11Package.HEAD_TYPE__SPACE:
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
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX:
                getXhtmlHeadOptsMix().clear();
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT:
                getScript().clear();
                return;
            case XHTML11Package.HEAD_TYPE__STYLE:
                getStyle().clear();
                return;
            case XHTML11Package.HEAD_TYPE__META:
                getMeta().clear();
                return;
            case XHTML11Package.HEAD_TYPE__LINK:
                getLink().clear();
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT:
                getObject().clear();
                return;
            case XHTML11Package.HEAD_TYPE__TITLE:
                setTitle((TitleType)null);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1:
                getXhtmlHeadOptsMix1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT1:
                getScript1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__STYLE1:
                getStyle1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__META1:
                getMeta1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__LINK1:
                getLink1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT1:
                getObject1().clear();
                return;
            case XHTML11Package.HEAD_TYPE__BASE:
                setBase((BaseType)null);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2:
                getXhtmlHeadOptsMix2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT2:
                getScript2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__STYLE2:
                getStyle2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__META2:
                getMeta2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__LINK2:
                getLink2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT2:
                getObject2().clear();
                return;
            case XHTML11Package.HEAD_TYPE__BASE1:
                setBase1((BaseType)null);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3:
                getXhtmlHeadOptsMix3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT3:
                getScript3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__STYLE3:
                getStyle3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__META3:
                getMeta3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__LINK3:
                getLink3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT3:
                getObject3().clear();
                return;
            case XHTML11Package.HEAD_TYPE__TITLE1:
                setTitle1((TitleType)null);
                return;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4:
                getXhtmlHeadOptsMix4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__SCRIPT4:
                getScript4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__STYLE4:
                getStyle4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__META4:
                getMeta4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__LINK4:
                getLink4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__OBJECT4:
                getObject4().clear();
                return;
            case XHTML11Package.HEAD_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XHTML11Package.HEAD_TYPE__LANG:
                setLang(LANG_EDEFAULT);
                return;
            case XHTML11Package.HEAD_TYPE__LANG1:
                setLang1(LANG1_EDEFAULT);
                return;
            case XHTML11Package.HEAD_TYPE__PROFILE:
                setProfile(PROFILE_EDEFAULT);
                return;
            case XHTML11Package.HEAD_TYPE__SPACE:
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
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX:
                return xhtmlHeadOptsMix != null && !xhtmlHeadOptsMix.isEmpty();
            case XHTML11Package.HEAD_TYPE__SCRIPT:
                return !getScript().isEmpty();
            case XHTML11Package.HEAD_TYPE__STYLE:
                return !getStyle().isEmpty();
            case XHTML11Package.HEAD_TYPE__META:
                return !getMeta().isEmpty();
            case XHTML11Package.HEAD_TYPE__LINK:
                return !getLink().isEmpty();
            case XHTML11Package.HEAD_TYPE__OBJECT:
                return !getObject().isEmpty();
            case XHTML11Package.HEAD_TYPE__TITLE:
                return title != null;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX1:
                return xhtmlHeadOptsMix1 != null && !xhtmlHeadOptsMix1.isEmpty();
            case XHTML11Package.HEAD_TYPE__SCRIPT1:
                return !getScript1().isEmpty();
            case XHTML11Package.HEAD_TYPE__STYLE1:
                return !getStyle1().isEmpty();
            case XHTML11Package.HEAD_TYPE__META1:
                return !getMeta1().isEmpty();
            case XHTML11Package.HEAD_TYPE__LINK1:
                return !getLink1().isEmpty();
            case XHTML11Package.HEAD_TYPE__OBJECT1:
                return !getObject1().isEmpty();
            case XHTML11Package.HEAD_TYPE__BASE:
                return base != null;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX2:
                return xhtmlHeadOptsMix2 != null && !xhtmlHeadOptsMix2.isEmpty();
            case XHTML11Package.HEAD_TYPE__SCRIPT2:
                return !getScript2().isEmpty();
            case XHTML11Package.HEAD_TYPE__STYLE2:
                return !getStyle2().isEmpty();
            case XHTML11Package.HEAD_TYPE__META2:
                return !getMeta2().isEmpty();
            case XHTML11Package.HEAD_TYPE__LINK2:
                return !getLink2().isEmpty();
            case XHTML11Package.HEAD_TYPE__OBJECT2:
                return !getObject2().isEmpty();
            case XHTML11Package.HEAD_TYPE__BASE1:
                return base1 != null;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX3:
                return xhtmlHeadOptsMix3 != null && !xhtmlHeadOptsMix3.isEmpty();
            case XHTML11Package.HEAD_TYPE__SCRIPT3:
                return !getScript3().isEmpty();
            case XHTML11Package.HEAD_TYPE__STYLE3:
                return !getStyle3().isEmpty();
            case XHTML11Package.HEAD_TYPE__META3:
                return !getMeta3().isEmpty();
            case XHTML11Package.HEAD_TYPE__LINK3:
                return !getLink3().isEmpty();
            case XHTML11Package.HEAD_TYPE__OBJECT3:
                return !getObject3().isEmpty();
            case XHTML11Package.HEAD_TYPE__TITLE1:
                return title1 != null;
            case XHTML11Package.HEAD_TYPE__XHTML_HEAD_OPTS_MIX4:
                return xhtmlHeadOptsMix4 != null && !xhtmlHeadOptsMix4.isEmpty();
            case XHTML11Package.HEAD_TYPE__SCRIPT4:
                return !getScript4().isEmpty();
            case XHTML11Package.HEAD_TYPE__STYLE4:
                return !getStyle4().isEmpty();
            case XHTML11Package.HEAD_TYPE__META4:
                return !getMeta4().isEmpty();
            case XHTML11Package.HEAD_TYPE__LINK4:
                return !getLink4().isEmpty();
            case XHTML11Package.HEAD_TYPE__OBJECT4:
                return !getObject4().isEmpty();
            case XHTML11Package.HEAD_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XHTML11Package.HEAD_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
            case XHTML11Package.HEAD_TYPE__LANG1:
                return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
            case XHTML11Package.HEAD_TYPE__PROFILE:
                return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
            case XHTML11Package.HEAD_TYPE__SPACE:
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
        result.append(" (xhtmlHeadOptsMix: ");
        result.append(xhtmlHeadOptsMix);
        result.append(", xhtmlHeadOptsMix1: ");
        result.append(xhtmlHeadOptsMix1);
        result.append(", xhtmlHeadOptsMix2: ");
        result.append(xhtmlHeadOptsMix2);
        result.append(", xhtmlHeadOptsMix3: ");
        result.append(xhtmlHeadOptsMix3);
        result.append(", xhtmlHeadOptsMix4: ");
        result.append(xhtmlHeadOptsMix4);
        result.append(", id: ");
        result.append(id);
        result.append(", lang: ");
        result.append(lang);
        result.append(", lang1: ");
        result.append(lang1);
        result.append(", profile: ");
        result.append(profile);
        result.append(", space: ");
        if (spaceESet) result.append(space); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //HeadTypeImpl
