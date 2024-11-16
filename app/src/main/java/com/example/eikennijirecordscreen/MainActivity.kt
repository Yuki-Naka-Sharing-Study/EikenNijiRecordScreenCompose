package com.example.eikennijirecordscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eikennijirecordscreen.ui.theme.EikenNijiRecordScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EikenNijiRecordScreenTheme {
                EikenNijiRecordScreen()
            }
        }
    }
}


@Composable
fun EikenNijiRecordScreen() {
    Column {
        Row {
            SelectDayText("")
        }
        Row {
            SelectGradeText("")
        }
        Row {
            EnterScoreText("")
        }
        Row {
            CSEScoreText("")
            CSEScoreInputField()
        }
        Row {
            SpeakingText("")
            SpeakingScoreInputField()
        }
        Row {
            ShortSpeechText(name = "")
            NumberInputWithValidation()
        }
        Row {
            InteractionText(name = "")
            NumberInputWithValidation()
        }
        Row {
            GrammarAndVocabularyText(name = "")
            NumberInputWithValidation()
        }
        Row {
            PronunciationText(name = "")
            NumberInputWithValidation()
        }
        Row {
            MemoText("")
            MemoTextField()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            SaveButton()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EikenNijiRecordScreenPreview() {
    EikenNijiRecordScreenTheme {
        EikenNijiRecordScreen()
    }
}


@Composable
private fun SelectDayText(day: String, modifier: Modifier = Modifier) {
    Text(
        text = "受験日を選択",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SelectDayTextPreview() {
    EikenNijiRecordScreenTheme {
        SelectDayText("受験日を選択")
    }
}


@Composable
private fun SelectGradeText(grade: String, modifier: Modifier = Modifier) {
    Text(
        text = "受験級を選択",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SelectGradeTextPreview() {
    EikenNijiRecordScreenTheme {
        SelectGradeText("受験級を選択")
    }
}


@Composable
private fun EnterScoreText(grade: String, modifier: Modifier = Modifier) {
    Text(
        text = "スコアを記入",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun EnterScoreTextPreview() {
    EikenNijiRecordScreenTheme {
        EnterScoreText("スコアを記入")
    }
}


@Composable
private fun CSEScoreText(grade: String, modifier: Modifier = Modifier) {
    Text(
        text = "CSEスコア",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun CSEScoreTextPreview() {
    EikenNijiRecordScreenTheme {
        CSEScoreText("CSEスコア")
    }
}


@Composable
fun CSEScoreInputField() {
    var number by remember { mutableStateOf("") }

    OutlinedTextField(
        value = number,
        onValueChange = { newValue ->
            if (newValue.all { it.isDigit() }) {
                number = newValue
            }
        },
        label = { Text("3400") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Preview(showBackground = true)
@Composable
private fun CSEScoreInputFieldPreview() {
    EikenNijiRecordScreenTheme {
        CSEScoreInputField()
    }
}


@Composable
private fun SpeakingText(speakingText: String, modifier: Modifier = Modifier) {
    Text(
        text = "Speaking",
        modifier = modifier
    )
}


@Composable
fun SpeakingScoreInputField() {
    var number by remember { mutableStateOf("") }

    OutlinedTextField(
        value = number,
        onValueChange = { newValue ->
            if (newValue.all { it.isDigit() }) {
                number = newValue
            }
        },
        label = { Text("850") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Preview(showBackground = true)
@Composable
private fun SpeakingScoreInputFieldPreview() {
    EikenNijiRecordScreenTheme {
        SpeakingScoreInputField()
    }
}


@Preview(showBackground = true)
@Composable
private fun SpeakingTextPreview() {
    EikenNijiRecordScreenTheme {
        SpeakingText("Speaking")
    }
}


@Composable
fun ShortSpeechText(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Short Speech",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ShortSpeechTextPreview() {
    EikenNijiRecordScreenTheme {
        ShortSpeechText("Short Speech")
    }
}


@Composable
fun InteractionText(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Interaction",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun InteractionTextPreview() {
    EikenNijiRecordScreenTheme {
        InteractionText("Interaction")
    }
}


@Composable
fun GrammarAndVocabularyText(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Interaction",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GrammarAndVocabularyTextPreview() {
    EikenNijiRecordScreenTheme {
        GrammarAndVocabularyText("Grammar And Vocabulary")
    }
}


@Composable
fun PronunciationText(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Pronunciation",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun PronunciationTextPreview() {
    EikenNijiRecordScreenTheme {
        PronunciationText("Pronunciation")
    }
}


@Composable
fun NumberInputWithValidation() {
    var input by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = input,
            onValueChange = { newValue ->
                if (newValue.all { it.isDigit() }) {
                    input = newValue
                    val number = newValue.toIntOrNull()
                    if (number != null && number >= 850) {
                        errorMessage = "11以上は入力できません。"
                    } else {
                        errorMessage = ""
                    }
                }
            },
            label = { Text("スコアを入力してください") }
        )
        if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color = androidx.compose.ui.graphics.Color.Red,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNumberInputWithValidation() {
    NumberInputWithValidation()
}


@Composable
private fun MemoText(memoText: String, modifier: Modifier = Modifier) {
    Text(
        text = "Memo",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun MemoTextPreview() {
    EikenNijiRecordScreenTheme {
        MemoText("Memo")
    }
}


@Composable
fun MemoTextField() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = { Text("MEMO") },
        placeholder = { Text("") },
        maxLines = 5,
        singleLine = false
    )
}

@Preview(showBackground = true)
@Composable
private fun MemoTextFieldPreview() {
    EikenNijiRecordScreenTheme {
        MemoTextField()
    }
}


@Composable
private fun SaveButton(
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Blue)
    ) {
        Text("記録する")
    }
}

@Preview(showBackground = true)
@Composable
private fun SaveButtonPreview() {
    EikenNijiRecordScreenTheme {
        SaveButton()
    }
}
