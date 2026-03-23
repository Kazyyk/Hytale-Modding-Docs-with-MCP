# ViewBobbingPacketGenerator

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing | Extends: SimpleAssetPacketGenerator

public class ViewBobbingPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull @Override public ToClientPacket generateInitPacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> assets)
- @Nonnull @Override protected ToClientPacket generateUpdatePacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> loadedAssets)
- @Nonnull @Override protected ToClientPacket generateRemovePacket(AssetMap<MovementType,ViewBobbing> assetMap, Set<MovementType> removed)
- @Nonnull protected static ToClientPacket toCachedPacket(UpdateType type, Map<MovementType,ViewBobbing> assets)

Also in this package: ViewBobbing

Complete API:
  public ToClientPacket generateInitPacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> assets)
  protected ToClientPacket generateUpdatePacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> loadedAssets)
  protected ToClientPacket generateRemovePacket(AssetMap<MovementType,ViewBobbing> assetMap, Set<MovementType> removed)
  protected static ToClientPacket toCachedPacket(UpdateType type, Map<MovementType,ViewBobbing> assets)
