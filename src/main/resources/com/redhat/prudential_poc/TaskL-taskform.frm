{"id":"e00e0bff-c977-4a04-9649-2d6e0702d61e","name":"TaskL-taskform.frm","model":{"taskName":"TaskL","processId":"prudential_poc.UnderwritingProcess","name":"task","properties":[{"name":"insured","typeInfo":{"type":"OBJECT","className":"com.redhat.prudential_poc.pojo.Insured","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":true}]}},{"name":"status","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"ceb9b7f2-57fd-4a2c-9f04-77bf1d7d5a54","container":"FIELD_SET","id":"field_0639054368857153E12","name":"insured","label":"Insured","required":false,"readOnly":true,"validateOnChange":true,"binding":"insured","standaloneClassName":"com.redhat.prudential_poc.pojo.Insured","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"options":[{"value":"H","text":"照會體檢"},{"value":"A","text":"加費"},{"value":"C","text":"條件承保"},{"value":"1","text":"承保"},{"value":"5","text":"拒保"}],"defaultValue":"H","addEmptyOption":true,"dataProvider":"","id":"field_400429165839156E11","name":"status","label":"核保結果","required":true,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"status","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eInputs:\u003c/h3\u003e"},"parts":[]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0639054368857153E12","form_id":"e00e0bff-c977-4a04-9649-2d6e0702d61e"},"parts":[{"partId":"Legend Text","cssProperties":{}}]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eOutputs:\u003c/h3\u003e"},"parts":[]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_400429165839156E11","form_id":"e00e0bff-c977-4a04-9649-2d6e0702d61e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]}]}]}}