---
title: "BuilderContext"
kind: "interface"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderContext"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public interface BuilderContext
```

Provides hierarchical context for builders, enabling breadcrumb-style error reporting. Each context knows its owner and label, allowing the system to construct a path like `"Role|Instruction|Action"` when reporting configuration errors.

## Methods

### getOwner

```java
BuilderContext getOwner();
```

Returns the parent context, or `null` for root-level builders.

### getLabel

```java
String getLabel();
```

Returns this context's label (typically the type name or JSON key).

### setCurrentStateName

```java
default void setCurrentStateName(String name)
```

Sets the current state name for state-aware contexts. Default is a no-op.

### getParent

```java
@Nullable
default Builder<?> getParent()
```

Walks up the owner chain to find the nearest [Builder](Builder.md) ancestor. Returns `null` if no builder ancestor exists.

### getBreadCrumbs

```java
default void getBreadCrumbs(@Nonnull StringBuilder stringBuilder)
```

Recursively builds a pipe-delimited breadcrumb string by walking up the owner chain.

```java
@Nonnull
default String getBreadCrumbs()
```

Returns the full breadcrumb string (convenience overload).

## Related Types

- [Builder](Builder.md) -- extends this interface
- [BuilderObjectHelper](BuilderObjectHelper.md) -- implements this interface
- [BuilderBase](BuilderBase.md) -- implements this via Builder
