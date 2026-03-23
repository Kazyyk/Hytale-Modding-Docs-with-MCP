---
title: "FetchedItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.FetchedItemContainer"
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
public class FetchedItemContainer extends ItemContainer
```

Item container proxy that lazily fetches its delegate via a `Supplier<ItemContainer>`. All operations are forwarded to the fetched container at call time. Used by `InventoryComponent.getCombined()` to wrap inventory components that may be swapped out during the entity lifecycle.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FetchedItemContainer(Supplier<ItemContainer> fetcher)` |

## Methods

All `ItemContainer` methods are delegated to the supplier-fetched container instance.

## Relationships

- Extends `ItemContainer`
- Created by [InventoryComponent](../com.hypixel.hytale.server.core.inventory/InventoryComponent.md) when building combined views
