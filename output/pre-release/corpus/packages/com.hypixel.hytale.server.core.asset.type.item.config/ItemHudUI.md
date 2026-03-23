# ItemHudUI

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Extends: java.lang.Object | Implements: NetworkSerializable

public class ItemHudUI implements NetworkSerializable<com.hypixel.hytale.protocol.ItemHudUI>

Defines a HUD UI element associated with an item. Contains a path to the UI definition file and the display type (e.g., `Hud`).

## Fields

- path | String | -- | Path to the UI definition file
- type | ItemHudUIType | ItemHudUIType.Hud | How the UI element is displayed

## Methods


public String getPath()

Returns the path to the UI definition file.


public ItemHudUIType getType()

Returns the display type of this HUD UI element.


@Nonnull
public com.hypixel.hytale.protocol.ItemHudUI toPacket()

Converts this asset to its protocol representation.

## Related Types

- `Item` -- items can define HUD UI elements
