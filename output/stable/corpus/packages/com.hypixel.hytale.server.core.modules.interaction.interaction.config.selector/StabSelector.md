# StabSelector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: SelectorType

public class StabSelector extends SelectorType

A selector that projects an orthogonal volume forward from the attacker over time, simulating a stabbing motion. Uses hit detection with configurable start/end distance, extension dimensions, rotation offsets, and optional line-of-sight testing.

## Key Methods

- public static final BuilderCodec<StabSelector> CODEC = BuilderCodec.builder(StabSelector.class, StabSelector::new, BASE_CODEC)
- public Selector newSelector()
- public com.hypixel.hytale.protocol.Selector toPacket()
- public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, float time, float runTime)
- public void selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )
- public void selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, TriIntConsumer consumer)

Also in this package: AOECircleSelector, AOECylinderSelector, ClientSourcedSelector, Direction, HorizontalSelector, PlayerMatcher, RaycastSelector, Result, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, SelectorType, VulnerableMatcher

Complete API:
  public Selector newSelector()
  public com.hypixel.hytale.protocol.Selector toPacket()

Fields:
public static final BuilderCodec<StabSelector> CODEC
protected double extendTop
protected double extendBottom
protected double extendLeft
protected double extendRight
protected double yawOffset
protected double pitchOffset
protected double rollOffset
protected double startDistance
protected double endDistance
protected boolean testLineOfSight
