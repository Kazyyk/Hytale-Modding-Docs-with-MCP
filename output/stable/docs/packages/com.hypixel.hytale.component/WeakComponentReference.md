---
title: "WeakComponentReference"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.WeakComponentReference"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class WeakComponentReference<ECS_TYPE, T extends Component<ECS_TYPE>>
```

A weak reference to a specific component on a specific entity. Caches the component instance via a `WeakReference` for fast access, falling back to a full store lookup if the cached reference has been garbage collected. Automatically invalidated when the owning entity is removed.

## Methods

```java
@Nullable
public T get()
```

Returns the component, or `null` if the entity has been removed.

```java
@Nonnull
public Store<ECS_TYPE> getStore()
```

```java
@Nonnull
public ComponentType<ECS_TYPE, T> getType()
```

```java
@Nullable
public Ref<ECS_TYPE> getEntityReference()
```

## Related Types

- [Ref](Ref.md) -- the entity reference this wraps
- [ComponentType](ComponentType.md) -- the component type being referenced
