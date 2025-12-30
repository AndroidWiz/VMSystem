package org.marssquad.vmsys.data.model

import kotlinx.serialization.Serializable
import org.marssquad.vmsys.data.enums.JobStatus
import kotlin.time.Instant

@Serializable
data class WorkOrder(
    val id: String,
    val clientId: String,
    val propertyId: String,
    val propertyAddress: String,
    val assignedVendorId: String?,
    val status: JobStatus,
    val title: String,
    val description: String,
    val createdDate: Instant,
    val scheduledDate: Instant?,
    val completedDate: Instant?,
    val financial: JobFinancials,
    val media: JobMedia,
)


val dummyWorkOrders = listOf(

    WorkOrder(
        id = "WO-1001",
        clientId = "CL-01",
        propertyId = "PR-01",
        propertyAddress = "House 12, Road 5, Dhanmondi, Dhaka",
        assignedVendorId = null,
        status = JobStatus.OPEN,
        title = "Air Conditioner Inspection",
        description = "Routine inspection of split AC unit",
        createdDate = Instant.parse("2025-01-02T09:00:00Z"),
        scheduledDate = null,
        completedDate = null,
        financial = JobFinancials(
            estimatedCost = 2500.0,
            approvedCost = 0.0,
            vendorPaymentAmount = 0.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = null
        ),
        media = JobMedia(
            beforePhotos = emptyList(),
            afterPhotos = emptyList(),
            estimateDocs = listOf("ac_estimate.pdf"),
            finalInvoices = emptyList()
        )
    ),

    WorkOrder(
        id = "WO-1002",
        clientId = "CL-02",
        propertyId = "PR-02",
        propertyAddress = "Flat B2, Gulshan Avenue, Dhaka",
        assignedVendorId = "VN-201",
        status = JobStatus.ASSIGNED,
        title = "Kitchen Sink Leakage",
        description = "Repair water leakage under sink",
        createdDate = Instant.parse("2025-01-03T10:30:00Z"),
        scheduledDate = Instant.parse("2025-01-05T09:00:00Z"),
        completedDate = null,
        financial = JobFinancials(
            estimatedCost = 1800.0,
            approvedCost = 1800.0,
            vendorPaymentAmount = 0.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = null
        ),
        media = JobMedia(
            beforePhotos = listOf("sink_leak_before.jpg"),
            afterPhotos = emptyList(),
            estimateDocs = listOf("plumbing_estimate.pdf"),
            finalInvoices = emptyList()
        )
    ),

    WorkOrder(
        id = "WO-1003",
        clientId = "CL-03",
        propertyId = "PR-03",
        propertyAddress = "Road 11, Banani DOHS",
        assignedVendorId = "VN-202",
        status = JobStatus.IN_PROGRESS,
        title = "Electrical Switch Repair",
        description = "Fix loose wiring in bedroom switchboard",
        createdDate = Instant.parse("2025-01-04T08:15:00Z"),
        scheduledDate = Instant.parse("2025-01-04T14:00:00Z"),
        completedDate = null,
        financial = JobFinancials(
            estimatedCost = 1200.0,
            approvedCost = 1200.0,
            vendorPaymentAmount = 0.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = null
        ),
        media = JobMedia(
            beforePhotos = listOf("switch_before.jpg"),
            afterPhotos = emptyList(),
            estimateDocs = listOf("electrical_estimate.pdf"),
            finalInvoices = emptyList()
        )
    ),

    WorkOrder(
        id = "WO-1004",
        clientId = "CL-04",
        propertyId = "PR-04",
        propertyAddress = "Sector 7, Uttara, Dhaka",
        assignedVendorId = "VN-203",
        status = JobStatus.COMPLETED,
        title = "Generator Maintenance",
        description = "Quarterly generator servicing",
        createdDate = Instant.parse("2024-12-28T09:00:00Z"),
        scheduledDate = Instant.parse("2024-12-30T10:00:00Z"),
        completedDate = Instant.parse("2024-12-30T14:00:00Z"),
        financial = JobFinancials(
            estimatedCost = 5000.0,
            approvedCost = 4800.0,
            vendorPaymentAmount = 4800.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = "INV-5001"
        ),
        media = JobMedia(
            beforePhotos = listOf("generator_before.jpg"),
            afterPhotos = listOf("generator_after.jpg"),
            estimateDocs = listOf("generator_estimate.pdf"),
            finalInvoices = listOf("generator_invoice.pdf")
        )
    ),

    WorkOrder(
        id = "WO-1005",
        clientId = "CL-05",
        propertyId = "PR-05",
        propertyAddress = "Mirpur DOHS, Dhaka",
        assignedVendorId = "VN-204",
        status = JobStatus.INVOICED,
        title = "Living Room Painting",
        description = "Full repaint of living room walls",
        createdDate = Instant.parse("2025-01-01T11:00:00Z"),
        scheduledDate = Instant.parse("2025-01-03T09:00:00Z"),
        completedDate = Instant.parse("2025-01-04T18:00:00Z"),
        financial = JobFinancials(
            estimatedCost = 15000.0,
            approvedCost = 14500.0,
            vendorPaymentAmount = 14500.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = "INV-5002"
        ),
        media = JobMedia(
            beforePhotos = listOf("paint_before.jpg"),
            afterPhotos = listOf("paint_after.jpg"),
            estimateDocs = listOf("painting_estimate.pdf"),
            finalInvoices = listOf("painting_invoice.pdf")
        )
    ),

    WorkOrder(
        id = "WO-1006",
        clientId = "CL-06",
        propertyId = "PR-06",
        propertyAddress = "Block C, Bashundhara R/A",
        assignedVendorId = "VN-205",
        status = JobStatus.PAID,
        title = "Elevator Safety Inspection",
        description = "Annual lift safety and load test",
        createdDate = Instant.parse("2024-12-20T10:00:00Z"),
        scheduledDate = Instant.parse("2024-12-22T11:00:00Z"),
        completedDate = Instant.parse("2024-12-22T16:00:00Z"),
        financial = JobFinancials(
            estimatedCost = 8000.0,
            approvedCost = 8000.0,
            vendorPaymentAmount = 8000.0,
            isVendorPaid = true,
            isClientPaid = true,
            clientInvoiceId = "INV-5003"
        ),
        media = JobMedia(
            beforePhotos = emptyList(),
            afterPhotos = emptyList(),
            estimateDocs = listOf("lift_estimate.pdf"),
            finalInvoices = listOf("lift_invoice.pdf")
        )
    ),

    WorkOrder(
        id = "WO-1007",
        clientId = "CL-07",
        propertyId = "PR-07",
        propertyAddress = "Mohakhali DOHS",
        assignedVendorId = null,
        status = JobStatus.CANCELLED,
        title = "Office LAN Cabling",
        description = "Network cabling for office floor",
        createdDate = Instant.parse("2025-01-02T15:00:00Z"),
        scheduledDate = Instant.parse("2025-01-04T09:00:00Z"),
        completedDate = null,
        financial = JobFinancials(
            estimatedCost = 6000.0,
            approvedCost = 0.0,
            vendorPaymentAmount = 0.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = null
        ),
        media = JobMedia(
            beforePhotos = emptyList(),
            afterPhotos = emptyList(),
            estimateDocs = listOf("lan_estimate.pdf"),
            finalInvoices = emptyList()
        )
    ),

    WorkOrder(
        id = "WO-1008",
        clientId = "CL-08",
        propertyId = "PR-08",
        propertyAddress = "Old Town, Dhaka",
        assignedVendorId = "VN-206",
        status = JobStatus.IN_PROGRESS,
        title = "Underground Water Tank Cleaning",
        description = "Cleaning and disinfecting water tank",
        createdDate = Instant.parse("2025-01-05T07:30:00Z"),
        scheduledDate = Instant.parse("2025-01-05T08:00:00Z"),
        completedDate = null,
        financial = JobFinancials(
            estimatedCost = 3500.0,
            approvedCost = 3500.0,
            vendorPaymentAmount = 0.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = null
        ),
        media = JobMedia(
            beforePhotos = listOf("tank_before.jpg"),
            afterPhotos = emptyList(),
            estimateDocs = listOf("tank_estimate.pdf"),
            finalInvoices = emptyList()
        )
    ),

    WorkOrder(
        id = "WO-1009",
        clientId = "CL-09",
        propertyId = "PR-09",
        propertyAddress = "Niketon, Dhaka",
        assignedVendorId = "VN-207",
        status = JobStatus.COMPLETED,
        title = "Roof Waterproofing",
        description = "Leak prevention waterproof coating",
        createdDate = Instant.parse("2024-12-15T09:00:00Z"),
        scheduledDate = Instant.parse("2024-12-17T10:00:00Z"),
        completedDate = Instant.parse("2024-12-18T17:30:00Z"),
        financial = JobFinancials(
            estimatedCost = 22000.0,
            approvedCost = 21500.0,
            vendorPaymentAmount = 21500.0,
            isVendorPaid = false,
            isClientPaid = false,
            clientInvoiceId = "INV-5004"
        ),
        media = JobMedia(
            beforePhotos = listOf("roof_before.jpg"),
            afterPhotos = listOf("roof_after.jpg"),
            estimateDocs = listOf("roof_estimate.pdf"),
            finalInvoices = listOf("roof_invoice.pdf")
        )
    ),

    WorkOrder(
        id = "WO-1010",
        clientId = "CL-10",
        propertyId = "PR-10",
        propertyAddress = "Baridhara Diplomatic Zone",
        assignedVendorId = "VN-208",
        status = JobStatus.PAID,
        title = "Fire Safety System Check",
        description = "Annual fire extinguisher and alarm inspection",
        createdDate = Instant.parse("2024-12-10T13:00:00Z"),
        scheduledDate = Instant.parse("2024-12-12T10:00:00Z"),
        completedDate = Instant.parse("2024-12-12T15:00:00Z"),
        financial = JobFinancials(
            estimatedCost = 4000.0,
            approvedCost = 4000.0,
            vendorPaymentAmount = 4000.0,
            isVendorPaid = true,
            isClientPaid = true,
            clientInvoiceId = "INV-5005"
        ),
        media = JobMedia(
            beforePhotos = emptyList(),
            afterPhotos = emptyList(),
            estimateDocs = listOf("fire_estimate.pdf"),
            finalInvoices = listOf("fire_invoice.pdf")
        )
    )
)
