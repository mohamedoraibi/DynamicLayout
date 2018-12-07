package camp.codelab.dynamiclayout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.mobile_item.view.*

class MobileAdapter : RecyclerView.Adapter<MobileAdapter.MobilesViewHolder> {

    // mobileList of items
    val mobileList: List<Mobile>

    // constructor to pass the items from Activity
    constructor(mobileList: List<Mobile>) : super() {
        this.mobileList = mobileList
    }

    // inflate the layout you created in res/layout
    // and return a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobileAdapter.MobilesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mobile_item, parent, false)
        return MobilesViewHolder(view)
    }

    // get the count of mobileList items to create rows accordingly
    override fun getItemCount(): Int {
        return mobileList.size
    }

    // bind data and layout using the viewHolder and position to get data from mobileList
    override fun onBindViewHolder(holder: MobilesViewHolder, position: Int) {

        holder.mobileNameTextView.text = mobileList[position].name
        holder.mobileMakeTextView.text = mobileList[position].make
        holder.mobileColorTextView.text = mobileList[position].color

    }


    // this is the ViewHolder's class
    class MobilesViewHolder : RecyclerView.ViewHolder {

        val mobileNameTextView: TextView
        val mobileMakeTextView: TextView
        val mobileColorTextView: TextView

        constructor(view: View) : super(view) {
            mobileNameTextView = view.mobileNameTextView
            mobileMakeTextView = view.mobileMakeTextView
            mobileColorTextView = view.mobileColorTextView
        }
    }

}