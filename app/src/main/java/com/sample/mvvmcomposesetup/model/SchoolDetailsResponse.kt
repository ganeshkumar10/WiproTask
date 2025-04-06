package com.sample.mvvmcomposesetup.model

data class SchoolDetailsResponse(
    val dbn: String,
    val sat_writing_avg_score: String,
    val sat_critical_reading_avg_score: String,
    val sat_math_avg_score: String,
    val school_name: String,
    val num_of_sat_test_takers: String
)
