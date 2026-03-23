# UICreateButtons

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UICreateButtons implements Metadata

Schema metadata that configures create buttons for the editor UI. Applies an array of UIButton instances to the schema via `Schema.getHytale().setUiCreateButtons()`.

## Fields

- private final UIButton[] buttons

## Constructors


public UICreateButtons(UIButton... buttons)

## Methods

- public void modify(@Nonnull Schema schema)
