package com.baki.rabbitmqadmin.ui.component

import com.intellij.ui.dsl.builder.panel
import javax.swing.JPanel

class OverviewTab {

    companion object {
        fun title(): String {
            return "Overview"
        }
    }
}

fun getOverviewContent(): JPanel {
    return panel {
        indent { row { label("Orverview") } }
    }
}