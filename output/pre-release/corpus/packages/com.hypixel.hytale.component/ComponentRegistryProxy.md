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
