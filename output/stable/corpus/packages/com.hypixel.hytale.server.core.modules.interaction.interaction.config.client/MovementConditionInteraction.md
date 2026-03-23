# MovementConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class MovementConditionInteraction extends SimpleInteraction

Branches to different interactions based on the player's current movement direction. Supports all eight directions (Forward, Back, Left, Right, ForwardLeft, ForwardRight, BackLeft, BackRight) plus a None/failed branch. Each direction maps to a separately configured interaction. Requires client-side synchronization.

## Codec

`MovementConditionInteraction.CODEC` -- `BuilderCodec<MovementConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
