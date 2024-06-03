package at.fhooe.sail.ourproject.activitys

<<<<<<< HEAD
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.sail.ourproject.MainAdapter
import at.fhooe.sail.ourproject.MainData
import at.fhooe.sail.ourproject.R
import at.fhooe.sail.ourproject.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    lateinit var binding: ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.activityAToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val data: MutableList<ListItemData> = mutableListOf(
            ListItemData(R.id.list_item_textView, R.drawable.recycle_bin),
        )

        with(binding.activityARecyclerview) {
            val pad = 10
            layoutManager = GridLayoutManager(this@ActivityA, 1)
            this.adapter = ListItemAdapter(data, this@ActivityA)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.left = pad
                    outRect.right = pad
                    outRect.top = pad
                    outRect.bottom = pad
                }
            })

        }

        binding.activityAAdd.setOnClickListener {
            data.add(ListItemData(R.id.list_item_textView, R.drawable.recycle_bin))
            binding.activityARecyclerview.adapter?.notifyDataSetChanged()
        }


    }
}

=======
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import at.fhooe.sail.ourproject.databinding.ActivityMainABinding
//
//class ActivityA : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainABinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainABinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setSupportActionBar(binding.activityAToolbar)
//        supportActionBar?.setDisplayShowTitleEnabled(true)
//
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        binding.recyclerView.adapter = adapter
//
//        binding.buttonAdd.setOnClickListener {
//            val product = binding.editText.text.toString()
//            if (product.isNotEmpty()) {
//                adapter.addProduct(product)
//                binding.editText.text.clear()
//            }
//        }
//
//        binding.buttonRemoveChecked.setOnClickListener {
//            adapter.removeCheckedProducts()
//        }
//    }
//}
>>>>>>> 83cd78abb531f6bf46f03334d49010c597be6652
