/**
 */
package org.github.freemarkerEditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.github.freemarkerEditor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreemarkerEditorFactoryImpl extends EFactoryImpl implements FreemarkerEditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FreemarkerEditorFactory init()
  {
    try
    {
      FreemarkerEditorFactory theFreemarkerEditorFactory = (FreemarkerEditorFactory)EPackage.Registry.INSTANCE.getEFactory(FreemarkerEditorPackage.eNS_URI);
      if (theFreemarkerEditorFactory != null)
      {
        return theFreemarkerEditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FreemarkerEditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreemarkerEditorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FreemarkerEditorPackage.FREEMARKER: return createFreemarker();
      case FreemarkerEditorPackage.ELEMENT: return createElement();
      case FreemarkerEditorPackage.PRINT: return createPrint();
      case FreemarkerEditorPackage.TAG: return createTag();
      case FreemarkerEditorPackage.TAG_PART: return createTagPart();
      case FreemarkerEditorPackage.OPEN_TAG: return createOpenTag();
      case FreemarkerEditorPackage.CLOSE_TAG: return createCloseTag();
      case FreemarkerEditorPackage.TEXT: return createText();
      case FreemarkerEditorPackage.COMMENT: return createComment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Freemarker createFreemarker()
  {
    FreemarkerImpl freemarker = new FreemarkerImpl();
    return freemarker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Print createPrint()
  {
    PrintImpl print = new PrintImpl();
    return print;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagPart createTagPart()
  {
    TagPartImpl tagPart = new TagPartImpl();
    return tagPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenTag createOpenTag()
  {
    OpenTagImpl openTag = new OpenTagImpl();
    return openTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloseTag createCloseTag()
  {
    CloseTagImpl closeTag = new CloseTagImpl();
    return closeTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreemarkerEditorPackage getFreemarkerEditorPackage()
  {
    return (FreemarkerEditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FreemarkerEditorPackage getPackage()
  {
    return FreemarkerEditorPackage.eINSTANCE;
  }

} //FreemarkerEditorFactoryImpl
