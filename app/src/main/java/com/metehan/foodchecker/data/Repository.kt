package com.metehan.foodchecker.data

import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource,
    firebaseAuth: FirebaseAuth
) {
    val remote = remoteDataSource
    val local = localDataSource
    val firebase = firebaseAuth
}