---
title: "SystemType"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.SystemType"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Comparable<SystemType<ECS_TYPE, ?>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class SystemType<ECS_TYPE, T extends ISystem<ECS_TYPE>> implements Comparable<SystemType<ECS_TYPE, ?>>
```

A typed handle representing a category of ECS systems. The registry pre-registers system types for the built-in system base classes (`TickingSystem`, `RefSystem`, `HolderSystem`, etc.). Systems are grouped by their SystemType for iteration -- for example, the store iterates all systems of the `TickingSystem` type each tick.

## Type Parameters

- `ECS_TYPE` -- the store type parameter
- `T` -- the system interface or base class

## Fields

```java
@Nonnull
public static final SystemType[] EMPTY_ARRAY = new SystemType[0];
```

## Methods

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

```java
public Class<? super T> getTypeClass()
```

```java
public boolean isType(@Nonnull ISystem<ECS_TYPE> system)
```

Returns `true` if the given system is an instance of this type's class.

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

- [ComponentRegistry](ComponentRegistry.md) -- registers system types and provides accessors for built-in types
- [SystemGroup](SystemGroup.md) -- groups systems for dependency ordering
