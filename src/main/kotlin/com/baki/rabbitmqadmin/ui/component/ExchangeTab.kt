package com.baki.rabbitmqadmin.ui.component

import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.table.JBTable
import javax.swing.JPanel

class ExchangeTab {
    companion object {
        fun title(): String {
            return "Exchanges"
        }
    }
}

fun getExchangeContent(): JPanel {
    return panel {
        indent {
            row {
                label("Exchanges")
                        .bold()
            }
        }

        separator()

        row {
            val header = arrayOf("Virtual host", "Name", "Type", "Features", "Message rate in", "Message rate out")
            val data = arrayOf(
                    arrayOf("1","","","","",""),
                    arrayOf("2","","","","","")
            )
            val
            val table = JBTable()

            cell(JBTable(data, header))
        }
    }
}