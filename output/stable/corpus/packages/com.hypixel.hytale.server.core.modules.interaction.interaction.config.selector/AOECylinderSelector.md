# AOECylinderSelector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: AOECircleSelector

public class AOECylinderSelector extends AOECircleSelector

A selector that finds all entities within a cylindrical volume. Extends `AOECircleSelector` with an additional height parameter, creating a cylinder from the attacker position upward.

## Key Methods

- public static final BuilderCodec<AOECylinderSelector> CODEC = BuilderCodec.builder( AOECylinderSelector.class, AOECylinderSelector::new, AOECircleSelector.CODEC )
- public Selector newSelector()
- public com.hypixel.hytale.protocol.Selector toPacket()
- public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, float time, float runTime)
- public void selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )
- public void selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, TriIntConsumer consumer)

Also in this package: AOECircleSelector, ClientSourcedSelector, Direction, HorizontalSelector, PlayerMatcher, RaycastSelector, Result, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, SelectorType, StabSelector, VulnerableMatcher

Complete API:
  public Selector newSelector()
  public com.hypixel.hytale.protocol.Selector toPacket()

Fields:
public static final BuilderCodec<AOECylinderSelector> CODEC
private final AOECylinderSelector.RuntimeSelector instance
protected float height
