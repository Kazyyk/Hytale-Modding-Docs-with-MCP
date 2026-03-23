# BlockConditionInteraction.BlockIdMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: NetworkSerializable<BlockIdMatcher>

public static class BlockConditionInteraction.BlockIdMatcher implements NetworkSerializable<BlockIdMatcher>

Matches a block by ID, state, and/or tag. The `tag` field is resolved to a tag index via `AssetRegistry.getOrCreateTagIndex()` during decoding.
