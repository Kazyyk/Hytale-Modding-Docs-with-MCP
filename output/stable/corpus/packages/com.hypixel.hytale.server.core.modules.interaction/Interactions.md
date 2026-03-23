# Interactions

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction | Implements: Component<EntityStore>

public class Interactions implements Component<EntityStore>

ECS component that binds interaction root IDs to `InteractionType` slots on an entity. Each entity can have a different root interaction assigned per interaction type (left click, right click, etc.), plus an optional interaction hint string displayed to the player. Changes are tracked via a network-dirty flag for efficient synchronization.

## Static Fields

- CODEC | BuilderCodec<Interactions> | Codec serializing the `"Interactions"` enum map and `"InteractionHint"` string, with inherited defaults.

## Static Methods


@Nonnull
public static ComponentType<EntityStore, Interactions> getComponentType()

## Constructors


public Interactions()

Creates an empty interactions component.


public Interactions(@Nonnull Map<InteractionType, String> interactions)

Creates an interactions component with pre-populated bindings.

## Instance Methods


@Nullable
public String getInteractionId(@Nonnull InteractionType type)

Returns the root interaction ID bound to the given interaction type, or `null` if none.


public void setInteractionId(@Nonnull InteractionType type, @Nonnull String interactionId)

Binds a root interaction ID to the given interaction type and marks the component as network-dirty.


@Nonnull
public Map<InteractionType, String> getInteractions()

Returns an unmodifiable view of all interaction bindings.


@Nullable
public String getInteractionHint()

Returns the interaction hint text, or `null` if none.


public void setInteractionHint(@Nullable String interactionHint)

Sets the interaction hint and marks the component as network-dirty.


public boolean consumeNetworkOutdated()

Returns and clears the network-dirty flag.
