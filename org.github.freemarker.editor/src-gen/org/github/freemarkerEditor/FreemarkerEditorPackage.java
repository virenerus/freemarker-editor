/**
 */
package org.github.freemarkerEditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.github.freemarkerEditor.FreemarkerEditorFactory
 * @model kind="package"
 * @generated
 */
public interface FreemarkerEditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "freemarkerEditor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.github.org/FreemarkerEditor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "freemarkerEditor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FreemarkerEditorPackage eINSTANCE = org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.FreemarkerImpl <em>Freemarker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.FreemarkerImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getFreemarker()
   * @generated
   */
  int FREEMARKER = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREEMARKER__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Freemarker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREEMARKER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.ElementImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.PrintImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getPrint()
   * @generated
   */
  int PRINT = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.TagImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getTag()
   * @generated
   */
  int TAG = 3;

  /**
   * The feature id for the '<em><b>Open Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__OPEN_TAG = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Close Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CLOSE_TAG = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.TagPartImpl <em>Tag Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.TagPartImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getTagPart()
   * @generated
   */
  int TAG_PART = 4;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_PART__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Tag Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.OpenTagImpl <em>Open Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.OpenTagImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getOpenTag()
   * @generated
   */
  int OPEN_TAG = 5;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_TAG__CONTENT = TAG_PART__CONTENT;

  /**
   * The number of structural features of the '<em>Open Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_TAG_FEATURE_COUNT = TAG_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.CloseTagImpl <em>Close Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.CloseTagImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getCloseTag()
   * @generated
   */
  int CLOSE_TAG = 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_TAG__CONTENT = TAG_PART__CONTENT;

  /**
   * The number of structural features of the '<em>Close Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSE_TAG_FEATURE_COUNT = TAG_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.TextImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getText()
   * @generated
   */
  int TEXT = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.github.freemarkerEditor.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.github.freemarkerEditor.impl.CommentImpl
   * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 8;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__TEXT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Freemarker <em>Freemarker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Freemarker</em>'.
   * @see org.github.freemarkerEditor.Freemarker
   * @generated
   */
  EClass getFreemarker();

  /**
   * Returns the meta object for the containment reference list '{@link org.github.freemarkerEditor.Freemarker#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.github.freemarkerEditor.Freemarker#getElements()
   * @see #getFreemarker()
   * @generated
   */
  EReference getFreemarker_Elements();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.github.freemarkerEditor.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.github.freemarkerEditor.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the meta object for the attribute '{@link org.github.freemarkerEditor.Print#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.github.freemarkerEditor.Print#getExpression()
   * @see #getPrint()
   * @generated
   */
  EAttribute getPrint_Expression();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see org.github.freemarkerEditor.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the containment reference '{@link org.github.freemarkerEditor.Tag#getOpenTag <em>Open Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Open Tag</em>'.
   * @see org.github.freemarkerEditor.Tag#getOpenTag()
   * @see #getTag()
   * @generated
   */
  EReference getTag_OpenTag();

  /**
   * Returns the meta object for the containment reference list '{@link org.github.freemarkerEditor.Tag#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.github.freemarkerEditor.Tag#getElements()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Elements();

  /**
   * Returns the meta object for the containment reference '{@link org.github.freemarkerEditor.Tag#getCloseTag <em>Close Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Close Tag</em>'.
   * @see org.github.freemarkerEditor.Tag#getCloseTag()
   * @see #getTag()
   * @generated
   */
  EReference getTag_CloseTag();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.TagPart <em>Tag Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Part</em>'.
   * @see org.github.freemarkerEditor.TagPart
   * @generated
   */
  EClass getTagPart();

  /**
   * Returns the meta object for the attribute '{@link org.github.freemarkerEditor.TagPart#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.github.freemarkerEditor.TagPart#getContent()
   * @see #getTagPart()
   * @generated
   */
  EAttribute getTagPart_Content();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.OpenTag <em>Open Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Tag</em>'.
   * @see org.github.freemarkerEditor.OpenTag
   * @generated
   */
  EClass getOpenTag();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.CloseTag <em>Close Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Close Tag</em>'.
   * @see org.github.freemarkerEditor.CloseTag
   * @generated
   */
  EClass getCloseTag();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.github.freemarkerEditor.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.github.freemarkerEditor.Text#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.github.freemarkerEditor.Text#getText()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Text();

  /**
   * Returns the meta object for class '{@link org.github.freemarkerEditor.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.github.freemarkerEditor.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link org.github.freemarkerEditor.Comment#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.github.freemarkerEditor.Comment#getText()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FreemarkerEditorFactory getFreemarkerEditorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.FreemarkerImpl <em>Freemarker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.FreemarkerImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getFreemarker()
     * @generated
     */
    EClass FREEMARKER = eINSTANCE.getFreemarker();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FREEMARKER__ELEMENTS = eINSTANCE.getFreemarker_Elements();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.ElementImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.PrintImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getPrint()
     * @generated
     */
    EClass PRINT = eINSTANCE.getPrint();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRINT__EXPRESSION = eINSTANCE.getPrint_Expression();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.TagImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Open Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__OPEN_TAG = eINSTANCE.getTag_OpenTag();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__ELEMENTS = eINSTANCE.getTag_Elements();

    /**
     * The meta object literal for the '<em><b>Close Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__CLOSE_TAG = eINSTANCE.getTag_CloseTag();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.TagPartImpl <em>Tag Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.TagPartImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getTagPart()
     * @generated
     */
    EClass TAG_PART = eINSTANCE.getTagPart();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG_PART__CONTENT = eINSTANCE.getTagPart_Content();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.OpenTagImpl <em>Open Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.OpenTagImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getOpenTag()
     * @generated
     */
    EClass OPEN_TAG = eINSTANCE.getOpenTag();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.CloseTagImpl <em>Close Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.CloseTagImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getCloseTag()
     * @generated
     */
    EClass CLOSE_TAG = eINSTANCE.getCloseTag();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.TextImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
     * The meta object literal for the '{@link org.github.freemarkerEditor.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.github.freemarkerEditor.impl.CommentImpl
     * @see org.github.freemarkerEditor.impl.FreemarkerEditorPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

  }

} //FreemarkerEditorPackage
