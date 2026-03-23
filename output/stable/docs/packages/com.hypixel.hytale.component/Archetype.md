---
title: "Archetype"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Archetype"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Query<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class Archetype<ECS_TYPE> implements Query<ECS_TYPE>
```

Represents a unique combination of [ComponentType](ComponentType.md) instances that defines an entity's shape. Entities with identical archetypes are stored together in the same [ArchetypeChunk](ArchetypeChunk.md), enabling cache-friendly iteration. Archetype also implements `Query`, matching any entity whose archetype contains all of this archetype's component types.

Archetypes are immutable. Adding or removing a component produces a new Archetype instance.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Static Factory Methods

```java
public static <ECS_TYPE> Archetype<ECS_TYPE> empty()
```

```java
@Nonnull
public static <ECS_TYPE> Archetype<ECS_TYPE> of(@Nonnull ComponentType<ECS_TYPE, ?> componentType)
```

```java
@SafeVarargs
public static <ECS_TYPE> Archetype<ECS_TYPE> of(@Nonnull ComponentType<ECS_TYPE, ?>... componentTypes)
```

```java
@Nonnull
public static <ECS_TYPE, T extends Component<ECS_TYPE>> Archetype<ECS_TYPE> add(@Nonnull Archetype<ECS_TYPE> archetype, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
public static <ECS_TYPE, T extends Component<ECS_TYPE>> Archetype<ECS_TYPE> remove(@Nonnull Archetype<ECS_TYPE> archetype, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

## Query Methods

```java
public int count()
```

Returns the number of component types in this archetype.

```java
public boolean isEmpty()
```

```java
public boolean contains(@Nonnull ComponentType<ECS_TYPE, ?> componentType)
```

```java
public boolean contains(@Nonnull Archetype<ECS_TYPE> archetype)
```

Returns `true` if this archetype contains all component types in the given archetype.

```java
@Nonnull
public ExactArchetypeQuery<ECS_TYPE> asExactQuery()
```

Returns an exact-match query for this specific archetype.

## Related Types

- [ArchetypeChunk](ArchetypeChunk.md) -- stores entities sharing the same archetype
- [ComponentType](ComponentType.md) -- the component handles that compose an archetype
- [Holder](Holder.md) -- carries an Archetype alongside component data
