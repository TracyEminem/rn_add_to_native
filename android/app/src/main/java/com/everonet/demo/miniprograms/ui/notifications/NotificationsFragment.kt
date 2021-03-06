package com.everonet.demo.miniprograms.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.everonet.demo.miniprograms.R
import com.everonet.demo.miniprograms.base.BaseFragment
import com.everonet.demo.miniprograms.databinding.FragmentNotificationsBinding
import com.everonet.demo.miniprograms.ui.mini.MiniAppListActivity
import com.everonet.demo.miniprograms.ui.mini.MiniScanActivity

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_notifications

    override fun initFragment(view: View, savedInstanceState: Bundle?) {
        mBinding.holder = this
    }

    fun startMiniList(view: View) {
        MiniAppListActivity.startActivity(activity)
    }

    //扫码展示小程序
    fun startScan(view: View) {
        val intent = Intent(activity, MiniScanActivity::class.java)
        intent.putExtra(MiniScanActivity.REQUEST_CODE, MiniScanActivity.CODE_SCAN_MINI_GID)
        startActivity(intent)
    }
}