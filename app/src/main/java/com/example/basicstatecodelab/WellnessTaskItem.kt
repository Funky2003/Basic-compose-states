package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier,
    onClose: () -> Unit,
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
    ) {
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = taskName,
            modifier
                .weight(1f)
                .padding(start = 16.dp)
        )

        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        IconButton(
            onClick = onClose
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = stringResource(R.string.close)
            )
        }
    }
}

//@Composable
//fun StatefulWellnessTaskItem(
//    taskName: String,
//    onClose: () -> Unit,
//    modifier: Modifier = Modifier ) {
//    var isChecked by rememberSaveable { mutableStateOf(false) }
//    WellnessTaskItem(
//        taskName = taskName,
//        onClose = onClose,
//        checked = isChecked,
//        onCheckedChange = { newValue -> isChecked = newValue },
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun WellnessTaskItemPreview() {
////    StatefulWellnessTaskItem()
//}