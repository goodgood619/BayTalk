package com.jay.baytalk.model

data class MessageData(
    var userId: String? = ""
    , var name: String? = ""
    , var message: String? = ""
    , var time: Long = 1
)