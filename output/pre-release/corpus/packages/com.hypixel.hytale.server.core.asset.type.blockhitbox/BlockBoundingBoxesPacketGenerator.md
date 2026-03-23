# BlockBoundingBoxesPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockhitbox

public class BlockBoundingBoxesPacketGenerator

Generates network packets for synchronizing block bounding box data to clients.

Also in this package: BlockBoundingBoxes, RotatedVariantBoxes

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,BlockBoundingBoxes> assetMap, Map<String,BlockBoundingBoxes> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,BlockBoundingBoxes> assetMap, Map<String,BlockBoundingBoxes> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,BlockBoundingBoxes> assetMap, Set<String> removed)
