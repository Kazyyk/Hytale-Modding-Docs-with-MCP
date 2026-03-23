# CombatTextUIComponentAnimationEvent

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui.asset

public abstract class CombatTextUIComponentAnimationEvent implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, CombatTextUIComponentAnimationEvent>>

Abstract base for combat text animation events with configurable start and end time percentages.

Known subclasses: CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent

Also in this package: CombatTextUIComponent, CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent, EntityStatUIComponent, EntityUIComponent, EntityUIComponentPacketGenerator, Unknown

Complete API:
  public String getId()
  public CombatTextEntityUIComponentAnimationEvent generatePacket()
  public String toString()

Fields:
public static final AssetCodecMapCodec<String,CombatTextUIComponentAnimationEvent> CODEC
public static final BuilderCodec<CombatTextUIComponentAnimationEvent> ABSTRACT_CODEC
protected String id
protected AssetExtraInfo.Data data
private CombatTextEntityUIAnimationEventType type
private float startAt
private float endAt
