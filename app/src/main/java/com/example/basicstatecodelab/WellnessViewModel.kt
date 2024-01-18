package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task $i") }

class WellnessViewModel : ViewModel(){
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() { return  _tasks }

    fun remove(item: WellnessTask){
        _tasks.remove(item)
    }

    fun changeTaskChecked( item: WellnessTask, isChecked: Boolean ) = run {
        _tasks.find { it.id == item.id }?.let { task -> task.isChecked = isChecked }
    }
}