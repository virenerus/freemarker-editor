/**
 */
package org.github.freemarkerEditor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.github.freemarkerEditor.CloseTag;
import org.github.freemarkerEditor.Element;
import org.github.freemarkerEditor.FreemarkerEditorPackage;
import org.github.freemarkerEditor.OpenTag;
import org.github.freemarkerEditor.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.github.freemarkerEditor.impl.TagImpl#getOpenTag <em>Open Tag</em>}</li>
 *   <li>{@link org.github.freemarkerEditor.impl.TagImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.github.freemarkerEditor.impl.TagImpl#getCloseTag <em>Close Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends ElementImpl implements Tag
{
  /**
   * The cached value of the '{@link #getOpenTag() <em>Open Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenTag()
   * @generated
   * @ordered
   */
  protected OpenTag openTag;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * The cached value of the '{@link #getCloseTag() <em>Close Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloseTag()
   * @generated
   * @ordered
   */
  protected CloseTag closeTag;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FreemarkerEditorPackage.Literals.TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenTag getOpenTag()
  {
    return openTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenTag(OpenTag newOpenTag, NotificationChain msgs)
  {
    OpenTag oldOpenTag = openTag;
    openTag = newOpenTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreemarkerEditorPackage.TAG__OPEN_TAG, oldOpenTag, newOpenTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenTag(OpenTag newOpenTag)
  {
    if (newOpenTag != openTag)
    {
      NotificationChain msgs = null;
      if (openTag != null)
        msgs = ((InternalEObject)openTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreemarkerEditorPackage.TAG__OPEN_TAG, null, msgs);
      if (newOpenTag != null)
        msgs = ((InternalEObject)newOpenTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreemarkerEditorPackage.TAG__OPEN_TAG, null, msgs);
      msgs = basicSetOpenTag(newOpenTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FreemarkerEditorPackage.TAG__OPEN_TAG, newOpenTag, newOpenTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, FreemarkerEditorPackage.TAG__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloseTag getCloseTag()
  {
    return closeTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCloseTag(CloseTag newCloseTag, NotificationChain msgs)
  {
    CloseTag oldCloseTag = closeTag;
    closeTag = newCloseTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreemarkerEditorPackage.TAG__CLOSE_TAG, oldCloseTag, newCloseTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCloseTag(CloseTag newCloseTag)
  {
    if (newCloseTag != closeTag)
    {
      NotificationChain msgs = null;
      if (closeTag != null)
        msgs = ((InternalEObject)closeTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreemarkerEditorPackage.TAG__CLOSE_TAG, null, msgs);
      if (newCloseTag != null)
        msgs = ((InternalEObject)newCloseTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreemarkerEditorPackage.TAG__CLOSE_TAG, null, msgs);
      msgs = basicSetCloseTag(newCloseTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FreemarkerEditorPackage.TAG__CLOSE_TAG, newCloseTag, newCloseTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FreemarkerEditorPackage.TAG__OPEN_TAG:
        return basicSetOpenTag(null, msgs);
      case FreemarkerEditorPackage.TAG__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case FreemarkerEditorPackage.TAG__CLOSE_TAG:
        return basicSetCloseTag(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FreemarkerEditorPackage.TAG__OPEN_TAG:
        return getOpenTag();
      case FreemarkerEditorPackage.TAG__ELEMENTS:
        return getElements();
      case FreemarkerEditorPackage.TAG__CLOSE_TAG:
        return getCloseTag();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FreemarkerEditorPackage.TAG__OPEN_TAG:
        setOpenTag((OpenTag)newValue);
        return;
      case FreemarkerEditorPackage.TAG__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
        return;
      case FreemarkerEditorPackage.TAG__CLOSE_TAG:
        setCloseTag((CloseTag)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FreemarkerEditorPackage.TAG__OPEN_TAG:
        setOpenTag((OpenTag)null);
        return;
      case FreemarkerEditorPackage.TAG__ELEMENTS:
        getElements().clear();
        return;
      case FreemarkerEditorPackage.TAG__CLOSE_TAG:
        setCloseTag((CloseTag)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FreemarkerEditorPackage.TAG__OPEN_TAG:
        return openTag != null;
      case FreemarkerEditorPackage.TAG__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case FreemarkerEditorPackage.TAG__CLOSE_TAG:
        return closeTag != null;
    }
    return super.eIsSet(featureID);
  }

} //TagImpl
