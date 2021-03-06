/**
 */
package de.fuberlin.winfo.project.model.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getId <em>Id</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getStart <em>Start</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getEnd <em>End</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getTime <em>Time</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#isIsUsed <em>Is Used</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getEnergyMin <em>Energy Min</em>}</li>
 *   <li>{@link de.fuberlin.winfo.project.model.network.Arc#getEnergyMax <em>Energy Max</em>}</li>
 * </ul>
 *
 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Vertex)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_Start()
	 * @model required="true"
	 * @generated
	 */
	Vertex getStart();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Vertex value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Vertex)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_End()
	 * @model required="true"
	 * @generated
	 */
	Vertex getEnd();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Vertex value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_Distance()
	 * @model
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Is Used</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Used</em>' attribute.
	 * @see #setIsUsed(boolean)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_IsUsed()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isIsUsed();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#isIsUsed <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Used</em>' attribute.
	 * @see #isIsUsed()
	 * @generated
	 */
	void setIsUsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Energy Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Min</em>' attribute.
	 * @see #setEnergyMin(int)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_EnergyMin()
	 * @model
	 * @generated
	 */
	int getEnergyMin();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getEnergyMin <em>Energy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Min</em>' attribute.
	 * @see #getEnergyMin()
	 * @generated
	 */
	void setEnergyMin(int value);

	/**
	 * Returns the value of the '<em><b>Energy Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Max</em>' attribute.
	 * @see #setEnergyMax(int)
	 * @see de.fuberlin.winfo.project.model.network.NetworkPackage#getArc_EnergyMax()
	 * @model
	 * @generated
	 */
	int getEnergyMax();

	/**
	 * Sets the value of the '{@link de.fuberlin.winfo.project.model.network.Arc#getEnergyMax <em>Energy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Max</em>' attribute.
	 * @see #getEnergyMax()
	 * @generated
	 */
	void setEnergyMax(int value);

} // Arc
