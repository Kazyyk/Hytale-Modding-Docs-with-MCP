# Resource

Type: interface | Package: com.hypixel.hytale.component | Extends: Cloneable

public interface Resource<ECS_TYPE> extends Cloneable

The root interface for all ECS resources. Resources are per-Store singleton data -- unlike Component which is per-entity, a resource exists once per store and is shared by all systems. Resources are registered via IComponentRegistry.registerResource() and accessed via ResourceType handles.

Resources are loaded and saved through IResourceStorage, enabling persistent store-level data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Fields


Resource[] EMPTY_ARRAY = new Resource[0];

Shared empty array constant.

## Methods


@Nullable
Resource<ECS_TYPE> clone();

Creates a deep copy of this resource. Returns `null` if the resource cannot be cloned.

## Related Types

- ResourceType -- typed handle for registering and accessing resources
- ResourceRegistration -- registration record for a resource
- IResourceStorage -- persistence interface for loading/saving resources
- Component -- the per-entity equivalent
- Store -- holds resource instances and provides access via `getResource()`

Known implementors: AStarNodePoolProviderSimple, AmbienceResource, Blackboard, BlockCounter, BlockMapMarkersResource, BlockStateInfoNeedRebuild, ChunkStorage, ChunkSuppressionQueue, CombatDataPool, Data, Data, Data, Data, DisabledFluidResource, FloodFillEntryPoolProviderSimple, IndexedStorageCache, InstanceDataResource, KillTrackerResource, LocalSpawnState, PortalWorld, PrefabEditSession, QueueResource, QueueResource, QueueResource, QueueResource, QueueResource, RandomTick, ReputationDataResource, RoleChangeQueue, SaveDataResource, SnapshotWorldInfo, SortBufferProviderResource, SpatialResource, SpawnSuppressionController, SprintStaminaRegenDelay, TimeResource, VoidInvasionData, WeatherResource, WorldMarkersResource, WorldPathData, WorldSomnolence, WorldSpawnData, WorldTimeResource

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery (and 8 more)

Complete API:
  Resource<ECS_TYPE> clone()

Fields:
Resource[] EMPTY_ARRAY
