# ComponentRegistryProxy

Type: class | Package: com.hypixel.hytale.component | Extends: java.lang.Object | Implements: IComponentRegistry<ECS_TYPE>

public class ComponentRegistryProxy<ECS_TYPE> implements IComponentRegistry<ECS_TYPE>

A plugin-scoped proxy around ComponentRegistry. All registrations made through a proxy are tracked, and when the owning plugin shuts down (without a full server shutdown), those registrations are automatically unregistered. This prevents plugins from leaking component types, resources, systems, and event types.

Plugins obtain a proxy via `JavaPlugin.getEntityStoreRegistry()` and `JavaPlugin.getChunkStoreRegistry()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Constructor


public ComponentRegistryProxy(List<BooleanConsumer> registrations, ComponentRegistry<ECS_TYPE> registry)

## Methods

All methods from IComponentRegistry are delegated to the underlying registry, with unregistration callbacks recorded in the `registrations` list.


@Deprecated(forRemoval = true)
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec, boolean skipValidation)

Deprecated variant that allows skipping codec validation.


@Deprecated(forRemoval = true)
public void registerSystem(@Nonnull ISystem<ECS_TYPE> system, boolean bypassClassCheck)

Deprecated variant that bypasses the one-system-per-class uniqueness check.

## Related Types

- IComponentRegistry -- the interface this proxy implements
- ComponentRegistry -- the concrete registry being proxied

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, Component, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  public void shutdown()
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, Supplier<T> supplier)
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  public ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec, boolean skipValidation)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, Supplier<T> supplier)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  public ResourceType<ECS_TYPE,SpatialResource<Ref<ECS_TYPE>,ECS_TYPE>> registerSpatialResource(Supplier<SpatialStructure<Ref<ECS_TYPE>>> supplier)
  public SystemType<ECS_TYPE,T> registerSystemType(Class<? super T> systemTypeClass)
  public EntityEventType<ECS_TYPE,T> registerEntityEventType(Class<? super T> eventTypeClass)
  public WorldEventType<ECS_TYPE,T> registerWorldEventType(Class<? super T> eventTypeClass)
  public SystemGroup<ECS_TYPE> registerSystemGroup()
  public void registerSystem(ISystem<ECS_TYPE> system)
  public void registerSystem(ISystem<ECS_TYPE> system, boolean bypassClassCheck)
  private ComponentType<ECS_TYPE,T> registerComponentType(ComponentType<ECS_TYPE,T> componentType)
  private ResourceType<ECS_TYPE,T> registerResourceType(ResourceType<ECS_TYPE,T> componentType)
  private SystemType<ECS_TYPE,T> registerSystemType(SystemType<ECS_TYPE,T> systemType)
  private EntityEventType<ECS_TYPE,T> registerEntityEventType(EntityEventType<ECS_TYPE,T> eventType)
  private WorldEventType<ECS_TYPE,T> registerWorldEventType(WorldEventType<ECS_TYPE,T> eventType)
  private SystemGroup<ECS_TYPE> registerSystemGroup(SystemGroup<ECS_TYPE> systemGroup)

Fields:
private final ComponentRegistry<ECS_TYPE> registry
private final List<BooleanConsumer> unregister
