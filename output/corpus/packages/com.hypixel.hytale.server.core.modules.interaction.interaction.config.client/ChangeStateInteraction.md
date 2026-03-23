# ChangeStateInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class ChangeStateInteraction extends SimpleBlockInteraction

Changes the state of the target block to another state based on a `Changes` map. The key `"default"` can be used for the initial state of a block. When `UpdateBlockState` is true, the block state update notification is sent. Plays the interaction sound event associated with the new block state, if configured.

## Codec

`ChangeStateInteraction.CODEC` -- `BuilderCodec<ChangeStateInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
