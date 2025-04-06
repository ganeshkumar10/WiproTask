package com.sample.mvvmcomposesetup.model.response

import com.google.gson.annotations.SerializedName

data class UserListResponseItem(

    @SerializedName("login") val login: String?,
    @SerializedName("id") val id: Int?,
    @SerializedName("avatar_url") val avatarUrl: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("site_admin") val siteAdmin: Boolean?,
    @SerializedName("html_url") val htmlUrl: String?,
    @SerializedName("gists_url") val gistsUrl: String?,
    @SerializedName("repos_url") val reposUrl: String?,
    @SerializedName("following_url") val followingUrl: String?,
    @SerializedName("followers_url") val followersUrl: String?,
    @SerializedName("starred_url") val starredUrl: String?,
    @SerializedName("subscriptions_url") val subscriptionsUrl: String?,
    @SerializedName("organizations_url") val organizationsUrl: String?,
    @SerializedName("events_url") val eventsUrl: String?,
    @SerializedName("received_events_url") val receivedEventsUrl: String?,
    @SerializedName("gravatar_id") val gravatarId: String?,
    @SerializedName("node_id") val nodeId: String?,
    @SerializedName("user_view_type") val userViewType: String?,

//	val gistsUrl: String? = null,
//	val reposUrl: String? = null,
//	val userViewType: String? = null,
//	val followingUrl: String? = null,
//	val starredUrl: String? = null,
//	val login: String? = null,
//	val followersUrl: String? = null,
//	val type: String? = null,
//	val url: String? = null,
//	val subscriptionsUrl: String? = null,
//	val receivedEventsUrl: String? = null,
//	val avatarUrl: String? = null,
//	val eventsUrl: String? = null,
//	val htmlUrl: String? = null,
//	val siteAdmin: Boolean? = null,
//	val id: Int? = null,
//	val gravatarId: String? = null,
//	val nodeId: String? = null,
//	val organizationsUrl: String? = null
)




