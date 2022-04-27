package uz.shox.recyclerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.recyclergridkotlin.adapter.UserAdapter
import uz.shox.recyclergridkotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)
        recyclerView.isNestedScrollingEnabled = false

        val users:ArrayList<User> = ArrayList<User>()
        users.add(User(R.drawable.lambo,"Lambo"))
        users.add(User(R.drawable.mers,"Mers"))
        users.add(User(R.drawable.bmw,"BMW"))
        users.add(User(R.drawable.ferra,"Ferra"))
        users.add(User(R.drawable.lambo,"Lambo"))
        users.add(User(R.drawable.mers,"Mers"))


        //adapter
        val userAdapter = UserAdapter(this,users)
        recyclerView.adapter = userAdapter
    }
}