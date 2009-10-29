/**
 * CmisACLCapabilityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.alfresco.repo.cmis.ws;

public class CmisACLCapabilityType  implements java.io.Serializable {
    private org.alfresco.repo.cmis.ws.EnumACLPropagation setType;

    private org.alfresco.repo.cmis.ws.CmisPermissionDefinition[] permissions;

    private org.alfresco.repo.cmis.ws.CmisPermissionMapping[] mapping;

    public CmisACLCapabilityType() {
    }

    public CmisACLCapabilityType(
           org.alfresco.repo.cmis.ws.EnumACLPropagation setType,
           org.alfresco.repo.cmis.ws.CmisPermissionDefinition[] permissions,
           org.alfresco.repo.cmis.ws.CmisPermissionMapping[] mapping) {
           this.setType = setType;
           this.permissions = permissions;
           this.mapping = mapping;
    }


    /**
     * Gets the setType value for this CmisACLCapabilityType.
     * 
     * @return setType
     */
    public org.alfresco.repo.cmis.ws.EnumACLPropagation getSetType() {
        return setType;
    }


    /**
     * Sets the setType value for this CmisACLCapabilityType.
     * 
     * @param setType
     */
    public void setSetType(org.alfresco.repo.cmis.ws.EnumACLPropagation setType) {
        this.setType = setType;
    }


    /**
     * Gets the permissions value for this CmisACLCapabilityType.
     * 
     * @return permissions
     */
    public org.alfresco.repo.cmis.ws.CmisPermissionDefinition[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this CmisACLCapabilityType.
     * 
     * @param permissions
     */
    public void setPermissions(org.alfresco.repo.cmis.ws.CmisPermissionDefinition[] permissions) {
        this.permissions = permissions;
    }

    public org.alfresco.repo.cmis.ws.CmisPermissionDefinition getPermissions(int i) {
        return this.permissions[i];
    }

    public void setPermissions(int i, org.alfresco.repo.cmis.ws.CmisPermissionDefinition _value) {
        this.permissions[i] = _value;
    }


    /**
     * Gets the mapping value for this CmisACLCapabilityType.
     * 
     * @return mapping
     */
    public org.alfresco.repo.cmis.ws.CmisPermissionMapping[] getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this CmisACLCapabilityType.
     * 
     * @param mapping
     */
    public void setMapping(org.alfresco.repo.cmis.ws.CmisPermissionMapping[] mapping) {
        this.mapping = mapping;
    }

    public org.alfresco.repo.cmis.ws.CmisPermissionMapping getMapping(int i) {
        return this.mapping[i];
    }

    public void setMapping(int i, org.alfresco.repo.cmis.ws.CmisPermissionMapping _value) {
        this.mapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmisACLCapabilityType)) return false;
        CmisACLCapabilityType other = (CmisACLCapabilityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setType==null && other.getSetType()==null) || 
             (this.setType!=null &&
              this.setType.equals(other.getSetType()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              java.util.Arrays.equals(this.mapping, other.getMapping())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSetType() != null) {
            _hashCode += getSetType().hashCode();
        }
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmisACLCapabilityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "cmisACLCapabilityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "setType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "enumACLPropagation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "cmisPermissionDefinition"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://docs.oasis-open.org/ns/cmis/core/200901", "cmisPermissionMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
