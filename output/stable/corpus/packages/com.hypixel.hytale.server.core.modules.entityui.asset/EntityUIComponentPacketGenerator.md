# EntityUIComponentPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui.asset | Extends: AssetPacketGenerator

public class EntityUIComponentPacketGenerator extends AssetPacketGenerator<String, EntityUIComponent, IndexedLookupTableAssetMap<String, EntityUIComponent>>

Generates network packets for entity UI component asset init, update, and removal operations.

Also in this package: CombatTextUIComponent, CombatTextUIComponentAnimationEvent, CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent, EntityStatUIComponent, EntityUIComponent, Unknown

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EntityUIComponent> assetMap, Map<String,EntityUIComponent> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityUIComponent> assetMap, Map<String,EntityUIComponent> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EntityUIComponent> assetMap, Set<String> removed, AssetUpdateQuery query)
