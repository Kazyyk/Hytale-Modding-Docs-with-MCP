# CombatTextUIComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui.asset | Extends: EntityUIComponent

public class CombatTextUIComponent extends EntityUIComponent

Entity UI component for displaying combat text (damage numbers). Configures random position offsets, viewport margins, duration, hit angle modifiers, font size, text color, and animation events.

Also in this package: CombatTextUIComponentAnimationEvent, CombatTextUIComponentOpacityAnimationEvent, CombatTextUIComponentPositionAnimationEvent, CombatTextUIComponentScaleAnimationEvent, EntityStatUIComponent, EntityUIComponent, EntityUIComponentPacketGenerator, Unknown

Complete API:
  protected com.hypixel.hytale.protocol.EntityUIComponent generatePacket()
  public String toString()

Fields:
private static final float DEFAULT_FONT_SIZE
private static final Color DEFAULT_TEXT_COLOR
public static final BuilderCodec<CombatTextUIComponent> CODEC
private RangeVector2f randomPositionOffsetRange
private float viewportMargin
private float duration
private float hitAngleModifierStrength
private float fontSize
private Color textColor
private CombatTextUIComponentAnimationEvent[] animationEvents
