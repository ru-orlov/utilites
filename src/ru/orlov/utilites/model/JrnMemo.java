package ru.orlov.utilites.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for JrnMemo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JrnMemo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Receipts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Expense" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Debet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JrnMemo", propOrder = {
    "code",
    "memo",
    "account",
    "receipts",
    "expense",
    "debet",
    "credit"
})
public class JrnMemo {

    @XmlElement(name = "Code")
    protected Short code;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Account")
    protected Long account;
    @XmlElement(name = "Receipts")
    protected Long receipts;
    @XmlElement(name = "Expense")
    protected Long expense;
    @XmlElement(name = "Debet")
    protected Long debet;
    @XmlElement(name = "Credit")
    protected Long credit;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCode(Short value) {
        this.code = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccount(Long value) {
        this.account = value;
    }

    /**
     * Gets the value of the receipts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceipts() {
        return receipts;
    }

    /**
     * Sets the value of the receipts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceipts(Long value) {
        this.receipts = value;
    }

    /**
     * Gets the value of the expense property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpense() {
        return expense;
    }

    /**
     * Sets the value of the expense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpense(Long value) {
        this.expense = value;
    }

    /**
     * Gets the value of the debet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebet() {
        return debet;
    }

    /**
     * Sets the value of the debet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebet(Long value) {
        this.debet = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCredit(Long value) {
        this.credit = value;
    }

}
