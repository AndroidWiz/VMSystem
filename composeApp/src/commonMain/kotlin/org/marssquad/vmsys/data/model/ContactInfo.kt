package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ContactInfo(
    val email: String,
    val phoneNumber: String,
    val address: String,
)
