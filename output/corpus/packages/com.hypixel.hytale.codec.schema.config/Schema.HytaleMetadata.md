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
