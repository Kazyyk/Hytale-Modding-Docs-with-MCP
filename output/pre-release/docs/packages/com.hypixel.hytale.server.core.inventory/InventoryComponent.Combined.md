---
title: "InventoryComponent.Combined"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.InventoryComponent.Combined"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:17:38Z"
tags:
  - "inventory"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public static class InventoryComponent.Combined implements Component<EntityStore>
```

Cache component that stores `CombinedItemContainer` views keyed by arrays of component types. Avoids recomputing combined views repeatedly. Extends nothing; implements `Component<EntityStore>`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InventoryComponent.Combined>` | `getComponentType()` |
| `public` | `Component<EntityStore>` | `clone()` |
