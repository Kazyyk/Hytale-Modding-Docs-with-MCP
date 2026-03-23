---
title: "Interactions"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.Interactions"
api_surface: true
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "ecs"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public class Interactions implements Component<EntityStore>
```

ECS component that binds interaction root IDs to `InteractionType` slots on an entity. Each entity can have a different root interaction assigned per interaction type (left click, right click, etc.), plus an optional interaction hint string displayed to the player. Changes are tracked via a network-dirty flag for efficient synchronization.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<Interactions>` | Codec serializing the `"Interactions"` enum map and `"InteractionHint"` string, with inherited defaults. |

## Static Methods

```java
@Nonnull
public static ComponentType<EntityStore, Interactions> getComponentType()
```

## Constructors

```java
public Interactions()
```

Creates an empty interactions component.

```java
public Interactions(@Nonnull Map<InteractionType, String> interactions)
```

Creates an interactions component with pre-populated bindings.

## Instance Methods

```java
@Nullable
public String getInteractionId(@Nonnull InteractionType type)
```

Returns the root interaction ID bound to the given interaction type, or `null` if none.

```java
public void setInteractionId(@Nonnull InteractionType type, @Nonnull String interactionId)
```

Binds a root interaction ID to the given interaction type and marks the component as network-dirty.

```java
@Nonnull
public Map<InteractionType, String> getInteractions()
```

Returns an unmodifiable view of all interaction bindings.

```java
@Nullable
public String getInteractionHint()
```

Returns the interaction hint text, or `null` if none.

```java
public void setInteractionHint(@Nullable String interactionHint)
```

Sets the interaction hint and marks the component as network-dirty.

```java
public boolean consumeNetworkOutdated()
```

Returns and clears the network-dirty flag.
