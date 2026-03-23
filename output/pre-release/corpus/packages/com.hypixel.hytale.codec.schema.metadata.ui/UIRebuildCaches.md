# UIRebuildCaches

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UIRebuildCaches implements Metadata

Schema metadata that declares which client-side caches should be rebuilt when a property is edited. Sets both `uiRebuildCaches` and `uiRebuildCachesForChildProperties` on the schema.

## Fields

- private final UIRebuildCaches.ClientCache[] caches
- private final boolean appliesToChildProperties

## Constructors


public UIRebuildCaches(UIRebuildCaches.ClientCache... caches)


public UIRebuildCaches(boolean appliesToChildProperties, UIRebuildCaches.ClientCache... caches)

## Methods

- public void modify(@Nonnull Schema schema)

## Inner Types

### ClientCache


public static enum ClientCache

- BLOCK_TEXTURES | Rebuild block texture cache.
- MODELS | Rebuild model cache.
- MODEL_TEXTURES | Rebuild model texture cache.
- MAP_GEOMETRY | Rebuild map geometry cache.
- ITEM_ICONS | Rebuild item icon cache.

Also in this package: ClientCache, DisplayMode, Dropdown, EditorComponent, EditorFeature, FormattedNumber, Icon, LocalizationKeyField, MultilineTextField, PreviewType, TextField, Timeline, UIButton, UICreateButtons, UIDefaultCollapsedState, UIDisplayMode, UIEditor, UIEditorFeatures, UIEditorPreview, UIEditorSectionStart (and 4 more)

Complete API:
  public void modify(Schema schema)

Fields:
private final UIRebuildCaches.ClientCache[] caches
private final boolean appliesToChildProperties
