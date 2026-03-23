# BlockGroupPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype | Extends: DefaultAssetPacketGenerator

public class BlockGroupPacketGenerator extends DefaultAssetPacketGenerator<String, BlockGroup>

Generates `UpdateBlockGroups` network packets for synchronizing block group assets to clients. Produces init, update, and remove packets wrapping `BlockGroup.toPacket()` data.

## Methods

- generateInitPacket(@Nonnull DefaultAssetMap<String, BlockGroup>, Map<String, BlockGroup>) | ToClientPacket | Creates an `UpdateBlockGroups` packet with `UpdateType.Init` containing all block groups.
- generateUpdatePacket(@Nonnull Map<String, BlockGroup>) | ToClientPacket | Creates an `UpdateBlockGroups` packet with `UpdateType.AddOrUpdate` for changed groups.
- generateRemovePacket(@Nonnull Set<String>) | @Nullable ToClientPacket | Creates an `UpdateBlockGroups` packet with `UpdateType.Remove`. Returns `null`.

## Related Types

- `BlockGroup` -- the asset type this generator serializes
- `UpdateBlockGroups` -- the packet type produced
