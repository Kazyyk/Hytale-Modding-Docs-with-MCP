# UIEditorFeatures

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UIEditorFeatures implements Metadata

Schema metadata that enables specific editor features for a property. Sets the `uiEditorFeatures` array on the schema.

## Fields

- private final UIEditorFeatures.EditorFeature[] features

## Constructors


public UIEditorFeatures(UIEditorFeatures.EditorFeature... features)

## Methods

- public void modify(@Nonnull Schema schema)

## Inner Types

### EditorFeature


public static enum EditorFeature

- WEATHER_DAYTIME_BAR | Enables a weather/daytime bar in the editor preview.
- WEATHER_PREVIEW_LOCAL | Enables local weather preview in the editor.
