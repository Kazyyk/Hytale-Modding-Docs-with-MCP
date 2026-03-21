---
title: "SystemGroup"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.SystemGroup"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Comparable<SystemGroup<ECS_TYPE>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class SystemGroup<ECS_TYPE> implements Comparable<SystemGroup<ECS_TYPE>>
```

Groups systems for dependency-based execution ordering. Systems can declare a group via `getGroup()`, and groups can declare dependencies on other groups, system types, or individual systems. The [ComponentRegistry](ComponentRegistry.md) uses these dependencies to compute a topological sort for system execution.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

```java
@Nonnull
public Set<Dependency<ECS_TYPE>> getDependencies()
```

Returns the set of dependencies declared for this group.

```java
public int getIndex()
```

```java
public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)
```

```java
public void validate()
```

## Related Types

- [SystemType](SystemType.md) -- categorizes systems by base class
- `Dependency` -- expresses ordering constraints between groups, types, and systems
