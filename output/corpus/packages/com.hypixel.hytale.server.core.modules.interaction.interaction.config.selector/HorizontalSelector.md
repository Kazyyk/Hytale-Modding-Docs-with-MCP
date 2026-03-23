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
