# DestroyBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class DestroyBlockInteraction extends SimpleInstantInteraction

Destroys the target block at the position specified in the interaction context. Delegates to `BlockHarvestUtils.performBlockBreak()` for the actual block removal.

## Codec

`DestroyBlockInteraction.CODEC` -- `BuilderCodec<DestroyBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
