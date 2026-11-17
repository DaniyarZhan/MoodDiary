package com.example.mooddiary.data.local.entity

import android.provider.ContactsContract
import java.net.PasswordAuthentication

class User (val login: String,
            val email: ContactsContract.CommonDataKinds.Email,
            val password: PasswordAuthentication) {

}