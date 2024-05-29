import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spouse1Input: EditText
    private lateinit var spouse2Input: EditText
    private lateinit var issuesInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        spouse1Input = findViewById(R.id.spouse1_input)
        spouse2Input = findViewById(R.id.spouse2_input)
        issuesInput = findViewById(R.id.issues_input)
        submitButton = findViewById(R.id.submit_btn)

        // Set click listener for submit button
        submitButton.setOnClickListener {
            val spouse1 = spouse1Input.text.toString()
            val spouse2 = spouse2Input.text.toString()
            val issues = issuesInput.text.toString()

            // Validation: Check if fields are not empty
            if (spouse1.isEmpty() || spouse2.isEmpty() || issues.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // For demonstration purposes, just print the entered data
            println("Spouse 1: $spouse1")
            println("Spouse 2: $spouse2")
            println("Issues: $issues")

            // In a real application, you would typically send this data to a server or database
            // for further processing or store it locally.
            // For simplicity, this example just prints the data.

            // Show a success message
            Toast.makeText(this, "Form submitted successfully", Toast.LENGTH_SHORT).show()

            // Clear input fields after submission (optional)
            clearForm()
        }
    }

    private fun clearForm() {
        spouse1Input.text.clear()
        spouse2Input.text.clear()
        issuesInput.text.clear()
    }
}
