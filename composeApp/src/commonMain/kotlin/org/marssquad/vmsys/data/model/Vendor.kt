package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Vendor(
    val id: String,
    val fullName: String,
    val companyName: String?,
    val contactInfo: ContactInfo,
    val serviceAreas: List<String>,
    val jobTypes: List<String>,
    val paymentPreferences: PaymentDetails,
    val rating: Double = 0.0,
    val totalJobsCompleted: Int = 0,
    val activeJobsIds: List<String> = emptyList()
)