# Selector

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector

public interface Selector

Interface defining the runtime behavior of an interaction target selector. Provides methods for ticking the selector state, selecting target entities within range, and selecting target blocks. Includes static utility methods for finding nearby entities and blocks using spatial queries.

## Methods

- static void selectNearbyBlocks(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> attackerRef, double range, @Nonnull TriIntConsumer consumer)
- static void selectNearbyBlocks(@Nonnull Vector3d position, double range, @Nonnull TriIntConsumer consumer)
- static void selectNearbyBlocks(double xPos, double yPos, double zPos, double range, @Nonnull TriIntConsumer consumer)
- static void selectNearbyEntities(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> attacker, double range, @Nonnull Consumer<Ref<EntityStore>> consumer, @Nonnull Predicate<Ref<EntityStore>> filter)
- static void selectNearbyEntities(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Vector3d position, double range, @Nonnull Consumer<Ref<EntityStore>> consumer, @Nullable Predicate<Ref<EntityStore>> filter)
- void tick(@Nonnull CommandBuffer<EntityStore> var1, @Nonnull Ref<EntityStore> var2, float var3, float var4)
- void selectTargetEntities(@Nonnull CommandBuffer<EntityStore> var1, @Nonnull Ref<EntityStore> var2, BiConsumer<Ref<EntityStore>, Vector4d> var3, Predicate<Ref<EntityStore>> var4)
- void selectTargetBlocks(@Nonnull CommandBuffer<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull TriIntConsumer var3)
