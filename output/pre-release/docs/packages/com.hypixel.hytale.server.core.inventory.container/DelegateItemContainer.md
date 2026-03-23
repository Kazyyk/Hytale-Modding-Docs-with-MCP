---
title: "DelegateItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.DelegateItemContainer"
api_surface: false
extends: "ItemContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:18:36Z"
tags:
  - "inventory"
  - "container"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public class DelegateItemContainer<T extends ItemContainer> extends ItemContainer
```

Generic delegate wrapper around another `ItemContainer`. Adds per-slot and global filter support on top of the delegate's own filtering. Change events bridge between the delegate and the wrapper, translating transactions to maintain correct container references.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `DelegateItemContainer(T delegate)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `T` | `getDelegate()` |
| `public` | `short` | `getCapacity()` |
| `public` | `ClearTransaction` | `clear()` |
| `public` | `DelegateItemContainer<T>` | `clone()` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `void` | `setGlobalFilter(FilterType globalFilter)` |
| `public` | `void` | `setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)` |

## Relationships

- Extends `ItemContainer`
