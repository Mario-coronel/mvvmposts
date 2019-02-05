package com.example.admin.mvvmposts.injection.component

import com.example.admin.mvvmposts.injection.module.NetworkModule
import com.example.admin.mvvmposts.ui.PostListViewModel
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)


//    @Component.Builder
//    interface Builder {
//        fun build(): ViewModelInjector
//        fun networkModule(networkModule: Module): Builder
//
//
//    }



}