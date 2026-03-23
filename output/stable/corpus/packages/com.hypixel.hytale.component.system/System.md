# System

Type: class | Package: com.hypixel.hytale.component.system | Implements: ISystem<ECS_TYPE>

public abstract class System<ECS_TYPE> implements ISystem<ECS_TYPE>

## Fields

- @Nonnull private final ObjectList<ComponentRegistration<ECS_TYPE, ?>> componentRegistrations
- @Nonnull private final ObjectList<ResourceRegistration<ECS_TYPE, ?>> resourceRegistrations

## Methods

- @Nonnull protected <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
- @Nonnull protected <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
- @Nonnull protected <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nullable String id, @Nullable BuilderCodec<T> codec, @Nonnull Supplier<T> supplier)
- @Nonnull public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
- @Nonnull public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
- @Nonnull private <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nullable String id, @Nullable BuilderCodec<T> codec, @Nonnull Supplier<T> supplier)
- @Nonnull public List<ComponentRegistration<ECS_TYPE, ?>> getComponentRegistrations()
- @Nonnull public List<ResourceRegistration<ECS_TYPE, ?>> getResourceRegistrations()

Known subclasses: ArchetypeChunkSystem, ArchetypeDataSystem, HolderSystem, RefChangeSystem, RefSystem, StoreSystem, TickingSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, WorldEventSystem

Complete API:
  protected ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, Supplier<T> supplier)
  protected ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  protected ComponentType<ECS_TYPE,T> registerComponent(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, Supplier<T> supplier)
  public ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, String id, BuilderCodec<T> codec)
  private ResourceType<ECS_TYPE,T> registerResource(Class<? super T> tClass, String id, BuilderCodec<T> codec, Supplier<T> supplier)
  public List<ComponentRegistration<ECS_TYPE,?>> getComponentRegistrations()
  public List<ResourceRegistration<ECS_TYPE,?>> getResourceRegistrations()

Fields:
private final ObjectList<ComponentRegistration<ECS_TYPE,?>> componentRegistrations
private final ObjectList<ResourceRegistration<ECS_TYPE,?>> resourceRegistrations
