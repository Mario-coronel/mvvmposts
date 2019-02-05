package com.example.admin.mvvmposts.ui

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.admin.mvvmposts.R
import com.example.admin.mvvmposts.databinding.ActivityPostListBinding

class PostListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPostListBinding
    private lateinit var viewModel: PostListViewModel
    private var errorSnackbar: com.google.android.material.snackbar.Snackbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_post_list)
        binding.postList.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            this,
            androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,
            false
        )

        viewModel = ViewModelProviders.of(this).get(PostListViewModel::class.java)
        viewModel.errorMessage.observe(this,Observer{
            errorMessage -> if(errorMessage != null) showError(errorMessage)else hideError()
        })
        binding.viewModel = viewModel
    }

    private fun showError(@StringRes errorMessage: Int) {
        errorSnackbar = com.google.android.material.snackbar.Snackbar.make(binding.root, errorMessage, com.google.android.material.snackbar.Snackbar.LENGTH_INDEFINITE)
        errorSnackbar?.setAction(R.string.retry, viewModel.errorClickListener)
        errorSnackbar?.show()
    }

    private fun hideError() {
        errorSnackbar?.dismiss()
    }
}