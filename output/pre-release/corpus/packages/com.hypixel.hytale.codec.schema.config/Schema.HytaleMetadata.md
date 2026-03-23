# Schema.HytaleMetadata

Type: class | Package: com.hypixel.hytale.codec.schema.config

public static class Schema.HytaleMetadata

Hytale-specific metadata attached to schema nodes via the `hytale` key. Controls asset editor UI behavior, file paths, inheritance settings, and caching directives.

## Codec Properties

- type | String | Schema type discriminator string.
- internalKeys | String[] | Keys treated as internal (hidden from editor).
- path | String | File system path for the schema.
- virtualPath | String | Virtual path used in the editor.
- extension | String | File extension for assets of this type.
- idProvider | String | ID provider configuration.
- inheritsProperty | Boolean | Whether properties are inherited from parent.
- mergesProperties | Boolean | Whether properties are merged with parent.
- uiDisplayMode | UIDisplayMode.DisplayMode | How the property is displayed in the editor.
- uiEditorComponent | UIEditor.EditorComponent | Custom editor component.
- allowEmptyObject | Boolean | Whether empty objects are valid.
- uiEditorIgnore | Boolean | Whether to hide from the editor.
- uiEditorFeatures | UIEditorFeatures.EditorFeature[] | Editor feature flags.
- uiEditorPreview | UIEditorPreview.PreviewType | Preview type in the editor.
- uiTypeIcon | String | Icon displayed in the editor.
- uiPropertyTitle | String | Custom property title in the editor.
- uiSectionStart | String | Section header for grouping in the editor.
- uiRebuildCaches | UIRebuildCaches.ClientCache[] | Client caches to rebuild on change.
- uiRebuildCachesForChildProperties | Boolean | Whether child property changes also rebuild caches.
- uiSidebarButtons | UIButton[] | Sidebar buttons in the editor.
- uiCollapsedByDefault | Boolean | Whether the section is collapsed by default.
- uiCreateButtons | UIButton[] | Create buttons in the editor.

## Constructors


public HytaleMetadata(String type)


public HytaleMetadata()

## Methods

Getter and setter methods for all fields listed above.


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- parent class

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, CommonAsset, DoubleOrSchema, InheritSettings, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public String getType()
  public void setType(String type)
  public String getPath()
  public void setPath(String path)
  public String getVirtualPath()
  public void setVirtualPath(String virtualPath)
  public String getExtension()
  public void setExtension(String extension)
  public String getIdProvider()
  public void setIdProvider(String idProvider)
  public String[] getInternalKeys()
  public void setInternalKeys(String[] internalKeys)
  public UIDisplayMode.DisplayMode getUiDisplayMode()
  public void setUiDisplayMode(UIDisplayMode.DisplayMode uiDisplayMode)
  public UIEditor.EditorComponent getUiEditorComponent()
  public void setUiEditorComponent(UIEditor.EditorComponent uiEditorComponent)
  public UIEditorFeatures.EditorFeature[] getUiEditorFeatures()
  public void setUiEditorFeatures(UIEditorFeatures.EditorFeature[] uiEditorFeatures)
  public UIEditorPreview.PreviewType getUiEditorPreview()
  public void setUiEditorPreview(UIEditorPreview.PreviewType uiEditorPreview)
  public String getUiTypeIcon()
  public void setUiTypeIcon(String uiTypeIcon)
  public Boolean getUiEditorIgnore()
  public void setUiEditorIgnore(Boolean uiEditorIgnore)
  public Boolean getAllowEmptyObject()
  public void setAllowEmptyObject(Boolean allowEmptyObject)
  public String getUiPropertyTitle()
  public void setUiPropertyTitle(String uiPropertyTitle)
  public String getUiSectionStart()
  public void setUiSectionStart(String uiSectionStart)
  public boolean isInheritsProperty()
  public void setInheritsProperty(boolean inheritsProperty)
  public boolean getMergesProperties()
  public void setMergesProperties(boolean mergesProperties)
  public UIRebuildCaches.ClientCache[] getUiRebuildCaches()
  public void setUiRebuildCaches(UIRebuildCaches.ClientCache[] uiRebuildCaches)
  public Boolean getUiRebuildCachesForChildProperties()
  public void setUiRebuildCachesForChildProperties(Boolean uiRebuildCachesForChildProperties)
  public UIButton[] getUiSidebarButtons()
  public void setUiSidebarButtons(UIButton[] uiSidebarButtons)
  public Boolean getUiCollapsedByDefault()
  public void setUiCollapsedByDefault(Boolean uiCollapsedByDefault)
  public UIButton[] getUiCreateButtons()
  public void setUiCreateButtons(UIButton[] uiCreateButtons)
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<Schema.HytaleMetadata> CODEC
private String type
private String path
private String virtualPath
private String extension
private String idProvider
private String[] internalKeys
private Boolean inheritsProperty
private Boolean mergesProperties
private UIEditorFeatures.EditorFeature[] uiEditorFeatures
private UIEditorPreview.PreviewType uiEditorPreview
private String uiTypeIcon
private Boolean uiEditorIgnore
private Boolean allowEmptyObject
private UIDisplayMode.DisplayMode uiDisplayMode
private UIEditor.EditorComponent uiEditorComponent
private String uiPropertyTitle
private String uiSectionStart
private UIRebuildCaches.ClientCache[] uiRebuildCaches
private Boolean uiRebuildCachesForChildProperties
private UIButton[] uiSidebarButtons
private Boolean uiCollapsedByDefault
private UIButton[] uiCreateButtons
