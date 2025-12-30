package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable

@Serializable
data class JobMedia(
    val beforePhotos: List<String>,
    val afterPhotos: List<String>,
    val estimateDocs: List<String>,
    val finalInvoices: List<String>,
)