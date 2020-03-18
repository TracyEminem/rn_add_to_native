package com.everonet.demo.miniprograms.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.everonet.demo.miniprograms.R
import com.everonet.demo.miniprograms.base.BaseFragment
import com.everonet.demo.miniprograms.databinding.FragmentDashboardBinding
import com.everonet.demo.miniprograms.flutter.FlutterContainerActivity

class DashboardFragment : BaseFragment<FragmentDashboardBinding>() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun getLayoutId(): Int = R.layout.fragment_dashboard

    override fun initFragment(view: View, savedInstanceState: Bundle?) {
        mBinding.holder = this
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        dashboardViewModel.text.observe(this, Observer {
            mBinding.textDashboard.text = it
        })
    }

    fun startMiniProgram(view: View) {
        Intent(requireActivity(), FlutterContainerActivity::class.java).also {
            startActivity(it)
        }
    }
}