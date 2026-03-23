# NetworkId

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.tracker | Implements: Component<EntityStore>

public final class NetworkId implements Component<EntityStore>

An ECS component that assigns an immutable integer network identifier to an entity. This ID is used by the entity tracker networking layer to reference entities in network packets (e.g., `EntityUpdates`). The ID is set at construction time and cannot be changed afterward.

The component type is registered by `EntityModule` and retrieved via the static `getComponentType()` accessor.

## Component Type Accessor


@Nonnull
public static ComponentType<EntityStore, NetworkId> getComponentType()

Returns the registered component type, delegating to `EntityModule.get().getNetworkIdComponentType()`.

## Constructor


public NetworkId(int id)

Creates a new `NetworkId` with the given integer identifier.

## Methods


public int getId()

Returns the network identifier assigned at construction.


@Nonnull
@Override
public Component<EntityStore> clone()

Returns `this` -- the component is immutable, so cloning returns the same instance.

## Related Types

- EntityTrackerSystems -- the `SendPackets` system reads `NetworkId` to assign network IDs in outbound packets
- `EntityModule` -- registers the `NetworkId` component type
- `EntityStore` -- the ECS store this component belongs to
