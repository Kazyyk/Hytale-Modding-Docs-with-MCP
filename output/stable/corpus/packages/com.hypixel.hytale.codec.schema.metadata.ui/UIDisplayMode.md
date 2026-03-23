# UIDisplayMode

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UIDisplayMode implements Metadata

Schema metadata that controls how a property is displayed in the editor UI. Provides three pre-built instances: `NORMAL`, `COMPACT`, and `HIDDEN`. Sets the `uiDisplayMode` property on the schema.

## Fields

- public static final UIDisplayMode NORMAL
- public static final UIDisplayMode COMPACT
- public static final UIDisplayMode HIDDEN
- private final UIDisplayMode.DisplayMode mode

## Methods

- public void modify(@Nonnull Schema schema)

## Inner Types

### DisplayMode


public static enum DisplayMode

- NORMAL | Standard display mode.
- COMPACT | Reduced-size display.
- HIDDEN | Property is hidden from the editor UI.
