/**
 */
package org.github.freemarkerEditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.github.freemarkerEditor.Tag#getOpenTag <em>Open Tag</em>}</li>
 *   <li>{@link org.github.freemarkerEditor.Tag#getElements <em>Elements</em>}</li>
 *   <li>{@link org.github.freemarkerEditor.Tag#getCloseTag <em>Close Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Element
{
  /**
   * Returns the value of the '<em><b>Open Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open Tag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open Tag</em>' containment reference.
   * @see #setOpenTag(OpenTag)
   * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getTag_OpenTag()
   * @model containment="true"
   * @generated
   */
  OpenTag getOpenTag();

  /**
   * Sets the value of the '{@link org.github.freemarkerEditor.Tag#getOpenTag <em>Open Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open Tag</em>' containment reference.
   * @see #getOpenTag()
   * @generated
   */
  void setOpenTag(OpenTag value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.github.freemarkerEditor.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getTag_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Close Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Close Tag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Close Tag</em>' containment reference.
   * @see #setCloseTag(CloseTag)
   * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getTag_CloseTag()
   * @model containment="true"
   * @generated
   */
  CloseTag getCloseTag();

  /**
   * Sets the value of the '{@link org.github.freemarkerEditor.Tag#getCloseTag <em>Close Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Close Tag</em>' containment reference.
   * @see #getCloseTag()
   * @generated
   */
  void setCloseTag(CloseTag value);

} // Tag
