package org.codejudge.android.restaurantslist

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import org.codejudge.android.App
import org.codejudge.android.R
import org.codejudge.android.databinding.ActivityRestaurantsBinding
import javax.inject.Inject

class RestaurantsListActivity : AppCompatActivity() {

    lateinit var binding: ActivityRestaurantsBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: RestaurantsListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as App).component.inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RestaurantsListViewModel::class.java)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_restaurants)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.restaurantsRecyclerview.adapter = RestaurantsListAdapter()
        viewModel.getAllRestaurants()

        viewModel.errorMessage.observe(this, {
            it?.let {
                showSnackbar(it, binding.root)
            }
        })

        binding.editSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (!query.isNullOrBlank()) {
                    viewModel.searchRestaurants(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrBlank()) {
                    viewModel.getAllRestaurants()
                } else {
                    viewModel.searchRestaurants(newText)
                }
                return false
            }
        })
    }

    private fun showSnackbar(snackbarText: String, view: View) {
        Snackbar.make(view, snackbarText, Snackbar.LENGTH_INDEFINITE).run {
            setAction(getString(R.string.retry)) { viewModel.getAllRestaurants()}
            show()
        }
    }
}