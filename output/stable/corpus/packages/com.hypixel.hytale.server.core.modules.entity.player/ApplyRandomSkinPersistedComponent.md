# ApplyRandomSkinPersistedComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public class ApplyRandomSkinPersistedComponent implements Component<EntityStore>

A singleton ECS component that flags a player entity for random skin assignment on persist. The component carries no data; its presence on an entity triggers the random skin behavior.

## Static Fields

- INSTANCE | ApplyRandomSkinPersistedComponent | Singleton instance returned by the codec.
- CODEC | BuilderCodec<ApplyRandomSkinPersistedComponent> | Serialization codec that always deserializes to `INSTANCE`.

## Static Methods


public static ComponentType<EntityStore, ApplyRandomSkinPersistedComponent> getComponentType()

Returns the component type, retrieved from `EntityModule.get().getApplyRandomSkinPersistedComponent()`.

## Methods


@Nonnull
@Override
public Component<EntityStore> clone()

Returns `this` since the component is a stateless singleton.

## Related Types

- PlayerSkinComponent -- holds the actual player skin data
