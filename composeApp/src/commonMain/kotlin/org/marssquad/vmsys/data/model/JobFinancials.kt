package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class JobFinancials(
    val estimatedCost: Double,
    val approvedCost: Double,
    val vendorPaymentAmount: Double,
    val isVendorPaid: Boolean,
    val isClientPaid: Boolean,
    val clientInvoiceId: String?,
)