# EntityUIComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui.asset

public abstract class EntityUIComponent implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityUIComponent>>, NetworkSerializable<EntityUIComponent>

Abstract base class for entity UI components displayed above or near entities. Supports hitbox offset configuration and packet generation for client synchronization.

Known subclasses: CombatTextUIComponent, EntityStatUIComponent, Unknown

Also in this package: CombatTextUIComponent, CombatTextUIComponentAnimationEvent, CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent, EntityStatUIComponent, EntityUIComponentPacketGenerator, Unknown

Complete API:
  public static AssetStore<String,EntityUIComponent,IndexedLookupTableAssetMap<String,EntityUIComponent>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,EntityUIComponent> getAssetMap()
  public static EntityUIComponent getUnknownFor(String id)
  public String getId()
  public final com.hypixel.hytale.protocol.EntityUIComponent toPacket()
  protected com.hypixel.hytale.protocol.EntityUIComponent generatePacket()
  public String toString()

Fields:
public static final AssetCodecMapCodec<String,EntityUIComponent> CODEC
public static final BuilderCodec<EntityUIComponent> ABSTRACT_CODEC
protected String id
protected AssetExtraInfo.Data data
private Vector2f hitboxOffset
private transient SoftReference<com.hypixel.hytale.protocol.EntityUIComponent> cachedPacket
private static AssetStore<String,EntityUIComponent,IndexedLookupTableAssetMap<String,EntityUIComponent>> ASSET_STORE
