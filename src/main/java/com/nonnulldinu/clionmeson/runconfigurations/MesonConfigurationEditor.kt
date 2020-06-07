package com.nonnulldinu.clionmeson.runconfigurations

import com.intellij.openapi.options.ConfigurationException
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.ComboBoxWithWidePopup
import com.intellij.openapi.ui.LabeledComponent
import com.nonnulldinu.clionmeson.buildsystem.MesonBuildTarget
import javax.swing.JComponent
import javax.swing.JPanel

class MesonConfigurationEditor : SettingsEditor<MesonConfiguration>() {
    private val myPanel: JPanel? = null
    private var myMainClass: LabeledComponent<ComboBoxWithWidePopup<*>>? = null

    override fun resetEditorFrom(config: MesonConfiguration) {}

    @Throws(ConfigurationException::class)
    override fun applyEditorTo(config: MesonConfiguration) {
    }

    override fun createEditor(): JComponent {
        return myPanel!!
    }

    private fun createUIComponents() {
        myMainClass = LabeledComponent<ComboBoxWithWidePopup<*>>()
        myMainClass!!.component = ComboBoxWithWidePopup<MesonBuildTarget>()
    }
}