package com.example.admin.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.example.admin.mvvmposts.injection.component.ViewModelInjector
import com.example.admin.mvvmposts.injection.module.NetworkModule
import com.example.admin.mvvmposts.ui.PostListViewModel


abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }


    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}