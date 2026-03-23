# DroplistItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class DroplistItemDropContainer extends ItemDropContainer

Drop container that delegates to a named `ItemDropList` asset by ID. Tracks visited droplists to prevent circular references.

## Fields

- droplistId | String | ID of the referenced ItemDropList asset.
