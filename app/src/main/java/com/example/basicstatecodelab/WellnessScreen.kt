package com.example.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WellnessScreen( modifier: Modifier = Modifier ) {
    StatefulWaterCounter(modifier)
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    WellnessScreen()
}