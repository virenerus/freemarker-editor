/**
 */
package org.github.freemarkerEditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.github.freemarkerEditor.Comment#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Element
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.github.freemarkerEditor.FreemarkerEditorPackage#getComment_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.github.freemarkerEditor.Comment#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Comment
