/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.Extension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ServiceData;
import net.java.slee.resource.diameter.sh.events.avp.userdata.TransparentData;


/**
 * <p>Java class for tTransparentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTransparentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceIndication" type="{}tString"/>
 *         &lt;element name="SequenceNumber" type="{}tSequenceNumber"/>
 *         &lt;element name="ServiceData" type="{}tServiceData" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTransparentData", propOrder = {
    "serviceIndication",
    "sequenceNumber",
    "serviceData",
    "extension",
    "any"
})
public class TTransparentData implements TransparentData {

    @XmlElement(name = "ServiceIndication", required = true)
    protected String serviceIndication;
    @XmlElement(name = "SequenceNumber")
    protected int sequenceNumber;
    @XmlElement(name = "ServiceData")
    protected ServiceData serviceData;
    @XmlElement(name = "Extension")
    protected Extension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#getServiceIndication()
     */
    public String getServiceIndication() {
        return serviceIndication;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#setServiceIndication(java.lang.String)
     */
    public void setServiceIndication(String value) {
        this.serviceIndication = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#getSequenceNumber()
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#setSequenceNumber(int)
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#getServiceData()
     */
    public ServiceData getServiceData() {
        return serviceData;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#setServiceData(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ServiceData)
     */
    public void setServiceData(ServiceData value) {
        this.serviceData = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#getExtension()
     */
    public Extension getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.Extension)
     */
    public void setExtension(Extension value) {
        this.extension = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TransparentData#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}