package com.dji.dair.internal.models

import android.app.Application
import androidx.annotation.MainThread
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.ViewModelProvider

/**
 *  앱 전체에서 동일한 ViewModel 인스턴스를
 *  사용하기 위한 확장 함수
 */

val globalViewModelStore = ViewModelStore()

@MainThread
inline fun <reified VM : ViewModel> ComponentActivity.globalViewModels(
    noinline factoryProducer: (() -> ViewModelProvider.Factory)? = null
): Lazy<VM> {
    val factoryPromise = factoryProducer ?: {
        defaultViewModelProviderFactory
    }
    return ViewModelLazy(VM::class, { globalViewModelStore }, factoryPromise)
}

@MainThread
inline fun <reified VM : ViewModel> Fragment.globalViewModels(
    noinline factoryProducer: (() -> ViewModelProvider.Factory)? = null
): Lazy<VM> {
    val factoryPromise = factoryProducer ?: {
        defaultViewModelProviderFactory
    }
    return ViewModelLazy(VM::class, { globalViewModelStore }, factoryPromise)
}

@MainThread
inline fun <reified VM : ViewModel> Application.globalViewModels(): Lazy<VM> {
    val factory = ViewModelProvider.AndroidViewModelFactory.getInstance(this)
    return ViewModelLazy(VM::class, { globalViewModelStore }, { factory })
}