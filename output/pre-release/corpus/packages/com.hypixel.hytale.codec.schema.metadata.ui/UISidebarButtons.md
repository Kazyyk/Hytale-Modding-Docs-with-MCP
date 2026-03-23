# UISidebarButtons

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UISidebarButtons implements Metadata

Schema metadata that configures sidebar buttons for the editor UI. Applies an array of UIButton instances to the schema via `Schema.getHytale().setUiSidebarButtons()`.

## Fields

- private final UIButton[] buttons

## Constructors


public UISidebarButtons(UIButton... buttons)

## Methods

- public void modify(@Nonnull Schema schema)

Also in this package: ClientCache, DisplayMode, Dropdown, EditorComponent, EditorFeature, FormattedNumber, Icon, LocalizationKeyField, MultilineTextField, PreviewType, TextField, Timeline, UIButton, UICreateButtons, UIDefaultCollapsedState, UIDisplayMode, UIEditor, UIEditorFeatures, UIEditorPreview, UIEditorSectionStart (and 4 more)

Complete API:
  public void modify(Schema schema)

Fields:
private final UIButton[] buttons
