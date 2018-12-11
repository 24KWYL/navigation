package wyl.kobe.com.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page_layout.view.*

abstract class SuperPageFragment : Fragment() {
    private lateinit var rootView: View
    private var TAG = this.javaClass.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = LayoutInflater.from(context).inflate(R.layout.fragment_page_layout, container, false)
        rootView.textView.text = TAG
        return rootView
    }

}

class MainPageFragment1 : SuperPageFragment()


class MainPageFragment2 : SuperPageFragment()

class MainPageFragment3 : SuperPageFragment()

class MainPageFragment4 : SuperPageFragment()

class MainPageFragment5 : SuperPageFragment()