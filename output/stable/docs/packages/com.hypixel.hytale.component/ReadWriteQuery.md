---
title: "ReadWriteQuery"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ReadWriteQuery"
api_surface: false
extends: "java.lang.Object"
implements:
  - "ReadWriteArchetypeQuery<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class ReadWriteQuery<ECS_TYPE> implements ReadWriteArchetypeQuery<ECS_TYPE>
```

A query that distinguishes between read-only and read-write component access. Used by the parallel execution system to determine which archetype chunks can be processed concurrently -- chunks are safe to process in parallel when systems only read shared components and write to disjoint ones.

## Constructor

```java
public ReadWriteQuery(@Nonnull Archetype<ECS_TYPE> read, @Nonnull Archetype<ECS_TYPE> write)
```

## Methods

```java
public Archetype<ECS_TYPE> getReadArchetype()
```

```java
public Archetype<ECS_TYPE> getWriteArchetype()
```

## Related Types

- [Archetype](Archetype.md) -- the read and write archetypes
