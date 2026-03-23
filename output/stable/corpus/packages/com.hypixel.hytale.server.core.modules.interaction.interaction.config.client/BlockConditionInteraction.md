# BlockConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class BlockConditionInteraction extends SimpleBlockInteraction

Tests the target block against an array of `BlockMatcher` conditions. Succeeds (runs `Next`) if any matcher passes; fails otherwise. Each matcher can test against block ID, block state, block tag, and/or block face (with optional rotation-aware face matching via the `StaticFace` flag).

## Codec

`BlockConditionInteraction.CODEC` -- `BuilderCodec<BlockConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
