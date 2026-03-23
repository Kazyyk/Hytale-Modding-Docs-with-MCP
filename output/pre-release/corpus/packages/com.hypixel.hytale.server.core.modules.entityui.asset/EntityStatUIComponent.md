# EntityStatUIComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui.asset | Extends: EntityUIComponent

public class EntityStatUIComponent extends EntityUIComponent

Entity UI component that displays an entity stat value (e.g., health bar). References an `EntityStatType` by name.

Also in this package: CombatTextUIComponent, CombatTextUIComponentAnimationEvent, CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent, EntityUIComponent, EntityUIComponentPacketGenerator, Unknown

Complete API:
  protected com.hypixel.hytale.protocol.EntityUIComponent generatePacket()
  public String toString()

Fields:
public static final BuilderCodec<EntityStatUIComponent> CODEC
protected String entityStat
protected int entityStatIndex
