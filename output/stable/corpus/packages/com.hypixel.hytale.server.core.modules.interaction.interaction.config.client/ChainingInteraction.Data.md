# ChainingInteraction.Data

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: Component<EntityStore>

public static class ChainingInteraction.Data implements Component<EntityStore>

Per-entity `EntityStore` component that tracks chaining state. Maintains an `Object2IntMap<String>` for anonymous chain indices and a separate `namedMap` for named chain IDs (`ChainId`). Tracks the timestamp of the last attack for chaining allowance calculations via `getTimeSinceLastAttackInSeconds()`.

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  public static ComponentType<EntityStore,ChainingInteraction.Data> getComponentType()
  public float getTimeSinceLastAttackInSeconds()
  public Object2IntMap<String> getNamedMap()
  public Component<EntityStore> clone()

Fields:
private final Object2IntMap<String> map
private final Object2IntMap<String> namedMap
private long lastAttack
