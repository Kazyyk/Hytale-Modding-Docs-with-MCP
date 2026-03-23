# InteractionModule

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction | Extends: JavaPlugin

public class InteractionModule extends JavaPlugin

Server plugin responsible for the item interaction system. Registers all interaction types (place block, break block, damage entity, launch projectile, charge, chain, etc.), the root interaction asset store, selector types, knockback types, and the ECS systems that drive interaction execution. Also handles mouse input processing and dispatches `PlayerMouseButtonEvent`/`PlayerMouseMotionEvent`.

## Static Fields

- MANIFEST | PluginManifest | Plugin manifest declaring dependency on `EntityModule`.
- INTERACTION_TYPE_CODEC | EnumCodec<InteractionType> | Codec for the `InteractionType` enum.
- INTERACTION_TYPE_SET_CODEC | SetCodec<InteractionType, EnumSet<InteractionType>> | Codec for sets of `InteractionType`.

## Static Methods


@Nonnull
public static InteractionModule get()

Returns the singleton instance.

## Instance Methods


public void doMouseInteraction(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull MouseInteraction packet, @Nonnull Player playerComponent, @Nonnull PlayerRef playerRefComponent)

Processes a mouse interaction packet from a client. Validates the active hotbar slot, resolves the target block/entity, dispatches mouse events, and updates the camera manager state.


@Nonnull
public ComponentType<EntityStore, ChainingInteraction.Data> getChainingDataComponent()

Returns the ECS component type for chaining interaction runtime data.


@Nonnull
public ComponentType<EntityStore, Interactions> getInteractionsComponentType()

Returns the ECS component type for entity interaction bindings.


@Nonnull
public ComponentType<EntityStore, InteractionManager> getInteractionManagerComponent()

Returns the ECS component type for the interaction manager.


@Nonnull
public ComponentType<ChunkStore, PlacedByInteractionComponent> getPlacedByComponentType()

Returns the ECS component type tracking which player placed a block.


public ResourceType<ChunkStore, BlockCounter> getBlockCounterResourceType()

Returns the resource type for per-chunk block placement counters.


public ComponentType<ChunkStore, TrackedPlacement> getTrackedPlacementComponentType()

Returns the ECS component type for tracked block placements.

## Registered Interaction Types

The `setup()` method registers over 50 interaction types with the `Interaction.CODEC` polymorphic codec, including: `Simple`, `PlaceBlock`, `BreakBlock`, `UseBlock`, `DamageEntity`, `LaunchProjectile`, `Charging`, `Chaining`, `Condition`, `Parallel`, `Serial`, `SpawnPrefab`, `Door`, `OpenContainer`, `EquipItem`, `ApplyEffect`, `ApplyForce`, and many more.

## Registered Selector Types

`Horizontal`, `Stab`, `AOECircle`, `AOECylinder`, `Raycast`.

## Registered Knockback Types

`Directional`, `Point`, `Force`.

Also in this package: BlockHarvestUtils, BlockInteractionUtils, BlockPlaceUtils, IInteractionSimulationHandler, InteractionSimulationHandler, Interactions

Complete API:
  public static InteractionModule get()
  protected void setup()
  private static void handledLoadedRootInteractions(LoadedAssetsEvent<String,RootInteraction,?> event)
  private static void handledLoadedInteractions(LoadedAssetsEvent<String,Interaction,?> event)
  private static void handledRemovedInteractions(RemovedAssetsEvent<String,Interaction,?> event)
  public void doMouseInteraction(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, MouseInteraction packet, Player playerComponent, PlayerRef playerRefComponent)
  public ComponentType<EntityStore,ChainingInteraction.Data> getChainingDataComponent()
  public ComponentType<EntityStore,Interactions> getInteractionsComponentType()
  public ComponentType<EntityStore,InteractionManager> getInteractionManagerComponent()
  public ComponentType<ChunkStore,PlacedByInteractionComponent> getPlacedByComponentType()
  public ResourceType<ChunkStore,BlockCounter> getBlockCounterResourceType()
  public ComponentType<ChunkStore,TrackedPlacement> getTrackedPlacementComponentType()

Fields:
public static final PluginManifest MANIFEST
public static final EnumCodec<InteractionType> INTERACTION_TYPE_CODEC
public static final SetCodec<InteractionType,EnumSet<InteractionType>> INTERACTION_TYPE_SET_CODEC
private static InteractionModule instance
private ComponentType<EntityStore,InteractionManager> interactionManagerComponent
private ComponentType<EntityStore,ChainingInteraction.Data> chainingDataComponent
private ComponentType<EntityStore,Interactions> interactionsComponentType
private ComponentType<ChunkStore,PlacedByInteractionComponent> placedByComponentType
private ResourceType<ChunkStore,BlockCounter> blockCounterResourceType
private ComponentType<ChunkStore,TrackedPlacement> trackedPlacementComponentType
