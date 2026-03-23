# AOECircleSelector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: SelectorType

public class AOECircleSelector extends SelectorType

A selector that finds all entities within a circular area around the attacker. Configurable range and positional offset. The circle is centered on the attacker and rotated by head yaw.

## Key Methods

- public static final BuilderCodec<AOECircleSelector> CODEC = BuilderCodec.builder(AOECircleSelector.class, AOECircleSelector::new, BASE_CODEC)
- public Selector newSelector()
- public com.hypixel.hytale.protocol.Selector toPacket()
- public Vector3f getOffset()
- public Vector3d selectTargetPosition(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attackerRef)
- public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, float time, float runTime)
- public void selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )
- public void selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, TriIntConsumer consumer)
