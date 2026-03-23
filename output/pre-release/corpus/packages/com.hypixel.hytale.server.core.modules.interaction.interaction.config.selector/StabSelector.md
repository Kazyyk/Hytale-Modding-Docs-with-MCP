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
