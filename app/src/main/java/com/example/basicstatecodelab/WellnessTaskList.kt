package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    listItems: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit
) {
    LazyColumn(
        modifier = modifier,
        state = remember { LazyListState() }
    ){
        items( listItems, key = { wellnessItems -> wellnessItems.id } ){
            wellnessItems -> WellnessTaskItem(
            onClose = { onCloseTask(wellnessItems) },
            taskName = wellnessItems.label,
            checked = wellnessItems.isChecked,
            onCheckedChange = { isChecked -> onCheckedTask( wellnessItems, isChecked ) }
        )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessTaskListPreview() {
//    WellnessTaskList()
}