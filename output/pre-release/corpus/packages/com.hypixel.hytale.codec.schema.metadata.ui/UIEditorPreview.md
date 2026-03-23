# UIEditorPreview

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UIEditorPreview implements Metadata

Schema metadata that configures the preview type shown in the editor for an asset type. Sets `uiEditorPreview` on the schema.

## Fields

- private final UIEditorPreview.PreviewType previewType

## Constructors


public UIEditorPreview(UIEditorPreview.PreviewType type)

## Methods

- public void modify(@Nonnull Schema schema)

## Inner Types

### PreviewType


public static enum PreviewType

- ITEM | Item preview in the editor.
- MODEL | 3D model preview.
- REVERB_EFFECT | Audio reverb effect preview.
- EQUALIZER_EFFECT | Audio equalizer effect preview.

Also in this package: ClientCache, DisplayMode, Dropdown, EditorComponent, EditorFeature, FormattedNumber, Icon, LocalizationKeyField, MultilineTextField, PreviewType, TextField, Timeline, UIButton, UICreateButtons, UIDefaultCollapsedState, UIDisplayMode, UIEditor, UIEditorFeatures, UIEditorSectionStart, UIPropertyTitle (and 4 more)

Complete API:
  public void modify(Schema schema)

Fields:
private final UIEditorPreview.PreviewType previewType
