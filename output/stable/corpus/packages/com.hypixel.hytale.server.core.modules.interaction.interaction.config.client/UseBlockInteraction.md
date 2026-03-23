# UseBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class UseBlockInteraction extends SimpleBlockInteraction

Attempts to use the target block, executing any interactions configured on it. Fires `UseBlockEvent` and `LivingEntityUseBlockEvent` on the block's chunk. Delegates block interaction lookup and execution to the block type's interaction configuration.

## Codec

`UseBlockInteraction.CODEC` -- `BuilderCodec<UseBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
