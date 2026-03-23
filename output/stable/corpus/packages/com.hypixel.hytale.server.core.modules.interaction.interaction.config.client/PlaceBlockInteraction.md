# PlaceBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class PlaceBlockInteraction extends SimpleInteraction

Places the current or a specified block at the target position. Handles block rotation, filler blocks, sound events, and item durability. Validates placement against world config and block placement rules via `BlockPlaceUtils`. Requires client-side synchronization.

## Codec

`PlaceBlockInteraction.CODEC` -- `BuilderCodec<PlaceBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
