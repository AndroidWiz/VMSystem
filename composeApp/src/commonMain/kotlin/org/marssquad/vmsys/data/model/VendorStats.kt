package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class VendorStats(
    val vendorId: String,
    val totalEarnings: Double,
    val jobsThisMonth: Int,
    val averageCompletionTimeHours: Double
)