package com.akondi.paginglibrxjava.model.api.entity

data class Response(
    val code: Int,
    val etag: String,
    val data: Data
)