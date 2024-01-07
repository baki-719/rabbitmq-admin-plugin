package com.baki.rabbitmqadmin.ui

import com.baki.rabbitmqadmin.ui.component.ExchangeTab
import com.baki.rabbitmqadmin.ui.component.OverviewTab
import com.baki.rabbitmqadmin.ui.component.getExchangeContent
import com.baki.rabbitmqadmin.ui.component.getOverviewContent
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class RabbitMqAdminWindowFactory : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val overviewContent = ContentFactory.getInstance().createContent(getOverviewContent(), OverviewTab.title(), true)
        val exchangeContent = ContentFactory.getInstance().createContent(getExchangeContent(), ExchangeTab.title(), false)
        toolWindow.contentManager.addContent(overviewContent)
        toolWindow.contentManager.addContent(exchangeContent)
    }
}
