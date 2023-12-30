package com.baki.rabbitmqadmin

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowAnchor
import com.intellij.openapi.wm.ToolWindowFactory
import javax.swing.Icon

class RabbitMqAdminWindowFactory : ToolWindowFactory {
    override fun isApplicable(project: Project): Boolean {
        return super.isApplicable(project)
    }

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
    }

    override fun init(toolWindow: ToolWindow) {
        super.init(toolWindow)
    }

    override fun shouldBeAvailable(project: Project): Boolean {
        return super.shouldBeAvailable(project)
    }

    override fun getAnchor(): ToolWindowAnchor? {
        return super.getAnchor()
    }

    override fun getIcon(): Icon? {
        return super.getIcon()
    }
}
