---
title: "EmptyItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.EmptyItemContainer"
api_surface: false
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "singleton"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class EmptyItemContainer extends ItemContainer
```

Zero-capacity singleton container. All slot access methods throw `UnsupportedOperationException`. Filter setters are no-ops. The `clone()` method returns the singleton `INSTANCE`.

Used as a null-object placeholder where an `ItemContainer` reference is required but no storage is needed.

## Constants

| Type | Name | Description |
|---|---|---|
| `EmptyItemContainer` | `INSTANCE` | The singleton instance. |

## Methods

```java
@Override
public short getCapacity()
```

Returns `0`.

```java
@Nonnull
@Override
public ClearTransaction clear()
```

Returns `ClearTransaction.EMPTY`.

```java
@Nonnull
@Override
public List<ItemStack> removeAllItemStacks()
```

Returns an empty list.

```java
@Nonnull
@Override
public Map<Integer, ItemWithAllMetadata> toProtocolMap()
```

Returns an empty map.

```java
public EmptyItemContainer clone()
```

Returns `INSTANCE`.
