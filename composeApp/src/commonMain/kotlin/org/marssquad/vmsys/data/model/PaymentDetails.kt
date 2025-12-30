package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PaymentDetails(
    val bankName: String,
    val accountNumber: String,
    val method: String // ACH, Check, Zelle
)