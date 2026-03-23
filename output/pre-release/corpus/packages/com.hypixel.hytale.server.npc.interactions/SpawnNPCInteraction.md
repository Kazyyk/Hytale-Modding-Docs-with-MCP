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

Also in this package: ContextualUseNPCInteraction, NPCInteractionSimulationHandler, SpawnData, UseNPCInteraction, WeightedNPCSpawn

Complete API:
  private void spawnNPC(Store<EntityStore> store, Vector3i targetBlock)
  private SpawnNPCInteraction.SpawnData computeSpawnData(World world, Vector3i targetBlock)
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<SpawnNPCInteraction> CODEC
protected String entityId
protected SpawnNPCInteraction.WeightedNPCSpawn[] weightedSpawns
protected IWeightedMap<String> weightedSpawnMap
protected Vector3d spawnOffset
protected float spawnYawOffset
protected float spawnChance
