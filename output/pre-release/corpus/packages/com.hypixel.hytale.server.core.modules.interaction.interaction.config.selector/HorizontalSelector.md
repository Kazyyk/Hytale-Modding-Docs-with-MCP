# HorizontalSelector

Type: enum | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: SelectorType

public class HorizontalSelector extends SelectorType

A selector that sweeps a horizontal arc over time, detecting entities and blocks within a frustum-shaped volume. Supports configurable arc length, direction (left/right), distance range, vertical extension, rotation offsets, and optional line-of-sight testing.

## Key Methods

- public static final BuilderCodec<HorizontalSelector> CODEC = BuilderCodec.builder(HorizontalSelector.class, HorizontalSelector::new, BASE_CODEC)
- public Selector newSelector()
- public com.hypixel.hytale.protocol.Selector toPacket()
- public static final EnumCodec<HorizontalSelector.Direction> CODEC = new EnumCodec<>(HorizontalSelector.Direction.class)
- public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, float time, float runTime)
- public void selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )
- public void selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, TriIntConsumer consumer)

Also in this package: AOECircleSelector, AOECylinderSelector, ClientSourcedSelector, Direction, PlayerMatcher, RaycastSelector, Result, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, SelectorType, StabSelector, VulnerableMatcher

Complete API:
  public Selector newSelector()
  public com.hypixel.hytale.protocol.Selector toPacket()

Fields:
public static final BuilderCodec<HorizontalSelector> CODEC
protected double extendTop
protected double extendBottom
protected double yawLength
protected double yawStartOffset
protected double pitchOffset
protected double rollOffset
protected double startDistance
protected double endDistance
protected HorizontalSelector.Direction direction
protected boolean testLineOfSight
