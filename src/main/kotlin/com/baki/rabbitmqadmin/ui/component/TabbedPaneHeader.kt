package com.baki.rabbitmqadmin.ui.component

import com.intellij.ide.ui.laf.darcula.ui.DarculaTabbedPaneUI
import com.intellij.ui.components.JBTabbedPane
import com.intellij.util.ui.JBUI
import java.awt.Dimension

class TabbedPaneHeader: JBTabbedPane() {
    override fun updateUI() {
        setUI(HeaderTabbedPaneUI())
    }

    override fun getPreferredSize(): Dimension {
        val insets = insets
        val tabbedPaneUI = ui as HeaderTabbedPaneUI
        return Dimension(tabbedPaneUI.getTabsWidth() + insets.left + insets.right,
                tabbedPaneUI.getTabHeight() + insets.top + insets.bottom)
    }

    override fun getMinimumSize(): Dimension {
        return preferredSize
    }

    override fun getBaseline(width: Int, height: Int): Int {
        var result = -1

        for (i in 0..tabCount - 1) {
            val component = getTabComponentAt(i)
            val baseline = component.getBaseline(component.width, component.height)
            if (baseline >= 0) {
                val baselineInParent = component.y + baseline
                if (result < 0) {
                    result = baselineInParent
                }
                else {
                    if (result != baselineInParent) {
                        return -1
                    }
                }
            }
        }

        return result
    }
}

private class HeaderTabbedPaneUI : DarculaTabbedPaneUI() {

    fun getTabsWidth(): Int {
        val metrics = tabPane.getFontMetrics(tabPane.font)
        return (0 until tabPane.tabCount).sumOf { calculateTabWidth(tabPane.tabPlacement, it, metrics) }
    }

    fun getTabHeight(): Int {
        return calculateMaxTabHeight(tabPane.tabPlacement)
    }

    override fun getOffset(): Int {
        return 0
    }

    override fun getTabLabelShiftY(tabPlacement: Int, tabIndex: Int, isSelected: Boolean): Int {
        return JBUI.scale(1)
    }
}