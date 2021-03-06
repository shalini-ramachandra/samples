package com.covisint.papi.sample.portlet.model.impl;

import com.covisint.papi.sample.portlet.model.Invoice;
import com.covisint.papi.sample.portlet.service.InvoiceLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Invoice service. Represents a row in the &quot;Invoice_Invoice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InvoiceImpl}.
 * </p>
 *
 * @author Nitin R. Khobragade
 * @see InvoiceImpl
 * @see com.covisint.papi.sample.portlet.model.Invoice
 * @generated
 */
public abstract class InvoiceBaseImpl extends InvoiceModelImpl
    implements Invoice {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a invoice model instance should use the {@link Invoice} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            InvoiceLocalServiceUtil.addInvoice(this);
        } else {
            InvoiceLocalServiceUtil.updateInvoice(this);
        }
    }
}
