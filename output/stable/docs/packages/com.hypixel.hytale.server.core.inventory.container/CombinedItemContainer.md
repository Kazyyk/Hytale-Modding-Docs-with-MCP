---
title: "CombinedItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.CombinedItemContainer"
api_surface: true
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "composite"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class CombinedItemContainer extends ItemContainer
```

Composite container that concatenates multiple child `ItemContainer` instances into a single logical container. Slot indices are offset: the first child's slots start at 0, the second child's slots start at the first child's capacity, and so on.

Read and write locks are acquired recursively across all child containers to ensure atomicity. Change events are propagated from children to the combined container with slot offsets adjusted.

Does not support `setGlobalFilter(FilterType)` -- throws `UnsupportedOperationException`. Per-slot filters are delegated to the appropriate child container.

Does not support `clone()` -- throws `UnsupportedOperationException`.

## Fields

| Type | Name | Description |
|---|---|---|
| `ItemContainer[]` | `containers` | The backing array of child containers. |

## Methods

```java
public CombinedItemContainer(ItemContainer... containers)
```

Creates a combined container from the given child containers.

```java
public ItemContainer getContainer(int index)
```

Returns the child container at the given index.

```java
public int getContainersSize()
```

Returns the number of child containers.

```java
@Nullable
public ItemContainer getContainerForSlot(short slot)
```

Returns the child container that owns the given logical slot, or `null` if out of range.

```java
@Override
public short getCapacity()
```

Returns the sum of all child container capacities.

```java
@Override
public boolean containsContainer(ItemContainer itemContainer)
```

Returns `true` if this combined container or any of its children contains the given container.
