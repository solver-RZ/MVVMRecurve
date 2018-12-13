package com.tangpj.recurve.ui.creator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.tangpj.recurve.ui.creator.ext.AppbarExt
import com.tangpj.recurve.ui.creator.ext.CollapsingToolbarLayoutExt
import com.tangpj.recurve.ui.creator.ext.ToolbarExt

/**
 * 创建折叠ActonBar内容
 *
 * @className: CollapsingContentCreator
 * @author: tangpj
 * @createTime: 2018/11/28 15:40
 */
interface AppbarCreator{

    /**
     * 接收Appbar配置并且初始化Appbar
     *
     * @method: appbar
     * @author: tangpengjian113
     * @createTime: 2018/12/5 21:21
     *
     * @param init Appbar配置
     */
    fun appbar(init: AppbarExt.() -> Unit): AppBarLayout

    fun createToolbar(
            toolbarExt: ToolbarExt,
            inflater: LayoutInflater,
            parent: ViewGroup): Toolbar

    fun createCollapsingToolbarLayout(
            collapsingToolbarLayoutExt: CollapsingToolbarLayoutExt,
            inflater: LayoutInflater,
            parent: ViewGroup)
            : CollapsingToolbarLayout
}