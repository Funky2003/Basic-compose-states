package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel

) {
    Column ( modifier =  modifier ){
        StatefulWaterCounter(modifier)

        WellnessTaskList(
            listItems = wellnessViewModel.tasks,
            onCloseTask = { task -> wellnessViewModel.remove(task) },
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked( task, checked )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
//    WellnessScreen()
}