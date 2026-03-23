# EntityRegistration

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: Registration

public class EntityRegistration extends Registration

A registration handle returned when a plugin registers a custom entity type via EntityRegistry. Extends `Registration` (which provides `isEnabled`, `unregister`, and `isRegistered` state management) with the entity's class reference. The registration remains valid as long as the owning plugin is enabled.

## Constructors


public EntityRegistration(Class<? extends Entity> entityClass, BooleanSupplier isEnabled, Runnable unregister)

Constructs a registration for the given entity class with the specified enabled-check and unregister callback.


public EntityRegistration(@Nonnull EntityRegistration registration, BooleanSupplier isEnabled, Runnable unregister)

Copy constructor that creates a new registration handle wrapping the same entity class from an existing registration, with new lifecycle callbacks. Used internally by the `Registry` base class to create plugin-scoped copies.

## Methods


public Class<? extends Entity> getEntityClass()

Returns the entity class associated with this registration.


@Nonnull
@Override
public String toString()

Returns a string representation including the entity class and the base `Registration` state.

## Related Types

- EntityRegistry -- the registry that produces these registration handles
- EntityModule -- creates registrations in `registerEntity()`
- `Registration` -- base class providing enabled/unregister lifecycle
- `Entity` -- the base entity type referenced by the registration
