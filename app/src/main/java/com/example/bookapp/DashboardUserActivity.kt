package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.bookapp.databinding.ActivityDashboardAdminBinding
import com.example.bookapp.databinding.ActivityDashboardUserBinding
import com.google.firebase.auth.FirebaseAuth

class DashboardUserActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityDashboardUserBinding
    private lateinit var acc:TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn10: Button
    private lateinit var btn11: Button
    private lateinit var btn12: Button
    private lateinit var btn13: Button
    private lateinit var btn14: Button
    //firebase auth
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init firebase auth
        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()
            binding.account.setOnClickListener {
                val intent = Intent(this@DashboardUserActivity,ActivityAccount::class.java)
                startActivity(intent)
            }
        //handle click, logout
        binding.logoutBtn.setOnClickListener {
            firebaseAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }





        btn1 = findViewById(R.id.a_story_of_struggle)
        btn2 = findViewById(R.id.write_a_new_name_in_the_book_of_life)
        btn3 = findViewById(R.id.the_outsiders)
        btn4 = findViewById(R.id.the_name_of_the_book)
        btn5 = findViewById(R.id.the_graveyard_apartment)
        btn6 = findViewById(R.id.the_english_novel)
        btn7 = findViewById(R.id.the_english_assassin)
        btn8 = findViewById(R.id.the_book_of_names)

        btn9 = findViewById(R.id.the_bamboo_stalk)
        btn10 = findViewById(R.id.news_of_the_world)
        btn11 = findViewById(R.id.mpfsae)
        btn12 = findViewById(R.id.HarryPotter)
        btn13 = findViewById(R.id.cng)
        btn14 = findViewById(R.id.agnipamk)







        btn1.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","A Story of Struggle")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","Write a new name in the book of life")
            startActivity(intent)
        }


        btn3.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The outsiders")
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The name of the book")
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The graveyard apartment")
            startActivity(intent)
        }


        btn6.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The english novel")
            startActivity(intent)
        }

        btn7.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The english assassin")
            startActivity(intent)
        }


        btn8.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The book of names")
            startActivity(intent)
        }

        btn9.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","The bamboo stalk")
            startActivity(intent)
        }

        btn10.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","News of the world")
            startActivity(intent)
        }

        btn11.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","Modern physics for science and engineering")
            startActivity(intent)
        }

        btn12.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","Harry Potter")
            startActivity(intent)
        }

        btn13.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","Code name of God")
            startActivity(intent)
        }
        btn14.setOnClickListener {
            val intent = Intent(this@DashboardUserActivity,myissuedBook::class.java)
            intent.putExtra("Name","Agnipank")
            startActivity(intent)
        }




    }

    private fun checkUser() {
        // get current user
        val firebaseUser = firebaseAuth.currentUser
        if(firebaseUser == null) {
            //not logged in, user can stay in user dashboard without login too
            binding.subTitletv.text = "Not Logged In"
        }
        else {
            // show user info
            val email = firebaseUser.email
            binding.subTitletv.text = email
        }
    }


    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Alert")
            .setMessage("Do You Want To Exit App?")
            .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
            finish()
            }
            .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->

            }
            .show()
    }

}