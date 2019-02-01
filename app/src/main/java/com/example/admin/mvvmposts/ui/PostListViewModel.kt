package com.example.admin.mvvmposts.ui

import com.example.admin.mvvmposts.base.BaseViewModel
import com.example.admin.mvvmposts.network.PostApi
import javax.inject.Inject

class PostListViewModel : BaseViewModel() {
    @Inject
    lateinit var postApi: PostApi
}