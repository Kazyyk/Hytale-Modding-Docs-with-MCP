# WieldingInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: ChargingInteraction

public class WieldingInteraction extends ChargingInteraction

A charging interaction variant used for wielded combat items. Adds stat modifier application (damage modifiers, damage cause effects), entity effect processing, and damage data tracking during the charge phase. Configurable via codec fields for stat modifiers, damage cause, damage effects, and entity effects.

## Codec

`WieldingInteraction.CODEC` -- `BuilderCodec<WieldingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public Int2DoubleMap getKnockbackModifiers()
  public Int2FloatMap getDamageModifiers()
  public WieldingInteraction.AngledWielding getAngledWielding()
  public DamageEffects getBlockedEffects()
  public WieldingInteraction.StaminaCost getStaminaCost()
  public String getBlockedInteractions()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void handle(Ref<EntityStore> ref, boolean firstRun, float time, InteractionType type, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static final float WIELDING_INDEX
public static final BuilderCodec<WieldingInteraction> CODEC
protected Object2DoubleMap<String> knockbackModifiersRaw
protected Object2FloatMap<String> damageModifiersRaw
protected WieldingInteraction.AngledWielding angledWielding
protected WieldingInteraction.StaminaCost staminaCost
protected DamageEffects blockedEffects
protected String blockedInteractions
protected transient Int2DoubleMap knockbackModifiers
protected transient Int2FloatMap damageModifiers
