package com.example.app2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        val userLogin: EditText = findViewById(R.id.user_login_auth)
        val userPassword: EditText = findViewById(R.id.user_password_auth)
        val button: Button = findViewById(R.id.button_reg_auth)

        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val password = userPassword.text.toString().trim()

            if (login == "" || password == "") {
                Toast.makeText(this, "Не все поля заполнены!", Toast.LENGTH_SHORT).show()
            }
            else {
                val db = DbHelper(this, null);
                val isAuth: Boolean = db.getUser(login, password);

                if (isAuth) {
                    Toast.makeText(this, "Вы успешно авторизовались!", Toast.LENGTH_SHORT).show()
                    userLogin.text.clear()
                    userPassword.text.clear()

                    val intent = Intent(this, ItemsActivity::class.java)
                    startActivity(intent);
                }
                else {
                    Toast.makeText(this, "Неверный логин или пароль!", Toast.LENGTH_SHORT).show()
                }

            }

        }

        val linkToReg: TextView = findViewById(R.id.link_to_reg);
        linkToReg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
    }
}