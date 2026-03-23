# EntityRegistry

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: Registry<EntityRegistration>

public class EntityRegistry extends Registry<EntityRegistration>

A plugin-scoped registry for registering custom entity types. Obtained via `PluginBase.getEntityRegistry()`. All entity registrations made through this registry are automatically cleaned up when the owning plugin shuts down.

Extends `Registry<EntityRegistration>`, which provides lifecycle management, precondition checking (the plugin must not be in `NONE` or `DISABLED` state), and automatic unregistration on shutdown.

## Constructor


public EntityRegistry(@Nonnull List<BooleanConsumer> registrations, BooleanSupplier precondition, String preconditionMessage)

Constructs the registry with the given registration list, precondition supplier, and error message. The `EntityRegistration::new` copy constructor is passed to the parent `Registry` for creating plugin-scoped registration copies. Called by the plugin framework -- plugins do not construct this directly.

## Methods


@Nullable
public <T extends Entity> EntityRegistration registerEntity(
    @Nonnull String key, @Nonnull Class<T> clazz, Function<World, T> constructor, DirectDecodeCodec<T> codec
)

Registers a new entity type with the server.

**Parameters:**

- `key` -- the string identifier for the entity type (e.g., `"MyCustomEntity"`)
- `clazz` -- the entity class
- `constructor` -- a factory function that creates new instances given a `World`
- `codec` -- the deserialization codec for loading entities from storage, or `null` if the entity type does not persist

**Returns:** An EntityRegistration handle, or `null` if the underlying EntityModule is disabled.

**Throws:** `IllegalStateException` if the plugin precondition is not met.

Internally delegates to `EntityModule.get().registerEntity()`, which creates the ECS component type and registers legacy holder/ref systems.

## Example


@Override
protected void setup() {
    EntityRegistration reg = getEntityRegistry().registerEntity(
        "MyNPC",
        MyNPC.class,
        world -> new MyNPC(world),
        MyNPC.CODEC
    );
}

## Related Types

- EntityRegistration -- the handle returned by registration
- EntityModule -- performs the actual entity registration
- `Registry` -- base class providing lifecycle management
- `Entity` -- base entity type
- `PluginBase` -- provides `getEntityRegistry()` to obtain this registry
