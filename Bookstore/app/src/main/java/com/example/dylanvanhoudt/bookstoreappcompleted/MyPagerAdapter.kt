package com.example.dylanvanhoudt.bookstoreappcompleted

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    val pageNumber = 3

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()

            else -> FragmentOne()
        }
    }

    override fun getCount(): Int {
        return pageNumber
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "top"
            1 -> "children"
            2 -> "fiction"
            else -> ""
        }

    }
}