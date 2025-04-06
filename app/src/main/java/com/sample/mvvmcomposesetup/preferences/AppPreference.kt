package com.sample.mvvmcomposesetup.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class AppPreference @Inject constructor(context: Context) {

    companion object {
        private const val PREFERENCE_NAME = "MY_INTERVIEW_TASK"
        private val USERTOKEN = stringPreferencesKey("UserToken")

    }

    private val Context.userPreferencesDataStore: DataStore<Preferences> by preferencesDataStore(
        name = PREFERENCE_NAME
    )

    private val dataStore = context.userPreferencesDataStore

    /*----------------------------------------------- Clear Preference -----------------------------------------------*/

    suspend fun clearAppPreference() {
        dataStore.edit { preference ->
            preference.clear()
        }
    }

    /*----------------------------------------------- Get Token -----------------------------------------------*/

    val getToken: Flow<String>
        get() = dataStore.data.catch {
            if (it is IOException) {
                it.printStackTrace()
                emit(emptyPreferences())
            } else {
                throw it
            }
        }.map { preference ->
            (preference[USERTOKEN] ?: "").toString()
        }


    suspend fun setToken(token: String) {
        dataStore.edit { preference ->
            preference[USERTOKEN] = token
        }
    }


}