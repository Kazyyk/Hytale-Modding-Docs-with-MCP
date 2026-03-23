# ClientSourcedSelector

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Implements: Selector

public class ClientSourcedSelector implements Selector

Deprecated. A selector that uses client-reported hit entities from the interaction context rather than performing server-side detection. Wraps a parent selector for block selection.

## Key Methods

- public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, float time, float runTime)
- public void selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )
- public void selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, TriIntConsumer consumer)
