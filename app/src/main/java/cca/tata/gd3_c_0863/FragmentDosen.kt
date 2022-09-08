package cca.tata.gd3_c_0863

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cca.tata.gd3_c_0863.entity.Dosen


class FragmentDosen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVDosenAdapter = RVDosenAdapter(Dosen.listOfDosen)

        val rvDosen : RecyclerView = view.findViewById(R.id.rv_dosen)

        rvDosen.layoutManager = layoutManager

        rvDosen.setHasFixedSize(true)

        rvDosen.adapter = adapter
    }
}