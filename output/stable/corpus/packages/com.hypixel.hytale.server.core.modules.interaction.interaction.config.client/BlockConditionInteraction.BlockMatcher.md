# BlockConditionInteraction.BlockMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: NetworkSerializable<BlockMatcher>

public static class BlockConditionInteraction.BlockMatcher implements NetworkSerializable<BlockMatcher>

Matches a block against criteria including block identity (via `BlockIdMatcher`), face direction, and static face flag. When `staticFace` is false, the face matching accounts for the block's rotation.
