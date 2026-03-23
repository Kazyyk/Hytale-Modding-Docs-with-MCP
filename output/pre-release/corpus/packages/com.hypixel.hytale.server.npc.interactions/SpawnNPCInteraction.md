# SpawnNPCInteraction

Type: class | Package: com.hypixel.hytale.server.npc.interactions | Extends: SimpleBlockInteraction

public class SpawnNPCInteraction extends SimpleBlockInteraction

## Fields

- protected String entityId
- protected SpawnNPCInteraction.WeightedNPCSpawn[] weightedSpawns
- protected IWeightedMap<String> weightedSpawnMap
- protected float spawnYawOffset
- protected float spawnChance
- private String id
- private double weight

## Methods

- private void spawnNPC(@Nonnull Store<EntityStore> store, @Nonnull Vector3i targetBlock)
- private SpawnNPCInteraction.SpawnData computeSpawnData(@Nonnull World world, @Nonnull Vector3i targetBlock)
- protected void interactWithBlock( @Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler )
- protected void simulateInteractWithBlock( @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock )
- private record SpawnData(@Nonnull Vector3d position, @Nonnull Vector3f rotation)
- public double getWeight()
