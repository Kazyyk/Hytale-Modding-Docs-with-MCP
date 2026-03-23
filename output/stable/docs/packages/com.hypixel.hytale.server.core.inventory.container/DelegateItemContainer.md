---
title: "DelegateItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.DelegateItemContainer"
api_surface: false
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "delegate"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class DelegateItemContainer<T extends ItemContainer> extends ItemContainer
```

Generic wrapper around another `ItemContainer` that adds per-slot filters (`SlotFilter`) and a global `FilterType` without modifying the delegate's own filter state. All slot access and locking is delegated to the underlying container.

Change events from the delegate are forwarded through this wrapper so listeners see this container as the source.

## Type Parameters

- `T` -- the type of the delegate container.

## Fields

| Type | Name | Description |
|---|---|---|
| `T` | `delegate` | The underlying container. |

## Constructors

```java
public DelegateItemContainer(T delegate)
```

Creates a delegate wrapper. Throws `NullPointerException` if delegate is `null`.

## Methods

```java
public T getDelegate()
```

Returns the underlying delegate container.

```java
@Override
public short getCapacity()
```

Returns the delegate's capacity.

```java
@Nonnull
public DelegateItemContainer<T> clone()
```

Returns a new `DelegateItemContainer` wrapping the same delegate.

```java
@Override
public void setGlobalFilter(@Nonnull FilterType globalFilter)
```

Sets the global filter on this wrapper (does not affect the delegate's own filter).

```java
@Override
public void setSlotFilter(FilterActionType actionType, short slot, @Nullable SlotFilter filter)
```

Sets or removes a per-slot filter on this wrapper.
